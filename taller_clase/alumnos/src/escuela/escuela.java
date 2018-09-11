package escuela;
import java.util.*;
class Escuela {

	public class Alumno{
   	 private String nombre;
   	 private int edad;
   	 private Scanner teclado;
   	 
   	public Alumno() {
   	 teclado=new Scanner(System.in);
     System.out.println("ingrese nombre: ");
     nombre=teclado.next();
     System.out.println("Ingrese edad: ");
     edad=teclado.nextInt();
     
   	}
   	
   	public void imprimir() {
   		System.out.println("Nombre: "+nombre);
   		System.out.println("Edad: "+edad);
   	}
   	
   	public void esMayorEdad() {
   		if(edad>=18) {
   			System.out.println(nombre+" es mayor de edad.");
   			
   		}else {
   			System.out.println(nombre+" no es mayor de edad");
   			
   		}
   	}
	 }
	
	public static void main(String[] args) {
    
     Alumno alumno1 = new Alumno();
     alumno1.imprimir();
     alumno1.esMayorEdad();
    	 	
	}

}
