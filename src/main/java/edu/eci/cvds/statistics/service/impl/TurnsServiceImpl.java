package edu.eci.cvds.statistics.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.cvds.statistics.client.TurnsClient;
import edu.eci.cvds.statistics.dto.turns.*;
import edu.eci.cvds.statistics.service.TurnsService;

@Service
public class TurnsServiceImpl implements TurnsService {

    private TurnsClient turnsClient;

    public TurnsServiceImpl(TurnsClient turnsClient) {
        this.turnsClient = turnsClient;
    }

    @Override
    public List<TurnsBySpecialityDto> getTurnsBySpeciality(String speciality, LocalDate start, LocalDate end,
            String status) {
        return turnsClient.getTurnsBySpeciality(speciality, start, end, status);
    }

    @Override
    public List<TurnsByRoleDto> getTurnsByRol(String speciality, LocalDate start, LocalDate end, String status) {
        return turnsClient.getTurnsByRole(speciality, start, end, status);
    }

    @Override
    public List<TurnsAvgByRoleDto> getTurnsAvgByRol(String speciality, LocalDate start, LocalDate end) {
        return turnsClient.getAvgTurnsByRole(speciality, start, end);
    }

    @Override
    public List<TurnsAvgBySpecialityDto> getTurnsAvgBySpeciality(String speciality, LocalDate start, LocalDate end) {
        return turnsClient.getAvgTurnsBySpeciality(speciality, start, end);
    }

}