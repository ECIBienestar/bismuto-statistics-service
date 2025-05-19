package edu.eci.cvds.statistics.dto.turns;

import lombok.Data;

@Data
public class TurnsByRoleDto {
    private String status;
    private Integer count;
    private String role;
}