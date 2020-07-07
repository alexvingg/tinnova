package br.com.tinnova.demo.service;

import br.com.tinnova.demo.entity.Vehicle;
import br.com.tinnova.demo.exception.ModelNotFoundException;
import br.com.tinnova.demo.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> listAll() {
        return this.vehicleRepository.findAll();
    }

    public Vehicle findById(Long id) {
        return this.vehicleRepository.findById(id).orElseThrow(() -> new ModelNotFoundException("VEHICLE_NOT_FOUND"));
    }

    public Vehicle save(Vehicle vehicle) {
        return this.vehicleRepository.save(vehicle);
    }

    public Vehicle update(Long id, Vehicle vehicle) {

        Vehicle vehicleToUpdate = this.vehicleRepository.findById(id).orElseThrow(
                () -> new ModelNotFoundException("VEHICLE_NOT_FOUND"));

        vehicleToUpdate.setBrand(vehicle.getBrand());
        vehicleToUpdate.setName(vehicle.getName());
        vehicleToUpdate.setSelled(vehicle.isSelled());
        vehicleToUpdate.setYear(vehicle.getYear());

        return this.vehicleRepository.save(vehicleToUpdate);
    }

    public Vehicle updateYear(Vehicle vehicle) {

        Vehicle vehicleToUpdate = this.vehicleRepository.findById(vehicle.getId()).orElseThrow(
                () -> new ModelNotFoundException("VEHICLE_NOT_FOUND"));

        vehicleToUpdate.setYear(vehicle.getYear());

        return this.vehicleRepository.save(vehicleToUpdate);
    }

    public void delete(Long id) {
        this.vehicleRepository.deleteById(id);
    }
}
