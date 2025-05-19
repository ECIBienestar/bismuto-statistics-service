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

@FeignClient(name = "stadistics-turns", url = "https://diamante-medicalturns-develop-dvb8c2cqfbh4gwbg.canadacentral-01.azurewebsites.net/api")
public interface TurnsClient {

    @GetMapping("reports/count-speciality")
    List<TurnsBySpecialityDto> getTurnsBySpeciality(
            @RequestParam String speciality,
            @RequestParam LocalDateTime start,
            @RequestParam LocalDateTime end,
            @RequestParam String status);

    @GetMapping("reports/count-role")
    List<TurnsByRoleDto> getTurnsByRole(
            @RequestParam String speciality,
            @RequestParam LocalDateTime start,
            @RequestParam LocalDateTime end,
            @RequestParam String status);

    @GetMapping("reports/avg-role")
    List<TurnsAvgByRoleDto> getAvgTurnsByRole(
            @RequestParam String speciality,
            @RequestParam LocalDateTime start,
            @RequestParam LocalDateTime end);

    @GetMapping("reports/avg-speciality")
    List<TurnsAvgBySpecialityDto> getAvgTurnsBySpeciality(
            @RequestParam String speciality,
            @RequestParam LocalDateTime start,
            @RequestParam LocalDateTime end);

}