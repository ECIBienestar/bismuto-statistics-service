package edu.eci.cvds.statistics.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.eci.cvds.statistics.dto.turns.*;
import edu.eci.cvds.statistics.service.impl.TurnsServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Controller
@Tag(name = "Authentication", description = "Medical turns stadistics")
@RequestMapping("/api/turns")
public class TurnsController {

    private TurnsServiceImpl turnsServiceImpl;

    public TurnsController(TurnsServiceImpl turnsServiceImpl) {
        this.turnsServiceImpl = turnsServiceImpl;
    }

    @Operation(summary = "Get all turs by role")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Number of turns obtained correctly"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Internal Server Error")
    })
    @GetMapping("/count-role")
    public ResponseEntity<List<TurnsByRoleDto>> getTurnByRole(@RequestParam String role, @RequestParam LocalDate start,
            @RequestParam LocalDate end, @RequestParam String status) {

        List<TurnsByRoleDto> turns = turnsServiceImpl.getTurnsByRol(role, start, end, status);
        return ResponseEntity.ok(turns);
    }

    @Operation(summary = "Get all turs by speciality")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Number of turns obtained correctly"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Internal Server Error")
    })
    @GetMapping("/count-speciality")
    public ResponseEntity<List<TurnsBySpecialityDto>> getTurnBySpeciality(@RequestParam String role,
            @RequestParam LocalDate start,
            @RequestParam LocalDate end, @RequestParam String status) {

        List<TurnsBySpecialityDto> turns = turnsServiceImpl.getTurnsBySpeciality(role, start, end, status);
        return ResponseEntity.ok(turns);
    }

    @Operation(summary = "Get average of turs by speciality")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Average of turns obtained correctly"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "500", description = "Internal Server Error")
    })
    @GetMapping("/avg-speciality")
    public ResponseEntity<List<TurnsAvgBySpecialityDto>> getTurnAvgBySpeciality(@RequestParam String role,
            @RequestParam LocalDate start, @RequestParam LocalDate end) {

        List<TurnsAvgBySpecialityDto> turn = turnsServiceImpl.getTurnsAvgBySpeciality(role, start, end);
        return ResponseEntity.ok(turn);
    }

    @GetMapping("/avg-role")
    public ResponseEntity<List<TurnsAvgByRoleDto>> getTurnAvgByRole(@RequestParam String role,
            @RequestParam LocalDate start, @RequestParam LocalDate end) {
        List<TurnsAvgByRoleDto> turn = turnsServiceImpl.getTurnsAvgByRol(role, start, end);
        return ResponseEntity.ok(turn);
    }

}