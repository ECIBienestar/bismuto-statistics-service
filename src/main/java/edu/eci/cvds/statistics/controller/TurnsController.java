package edu.eci.cvds.statistics.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.eci.cvds.statistics.dto.turns.TurnsAvgByRoleDto;
import edu.eci.cvds.statistics.dto.turns.TurnsAvgBySpecialityDto;
import edu.eci.cvds.statistics.dto.turns.TurnsByRoleDto;
import edu.eci.cvds.statistics.dto.turns.TurnsBySpecialityDto;

@Controller
@RequestMapping("/api/turns")
public class TurnsController {

    @GetMapping("/count-role")
    public ResponseEntity<List<TurnsByRoleDto>> getTurnByRole(@RequestParam String role, @RequestParam LocalDate start,
            @RequestParam LocalDate end, @RequestParam String status) {
        return null;
    }

    @GetMapping("/count-speciality")
    public ResponseEntity<List<TurnsBySpecialityDto>> getTurnBySpeciality(@RequestParam String role,
            @RequestParam LocalDate start,
            @RequestParam LocalDate end, @RequestParam String status) {
        return null;
    }

    @GetMapping("/avg-speciality")
    public ResponseEntity<List<TurnsAvgBySpecialityDto>> getTurnAvgBySpeciality(@RequestParam String role,
            @RequestParam LocalDate start, @RequestParam LocalDate end) {
        return null;
    }

    @GetMapping("/avg-role")
    public ResponseEntity<List<TurnsAvgByRoleDto>> getTurnAvgByRole(@RequestParam String role,
            @RequestParam LocalDate start, @RequestParam LocalDate end) {
        return null;
    }

}