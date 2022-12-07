
package Modelo;
import Vista.InOut;

public class Operario extends Empleado{
    InOut ob=new InOut();
   private int horaExtra;
   private double subTrans;
   
   public Operario(int horasExtras,double subTrans){
        this.horaExtra=horasExtras;
        this.subTrans=subTrans;
   }

    public Operario() {
    }
   
   public double CalHoras(){
       int valorHora=0;
       double hoE = horaExtra*valorHora;
       return hoE;  
   }
   public double calSubTrans(){
       String op;
       op=ob.pedirString("Cuanta con moto?");
       if("s".equals(op)||"S".equals(op)){
           subTrans=0.02*salario;
       }else{
           subTrans=200000;                  
       }      
       return subTrans;
   }
   
}

