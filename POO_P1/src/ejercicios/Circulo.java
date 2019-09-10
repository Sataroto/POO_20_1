/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa:
 * descripcion:
 * fecha: @date
 */
package ejercicios;

public class Circulo {
    //atributos
    float radio=5;
    static float pi=3.1416f;
    //Metodos
    float calcularArea(){
        float area = pi*radio*radio;
        return area;
    }
    float calcularPerimetro(){
        float perimetro= radio*2*pi;
        return perimetro;
    }
    
    
}
