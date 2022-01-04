package clases;

public enum TipoPajaro {
	EXOTICO(100), NO_EXOTICO(50);
	
	private TipoPajaro(int precio) {
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
