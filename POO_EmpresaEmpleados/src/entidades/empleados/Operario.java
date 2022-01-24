package entidades.empleados;

public class Operario extends Empleado {

	private String especialidad;

	public static final String ESPECIALIDAD_INVESTIGACION = "I";
	public static final String ESPECIALIDAD_DESARROLLO = "D";
	public static final String ESPECIALIDAD_TECNICO = "T";

	public Operario(String apellido, int legajo, String especialidad) {
		super(apellido, legajo);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public float getSalarioFinal() {
		float salarioFinal = getPrecioHora() * getCantidadHorasTrabajadas();
		if (especialidad.equals(ESPECIALIDAD_INVESTIGACION)) {
			salarioFinal += 2000;
		} else if (especialidad.equals(ESPECIALIDAD_DESARROLLO)) {
			salarioFinal += 1000;
		} else if (especialidad.equals(ESPECIALIDAD_TECNICO)) {
			salarioFinal += 1500;
		}
		return salarioFinal;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", tipo de empleado: Operario");
		builder.append(", especialidad=");
		builder.append(especialidad);
		return builder.toString();
	}

}
