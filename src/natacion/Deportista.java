/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package natacion;

import java.util.Scanner;

/**
 *
 * @author monica
 */
public class Deportista {
    String Nombre;
    String Apellido;
    String ID;
    double Year;
    String Sexo;
    String Categoria;
    int Prueba[];

    Deportista(){
        Nombre="Santiago";
        Apellido="Salgado";
        ID="1037641486";
        Year=1995;
        Sexo="Maculino";
        Prueba= new int[]{0,0,0,0};
        Categoria="Juvenil";

    }
    public void setPrueba(int pru){
        Prueba[pru]=1;
    }
    
    public void EliminarPrueba(int pru){
        Prueba[pru]=0;
    }
    
    public int[] getPrueba(){
        return Prueba;
    }
    
    public String getNombrePrueba(int n){
        switch(n){
            case 1:
                return "Libre";
            case 2:
                return "Espalda";
            case 3:
                return "Pecho";
            case 4:
                return "Mariposa";
            default:
                return "No esta inscrito en ninguna prueba";
        }
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getID() {
        return ID;
    }
    public void ShowInfo(){        
        System.out.println ("1) Nombre: "+Nombre);   
        System.out.println ("2) Apellid0: "+Apellido);   
        System.out.println ("3) ID: "+ID);   
        System.out.println ("4)A;o de nacimiento: "+Year);   
        System.out.println ("5) Sexo: "+Sexo);   
        System.out.println ("Categoria: "+Categoria);
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public double getYear() {
        return Year;
    }

    public void setYear(double Year) {
        double year2=Year;
        if(Year<1991){
            Categoria="Senior";
            Year=10000;
        }
        else if(Year<1998){
            Categoria="Juvenil";
            Year=10000;
        }
        else if(Year<2005){
            Categoria="Infantil A";
            Year=10000;
        }
        else if(Year<2010){
            Categoria="Infantil B";
            Year=10000;
        }
        Year=year2;        
        this.Year = Year;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
    
    public void setDatos(){
        double year2;
        Scanner entradaEscaner = new Scanner (System.in);        
        System.out.println ("Nombre del deportista:");
        Nombre=entradaEscaner.nextLine();
        System.out.println ("Apellido del deportista:");
        Apellido=entradaEscaner.nextLine();
        System.out.println ("ID del deportista:");
        ID=entradaEscaner.nextLine();
        System.out.println ("A;o de nacimiento del deportista:");
        Year=entradaEscaner.nextDouble();
        year2=Year;
        entradaEscaner.nextLine();
        System.out.println ("Sexo del deportista:");
        Sexo=entradaEscaner.nextLine();
        if(Year<1991){
            Categoria="Senior";
            Year=10000;
        }
        else if(Year<1998){
            Categoria="Juvenil";
            Year=10000;
        }
        else if(Year<2005){
            Categoria="Infantil A";
            Year=10000;
        }
        else if(Year<2000){
            Categoria="Infantil B";
            Year=10000;
        }
        Year=year2;        
    }
    
}
