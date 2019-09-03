/*
 * nombre: Gerardo Ayala Juarez
 * tema del programa:Ejercicio 1 Reloj 
 * descripcion: simule un reloj que indique horas, minutos y segundos: HH:MM:SS
 *(formato de 24 hrs.). Se deben definir los métodos que permitan cambiar solo segundos o minutos
 *u horas, así como un método que permita ver la hora completa.
 * fecha: 23 de Agosto 2019
 */
package Ejercicios;
public class Reloj {
    private int segundo, hora, minuto;
    
    public void CambiarSegundo(int segundo){
        if (!(segundo>60||segundo<0)){
            this.segundo = segundo;
        }
    }
    public void CambiaMinuto(int minuto){
        if (!(minuto>60||minuto<0)){
            this.minuto = minuto;
        }
    }
    public void AsignarSegundo(int segundo){
        if (!(segundo>60||segundo<0)){
            this.segundo = segundo;
        }
    }
    public void AsignarMinuto(int minuto){
        if (!(minuto>60||minuto<0)){
            this.minuto = minuto;
        }
    }
    public void AsignarHora(int hora){
        if (!(hora>24||hora<0)){
            this.hora = hora;
        }
    }
    public void ImprimirHora(){
        System.out.println("La hora Guardada es: "+ this.hora+ ":"+this.minuto+":"+this.segundo);
    }
    public static void main(String[] args){
       Reloj Hora1 = new Reloj();
       Reloj Hora2 = new Reloj();
       Reloj Hora3 = new Reloj();
       
       Hora1.AsignarHora(23);
       Hora1.AsignarMinuto(59);
       Hora1.AsignarSegundo(59);
       Hora1.ImprimirHora();
       Hora1.CambiaMinuto(61);
       Hora1.CambiarSegundo(-8);
       Hora1.ImprimirHora();
       
       Hora2.AsignarHora(0);
       Hora2.AsignarMinuto(0);
       Hora2.AsignarSegundo(0);
       Hora2.ImprimirHora();
       Hora2.CambiaMinuto(2);
       Hora2.CambiarSegundo(5);
       Hora2.ImprimirHora();
       
       Hora3.AsignarHora(10);
       Hora3.AsignarMinuto(02);
       Hora3.AsignarSegundo(034);
       Hora3.ImprimirHora();
       Hora3.CambiaMinuto(61);
       Hora3.CambiarSegundo(30);
       Hora3.ImprimirHora();
       
    }
}
