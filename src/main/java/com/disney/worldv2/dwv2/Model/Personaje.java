package com.disney.worldv2.dwv2.Model;

import javax.persistence.*;


@Entity
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_personaje;

    private String imagen;
    private String nombre;
    private int edad;
    private  int peso;
    private String historia;

    @OneToOne
    @JoinColumn(name = "id_pelicula_o_serie",referencedColumnName = "id_pelicula_o_serie")
    private Pelicula_o_Serie pelicula_o_serie;

    public int getId_personaje() {
        return id_personaje;
    }

    public void setId_personaje(int id_personaje) {
        this.id_personaje = id_personaje;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public Pelicula_o_Serie getPelicula_o_serie() {
        return pelicula_o_serie;
    }

    public void setPelicula_o_serie(Pelicula_o_Serie pelicula_o_serie) {
        this.pelicula_o_serie = pelicula_o_serie;
    }
}
