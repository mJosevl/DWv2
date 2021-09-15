package com.disney.worldv2.dwv2.Repository;

import com.disney.worldv2.dwv2.Model.Genero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface GeneroRepository extends CrudRepository<Genero,Integer> {
  /*  @Query( value = "select * from genero where genero like %:genero%", nativeQuery = true)
    Iterable<Genero> getGenero(@Param("genero") String nombre, String value);*/
}
