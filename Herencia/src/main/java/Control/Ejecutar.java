/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
//import Vista.InOut;
import Modelo.Operario;
import Vista.InOut;
/**
 *
 * @author DJJORGEGUTIERREZ
 */
public class Ejecutar {
   // static InOut ob=new InOut();
    static Operario p=new Operario();
    static InOut d=new InOut();
    public void main(){
        d.mostrarRes("Bienvenido a EmpresasFactoy's");
        menuPrin();
}
    void menuPrin(){
        int resp;
        do{
            d.mostrarRes("1. Agregar empleado.\n"
                    + "2. Traer los datos de un empleado ingresando su identificación.\n"
                    + "3. Traer el listado de empleados que tiene la empresa. c) Traer el listado de empleados por categoría.\n"
                    + "4. Traer la nómina de un empleado determinado. \n"
                    + "5. Traer el listado de empleados que ganan 1 salario mínimo. \n"
                    + "6. salir.\n");
            resp=d.pedirEntero("ingrese el id de la operación que desea realizar");
            switch(resp){
                case 1:menusec();break;
                case 2: ;break;
                case 3: ;break;
                case 4: ;break;
                case 5: ;break;
                case 6:;break;
                default:d.mostrarRes("Seleccione una opción válida.");menuPrin();break;
            }
        }while(resp!=6);
    }
    void menusec(){
        int resp;
        d.mostrarRes("Este nuevo empleado será de tipo:\n"
                    + "1. Operario.\n"
                    + "2. Atención al publico.\n"
                    + "3. Administrativo. \n"
                    + "4. Volver atras. \n");
        resp=d.pedirEntero("ingrese el id de la operación que desea realizar");
        switch(resp){
                case 1:menuOpe();break;
                case 2:menuAten();break;
                case 3:menuAdmin();break;
                case 4:menuPrin();break;
                default:d.mostrarRes("Seleccione una opción válida.");menusec();break;
            }
    }
    void menuOpe(){
        int resp;
        d.mostrarRes("Este nuevo empleado será de:\n"
                    + "1. Servicios generales.\n"
                    + "2. Operador de maquinaría.\n"
                    + "3. Volver atras. \n");
        resp=d.pedirEntero("ingrese el id de la operación que desea realizar");
        switch(resp){
                case 1:/*funcion que añade al empleado de servicios generales*/;break;
                case 2:/*funcion que añade al Operador de maquinaría*/;break;
                case 3:menusec(); ;break;
                default:d.mostrarRes("Seleccione una opción válida.");menuOpe();break;
            }
    }
    void menuAten(){
        int resp;
        d.mostrarRes("Este nuevo empleado será de:\n"
                    + "1. Prestación de servicios.\n"
                    + "2. Planta.\n"
                    + "3. Volver atras. \n");
        resp=d.pedirEntero("ingrese el id de la operación que desea realizar");
        switch(resp){
                case 1:/*funcion que añade al empleado de Prestación de servicios*/;break;
                case 2:/*funcion que añade al empleado de Planta*/;break;
                case 3:menusec(); ;break;
                default:d.mostrarRes("Seleccione una opción válida.");menuAten();break;
            }
    }
    void menuAdmin(){
        int resp;
        d.mostrarRes("Este nuevo empleado será un:\n"
                    + "1. Subgerente.\n"
                    + "2. Gerente.\n"
                    + "3. Volver atras. \n");
        resp=d.pedirEntero("ingrese el id de la operación que desea realizar");
        switch(resp){
                case 1:/*funcion que añade al Subgerente*/;break;
                case 2:/*funcion que añade al Gerente*/;break;
                case 3:menusec(); ;break;
                default:d.mostrarRes("Seleccione una opción válida.");menuAdmin();break;
            }
    }
}