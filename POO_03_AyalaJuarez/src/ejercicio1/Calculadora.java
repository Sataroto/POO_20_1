/*
 *Nombre:Gerardo Ayala Juarez
 *Tema:Sobrecarga
 *Descripcion: la clase “Calculadora” que permita realizar las operaciones aritméticas básicas (+, -, *, /) al menos de tres formas diferentes (aplicación de sobrecarga). El resto de las funciones de una calculadora estándar (%, ±, √, x2, 1 ), de forma tradicional (sin sobrecarga).
 *Fecha: 3/09/2019
 *
 */
package ejercicio1;

public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculadora() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public double suma(){
    return this.getNum1()+this.getNum2();
    }
    
    public double suma(double num3){
    return this.getNum1()+this.getNum2() + num3;
    }
    public double suma(double num3, double num4){
    return this.getNum1()+this.getNum2()+ num3 + num4;
    }
    
    public double resta(){
    return this.getNum1()-this.getNum2();
    }
    
    public double resta(double num3){
    return this.getNum1()-this.getNum2()-num3;
    }
    
    public double resta(double num3, double num4){
    return this.getNum1()-this.getNum2()-num3-num4;
    }
    
    public double multiplicacion(){
    return this.getNum1()+this.getNum2();
    }
    
    public double multiplicacion(double num3){
    return this.getNum1()*this.getNum2()*num3;
    }
    
    public double multiplicacion(double num3, double num4){
    return this.getNum1()*this.getNum2()*num3*num4;
    }
    public double division(){
    return this.getNum1()/this.getNum2();
    }
    
    public double division(boolean alrevez){
        if (alrevez)
            return this.getNum2()/this.getNum1();
        return this.getNum1()/this.getNum2();
    }
    
    public double division(boolean primero, double num){
        if (primero)
            return this.getNum1()/num;
    return this.getNum2()/num;
    }
    public double raiz(boolean primero){
        if(primero)
            return (double)Math.sqrt(this.num1);
        return (double)Math.sqrt(this.num2);
    }
    public double porcentaje(boolean primero){
        if(primero)
            return (this.num1*100)/this.num2;
        return (this.num1*100)/this.num2;
    }
    public double signo(boolean primero){
        if(primero)
            return -1*(this.num1);
        return -1*(this.num2);
    }
    public double alcuadrado(boolean primero){
        if(primero)
               return num1*num1;
        return num2*num2;
    }
    public double unosobre(boolean primero){
        if(primero)
               return 1/num1;
        return 1/num2;
    }
}
