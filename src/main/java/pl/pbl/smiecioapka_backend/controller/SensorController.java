package pl.pbl.smiecioapka_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.pbl.smiecioapka_backend.entity.Sensor;
import pl.pbl.smiecioapka_backend.repository.SensorRepository;
import pl.pbl.smiecioapka_backend.service.SensorService;

import java.util.List;

@RestController
public class SensorController {

    private final SensorService sensorService;

    @Autowired
    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @GetMapping("/sensors")
    public List<Sensor> getSensorsList() {
        return sensorService.getSensorsList();
    }

    @GetMapping("/sensors/{id}")
    public Sensor getSensorById(@PathVariable("id") Long sensorId) {
        return sensorService.getSensorById(sensorId);
    }

    @GetMapping("/sensors/addDefault")
    public void saveDefaultSensor() {
        sensorService.saveDefaultSensor();
    }
}
