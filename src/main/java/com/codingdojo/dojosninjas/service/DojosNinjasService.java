package com.codingdojo.dojosninjas.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.codingdojo.dojosninjas.models.Dojos;
import com.codingdojo.dojosninjas.models.Ninjas;
import com.codingdojo.dojosninjas.repository.DojoRepository;
import com.codingdojo.dojosninjas.repository.NinjaRepository;

@Service
public class DojosNinjasService {
	@Autowired
	private NinjaRepository ninjaRepository;
	@Autowired
	private DojoRepository dojoRepository;
    public List<Ninjas> all() {
        return ninjaRepository.findAll();
    }
    public List<Dojos> Dall() {
        return dojoRepository.findAll();
    }
    public Ninjas createN(Ninjas ninjas) {
        return ninjaRepository.save(ninjas);
    }
    public Dojos createD(Dojos dojos) {
        System.out.println(dojos);
        return dojoRepository.save(dojos);
    }
    public Ninjas deleteN(Long id) {
        ninjaRepository.deleteById(id);
		return null;
    }
    public Ninjas find(Long id) {
        Optional<Ninjas> optionalDriver = ninjaRepository.findById(id);
        if(optionalDriver.isPresent()) {
            return optionalDriver.get();
        } else {
            return null;
        }
    }
    public Dojos findD(Long id) {
        Optional<Dojos> optionalL = dojoRepository.findById(id);
        if(optionalL.isPresent()) {
            return optionalL.get();
        } else {
            return null;
        }
    }
}
