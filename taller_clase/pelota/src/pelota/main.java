package pelota;
import pelota.pelota;
class main {

	public static void main(String[] args) {
		
		pelota p = new pelota(300,600);
		
		System.out.println("El peso de la pelota es "+p.ObtenerPeso());
		System.out.println("El radio de la pelota es "+p.ObtenerRadio());
		p.AtraparPelota();
		p.PatearPelota();
		

	}

}
