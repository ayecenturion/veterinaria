package clases;

public class Gato extends Mascota{
	
	private TipoGato tipo;
	
	public Gato(String nombre, String dniDuenio, TipoGato tipo) {
		super(nombre, dniDuenio);
		this.tipo = tipo;
	}

	public TipoGato getTipo() {
		return tipo;
	}

	public void setTipo(TipoGato tipo) {
		this.tipo = tipo;
	}

	@Override
	public int calcularConsulta() {
		return tipo.getPrecio();
	}
	
	@Override
	public String toString() {
		return super.toString() + "Gato [tipo=" + tipo + "]";
	}

}
