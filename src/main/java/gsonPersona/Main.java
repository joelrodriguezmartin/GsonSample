package gsonPersona;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {

	public static void main(String[] args) {
		String nombre = "";
		String apellido = "";
		String aux;
		int edad = - 1;
		Scanner in = new Scanner(System.in);
		while (nombre.length() <= 0 ) {
			System.out.println("Introduzca su nombre: ");
			nombre = in.nextLine();
		}
		while (apellido.length() <= 0) {
			System.out.println("Introduzca su apellido: ");
			apellido = in.nextLine();
		}
		while(edad < 0) {
			try {
			System.out.println("Introduzca su edad: ");
			aux = in.nextLine();
			edad = Integer.parseInt(aux);
				} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
					System.out.println("La edad debe ser un numero"); 
			}
		}
		in.close();
		
		Persona p = new Persona(nombre, apellido, edad);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
	}

}
