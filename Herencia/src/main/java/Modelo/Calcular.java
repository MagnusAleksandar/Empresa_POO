package Modelo;
import Vista.InOut;

public class Calcular {
    InOut ob=new InOut();
    Gerente g[];
    Maquina m[];
    Planta pl[];
    PreServicio ps[];
    SGenerales sg[];
    Subgerente sub[];
    
    public double nominaTotal(double salario){
        double total=0;
        total=salario+total;
        ob.mostrarRes("Lo que la mepresa paga a todos sus empleados en total es:"+total);
        return total;
    }
    
    public double calcularPrestamo(double salario){
        double prest,tp=0;
        prest=ob.pedirDouble("ingrese cantidad de prestamo");
        
        ob.mostrarRes("la cuota que va a pagar es de: "+tp);
        return tp;
    }
    public double calcularBonificacion(){
        double bon,bt=0;
        bon=ob.pedirDouble("ingrese cantidade de venta:");
        bt=bon*0.03;
        ob.mostrarRes("Su bonificacion es: "+bon+"\n");
        return bt;
    }
    
    public double Pretaciones(double salario){
        double pres=0,salud,pension;
        salud=salario*0.05;
        pension=salario*0.03;
        pres=salud+pension;
        ob.mostrarRes("lo que paga en prestaciones es:"+pres);
        return pres;
    }
}    
