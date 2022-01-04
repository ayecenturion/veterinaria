package clases;

public enum TipoPerro {

	GRANDE(1000), MEDIANO(750), CHICO(500);
	
	private TipoPerro(int precio) {
		setPrecio(precio);
	}

	private int precio;

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
