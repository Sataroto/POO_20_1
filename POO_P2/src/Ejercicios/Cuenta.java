/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa: Cuenta
 * Version: 1.0
 * descripcion: simular una cuenta bancaria, dicha cuenta debe tener un
 *  saldo y se pueden realizar las siguientes operaciones sobre ella: mostrar el saldo, depositar y
 *  retirar.
 * fecha: 23 de Agosto 2019
 */
package Ejercicios;

public class Cuenta {
    public double saldo=0; // para que siempre se aplique la regla
    
    public void Depositar (double deposito){
        this.saldo+=deposito;
    }
    
    public void Retirar (double retirar){
        if(!(retirar >= this.saldo)){
            this.saldo-=retirar;
        }
    }
    
    public void ImprimirSaldo (){
        System.out.println("El saldo disponible es:" + this.saldo);
    }
    
    public static void main(String[] args){
    Cuenta cta= new Cuenta();
    cta.saldo+=47;
    cta.saldo= cta.saldo -150; 
    cta.ImprimirSaldo();
    cta.Depositar(200);
    cta.Retirar(200);
    cta.ImprimirSaldo();
    }
}
