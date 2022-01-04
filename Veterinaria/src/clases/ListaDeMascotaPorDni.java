package clases;
import ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;
import ort.tp1.tdas.interfaces.*;

public class ListaDeMascotaPorDni extends ListaOrdenadaNodos<String,Mascota> {

	@Override
	public int compare(Mascota m1, Mascota m2) {
		return m1.getDniDuenio().compareTo(m2.getDniDuenio());
	}

	@Override
	public int compareByKey(String clave, Mascota m) {
		return clave.compareTo(m.getDniDuenio());
	}

}
