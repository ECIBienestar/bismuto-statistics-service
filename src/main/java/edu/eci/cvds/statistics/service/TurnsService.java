package edu.eci.cvds.statistics.service;

import java.time.LocalDate;
import java.util.List;

import edu.eci.cvds.statistics.dto.turns.TurnsAvgByRoleDto;
import edu.eci.cvds.statistics.dto.turns.TurnsAvgBySpecialityDto;
import edu.eci.cvds.statistics.dto.turns.TurnsByRoleDto;
import edu.eci.cvds.statistics.dto.turns.TurnsBySpecialityDto;

public interface TurnsService {
    public List<TurnsBySpecialityDto> getTurnsBySpeciality(String speciality, LocalDate start, LocalDate end,
            String status);

    public List<TurnsByRoleDto> getTurnsByRol(String speciality, LocalDate start, LocalDate end, String status);

    public List<TurnsAvgByRoleDto> getTurnsAvgByRol(String speciality, LocalDate start, LocalDate end);

    public List<TurnsAvgBySpecialityDto> getTurnsAvgBySpeciality(String speciality, LocalDate start, LocalDate end);
}