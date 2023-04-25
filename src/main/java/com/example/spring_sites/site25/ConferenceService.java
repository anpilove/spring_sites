package com.example.spring_sites.site25;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConferenceService {
    @Autowired
    private ConferenceRepository repo;

    public List<Conference> listAll(String keyword){
        if (keyword != null){
            return repo.search(keyword);
        }
        return repo.findAll();
    }

    public void save(Conference conference){
        repo.save(conference);
    }

    public Conference get(Long id){
        return repo.findById(id).get();
    }

    public void delete(Long id){
        repo.deleteById(id);
    }


}
