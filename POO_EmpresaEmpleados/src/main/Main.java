package main;

import java.io.File;
import java.io.FileWriter;

import entidades.Empresa;
import entidades.empleados.Empleado;
import entidades.empleados.Operario;
import entidades.empleados.Supervisor;

public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa("Empresa POO");

		simularCargaEmpleados(empresa);
		mostrarGastoSalarios(empresa);
		simularBusquedaEmpleado(empresa);

		guardarEnArchivo(empresa);
	}

	private static void simularCargaEmpleados(Empresa empresa) {
		System.out.println("Simular carga de empleados");

		Operario emp1 = new Operario("Juarez", 111, Operario.ESPECIALIDAD_DESARROLLO);
		emp1.setPrecioHora(100);
		emp1.setCantidadHorasTrabajadas(170);
		System.out.println(emp1);

		empresa.agregarEmpleado(emp1);

		Operario emp2 = new Operario("Perez", 112, Operario.ESPECIALIDAD_INVESTIGACION);
		emp2.setPrecioHora(120);
		emp2.setCantidadHorasTrabajadas(120);
		System.out.println(emp2);

		empresa.agregarEmpleado(emp2);

		Supervisor emp3 = new Supervisor("Flores", 112, Supervisor.CATEGORIA_2);
		emp3.setPrecioHora(160);
		emp3.setCantidadHorasTrabajadas(160);
		System.out.println(emp3);

		empresa.agregarEmpleado(emp3);

		Supervisor emp4 = new Supervisor("Ramirez", 112, Supervisor.CATEGORIA_1);
		emp4.setPrecioHora(180);
		emp4.setCantidadHorasTrabajadas(160);
		System.out.println(emp4);

		empresa.agregarEmpleado(emp4);

		System.out.println();
	}

	private static void mostrarGastoSalarios(Empresa empresa) {
		System.out.println("Gastos total de la empresa en salarios: " + empresa.calcularGastosSalarios());
		System.out.println();
	}

	private static void simularBusquedaEmpleado(Empresa empresa) {
		System.out.println("Búsqueda de empleado");
		String apellidoEmpleado = "Flores";
		System.out.println("Buscar empleado con apellido: " + apellidoEmpleado);
		Empleado empleado = empresa.buscarEmpleado(apellidoEmpleado);
		if (empleado != null) {
			System.out.println("Empleado encontrado:");
			System.out.println(empleado.toString());
		} else {
			System.out.println("Empleado no encontrado");
		}
	}

	private static void guardarEnArchivo(Empresa empresa) {
		try {
			File archivo = new File("Empresa empleados.txt");

			FileWriter writer = new FileWriter(archivo, false);

			String contenido = empresa.getNombreEmpresa() + " - Total ingresos: " + empresa.calcularGastosSalarios();

			writer.write(System.lineSeparator());
			writer.write(contenido);

			writer.close();
		} catch (Exception e) {
			System.out.println("Se produjo un error al guardar en archivo. " + e);
		}
	}

}
