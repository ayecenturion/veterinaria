package clases;

public class Test {

	public static void main(String[] args) {
Veterinaria v = new Veterinaria();
		
		//CREO LAS MASCOTAS
		Mascota p1 = new Perro("Nando", "36296585", TipoPerro.GRANDE);
		Mascota p2 = new Perro("Titan", "35094383", TipoPerro.MEDIANO);
		Mascota p3 = new Perro("Basky", "34001531", TipoPerro.CHICO);
		Mascota p4 = new Perro("Ken", "33084601", TipoPerro.MEDIANO);
		Mascota p5 = new Perro("Ichiro", "37445189", TipoPerro.CHICO);
		Mascota p6 = new Perro("Rango", "31087555", TipoPerro.MEDIANO);
	
		Mascota j1 = new Pajaro("pio", "35875506", 600, TipoPajaro.EXOTICO);
		Mascota j2 = new Pajaro("pio2", "38888506", 600, TipoPajaro.NO_EXOTICO);
		Mascota j3 = new Pajaro("pio3", "28875996", 600, TipoPajaro.EXOTICO);
		
		Mascota g1 = new Gato("mia1", "26780906", TipoGato.DE_RAZA);
		Mascota g2 = new Gato("mia2", "40788006", TipoGato.SIN_RAZA);
		
		procesarLlegada(v,p1);
		
		System.out.println("INGRESO LAS MASCOTAS A COLA DE ESPERA");
		System.out.println("*****");
		procesarLlegada(v,p1);
		procesarLlegada(v,p2);
		procesarLlegada(v,p4);
		procesarLlegada(v,j2);
		procesarLlegada(v,g2);
		procesarLlegada(v,g1);
		procesarLlegada(v,p3);
		procesarLlegada(v,j1);
		
		System.out.println(" ");
		System.out.println("*****COLA ACTUAL");
		v.mostraColaDeEspera();
		System.out.println(" ");
	
		
		System.out.println("***** PAJARO 2 SE RETIRA ANTES");
		v.retiroAnticipado(j2);
		System.out.println(" ");
		System.out.println("*****COLA ACTUAL");
		v.mostraColaDeEspera();
		System.out.println(" ");
		
		
		System.out.println("***** FINALIZO CONSULTAS");
		System.out.println("a pagar por la consulta:  ");
		finalizarConsulta(v,p1);
		finalizarConsulta(v,p2);
		finalizarConsulta(v,p4);
		finalizarConsulta(v,g2);
		finalizarConsulta(v,g1);
		finalizarConsulta(v,p3);
		finalizarConsulta(v,j1);
		
		System.out.println(" ");
		System.out.println("*****COLA ACTUAL");
		v.mostraColaDeEspera();
		System.out.println(" ");

		System.out.println("ULTIMAS xx MASCOTAS ATENDIDAS");
		
		v.ultimasMascotasAtendidas(10);
		
		System.out.println(" ");
		System.out.println("*****REGISTRO ORDENADO DE LAS MASCOTAS");
		v.mostrarListaOrdenada();
		

	}
	private static void procesarLlegada(Veterinaria v, Mascota mascota) {
		
		try {
			v.procesarLlegada(mascota);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static void finalizarConsulta(Veterinaria v, Mascota mascota) {
		
		try {
			v.procesarLlegada(mascota);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

}
