package com.lian.joole.Entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mechanicals")
public class Mechanical {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "type")
    private String type;
    @Column(name="name")
    private String name;
    @Column(name = "airflow")
    private Integer airflow;
    @Column(name = "max_power")
    private float maxPower;
    @Column(name = "sound")
    private Integer sound;
    @Column(name = "date")
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAirflow() {
        return airflow;
    }

    public void setAirflow(Integer airflow) {
        this.airflow = airflow;
    }

    public float getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(float maxPower) {
        this.maxPower = maxPower;
    }

    public Integer getSound() {
        return sound;
    }

    public void setSound(Integer sound) {
        this.sound = sound;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
