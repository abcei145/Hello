/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natacion;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author monica
 */
public class Competencia {
    
    Deportista Deportistas[];
    int llenado;
    Competencia(){
        Deportistas=new Deportista[50];
        llenado=0;
    }
    public void SetDeportista(){ //llenar base de datos
        Deportistas[llenado]=new Deportista();
        Deportistas[llenado].setDatos();
        llenado++;
    }
    public void MostrarCategorias(){
        int cnt,cnt2,cnt3,cnt4,cnt5;
        cnt2=0;
        cnt3=0;
        cnt4=0;
        cnt5=0;
        int Pru[];
        String competes1[],competes2[],competes3[],competes4[];
        String nombre;
        competes1=new String[20];
        competes2=new String[20];
        competes3=new String[20];
        competes4=new String[20];
        Pru=new int [4];
        for(cnt=0;cnt<llenado;cnt++){
            Pru=Deportistas[cnt].getPrueba();
            nombre=Deportistas[cnt].getNombre();
            if(Pru[0]==1){
                competes1[cnt2]=nombre;
                cnt2++;
            }
            if(Pru[1]==1){
                competes2[cnt3]=nombre;
                cnt3++;
            }
            if(Pru[2]==1){
                competes3[cnt4]=nombre;
                cnt4++;
            }
            if(Pru[3]==1){
                competes4[cnt5]=nombre;
                cnt5++;
            }
          
        }
        if(cnt2+cnt3+cnt4+cnt5>0){
            System.out.println ("Libre :");
            
            for(cnt=0;cnt<cnt2;cnt++)
                System.out.println (competes1[cnt]);

            System.out.println (" ");
            System.out.println ("Espalda :");
            for(cnt=0;cnt<cnt3;cnt++)
                System.out.println (competes2[cnt]);

            System.out.println (" ");
            System.out.println ("Pecho :");
            for(cnt=0;cnt<cnt4;cnt++)
                System.out.println (competes3[cnt]);

            System.out.println (" ");
            System.out.println ("Mariposa :");
            for(cnt=0;cnt<cnt5;cnt++)
                System.out.println (competes4[cnt]);
        }
        else{
            System.out.println ("No hay ningun deportista inscrito en alguna categoria.");
        }
        System.out.println (" ");
        
    }
    
    public void ActualizarDeportista(){
        Scanner Escaner=new Scanner(System.in);
        String ID,ID2;
        int cnt,flag;
        int option;
        boolean flag2;
        System.out.println ("Ingrese la ID del deportista");
        ID= Escaner.nextLine();
        flag=0;
        for (cnt=0;cnt<llenado;cnt++){
            
            ID2=Deportistas[cnt].getID();
            flag2=ID2.equals(ID);
            if(flag2){
                flag=1;
                System.out.println ("Ingrese el numero del item a modificar:");
                Deportistas[cnt].ShowInfo();
                option=Escaner.nextInt();
                Escaner.nextLine();
                
                switch(option){
                    case 1:
                        System.out.println ("Ingrese nuevo nombre: ");
                        Deportistas[cnt].setNombre(Escaner.nextLine());
                        break;
                    case 2:
                        System.out.println ("Ingrese nuevo apellido: ");
                        Deportistas[cnt].setApellido(Escaner.nextLine());
                        break;
                    case 3:
                        System.out.println ("Ingrese nueva ID: ");
                        Deportistas[cnt].setID(Escaner.nextLine());
                        break;
                    case 4:
                        System.out.println ("Ingrese nuevo a;o de nacimiento: ");
                        Deportistas[cnt].setYear(Escaner.nextInt());
                        Escaner.nextLine();
                        break;
                    case 5:
                        System.out.println ("Ingrese nuevo sexo: ");
                        Deportistas[cnt].setSexo(Escaner.nextLine());
                        break;   
                    default:
                        System.out.println ("Opcion erronea...");
                        break;
                        
                }
                Deportistas[cnt].ShowInfo();
                    
                
            }
        }
        if(flag==0)
            System.out.println ("No se encuentra el deportista con dicha ID"); 
        System.out.println (" ");    
    }
    public void InscribirNadador(){
        Scanner Escaner=new Scanner(System.in);
        String ID,ID2;
        int cnt,flag,entrada;
        boolean flag2;
        System.out.println ("Ingrese la ID del deportista");
        ID= Escaner.nextLine();
        flag=0;
        for (cnt=0;cnt<llenado;cnt++){
            
            ID2=Deportistas[cnt].getID();
            flag2=ID2.equals(ID);
            if(flag2){
                System.out.println ("A que competencia desea inscribrse el deportista: " +Deportistas[cnt].getNombre());
                System.out.println ("1) Libre.");
                System.out.println ("2) Espalda.");
                System.out.println ("3) Pecho.");
                System.out.println ("4) Mariposa.");
                entrada=Escaner.nextInt();
                Deportistas[cnt].setPrueba(entrada-1);
                Escaner.nextLine();
                flag=1;
                System.out.println ("El deportista "+Deportistas[cnt].getNombre()+" se ha inscrito");
                System.out.println ("en la categoria "+Deportistas[cnt].getNombrePrueba(entrada));
                
            }            
        }
        if(flag==0){
            System.out.println ("La ID del deportista no se encuentra");
            System.out.println ("en la base de datos...");
        }
        System.out.println (" ");
    }
    public void BuscarDeportista(){
        Scanner Escaner=new Scanner(System.in);
        String ID,ID2;
        int cnt,flag;
        boolean flag2;
        
        System.out.println ("Ingrese la ID del deportista a buscar");
        ID= Escaner.nextLine();
        flag=0;
        
        for (cnt=0;cnt<llenado;cnt++){
            ID2=Deportistas[cnt].getID();
            flag2=ID2.equals(ID);
            if(flag2){
                Deportistas[cnt].ShowInfo();
                flag=1;
            }
        }
        if (flag==0)
            System.out.println ("ID desconocida");
        
        System.out.println (" ");
        
    }
    public void EliminarDeportista(){
        int cnt,cnt2,cnt3,flag;
        
        Scanner Escaner=new Scanner(System.in);
        Deportista Deportist[];
        Deportist=new Deportista[50];
        Deportist=Deportistas;
        Deportistas=null;
        Deportistas=new Deportista[50];
        
        String ID;
        cnt3=0;
        flag=0;
        System.out.println ("ingrese ID del deportista");
        ID=Escaner.nextLine();
        for (cnt=0;cnt<llenado;cnt++){
            if(Deportist[cnt].getID().equals(ID)){
                cnt3=cnt;
                flag=1;
            }                   
        }
        
        cnt=cnt3;
        cnt3=0;
        if(flag==0)
            System.out.println ("ID no identificable");
        
        else{
            for (cnt2=0;cnt2<llenado;cnt2++){
                    if(cnt2!=cnt){
                        Deportistas[cnt3]=Deportist[cnt2];
                        cnt3++;
                    }
                }
            System.out.println ("Se ha eliminado de la base de datos ");
            System.out.println ("Al Deportista: "+Deportist[cnt].Nombre);
            llenado--;
        }
        
        System.out.println (" ");
        
    }
    public void EliminarNadador(){
        Scanner Escaner=new Scanner(System.in);
        String ID;
        int Pru[];
        
        System.out.println ("Ingrese la ID del deportista");
        ID= Escaner.nextLine();
        int cnt,flag,entrada,flag1;
        flag=0;
        flag1=0;
        for (cnt=0;cnt<llenado;cnt++){
            if(Deportistas[cnt].getID().equals(ID)){
                System.out.println ("El deportista "+Deportistas[cnt].getNombre()+" se encuentra inscrito en");
                Pru=Deportistas[cnt].getPrueba();
                if(Pru[0]==1){
                    System.out.println ("1) Libre.");
                    flag1=1;
                }
                if(Pru[1]==1){
                    System.out.println ("2) Espalda.");
                    flag1=1;
                }
                if(Pru[2]==1){
                    System.out.println ("3) Pecho.");
                    flag1=1;
                }
                if(Pru[3]==1){
                    System.out.println ("4) Mariposa.");
                    flag1=1;
                }
                if(flag1==1){
                    entrada=Escaner.nextInt();
                    Escaner.nextLine();
                    Deportistas[cnt].EliminarPrueba(entrada-1);
                    System.out.println ("Eliminado "+Deportistas[cnt].getNombre()+" de la categoria "+Deportistas[cnt].getNombrePrueba(entrada));
                }else{                    
                    System.out.println ("No esta inscrito en niguna prueba"); 
                }
                flag=1;
            }            
        }
        if(flag==0){
            System.out.println ("La ID del deportista no se encuentra");
            System.out.println ("en la base de datos...");
        }
        
        System.out.println (" ");
    }
        
    
}
