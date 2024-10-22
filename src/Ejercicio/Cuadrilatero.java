package Ejercicio;

import java.util.Scanner;

public class Cuadrilatero {

    private float lado1;
    private float lado2;

    //Metodos

//Constructor 1
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
//Constructor2
    public Cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

     public float getPerimetro(){
        float perimetro= 2*(lado1+lado2);
        return perimetro;
     }

     public float getArea (){
        float area= (lado1*lado2);
         return area;
     }



     public static void main (String[] args){

        Cuadrilatero c1;
        float lado1,lado2;

        Scanner sc= new Scanner(System.in);
         System.out.println("Digite un lado");
         lado1=sc.nextFloat();

         System.out.println("Digite un lado");
         lado2=sc.nextFloat();

         if (lado1==lado2){

             c1= new Cuadrilatero(lado1);
         }
         else {

             c1=new Cuadrilatero(lado1,lado2);

         }

         System.out.println("El periemtro es: "+c1.getPerimetro() );
         System.out.println("El area es: "+c1.getArea());
     }

}


