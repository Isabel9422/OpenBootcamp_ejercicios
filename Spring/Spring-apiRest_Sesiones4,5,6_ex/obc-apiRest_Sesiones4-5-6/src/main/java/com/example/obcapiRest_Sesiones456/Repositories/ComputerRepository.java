package com.example.obcapiRest_Sesiones456.Repositories;

import com.example.obcapiRest_Sesiones456.Entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputerRepository extends JpaRepository<Computer,Long> {

}
