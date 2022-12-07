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
    Empleado em[];
    
    public void pedirDatos(){
        int id; 
        String nom, ap, co;
        double tel, cc, sal;
        char t;
        for(int i=0; i<em.length; i++){
            if(i==0){
            id=ob.pedirEntero("Inserte el ID de su empleado");
            nom=ob.pedirString("Inserte el nombre de su empleado");
            ap=ob.pedirString("Inserte el apellido de su empleado");
            co=ob.pedirString("Inserte el correo de su empleado");
            tel=ob.pedirDouble("Inserte el telefono de su empleado");
            cc=ob.pedirDouble("Inserte la cedula de su empleado");
            sal=ob.pedirDouble("Inserte el salario de su empleado");
            t=ob.pedirChar("Inserte el tipo de empleado");
            em[i]=new Empleado(id, nom, ap, tel, cc, sal, co, t);
            }
        }
    }
    
    public double nominaTotal(){
        double total=0, salario;
        salario=0;
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
