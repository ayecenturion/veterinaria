package clases;

public class Perro extends Mascota{
	private TipoPerro tipo;

	public Perro(String nombre, String dniDuenio, TipoPerro tipo) {
		super(nombre,dniDuenio);
		this.tipo = tipo;
	}

	public TipoPerro getTipo() {
		return tipo;
	}

	public void setTipo(TipoPerro tipo) {
		this.tipo = tipo;
	}

	@Override
	public int calcularConsulta() {
		return tipo.getPrecio();
	}

	@Override
	public String toString() {
		return super.toString() + "Perro [tipo=" + tipo + "]";
	}

	
	
	
	
}
