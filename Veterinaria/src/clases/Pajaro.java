package clases;

public class Pajaro extends Mascota{
	
	private TipoPajaro tipo;
	private int peso;
	private static int PESO_GR = 100;
	
	public Pajaro(String nombre, String dniDuenio, int peso, TipoPajaro tipo) {
		super(nombre, dniDuenio);
		this.tipo = tipo;
	}

	public TipoPajaro getTipo() {
		return tipo;
	}

	public void setTipo(TipoPajaro tipo) {
		this.tipo = tipo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public int calcularConsulta() {
		return (this.peso/PESO_GR) * tipo.getPrecio();
	}
	@Override
	public String toString() {
		return super.toString() + "Pajaro [tipo=" + tipo + "]";
	}
}
