package edu.eci.cvds.statistics.client;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.eci.cvds.statistics.dto.TurnsBySpecialityDto;

@FeignClient(name = "stadistics-turns", url = "${stadistics.turns.url}")
public interface TurnsClient {

    @GetMapping("reports/count-speciality")
    List<TurnsBySpecialityDto> getTurnsBySpeciality(
            @RequestParam("speciality") String speciality,
            @RequestParam("start") LocalDateTime start,
            @RequestParam("end") LocalDateTime end,
            @RequestParam("status") String status);
}