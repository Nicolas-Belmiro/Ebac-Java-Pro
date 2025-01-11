package com.Animal_MS.controllers;

import com.Animal_MS.Repository.AnimalRepository;
import com.Animal_MS.dto.ResgatadorDTO;
import com.Animal_MS.entidades.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository){
        this.repository = repository;
    }

    @GetMapping
    private List<Animal> findAll(){

        return repository.findAll();

    }

    @PostMapping
    private Animal create(@RequestBody Animal animal){
        return repository.save(animal);
    }

    @GetMapping("/not-adopted")
    private List<Animal> findNotAdopted(){
        return repository.findyNotAdopted();
    }

    @GetMapping("/adopted")
    private List<Animal> findAdoptes(){
        return repository.findyAdopted();
    }


    @GetMapping("/animais-resgatadores")
    private List<ResgatadorDTO> findAnimaisPorResgatador(){
        return repository.obterResgatadorQuantidadeAnimais();
    }
}