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
    @Column(name = "Manufacture")
    private String manufacture;
    @Column(name = "Series")
    private String series;
    @Column(name = "Model")
    private String model;
    @Column(name = "airflow")
    private Integer airflow;
    @Column(name = "max_power")
    private float maxPower;
    @Column(name = "sound")
    private Integer sound;
    @Column(name = "date")
    private Date date;
    @Column(name ="fan_sweep_diameter")
    private Integer diameter;
    @Column(name="min_power")
    private float minPower;
    @Column(name="min_vac")
    private Integer minVAC;
    @Column(name="max_vac")
    private Integer maxVAC;
    @Column(name="speeds")
    private Integer speeds;
    @Column(name="use_type")
    private String useType;
    @Column(name="application")
    private String application;
    @Column(name="mount")
    private String mount;
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

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public Integer getDiameter() {
        return diameter;
    }

    public void setDiameter(Integer diameter) {
        this.diameter = diameter;
    }

    public float getMinPower() {
        return minPower;
    }

    public void setMinPower(float minPower) {
        this.minPower = minPower;
    }

    public Integer getMinVAC() {
        return minVAC;
    }

    public void setMinVAC(Integer minVAC) {
        this.minVAC = minVAC;
    }

    public Integer getMaxVAC() {
        return maxVAC;
    }

    public void setMaxVAC(Integer maxVAC) {
        this.maxVAC = maxVAC;
    }

    public Integer getSpeeds() {
        return speeds;
    }

    public void setSpeeds(Integer speeds) {
        this.speeds = speeds;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount;
    }
}
