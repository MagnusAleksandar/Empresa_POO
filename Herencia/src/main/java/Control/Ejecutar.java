/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
//import Vista.InOut;
import Modelo.Calcular;
import Vista.InOut;
/**
 *
 * @author DJJORGEGUTIERREZ
 */
public class Ejecutar {
    static Calcular p=new Calcular();
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
                    + "3. Traer el listado de empleados que tiene la empresa.\n"
                    + "4. Traer el listado de empleados por categoría.\n"
                    + "5. Traer la nómina de un empleado determinado. \n"
                    + "6. Traer el listado de empleados que ganan 1 salario mínimo. \n"
                    + "7. salir.\n");
            resp=d.pedirEntero("ingrese el id de la operación que desea realizar");
            switch(resp){
                case 1:p.pedirDatos();break;
                case 2:p.mostrarEmp();break;
                case 3:p.mostrarTodos();break;
                case 4:p.mostrarCat();break;
                case 5:p.nomEmpl();break;
                case 6:p.empMillon();break;
                case 7:;break;
                default:d.mostrarRes("Seleccione una opción válida.");break;
            }
        }while(resp!=7);
    }
    
}