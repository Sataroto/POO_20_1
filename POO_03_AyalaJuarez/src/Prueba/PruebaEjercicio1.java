/*
 *Nombre:Gerardo Ayala Juarez
 *Tema:Sobrecarga
 *Descripcion: Es donde se prueba el funcionamiento del ejercicio 1
 *Fecha: 4/09/2019
 *
 */
package Prueba;

import ejercicio1.Calculadora;

/**
 *
 * @author Alumno
 */
public class PruebaEjercicio1 {
    public static void main (String[] agggg){
        Calculadora prueba = new Calculadora(65, 75);
        System.out.println("El resultado de la operacion: " +prueba.suma()); //suma entre dos numeros
        System.out.println("El resultado de la operacion: " +prueba.suma(23));//suma entre tres numeros
        System.out.println("El resultado de la operacion: " +prueba.suma(23,45)); //suma entre 4 numeros
        System.out.println("El resultado de la operacion: " +prueba.resta());// resta del primero con el segundo
        System.out.println("El resultado de la operacion: " +prueba.resta(13)); //resta del primero con dos numeros
        System.out.println("El resultado de la operacion: " +prueba.resta(13,23));//resta del primero con tres numeros
        System.out.println("El resultado de la operacion: " +prueba.multiplicacion());//multiplicacion de dos numeros
        System.out.println("El resultado de la operacion: " +prueba.multiplicacion(2));//multiplicacionde tres numeros
        System.out.println("El resultado de la operacion: " +prueba.multiplicacion(2,3));//multiplicacion de 4 numeros
        System.out.println("El resultado de la operacion: " +prueba.division());//divison del primero con el segundo
        System.out.println("El resultado de la operacion: " +prueba.division(false));//division del segundo con el primero
        System.out.println("El resultado de la operacion: " +prueba.division(false, 4)); //dividimos el primer numeor con el numero ingresado
        System.out.println("El resultado de la operacion: " +prueba.alcuadrado(true)); //Elevamos al cuadrado el numero 1
        System.out.println("El resultado de la operacion: " +prueba.porcentaje(false));//sacamos porcentaje del primer respecto el segundo numero 
        System.out.println("El resultado de la operacion: " +prueba.raiz(true)); //raiz dewl primer numero
        System.out.println("El resultado de la operacion: " +prueba.unosobre(false));//dividimos el 1 sobre el segundo numero
        System.out.println("El resultado de la operacion: " +prueba.signo(false));//el segudno numero en su signo contrario
    }
}
