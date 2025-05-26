package edu.eci.cvds.statistics.dto.turns;

import lombok.Data;

@Data
public class TurnsAvgBySpecialityDto {
    private String speciality;
    private Float averageLevel;
}