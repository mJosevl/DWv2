package com.disney.worldv2.dwv2.Model;

import javax.persistence.*;
import java.sql.Date;


@Entity
public class Pelicula_o_Serie {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_pelicula_o_serie;

        private String imagen;
        private String titulo;
        private Date fecha_creacion;
        private int calificacion;

        @OneToOne
        @JoinColumn(name = "id_genero",referencedColumnName = "id_genero")
        private Genero genero;

        public int getId_pelicula_o_serie() {
            return id_pelicula_o_serie;
        }

        public void setId_pelicula_o_serie(int id_pelicula_o_serie) {
            this.id_pelicula_o_serie = id_pelicula_o_serie;
        }

        public String getImagen() {
            return imagen;
        }

        public void setImagen(String imagen) {
            this.imagen = imagen;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Date getFecha_creacion() {
            return fecha_creacion;
        }

        public void setFecha_creacion(Date fecha_creacion) {
            this.fecha_creacion = fecha_creacion;
        }

        public int getCalificacion() {
            return calificacion;
        }

        public void setCalificacion(int calificacion) {
            this.calificacion = calificacion;
        }

        public Genero getGenero() {
            return genero;
        }

        public void setGenero(Genero genero) {
            this.genero = genero;
        }
    }
