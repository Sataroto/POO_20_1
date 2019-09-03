/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa:
 * descripcion:
 * fecha: 23 de Agosto 2019
 */
package Ejercicios;

/**
 *
 * @author Gerardo Ayala Juarez
 */
public class pruebas {
    public static void main(String[] args){
    CuentaReal cta= new CuentaReal(300);

    cta.ImprimirSaldo();
    cta.Depositar(47);
    cta.Retirar(150); 
    cta.ImprimirSaldo();

    }
    
}
