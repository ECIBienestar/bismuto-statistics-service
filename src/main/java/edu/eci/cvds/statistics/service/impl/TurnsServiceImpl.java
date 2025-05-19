package edu.eci.cvds.statistics.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.cvds.statistics.dto.turns.*;
import edu.eci.cvds.statistics.service.TurnsService;

@Service
public class TurnsServiceImpl implements TurnsService {

    @Override
    public List<TurnsBySpecialityDto> getTurnsBySpeciality() {
        return null;
    }

    @Override
    public List<TurnsByRoleDto> getTurnsByRol() {
        return null;
    }

    @Override
    public List<TurnsAvgByRoleDto> getTurnsAvgByRol() {
        return null;
    }

    @Override
    public List<TurnsAvgBySpecialityDto> getTurnsAvgBySpeciality() {
        return null;
    }

}