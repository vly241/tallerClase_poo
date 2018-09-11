package pelota;

public class pelota {
	//atributos
	float radio;
	float peso;
	
	//constructor
	public pelota() {
		
		radio = 100;
		peso = 250;
		
	}
	
	public pelota(float radio, float peso) {
		this.radio = radio;
		this.peso = peso;
	}
	
	//metodos
	public float ObtenerRadio() {
		return radio;
	}
	
	public float ObtenerPeso() {
		return peso;
	}
	
	public void PatearPelota() {
		System.out.println("Se ha pateado la pelota");	
	}
	
	public void AtraparPelota() {
		System.out.println("Se ha atrapado la pelota");	
	}
	

}
