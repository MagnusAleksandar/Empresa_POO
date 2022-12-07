package Modelo;
import Vista.InOut;

public class Calcular {
    InOut ob=new InOut();
    double salMin=4000000;
    Gerente g[];
    Subgerente su[];
    Maquina m[];
    Planta pl[];
    PreServicio ps[];
    SGenerales sg[];
    Subgerente sub[];
    Empleado em[];
    
    public void pedirDatos(){
        int id=0; 
        String nom="", ap="", co="";
        double tel=0, cc=0, sal=0, p=0, b=0, bon=0,st=0,pres=0;
        char t=' ',m=' ', he=' ';
        for(int i=0; i<em.length; i++){
            if(i==0){
            id=ob.pedirEntero("Inserte el ID de su empleado");
            nom=ob.pedirString("Inserte el nombre de su empleado");
            ap=ob.pedirString("Inserte el apellido de su empleado");
            co=ob.pedirString("Inserte el correo de su empleado");
            tel=ob.pedirDouble("Inserte el telefono de su empleado");
            cc=ob.pedirDouble("Inserte la cedula de su empleado");
            sal=ob.pedirDouble("Inserte el salario de su empleado");
            t=ob.pedirChar("Inserte el tipo de empleado:\ng: Gerente"
                    + "\nb: Subgerente"
                    + "\np: Servicio al cliente de planta"
                    + "\nr: Servicio al cliente por prestacion de servicios"
                    + "\ns: De servicios generales"
                    + "\nm: Operario de maquina");
            em[i]=new Empleado(id, nom, ap, tel, cc, sal, co, t);
            }
            switch(t){
                case 'g':
                case 'b':
                    if(sal<salMin){
                        ob.mostrarRes("El salario no es válido. Por favor corregir");
                        do{
                            sal=ob.pedirDouble("Ingrese el salario correcto");
                        }while(sal<salMin);
                    }
                    p=Pretaciones(sal);
                    pres=calcularPrestamo(sal);
                    if(t=='b'){
                        g[i]=new Gerente(id, nom, ap, tel, cc, sal, co, t, p, pres);
                    }else{
                        su[i]=new Subgerente(id, nom, ap, tel, cc, sal, co, t, p, pres);
                    }
                    break;
                case 'p':
                    if(sal>=salMin){
                        p=Pretaciones(sal);
                    }
                    bon=ob.pedirDouble("Ingrese cantidad de ventas");
                    if(bon<5000000){
                        b=calcularBonificacion(bon);
                    }
                    pl[i]=new Planta(id, nom, ap, tel, cc, sal, co, t, p, b);
                    break;
                case 'r':
                    if(sal>=salMin){
                        p=Pretaciones(sal);
                    }
                    ps[i]=new PreServicio(id, nom, ap, tel, cc, sal, co, t);
                    break;
                case 's':
                case 'm':
                    do{
                        m=ob.pedirChar("¿Tiene moto? y/n");
                        switch (m) {
                            case 'y':
                            case 'Y':
                                st=subTrans();
                                break;
                            case 'n':
                            case 'N':
                                st=sal+200000;
                                break;
                            default:
                                ob.mostrarRes("Valor invlido");
                                break;
                        }
                    }while(m=='y'||m=='Y'||m=='n'||m=='N');
                    he=ob.pedirChar("¿Hace horas extra?");
                    sg[i]=new SGenerales(id, nom, ap, tel, cc, sal, co, t, he, st);
                    break;
            }
        }
    }
    
    public void nominaTotal(){
        double total=0, salario;
        for (Empleado em1 : em) {
            salario = em1.getSal();
            total=salario+total;
        }
        ob.mostrarRes("Lo que la empresa paga a todos sus empleados en total es:"+total);
    }
    
    public double calcularPrestamo(double sal){
        double prest,tp=0;
        prest=ob.pedirDouble("Ingrese porcentaje del salario");
        tp=sal*(prest/100);
        return tp;
    }
    public double calcularBonificacion(double bon){
        double bt;
        bt=bon+bon*0.03;
        return bt;
    }
    
    public double Pretaciones(double salario){
        double pres=0,salud,pension;
        salud=salario*0.05;
        pension=salario*0.03;
        pres=salud+pension;
        return pres;
    }
    
    public double subTrans(){
        double salario=0;
        salario+=salario*0.02;
        return salario;
    }
}    
