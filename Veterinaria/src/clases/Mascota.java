package clases;

public abstract class Mascota {
	private String nombre;
	private String dniDuenio;
	
	public Mascota(String nombre, String dniDuenio) {
		setNombre(nombre);
		setDniDuenio(dniDuenio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDniDuenio() {
		return dniDuenio;
	}

	public void setDniDuenio(String dniDuenio) {
		this.dniDuenio = dniDuenio;
	}
	
	public abstract int calcularConsulta();

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", dniDuenio=" + dniDuenio + "]";
	}
	
	
	
}
