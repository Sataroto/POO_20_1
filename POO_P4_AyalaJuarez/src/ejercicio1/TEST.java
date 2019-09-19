/*
 *Nombre:Gerardo Ayala Juarez
 *Tema:Uso de variables y métodos de clase
 *Descripcion:Prueba de 4 fechas manipulandoas y haciendo uso de una funcion estatica
 *
 *Fecha: 17/09/2019
 *
 */
package ejercicio1;

/**
 *
 * @author Gerardo Ayala Juarez
 */
public class TEST {
    public static void main(String[] aggg){
        Fecha f1= new Fecha(12,27,1992);
        Fecha f2= new Fecha(0,99,8045);
        Fecha f3= new Fecha(2,29,1993) ;
        Fecha f4= new Fecha(1,2,2005);
        
        System.out.println("Empezamos a manipular Fecha 1");
        System.out.println(f1.mostrarfecha());
        f1.restarDias(45);
        System.out.println("45 dias restados: "+f1.mostrarfecha());
        f1.sumarDias(54);
        System.out.println("54 dias sumados: "+f1.mostrarfecha());
        
        System.out.println("Empezamos a manipular Fecha 2");
        System.out.println(f2.mostrarfecha());
        f2.restarDias(60);
        System.out.println("60 dias restados: "+f2.mostrarfecha());
        f2.sumarDias(30);
        System.out.println("30 dias sumados: "+f2.mostrarfecha());
        
        System.out.println("Empezamos a manipular Fecha 3");
        System.out.println(f3.mostrarfecha());
        f3.restarDias(1);
        System.out.println("un dia restados: "+f3.mostrarfecha());
        f3.sumarDias(1);
        System.out.println("un dia sumados: "+f3.mostrarfecha());
        
        System.out.println("Empezamos a manipular Fecha 4");
        System.out.println(f4.mostrarfecha());
        f4.restarDias(60);
        System.out.println("un año restados: "+f4.mostrarfecha());
        f4.sumarDias(20);
        System.out.println("dos años sumados: "+f4.mostrarfecha());
        
         //29/2/1991
        
        System.out.println( "Dias transcurridos: "+Fecha.diasTranscurridos(29, 2, 1991));//Si arroja menos uno es porque es una fecha no valida
    }
}
