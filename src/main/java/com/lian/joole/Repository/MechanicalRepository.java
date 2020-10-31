package com.lian.joole.Repository;

import com.lian.joole.Entity.Mechanical;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MechanicalRepository extends JpaRepository<Mechanical, Integer> {
    Mechanical findMechanicalById(Integer id);
    List<Mechanical> findMechanicalsByType(String type);


}
