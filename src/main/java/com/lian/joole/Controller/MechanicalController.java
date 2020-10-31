package com.lian.joole.Controller;

import com.lian.joole.Entity.Mechanical;
import com.lian.joole.Response.MechanicalListResponse;
import com.lian.joole.Services.MechanicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MechanicalController {
    @Autowired
    private MechanicalService service;


    @GetMapping("getMechanicals")
    public ResponseEntity<?> getMechincalListWithType(@RequestParam String type) {
        List<Mechanical> mechanicalList = service.getMechanicalsWithType(type);
        return ResponseEntity.ok(new MechanicalListResponse(mechanicalList));
    }
}
