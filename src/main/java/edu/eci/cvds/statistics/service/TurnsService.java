package edu.eci.cvds.statistics.service;

import java.util.List;

import edu.eci.cvds.statistics.dto.turns.TurnsAvgByRolDto;
import edu.eci.cvds.statistics.dto.turns.TurnsAvgBySpecialityDto;
import edu.eci.cvds.statistics.dto.turns.TurnsByRolDto;
import edu.eci.cvds.statistics.dto.turns.TurnsBySpecialityDto;

public interface TurnsService {
    public List<TurnsBySpecialityDto> getTurnsBySpeciality();

    public List<TurnsByRolDto> getTurnsByRol();

    public List<TurnsAvgByRolDto> getTurnsAvgByRol();

    public List<TurnsAvgBySpecialityDto> getTurnsAvgBySpeciality();
}