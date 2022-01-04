package clases;

public enum TipoGato {
	
	
	
	DE_RAZA(1500), SIN_RAZA(750);
	
	private int precio;

	private TipoGato(int precio) {
		setPrecio(precio);
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
