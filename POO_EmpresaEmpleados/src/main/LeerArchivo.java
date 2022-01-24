package main;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeerArchivo {

	public static void main(String arg[]) {
		String texto = "";

		try {
			FileReader lector = new FileReader("Empresa empleados.txt");
			BufferedReader contenido = new BufferedReader(lector);

			while ((texto = contenido.readLine()) != null) {
				System.out.println(texto);
			}

			contenido.close();
		} catch (Exception e) {
			System.out.println("Error al intentar leer el archivo. " + e);
		}
	}

}
