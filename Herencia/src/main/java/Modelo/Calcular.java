package Modelo;
import Vista.InOut;

public class Calcular {
    InOut ob=new InOut();
    double salMin=4000000;
    Gerente g[];
    Subgerente su[];
    Maquina mq[];
    Planta pl[];
    PreServicio ps[];
    SGenerales sg[];
    Empleado em[];
    
    public void menusec(){
        int id=0; 
        String nom="", ap="", co="";
        double tel=0, cc=0, sal=0, p=0, b=0, bon,st=0,pres;
        char t=' ',m, he;
        for(int i=0; i<em.length; i++){
            if(i==0){
            do{
                id=ob.pedirEntero("Inserte el ID de su empleado");
            }while(!verificarP(id,i)&&!verificarPos(id));
            nom=ob.pedirString("Inserte el nombre de su empleado");
            ap=ob.pedirString("Inserte el apellido de su empleado");
            co=ob.pedirString("Inserte el correo de su empleado");
            tel=ob.pedirDouble("Inserte el telefono de su empleado");
            cc=ob.pedirDouble("Inserte la cedula de su empleado");
            do{
                sal=ob.pedirDouble("Inserte el salario de su empleado");
            }while(!verificarPos(sal));
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
                default: ob.mostrarRes("Ingrese un caracter valido");break;
            }
        }
    }
    
    public boolean verificarP( int id, int indice){
      boolean es=false;
        for(int i=0; i<indice; i++){
           if(em[i].getId()==id){
               es=true;
           }
        }
      return es;
    }
    
    public boolean verificarPos(double in){
        boolean es=false;
        if(in>=0){
            return true;
        }else{
           return es;  
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
        double prest,tp;
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
    
    public void mostrarEmp(){
        int id;
        id=ob.pedirEntero("Ingrese la cedula del empleado");
        boolean est=false;
        int ind=0;
        for(int i=0; i<em.length; i++){
            if(em[i].getCc()==id){
                est=true;
                ind=i;
            }
        }        
       if(est) {       
          ob.mostrarRes("El empleado es: "+em[ind]);
        }else{
           ob.mostrarRes("Cedula invalida");
        }  
    }
    
    public void mostrarTodos(){
        String m="";
        for (Empleado em1 : em) {
            m += "Cedula: " + em1.getCc() + "Nombre: " + em1.getNom() + "Apellido: " + em1.getApe() + "Correo: " + em1.getCorreo() + "Telefono: " + em1.getTel() + "Salario: " + em1.getSal() + "\n";
        }
        ob.mostrarRes(m);
    }
    
    public void mostrarCat(){
        String m="";
        char op;
        op=ob.pedirChar("Elija el tipo de empleado a mostrar:\ng: Gerente"
                    + "\nb: Subgerente"
                    + "\np: Servicio al cliente de planta"
                    + "\nr: Servicio al cliente por prestacion de servicios"
                    + "\ns: De servicios generales"
                    + "\nm: Operario de maquina");
        switch(op){
            case 'g':
            for (Gerente g1 : g) {
                m += "Cedula: " + g1.getCc() + "Nombre: " + g1.getNom() + "Apellido: " + g1.getApe() + "Correo: " + g1.getCorreo() + "Telefono: " + g1.getTel() + "Salario: " + g1.getSal() + "\n";
            }
                break;

            case 'b':
            for (Subgerente su1 : su) {
                m += "Cedula: " + su1.getCc() + "Nombre: " + su1.getNom() + "Apellido: " + su1.getApe() + "Correo: " + su1.getCorreo() + "Telefono: " + su1.getTel() + "Salario: " + su1.getSal() + "\n";
            }
                break;

            case 'p':
            for (Planta pl1 : pl) {
                m += "Cedula: " + pl1.getCc() + "Nombre: " + pl1.getNom() + "Apellido: " + pl1.getApe() + "Correo: " + pl1.getCorreo() + "Telefono: " + pl1.getTel() + "Salario: " + pl1.getSal() + "\n";
            }
                break;

            case 'r':
            for (PreServicio p : ps) {
                m += "Cedula: " + p.getCc() + "Nombre: " + p.getNom() + "Apellido: " + p.getApe() + "Correo: " + p.getCorreo() + "Telefono: " + p.getTel() + "Salario: " + p.getSal() + "\n";
            }
                break;

            case 's':
            for (SGenerales sg1 : sg) {
                m += "Cedula: " + sg1.getCc() + "Nombre: " + sg1.getNom() + "Apellido: " + sg1.getApe() + "Correo: " + sg1.getCorreo() + "Telefono: " + sg1.getTel() + "Salario: " + sg1.getSal() + "\n";
            }
                break;

            case 'm':
            for (Maquina mq1 : mq) {
                m += "Cedula: " + mq1.getCc() + "Nombre: " + mq1.getNom() + "Apellido: " + mq1.getApe() + "Correo: " + mq1.getCorreo() + "Telefono: " + mq1.getTel() + "Salario: " + mq1.getSal() + "\n";
            }
                break;

        }
        ob.mostrarRes(m);
    }
    
    public void nomEmpl(){
        int id;
        id=ob.pedirEntero("Ingrese la cedula del empleado");
        boolean est=false;
        int ind=0;
        for(int i=0; i<em.length; i++){
            if(em[i].getCc()==id){
                est=true;
                ind=i;
            }
        }        
       if(est) {       
          ob.mostrarRes("La nomina de "+em[ind].getNom()+" es: "+em[ind].getSal());
       }else{
           ob.mostrarRes("Cedula invalida");
       }
    }
    
    public void empMillon(){
        String m="";
        for (Empleado em2 : em) {
            if (em2.getSal() == 1000000) {
                m += "Cedula: " + em2.getCc() + "Nombre: " + em2.getNom() + "Apellido: " + em2.getApe() + "Correo: " + em2.getCorreo() + "Telefono: " + em2.getTel() + "Salario: " + em2.getSal() + "\n";
            }else{
                ob.mostrarRes("Ningun empleado gana el salario minimo de $1M");
            }
        }
        ob.mostrarRes(m);
    }
}    
