package edu.eci.cvds.statistics.client;

import java.time.LocalDate;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.eci.cvds.statistics.dto.turns.TurnsAvgByRoleDto;
import edu.eci.cvds.statistics.dto.turns.TurnsAvgBySpecialityDto;
import edu.eci.cvds.statistics.dto.turns.TurnsByRoleDto;
import edu.eci.cvds.statistics.dto.turns.TurnsBySpecialityDto;

@FeignClient(name = "stadistics-turns", url = "https://suoeltmtp2.execute-api.us-east-1.amazonaws.com/medical-turns")
public interface TurnsClient {

    @GetMapping("reports/count-speciality")
    List<TurnsBySpecialityDto> getTurnsBySpeciality(
        @RequestParam String speciality,
        @RequestParam LocalDate start,
        @RequestParam LocalDate end,
        @RequestParam String status);

    @GetMapping("reports/count-role")
    List<TurnsByRoleDto> getTurnsByRole(
            @RequestParam String speciality,
            @RequestParam LocalDate start,
            @RequestParam LocalDate end,
            @RequestParam String status);

    @GetMapping("reports/avg-role")
    List<TurnsAvgByRoleDto> getAvgTurnsByRole(
            @RequestParam String speciality,
            @RequestParam LocalDate start,
            @RequestParam LocalDate end);

    @GetMapping("reports/avg-speciality")
    List<TurnsAvgBySpecialityDto> getAvgTurnsBySpeciality(
            @RequestParam String speciality,
            @RequestParam LocalDate start,
            @RequestParam LocalDate end);

}