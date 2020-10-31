package com.lian.joole.Response;

import com.lian.joole.Entity.Mechanical;

import java.util.List;

public class MechanicalListResponse {
    private final List<Mechanical> mechanicalList;

    public MechanicalListResponse(List<Mechanical> mechanicalList) {
        this.mechanicalList = mechanicalList;
    }

    public List<Mechanical> getMechanicalList() {
        return mechanicalList;
    }
}
