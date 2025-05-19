package edu.eci.cvds.statistics.dto.turns;

import lombok.Data;

@Data
public class TurnsByRolDto {
    private String status;
    private Integer count;
    private String role;
}