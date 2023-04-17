package com.example.mainsite.site24;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface CargoRepository extends JpaRepository<Cargo, Long> {
    @Query("SELECT p FROM Cargo p WHERE CONCAT(p.name_load, ' ', p.content, ' ', p.city_from , ' ', p.city_to, ' ', p.data_input, ' ', p.data_output) LIKE %?1%")
    List<Cargo> search(String keyword);


}