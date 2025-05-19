package edu.eci.cvds.statistics.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.cvds.statistics.dto.TurnsAvgByRolDto;
import edu.eci.cvds.statistics.dto.TurnsAvgBySpecialityDto;
import edu.eci.cvds.statistics.dto.TurnsByRolDto;
import edu.eci.cvds.statistics.dto.TurnsBySpecialityDto;
import edu.eci.cvds.statistics.service.TurnsService;

@Service
public class TurnsServiceImpl implements TurnsService {

    @Override
    public List<TurnsBySpecialityDto> getTurnsBySpeciality() {
        return null;
    }

    @Override
    public List<TurnsByRolDto> getTurnsByRol() {
        return null;
    }

    @Override
    public List<TurnsAvgByRolDto> getTurnsAvgByRol() {
        return null;
    }

    @Override
    public List<TurnsAvgBySpecialityDto> getTurnsAvgBySpeciality() {
        return null;
    }

}