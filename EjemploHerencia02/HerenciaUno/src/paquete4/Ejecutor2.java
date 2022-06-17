/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author USER
 */
public class Ejecutor2 {
    
    public static void main(String[] args) {
        
        String nombre = "Pablo";
        String apellido = "Ramon";
        String identificacion = "115064";
        int edad = 18;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerCostoCredito(12.50);
        estPresencial.establecerNumeroCreditos(120);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
