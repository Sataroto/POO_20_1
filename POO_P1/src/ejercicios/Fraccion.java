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
public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion() {
        this.numerador=0;
        this.denominador=0;
    }
    public Fraccion(Fraccion f){
        this.numerador=f.numerador;
        this.denominador=f.denominador;
    }
            

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
}
