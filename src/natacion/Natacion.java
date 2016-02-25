/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natacion;

/**
 *
 * @author monica
 */

import java.util.Scanner;

public class Natacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Competencia Comp;
        int option;
        Comp=new Competencia();
        option=0;
        Scanner Escaner = new Scanner (System.in);  
        
        
        System.out.println ("Bienvenido a natacion Liga Antioque;a.");
        while(option<8){
            System.out.println ("Elija una opcion:");
            System.out.println ("1) Deportistas.");
            System.out.println ("2) Competencia");
            System.out.println ("8) Terminar");

            option=Escaner.nextInt();
            Escaner.nextLine();
            switch(option){
                case 1:
                    System.out.println ("Menu de deportistas");
                    System.out.println ("Elija una opcion:");
                    System.out.println ("1) Ingrear nuevo deportista.");
                    System.out.println ("2) Actualizar deportista");
                    System.out.println ("3) Eliminar deportista");
                    System.out.println ("4) Buscar deportista");
                    option=Escaner.nextInt();
                    System.out.println (" ");
                    Escaner.nextLine();
                    switch(option){
                        case 1:
                            Comp.SetDeportista();
                            break;
                        case 2:
                            Comp.ActualizarDeportista();
                            break;
                        case 3:
                            Comp.EliminarDeportista();
                            break;
                        case 4:
                            Comp.BuscarDeportista();
                            break;
                        default:
                            System.out.println ("Opcion erronea");
                            break;
                    }
                    break;
                case 2:
                    System.out.println ("Menu de competencia");
                    System.out.println ("Elija una opcion:");
                    System.out.println ("1) Inscribir nadador.");
                    System.out.println ("2) Eliminar nadador.");
                    System.out.println ("3) Mostrar Prueba.");
                    System.out.println (" ");
                    option=Escaner.nextInt();
                    Escaner.nextLine();
                    switch(option){
                        case 1:
                            Comp.InscribirNadador();
                            break;
                        case 2:
                            Comp.EliminarNadador();
                            break;
                        case 3:
                            Comp.MostrarCategorias();
                            break;
                        default:
                            System.out.println ("Opcion erronea...");
                            break;
                            
                    }
                    break;
                default:
                    System.out.println ("opcion erronea ");
                    break;
            }
            System.out.println (" ");
        }
        
        // TODO code application logic here
       
        
    }
    
}
