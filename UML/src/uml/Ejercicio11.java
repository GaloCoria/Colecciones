/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author PC
 */
public class Ejercicio11 {
     class Cancion {
        private String titulo;
        private Artista artista; 

        public Cancion(String titulo, Artista artista) {
            this.titulo = titulo;
            this.artista = artista;
        }

        public String getTitulo() { return titulo; }
        public Artista getArtista() { return artista; }
    }

    class Artista {
        private String nombre;
        private String genero;

        public Artista(String nombre, String genero) {
            this.nombre = nombre;
            this.genero = genero;
        }

        public String getNombre() { return nombre; }
    }

    class Reproductor {
        public void reproducir(Cancion cancion) {
            System.out.println("Reproduciendo: " + cancion.getTitulo() +
                    " de " + cancion.getArtista().getNombre());
        }
    }
}
