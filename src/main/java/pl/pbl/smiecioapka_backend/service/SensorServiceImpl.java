package pl.pbl.smiecioapka_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pbl.smiecioapka_backend.entity.Sensor;
import pl.pbl.smiecioapka_backend.repository.SensorRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SensorServiceImpl  implements SensorService{
    private final SensorRepository sensorRepository;

    @Autowired
    public SensorServiceImpl(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public List<Sensor> getSensorsList() {
        return sensorRepository.findAll();
    }

    @Override
    public Sensor getSensorById(Long sensorId) {
        Optional<Sensor> sensor = sensorRepository.findById(sensorId);

        if(!sensor.isPresent()) {
            System.out.println("Sensor not available");
        }

        return sensor.get();
    }

    @Override
    public String saveDefaultSensor() {
        Sensor sensorDefault = new Sensor( 25, "00:1A:2B:3C:4D:5E", LocalDate.now());
        sensorRepository.save(sensorDefault);
        return "dodano pomyslnie domyslny sensor";
    }


}
