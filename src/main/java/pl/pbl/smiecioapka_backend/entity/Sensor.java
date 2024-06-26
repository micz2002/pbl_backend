package pl.pbl.smiecioapka_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Sensor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int sensorValue;
    private String sensorMac;
    private LocalDate readingDate;

    public Sensor() {
    }

    public Sensor(int sensorValue, String sensorMac, LocalDate readingDate) {
        this.sensorValue = sensorValue;
        this.sensorMac = sensorMac;
        this.readingDate = readingDate;
    }

    public int getSensorValue() {
        return sensorValue;
    }

    public void setSensorValue(int sensorValue) {
        this.sensorValue = sensorValue;
    }

    public String getSensorMac() {
        return sensorMac;
    }

    public void setSensorMac(String sensorMac) {
        this.sensorMac = sensorMac;
    }

    public LocalDate getReadingDate() {
        return readingDate;
    }

    public void setReadingDate(LocalDate readingDate) {
        this.readingDate = readingDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
