

/*
 *Nombre:Gerardo Ayala Juarez
 *Tema:Uso de variables y métodos de clase
 *Descripcion: Crear un proyecto en Netbeans llamado: POO_P4_apellidos y un paquete llamado “ejercicio1”.
 *Diseñar y crear la clase “Fecha”, la cual modelará las fechas en el Calendario Gregoriano. Cada
 *fecha tendrá 3 datos enteros nombrados día, mes y anio, Seguir el diagrama de Clase previamente corregido
 *
 *Fecha: 17/09/2019
 *
 */
package ejercicio1;
import java.util.Calendar;
/**
 *
 * @author Alumno
 */
public class Fecha {
    //ATRIBUTOS
    private int dia;
    private int mes;
    private int anio;
    public static final int diasxmes[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static final String meses[]={"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public Fecha(){
        
    }
    public Fecha(int d, int m, int a){
        establecerFecha(d,m,a);
    }
    public void establecerFecha(int d, int m, int a){
        Calendar c = Calendar.getInstance();
        anio=(a>=1900 && a <=c.get(Calendar.YEAR))? a : c.get(Calendar.YEAR) ;
        mes=(m>=1 && m<=12)? m : c.get(Calendar.MONTH)+1;
        if(mes==2 && esAnioBisiesto(anio)){
            dia=(d>=1 && d<=29)? d : c.get(Calendar.DAY_OF_MONTH);
        }
        else
            dia=(d>=1 && d<=diasxmes[mes])? d : c.get(Calendar.DAY_OF_MONTH);
    }
    public static boolean esAnioBisiesto(int a){
        boolean bis=false;
        if((a%4==0&&a%100!=0)||(a%100==0&&a%400==0))
            bis=true;
        return bis;
        
    }
    public void incrementarDias(){
        //solo se incrementa de 1 en 1 cada vez
        if(!(esFindeMes(dia)))//para incrementar dias es necesario saber si el dia es el ultimo del mes;
            dia+=1;  //se incrementa el dia
        else
            if(dia==28&&mes==2&&esAnioBisiesto(anio))//en caso de ser 28 y ser año bisiesto tiene que sumar un dia ya que no es el fin de mes.
                dia+=1;
            else if(mes<12){//si es el ultimo dia del mes, se verifica el mes no sea 12
                dia =1; //si el mes no es 12 se setea el dia a primero;
                mes+=1;// y se aumenta un mes al mes;
            }
            else{
                dia= 1; //en caso contario se setea en el dia en el primero
                mes=1; // se setea en el mes en el correspondiente de enero
                anio+=1;// se suma el año
            }
    }
    public void decrementarDias(){
        //solo se decrementa de 1 en 1 cada vez
        
        if(dia>1)//para decrementar dias es necesario saber si el dia es el primero del mes;
            dia-=1;  //se decrementa el dia;
        else
            if(mes==3 && esAnioBisiesto(anio)){//si es el primer dia del mes, se verifica si el mes es marzo y si es año bisiesto;
                mes-=1;//Se resta un mes a llegando a febrero
                dia =29; //por es Año bisiesto el mes de febrero tiene 29 dias.
                
            }
            else if(mes>1){//en caso de que el mes no corresponda a febrero y sea año bisiesto se pasa al caso normal donde se ve si el mes no es enero.
                mes-=1;//se resta un mes con normalidad;
                dia=diasxmes[mes];//y se le asigna los dias correpondiente al fin del mes.
            }
            else{
                anio-=1;// Este caso quiere decir que era primero de enero y al restarle un dia se llega a;
                mes=12;//El mes de Enero.
                dia =diasxmes[mes]; // Dia 31.
            }
    }
    public boolean esFindeMes(int d){
        boolean fin = false;//Auxiliar para ayudar la logica del programa
        if(mes==2 && esAnioBisiesto(anio)==true && dia == 29)//comprobar si es fin de mes en febrero y año bisiesto
            fin = true;//si es fin de mes
        else if(dia==diasxmes[mes])//comprobar con el respectivo fin de mes del mes correspondiente
            fin = true;// si es fin de mes
            // en caso de que ninguno de los casos anteriores, entonces no es fin de mes
        return fin;//retorna la conclusion
    }
    public void restarDias(int dias){
        if(dias>0)//Revisamos que no se esten restando dias negativos o ningun dia
            for(int i=0;i<dias;i++){//desde el 1 empezamos a contar hasta que se lleguen a los dias a sumar, 
                decrementarDias();//La funcion que resta un dia, por eso se repite dias veces.
            }
    }
    public void sumarDias(int dias){
        if(dias>0)//Revisamos que no se esten sumando dias negativos o ningun dia
            for(int i=1;i<=dias;i++){//desde el 1 empezamos a contar hasta que se lleguen a los dias a sumar, 
                incrementarDias();//La funcion que aumenta un dia, por eso se repite dias veces.
            }
    }
    public String mostrarfecha(){
        //devolver el formato de fecha con dia/nombre del mes/anio
        //Ejemplo 17/septiembre/2019
        String FechaCom = dia+"/";//Agregamos el dia y la diagonal
        FechaCom = FechaCom+meses[mes]+"/";//Agregamos el mes por el arreglo y la diagonal
        FechaCom = FechaCom+anio;//Agregamos el año
        return FechaCom;//retornamos la fecha;
    }
    public static int diasTranscurridos(int d, int m, int a){
        Fecha faux = new Fecha( d, m, a);// genera la fecha para usar una funcion;
        Fecha fact = new Fecha (0,0,0);// esto hace que se genere la fecha actual
        int diasTrans=-1; // iniciamos el caso de que no sea valido estableciendolo a -1
        if(m>1&&m<=12){//filtro de mes
            if(a>1900){//filtro de año
                if(d>0&&d<=diasxmes[m]){//filtro de dia 
                    diasTrans=0;//inicamos el contador en caso de que el caso se valido
                    while(true){//Mientras la fecha no sea igual va seguir repitiendo
                        if(fact.devolverAnio()==faux.devolverAnio()){
                            if(fact.devolverMes()==faux.devolverMes()){
                                if(fact.devolverDia()==faux.devolverDia()){
                                    break;
                                }
                            }
                        }
                        faux.incrementarDias();//sumara un dia a aux simulando que transcurre un dia
                        diasTrans++;//el conteo de dias transcurridos;
                    }
                }
            }
        }
        return diasTrans;//retorna los dias transcurridos
    }
    public void cambiarDia(int d){
        if(d>0&&d<=diasxmes[mes])//Revisamos que el dia si pueda tomar ese valor
            dia=d;//se lo asignamos de ser asi
        else// o en caso contrario
            dia=1;// le asignamos uno que se pueda asignar
    }
    public void cambiarMes(int m){
        if(m>0&&m<=12)//Revisamos que el mes si pueda tomar ese valor
            mes=m;//se lo asignamos de ser asi
        else// o en caso contrario
            mes=1;//le asignamos uno que se pueda asignar
    }
    public void cambiarAnio(int a){
        if(anio>1900)//Revisamos que pueda tomar ese valor de Año
            anio=a;//De ser asi le asignamos uno que pueda tomar
        else//en caso contrario
            anio=1901;//se le asigna un valor que se le pueda asignar
    }
    
    public int devolverDia(){
        return dia;
    }
    public int devolverMes(){
        return mes;
    }public int devolverAnio(){
        return anio;
    }
    
}
