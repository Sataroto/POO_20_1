 /*
 *Nombre:Gerardo Ayala Juarez
 *Tema:Sobrecarga
 *Descripcion:Realizar el diagrama y la clase “Conjunto” que permita almacenar una colección de valores de tipo entero, para ello, debe poder crearse a partir de un arreglo de datos, un String o un arreglo de caracteres. Se deben agregar 3 métodos sobrecargados que permitan obtener los elementos del arreglo 
 *Fecha: 4/09/2019
 *
 */
package ejercicio2;

public class Conjunto {
    int[] arreglo;

    public Conjunto(int[] arreglo) {
        
        this.arreglo = arreglo;
    }
    public Conjunto(String cadena) {
        arreglo= new int[ cadena.length() ];
        for (int i=0; i<cadena.length();i++){
            arreglo[i]=cadena.codePointAt(i);
        }
    }
    public Conjunto(char[] caracteres) {
        arreglo= new int[caracteres.length];
        for (int i=0; i<caracteres.length;i++){
            arreglo[i]=(int)caracteres[i];
        }
    }
    
    public void SacarRango(int n){
        if(n<arreglo.length){
            for(int i=0;i<n;i++){
                System.out.print(arreglo[i]);
                System.out.print(",");
            }
           System.out.println(); 
        }
    }
        
    public void SacarRango(int n1, int n2){
        if(n1<arreglo.length-1&&n2<arreglo.length){
            for(int i=n1-1;i<n2-1;i++){
                System.out.print(arreglo[i]);
                System.out.print(",");
            }
            System.out.println();
        }    
    }
    public void SacarRango(int n1, int n2, int n3){
        if(n1<arreglo.length-1&&n2<arreglo.length){
            for(int i=n1-1;i<n2-1;i=i+n3){
                System.out.print(arreglo[i]);
                System.out.print(",");
            }
            System.out.println();
        }    
    }
    
}
