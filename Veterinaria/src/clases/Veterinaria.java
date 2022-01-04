package clases;

import ort.tp1.tdas.implementaciones.ColaNodos;
import ort.tp1.tdas.implementaciones.PilaNodos;
import ort.tp1.tdas.interfaces.Pila;

public class Veterinaria {
	
	private ColaNodos<Mascota> colaDeEspera;
	private PilaNodos<Mascota> informes;
	private ListaDeMascotaPorDni registro;
	
	
	public Veterinaria() {
		this.colaDeEspera = new ColaNodos<Mascota>();
		this.informes = new PilaNodos<Mascota>();
		this.registro = new ListaDeMascotaPorDni();
	}
	public void procesarLlegada(Mascota m) {
		
		if( m == null ) {
			throw new IllegalArgumentException("La mascota no vino con ud!!!");
		}
		
		if (!estaRegistrado(m)) {
			registro.add(m);
		}
		
		this.colaDeEspera.add(m);
	}
	
	private boolean estaRegistrado(Mascota m) {
		return this.registro.exists(m.getDniDuenio());
	}
	
	public int finalizarConsulta(Mascota m) {
		
		if( m == null ) {
			throw new IllegalArgumentException("Esa mascota no esta en el consultorio!!!");
		}
		
		int costo = 0;
		
		//Mascota mascota = buscarMascotaEnCola(m);
		
		if(m != null) {
			costo = m.calcularConsulta();
			informes.push(colaDeEspera.remove());
		}
		
		return costo;
	}
	
//	private Mascota buscarMascotaEnCola(Mascota m) {
//		Mascota centinela = new Perro("@@","@@",TipoPerro.GRANDE);
//		Mascota mBuscada = null;
//		Mascota mActual;
//		
//		this.colaDeEspera.add(centinela);
//		mActual = this.colaDeEspera.remove();
//		
//		while (mActual != centinela) {
//			if(mActual == m) {
//				mBuscada = mActual;
//			}
//			this.colaDeEspera.add(mActual);
//			mActual = this.colaDeEspera.remove();
//		}
//		
//		return mBuscada;
//	}
	
	public Mascota[] ultimasMascotasAtendidas(int cantidad) {
		int cantEnPila = obtenerCantidadEnPila();
		Pila<Mascota> pilaAux = new PilaNodos<Mascota>();
		
		while(cantEnPila < cantidad) {
			cantidad = cantEnPila;
		}
		
		Mascota[] ultimasAtendidas = new Mascota[cantidad];
		
		for (int i = 0; i < ultimasAtendidas.length-1 ; i++) {
			
				Mascota m = informes.pop();
				ultimasAtendidas[i] = m;
				pilaAux.push(m);
		}
		ordenarPila(pilaAux);
		
		return ultimasAtendidas;
	}
	private int obtenerCantidadEnPila() {
		int cantidad = 0;
		Pila<Mascota> pilaAux = new PilaNodos<Mascota>();
		
		while(!informes.isEmpty()) {
			pilaAux.push(informes.pop());
		}
		
		ordenarPila(pilaAux);
		return cantidad;
	}
	
	private void ordenarPila(Pila<Mascota> pilaAux) {
		while(!pilaAux.isEmpty()) {
			informes.push(pilaAux.pop());
		}
	}
	public void mostraColaDeEspera(){
		Mascota centinela = new Perro("-1","ppp", TipoPerro.GRANDE);
		Mascota mascotaActual;
		
		colaDeEspera.add(centinela);
		
		mascotaActual = colaDeEspera.remove();
		
		while(mascotaActual != centinela){
						
			System.out.println(mascotaActual);
			colaDeEspera.add(mascotaActual);
			mascotaActual = colaDeEspera.remove();
		}
	}
	
	public void retiroAnticipado(Mascota m){
		Mascota centinela = new Perro("-1","ppp", TipoPerro.GRANDE);
		Mascota mascotaActual;
		
		colaDeEspera.add(centinela);
		
		mascotaActual = colaDeEspera.remove();
		
		while(mascotaActual != centinela) {
			if(mascotaActual != m){
				colaDeEspera.add(mascotaActual);
			}
			mascotaActual = colaDeEspera.remove();
		}
		
	}
	
	public void mostrarListaOrdenada() {
		for (Mascota mascota : registro) {
			System.out.println(mascota);
		}
	}
}
