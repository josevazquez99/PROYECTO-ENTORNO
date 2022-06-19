package com.jacaranda.lemas;

import java.util.Scanner;

import com.jacaranda.lemas.Diccionario;
import com.jacaranda.lemas.DiccionarioException;
import com.jacaranda.lemas.LetraException;

public class MainDiccionario {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) throws DiccionarioException, LetraException {

		// Declaramos el objeto
		Diccionario d1 = new Diccionario();

		char opcion;
		String palabra;
		String significado;
		String cadena = null;

		System.out.println("Bienvenido a tu próximo viaje");
		System.out.println(menu());
		System.out.println("Elija una opcion");
		opcion = teclado.nextLine().charAt(0);

		while (opcion != 5) {
			switch (opcion) {
			case '1': {
				System.out.println("Introduce la palabra ");
				palabra = teclado.nextLine();
				System.out.println("Introduce el significado ");
				significado = teclado.nextLine();
				d1.addPalabra(palabra, significado);

			}
				break;
			case '2': {
				System.out.println("Introduce la palabra");
				palabra = teclado.nextLine();
				System.out.println(d1.buscarPalabra(palabra));

			}
				break;
			case '3': {
				System.out.println("Introduce la palabra");
				palabra = teclado.nextLine();
				d1.borrarPalabra(palabra);
			}
				break;
			case '4': {
				System.out.println("Introduce la cadena");
				palabra = teclado.nextLine();
				System.out.println(d1.listadoPalabrasQueEmpiezanPor(palabra));
			}
				break;
			case '5': {
				System.out.println("Apagar y salir");
			}
				break;
			default:
				System.out.println("Error");
			}
			System.out.println(menu());
			System.out.println("Elija una opcion");
			opcion = teclado.nextLine().charAt(0);
		}

	}

	private static String menu() {
		return "1-.Anadir palabra\n" + "2-.Buscar palabra en diccionario\n" + "3-.Borrar una palabra del diccionario\n"
				+ "4-.Listado de palabras que empiecen por...\n" + "5-.Apagar y salir\n";
	}
}