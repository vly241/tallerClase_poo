package sueldos;
import java.util.Scanner;

public class operarios {
	
	private Scanner teclado;
	private int[] sueldos;
	
	public operarios() {
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		for(int f=0; f<5; f++) {
			System.out.println("ingrese los datos de los empleados: ");
			sueldos[f] = teclado.nextInt();
		}
	}
	

	public void imprimir() {
		for(int i=0;i<5;i++) {
			System.out.println(sueldos[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		operarios op = new operarios();
		op.imprimir();

	}

}
