/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_dannacasco;

import java.util.Scanner;

/**
 *
 * @author Danna Casco
 */
public class Examen1P1_DannaCasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;System.out.println(exam(opcion));
    }
    
    public static int exam (int opcion){
    Scanner entrada = new Scanner (System.in);
    Scanner entrada2 = new Scanner (System.in);


       opcion =0;
       String name="";
       
       System.out.print("Ingrese su nombre: ");
       name=entrada2.nextLine();
       System.out.println("BIENVENID@ "+name+"!!");
       do{
           
           System.out.println("-------------------------------");
           System.out.println("1.Conjuntos ");
           System.out.println("2.Cifrado por substitución ");
           System.out.println("3.Sobre ");
           System.out.println("4.SALIR");
           System.out.print(name+" porfavor ingrese una opcion: ");
           opcion = entrada.nextInt();
           
       switch (opcion){
           case 1:
               
               String cad1="";
               String cad2="";
               

               System.out.println("-------------------------------");
               System.out.println("Ingrese conjunto A= ");
               cad1=entrada2.nextLine();
               System.out.println("Ingrese conjunto B= ");
               cad2=entrada2.nextLine();
               
               conjuntos(cad1,cad2);
       break;
       
           case 2:
           case 3:{
               int num=0;
               char carac = 0;
               
               System.out.println("Ingrese tamaño de figura:  ");
               num=entrada.nextInt();
               System.out.println("Ingrese caracter:  ");
               carac=entrada.next().charAt(carac);
              
               sobre(num,carac);
           }
           break;
          
           case 4:
               System.out.println("-------------------------------");
               System.out.println("Que tenga buen día :)");
               System.out.println("-------------------------------");

           default:
               System.out.println("-------------------------------");
               System.out.println("OPCION INVALIDA :/");
               System.out.println("-------------------------------");
  
           
       }
       }while(opcion>4||opcion<4);
       return opcion;
}
 
    public static void conjuntos(String cad1,String cad2){
            Scanner entrada2 = new Scanner (System.in); 
               String union="";
               String inter="";
               String union2="";

                
               String cad12 = cad1+cad2;

               if(cad1.equals(cad2)){
                   System.out.println("Ambos conjuntos son iguales");
              
               
       }else if (!cad2.equals(cad1)){
            for (int i = 0; i <= cad1.length()-1; i++) {           
                for (int j = 0; j <= cad2.length()-1; j++) {
                    
              if (cad1.charAt(i)==cad2.charAt(j)){
                  inter=inter+cad1.charAt(i);
                  
              }                    
            }                        
        }
        union=cad12.replace(inter, "");
        System.out.println("Union C= "+inter+union);
        System.out.println("Intersección D= "+inter);
                

       }
       
    }
    public static void substitucion(String cadena){
        String cif="";
                
        for (int i = 0; i <= cadena.length()-1; i++) {
         int tab=cadena.charAt(i);
         

            
        }
    }
    public static void sobre (int size,char carac){
        size=0;
        int size1=size*2;
        for (int i = 1; i <=size1; i++) {
            System.out.print(carac);           
        }System.out.println();
        
        for (int i = 1; i <=size1; i++) {
            System.out.println(carac);
            for (int j = 1; j <=size1; j++) {
                System.out.println(" ");
            }
            System.out.println(carac);
        }
        for (int i = 1; i <= size1; i++) {
            System.out.println(carac);
        }
    
    }      
               
            
 }
   



