package com.example.obcapiRest_Sesiones456.Controller;

import com.example.obcapiRest_Sesiones456.Entities.Computer;
import com.example.obcapiRest_Sesiones456.Repositories.ComputerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ComputerController {

    private ComputerRepository comrepo;

    public ComputerController(ComputerRepository comrepo) {
        this.comrepo = comrepo;
    }

    /**
     * Devuelve todos los ordenadores creados en la siguiente url: http:/localhost/api/computers
     * @return
     */
    @GetMapping("/api/computers")
    public List<Computer> findAllComputers(){
        return comrepo.findAll();
    }
    @GetMapping("/api/computers/{id}")
    public ResponseEntity<Computer> findOnebyId(@PathVariable ("id") Long id){
        Optional<Computer> comOpt = comrepo.findById(id);

        if(comOpt.isPresent())
                return ResponseEntity.ok(comOpt.get());
            else
                return ResponseEntity.notFound().build();

    }

    @PostMapping("/api/computers")
    public Computer Create(@RequestBody Computer computer){
        return comrepo.save(computer);
    }

}
