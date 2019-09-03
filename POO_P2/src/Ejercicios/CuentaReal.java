/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa: Cuenta
 * Version: 2.0
 * descripcion: simular una cuenta bancaria, dicha cuenta debe tener un
 *  saldo y se pueden realizar las siguientes operaciones sobre ella: mostrar el saldo, depositar y
 *  retirar.
 * fecha: 23 de Agosto 2019
 */
package Ejercicios;

public class CuentaReal {
    private double saldo=100; // para que siempre se aplique la regla

    public CuentaReal(double saldo) {
        this.Depositar(saldo);
    }
    
    public void Depositar (double deposito){
        if(deposito>0)
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
    

}
