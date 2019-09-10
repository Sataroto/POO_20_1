/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa:
 * descripcion:
 * fecha: @date
 */
package ejercicios;

/**
 *
 * @author Alumno
 */
public class Esfera {
    float radio;
    static int contador=0;
    public Esfera(float r){
        radio=r;
        contador++;
    }
    public float calcularVolumen(){
        return (float)((4/3)* Circulo.pi * (Math.pow(radio, 3)));
    }
    {
    System.out.println("Hola estaticos!!!");
    }
 }
