/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author PC
 */
public class Ejercicio7 {
    class Vehiculo {
        private String patente;
        private String modelo;
        private Motor motor; 
        private Conductor conductor;

        public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
            this.patente = patente;
            this.modelo = modelo;
            this.motor = motor;
            this.conductor = conductor;
        }
    }

    class Motor {
        private String tipo;
        private String numeroSerie;

        public Motor(String tipo, String numeroSerie) {
            this.tipo = tipo;
            this.numeroSerie = numeroSerie;
        }
    }

    class Conductor {
        private String nombre;
        private String licencia;
        private Vehiculo vehiculo; 

        public Conductor(String nombre, String licencia) {
            this.nombre = nombre;
            this.licencia = licencia;
        }
    }
}
