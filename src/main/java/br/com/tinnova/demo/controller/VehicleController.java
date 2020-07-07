package br.com.tinnova.demo.controller;

import br.com.tinnova.demo.entity.Vehicle;
import br.com.tinnova.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/vehicle")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Vehicle>> getAll() {
        return ResponseEntity.ok(this.vehicleService.listAll());
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    public ResponseEntity<Vehicle> get(@PathVariable Long id) {
        return ResponseEntity.ok(this.vehicleService.findById(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Vehicle> save(@RequestBody @Valid Vehicle vehicle) {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.vehicleService.save(vehicle));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Vehicle> update(@PathVariable Long id,
                                          @RequestBody @Valid Vehicle vehicle) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.vehicleService.update(id, vehicle));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Vehicle> update(@PathVariable Long id) {
        this.vehicleService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<Vehicle> updateYear(@PathVariable Long id,
                                              @RequestBody @Valid Vehicle vehicle) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.vehicleService.updateYear(vehicle));
    }


}