/*
 *Nombre:Gerardo Ayala Juarez
 *Tema:
 *Descripcion: 
 *Fecha: 3/09/2019
 *
 */
package ejercicio1;

/**
 *
 * @author Alumno
 */
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

    private double getNum1() {
        return num1;
    }

    private double getNum2() {
        return num2;
    }

    private void setNum1(double num1) {
        this.num1 = num1;
    }

    private void setNum2(double num2) {
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
    
}
