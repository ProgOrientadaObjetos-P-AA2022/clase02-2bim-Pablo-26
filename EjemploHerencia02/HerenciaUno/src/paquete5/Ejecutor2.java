/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author USER
 */
public class Ejecutor2 {
    
    public static void main(String[] args) {
        // Creación de un objeto de tipo EstudianteDistancia
        String nombre = "Pablo";
        String apellido = "Ramon";
        String identificacion = "115064";
        int edad = 18;
        int numCreditos = 120;
        double costoCred = 12.50;
        
                
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numCreditos, costoCred);
        
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
