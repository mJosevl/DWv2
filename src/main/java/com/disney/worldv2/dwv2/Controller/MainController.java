package com.disney.worldv2.dwv2.Controller;
import com.disney.worldv2.dwv2.Model.Genero;
import com.disney.worldv2.dwv2.Model.Pelicula_o_Serie;
import com.disney.worldv2.dwv2.Model.Personaje;
import com.disney.worldv2.dwv2.Repository.GeneroRepository;
import com.disney.worldv2.dwv2.Repository.Pelicula_o_SerieRepository;
import com.disney.worldv2.dwv2.Repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "disney/world/")
public class MainController {

    @Autowired
    private GeneroRepository generoRepository;

    @Autowired
    private Pelicula_o_SerieRepository pelicula_o_serieRepository;

    @Autowired
    private PersonajeRepository personajeRepository;


/////////////////////////////////////////////READ////////////////////////////////////////////////////////////


    @GetMapping(path = "genero/all")
    public @ResponseBody
    Iterable<Genero> getAllGenero() {
        return generoRepository.findAll();
    }

    @GetMapping(path = "characters/all")
    public @ResponseBody
    Iterable<Personaje> getAllPersonaje() {

        return personajeRepository.findAll();
    }

    @GetMapping(path = "peliculas_o_series/all")
    public @ResponseBody
    Iterable<Pelicula_o_Serie> getAllPelicula_o_serie() {

        return pelicula_o_serieRepository.findAll();
    }

///////////////////////////////////////////POST////////////////////////////////////////
    @PostMapping(path = "peliculas_o_series/create", consumes = "application/json", produces = "application/json")
    public Pelicula_o_Serie createPOS(@RequestBody Pelicula_o_Serie nPOS) {
        return pelicula_o_serieRepository.save(nPOS);
    }

    @PostMapping(path = "characters/create", consumes = "application/json", produces = "application/json")
    public Personaje createPOS(@RequestBody Personaje nPersonaje) {
        return personajeRepository.save(nPersonaje);
    }
    @PostMapping(path = "genero/create", consumes = "application/json", produces = "application/json")
    public Genero createPOS(@RequestBody Genero nGenero) {
        return generoRepository.save(nGenero);
    }


}
