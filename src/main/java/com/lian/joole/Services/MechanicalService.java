package com.lian.joole.Services;

import com.lian.joole.Entity.Mechanical;

import java.util.List;


public interface MechanicalService {
    List<Mechanical> getMechanicalsWithType(String type);
}
