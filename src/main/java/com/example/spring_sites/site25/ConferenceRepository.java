package com.example.spring_sites.site25;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ConferenceRepository extends JpaRepository<Conference, Long> {
    @Query("SELECT p FROM  Conference p WHERE CONCAT(p.name, ' ', p.data_input, ' ', p.FIO_moder , ' ', p.FIO_speaker) LIKE %?1%")
    List<Conference> search(String keyword);


}
