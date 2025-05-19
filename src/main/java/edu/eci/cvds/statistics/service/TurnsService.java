package edu.eci.cvds.statistics.service;

import java.util.List;

import edu.eci.cvds.statistics.dto.TurnsAvgByRolDto;
import edu.eci.cvds.statistics.dto.TurnsAvgBySpecialityDto;
import edu.eci.cvds.statistics.dto.TurnsByRolDto;
import edu.eci.cvds.statistics.dto.TurnsBySpecialityDto;

public interface TurnsService {
    public List<TurnsBySpecialityDto> getTurnsBySpeciality();

    public List<TurnsByRolDto> getTurnsByRol();

    public List<TurnsAvgByRolDto> getTurnsAvgByRol();

    public List<TurnsAvgBySpecialityDto> getTurnsAvgBySpeciality();
}