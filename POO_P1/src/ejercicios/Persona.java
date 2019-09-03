/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa:
 * descripcion:
 * fecha: @date
 */
package ejercicios;

/**
 *
 * @author Gerardo Ayala Juarez
 */
public class Persona {
    private float peso;
    private float altura;
    private char genero;

    public Persona(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }
    
    
    public double CalcularImc(){
     
        return (this.peso/(this.altura*this.altura));
    }
    
    public String SituacionImc(){
        if(this.CalcularImc()> 40){
            return "Obesidad Grave\n";
        }
        else if(this.CalcularImc()> 35){
            return "Obesidad Medio\n";
        }
        else if(this.CalcularImc()> 30){
            return "Obesidad Inicial\n";
        }
        else if(this.CalcularImc()> 25){
            return "Sobrepeso \n";
        }
        else if(this.CalcularImc()> 18.49){
            return " Adecuado\n";
        }
        else{
            return "Bajo Peso\n";
        }
                
    }
}
