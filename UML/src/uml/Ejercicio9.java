/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uml;

/**
 *
 * @author PC
 */
public class Ejercicio9 {
    class CitaMedica {
        private String fecha;
        private String hora;
        private Paciente paciente; 
        private Profesional profesional; 

        public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
            this.fecha = fecha;
            this.hora = hora;
            this.paciente = paciente;
            this.profesional = profesional;
        }
    }

    class Paciente {
        private String nombre;
        private String obraSocial;

        public Paciente(String nombre, String obraSocial) {
            this.nombre = nombre;
            this.obraSocial = obraSocial;
        }
    }

    class Profesional {
        private String nombre;
        private String especialidad;

        public Profesional(String nombre, String especialidad) {
            this.nombre = nombre;
            this.especialidad = especialidad;
        }
    }
}
