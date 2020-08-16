package com.wawa.platform.reference.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wawa.platform.reference.model.Aggregate;
import com.wawa.platform.reference.repo.AggregateRepository;

@RestController
public class AggregateRestController {
    @Autowired
    AggregateRepository repo ;

    @RequestMapping(value="/aggregates", method = RequestMethod.GET)
	  public List getAggregates() { return repo.findAll(); }
	 
    @RequestMapping(value="/aggregate", method = RequestMethod.GET)
    public Optional<Aggregate> getAggregate(@RequestParam(name = "id", defaultValue ="1") Long id)
    {
        return repo.findById(id);
    }

   

}
