package edu.eci.cvds.statistics.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.eci.cvds.statistics.client.TurnsClient;
import edu.eci.cvds.statistics.dto.turns.*;
import edu.eci.cvds.statistics.service.TurnsService;

@Service
public class TurnsServiceImpl implements TurnsService {

    private TurnsAvgByRoleDto turnsAvgByRoleDto;
    private TurnsAvgBySpecialityDto turnsAvgBySpecialityDto;
    private TurnsByRoleDto turnsByRoleDto;
    private TurnsBySpecialityDto turnsBySpecialityDto;
    private TurnsClient turnsClient;

    public TurnsServiceImpl(TurnsAvgByRoleDto turnsAvgByRoleDto, TurnsAvgBySpecialityDto turnsAvgBySpecialityDto,
            TurnsBySpecialityDto turnsBySpecialityDto, TurnsByRoleDto turnsByRoleDto, TurnsClient turnsClient) {
        this.turnsByRoleDto = turnsByRoleDto;
        this.turnsBySpecialityDto = turnsBySpecialityDto;
        this.turnsAvgByRoleDto = turnsAvgByRoleDto;
        this.turnsAvgBySpecialityDto = turnsAvgBySpecialityDto;
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
        return null;
    }

    @Override
    public List<TurnsAvgBySpecialityDto> getTurnsAvgBySpeciality(String speciality, LocalDate start, LocalDate end) {
        return null;
    }

}