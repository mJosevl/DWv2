package com.disney.worldv2.dwv2.Repository;

import com.disney.worldv2.dwv2.Model.Personaje;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PersonajeRepository extends CrudRepository<Personaje,Integer> {
    /*@Query(value = "select * from personaje where nombre like %:nombre%", nativeQuery = true)
    Iterable<Personaje>getPersonajePorNombre(@Param("nombre") String nombre);

    Object getPersonajePorNombre();*/
}
