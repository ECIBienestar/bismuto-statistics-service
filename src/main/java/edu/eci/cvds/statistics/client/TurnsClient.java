package edu.eci.cvds.statistics.client;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.eci.cvds.statistics.dto.turns.TurnsAvgByRoleDto;
import edu.eci.cvds.statistics.dto.turns.TurnsAvgBySpecialityDto;
import edu.eci.cvds.statistics.dto.turns.TurnsByRoleDto;
import edu.eci.cvds.statistics.dto.turns.TurnsBySpecialityDto;

@FeignClient(name = "stadistics-turns", url = "${stadistics.turns.url}")
public interface TurnsClient {

    @GetMapping("reports/count-speciality")
    List<TurnsBySpecialityDto> getTurnsBySpeciality(
            @RequestParam("speciality") String speciality,
            @RequestParam("start") LocalDateTime start,
            @RequestParam("end") LocalDateTime end,
            @RequestParam("status") String status);

    @GetMapping("reports/count-role")
    List<TurnsByRoleDto> getTurnsByRole(
            @RequestParam("speciality") String speciality,
            @RequestParam("start") LocalDateTime start,
            @RequestParam("end") LocalDateTime end,
            @RequestParam("status") String status);

    @GetMapping("reports/avg-role")
    List<TurnsAvgByRoleDto> getAvgTurnsByRole(
            @RequestParam("speciality") String speciality,
            @RequestParam("start") LocalDateTime start,
            @RequestParam("end") LocalDateTime end);

    @GetMapping("reports/avg-speciality")
    List<TurnsAvgBySpecialityDto> getAvgTurnsBySpeciality(
            @RequestParam("speciality") String speciality,
            @RequestParam("start") LocalDateTime start,
            @RequestParam("end") LocalDateTime end);

}