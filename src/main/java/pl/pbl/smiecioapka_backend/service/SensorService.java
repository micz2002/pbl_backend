package pl.pbl.smiecioapka_backend.service;

import pl.pbl.smiecioapka_backend.entity.Sensor;

import java.util.List;

public interface SensorService {
    List<Sensor> getSensorsList();

    Sensor getSensorById(Long sensorId);

    //dodanie przykladowego sesora do bazy
    String saveDefaultSensor();

}
