/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa: Introduccion a Java IV 
 * descripcion: Trabajr con alertas y cuadros.
 * fecha: 13-08-19
 */
package ejercicios;

import javax.swing.JOptionPane;

public class CuadroDialogo {
    public static void main(String args[]){
        String nombre = JOptionPane.showInputDialog("Escribe tu nombre");
        JOptionPane.showMessageDialog(null, "Hola " + nombre.toUpperCase()+ " Bienvenido a NetBeans");
    }
}
