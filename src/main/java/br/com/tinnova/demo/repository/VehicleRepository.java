package br.com.tinnova.demo.repository;

import br.com.tinnova.demo.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
