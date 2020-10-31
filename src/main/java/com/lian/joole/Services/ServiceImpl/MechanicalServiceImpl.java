package com.lian.joole.Services.ServiceImpl;

import com.lian.joole.Entity.Mechanical;
import com.lian.joole.Repository.MechanicalRepository;
import com.lian.joole.Services.MechanicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MechanicalServiceImpl implements MechanicalService {

    @Autowired
    private MechanicalRepository mechanicalRepository;


    @Override
    public List<Mechanical> getMechanicalsWithType(String type) {
        List<Mechanical> mechanicals = mechanicalRepository.findMechanicalsByType(type);
        return mechanicals;
    }
}
