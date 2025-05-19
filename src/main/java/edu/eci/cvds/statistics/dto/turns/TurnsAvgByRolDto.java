package edu.eci.cvds.statistics.dto.turns;

import lombok.Data;

@Data
public class TurnsAvgByRolDto {
    private String role;
    private Float averageLevel;
}