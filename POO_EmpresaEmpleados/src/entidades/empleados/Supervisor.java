package entidades.empleados;

public class Supervisor extends Empleado {

	private int categoria;

	public static int CATEGORIA_1 = 1;
	public static int CATEGORIA_2 = 2;

	public Supervisor(String apellido, int legajo, int categoria) {
		super(apellido, legajo);
		this.categoria = categoria;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public float getSalarioFinal() {
		float salarioFinal = getPrecioHora() * getCantidadHorasTrabajadas();
		if (categoria == CATEGORIA_1) {
			salarioFinal += 2000;
		} else if (categoria == CATEGORIA_2) {
			salarioFinal += 1000;
		}
		return salarioFinal;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", tipo de empleado: Supervisor");
		builder.append(", categoría=");
		builder.append(categoria);
		return builder.toString();
	}

}
