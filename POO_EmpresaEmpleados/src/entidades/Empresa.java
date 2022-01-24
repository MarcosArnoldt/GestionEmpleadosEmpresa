package entidades;

import java.util.ArrayList;
import entidades.empleados.Empleado;

public class Empresa {

	private String nombreEmpresa;
	private ArrayList<Empleado> listadoEmpleados;

	public Empresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public void agregarEmpleado(Empleado empleado) {
		if (listadoEmpleados == null) {
			listadoEmpleados = new ArrayList<Empleado>();
		}
		listadoEmpleados.add(empleado);
	}

	public float calcularGastosSalarios() {
		float gastosSalario = 0;
		for (int i = 0; i < listadoEmpleados.size(); i++) {
			Empleado e = listadoEmpleados.get(i);
			gastosSalario += e.getSalarioFinal();
		}
		return gastosSalario;
	}

	public Empleado buscarEmpleado(String apellidoEmpleado) {
		Empleado empleadoEncontrado = null;
		for (int i = 0; i < listadoEmpleados.size(); i++) {
			Empleado empleado = listadoEmpleados.get(i);
			if (empleado.getApellido().equalsIgnoreCase(apellidoEmpleado)) {
				empleadoEncontrado = empleado;
				break;
			}
		}
		return empleadoEncontrado;
	}

}
