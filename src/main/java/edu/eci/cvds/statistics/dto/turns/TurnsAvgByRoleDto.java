package edu.eci.cvds.statistics.dto.turns;

import lombok.Data;

@Data
public class TurnsAvgByRoleDto {
    private String role;
    private Float averageLevel;
}