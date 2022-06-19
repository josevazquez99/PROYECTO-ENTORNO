package org.ed.junit.diccionario;

import org.junit.Test;

import com.jacaranda.lemas.DefinicionException;
import com.jacaranda.lemas.Diccionario;
import com.jacaranda.lemas.DiccionarioException;
import com.jacaranda.lemas.LemaException;
import com.jacaranda.lemas.LetraException;
import com.jacaranda.lemas.Palabra;
import com.jacaranda.lemas.Significado;

public class testDiccionario {

	/*
	 * Comrpueba que añade la palabra y el significado
	 */
	@Test
	public void testañadirPalabrasConDatosCorrectos()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.addPalabra("SALUDAR", "Es saludar");
		} catch (Exception e) {
			System.out.println("Ya existe la palabra");
		}

	}

	/*
	 * Comrpueba que salta la excepcion al meterle una palabra nula
	 */
	@Test
	public void testAñadirPalabraConDatosNulos()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.addPalabra(null, "Es saludar");
		} catch (Exception e) {
			System.out.println("La palabra añadida no puede ser nula");
		}

	}

	/*
	 * Comrpueba que salta la excepcion al meterle una palabra nula
	 */
	@Test
	public void testAñadirPalabraConDatosVacíos()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.addPalabra("SALUDAR", "Es saludar");
		} catch (Exception e) {
			System.out.println("La palabra añadida no puede estar vacía");
		}

	}

//
//	/*
//	 * Comrpueba que salta la excepcion al meterle una palabra con espacios en
//	 * blanco
//	 */
	@Test
	public void testAñadirPalabraConDatosEnBlancos()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.addPalabra("SALUDAR", "Es saludar");
		} catch (Exception e) {
			System.out.println("La palabra añadida no puede solo contener espacios en blanco");
		}

	}

	/*
	 * Comprueba que añade el significado
	 */
	@Test
	public void testAñadirSignificadoConDatosCorrectos()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.addPalabra("SALUDAR", "Es saludar");
		} catch (Exception e) {
			System.out.println("La definición no puede ser nula");
		}

	}

//
//	/*
//	 * Comrpueba que salta la excepcion al meterle un significado nulo
//	 */
	@Test
	public void testAñadirSignificadoConDatosNulos()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.addPalabra("SALUDAR", null);
		} catch (Exception e) {
			System.out.println("La definición no puede ser nula");
		}

	}

//
//	/*
//	 * Comrpueba que salta la excepcion al meterle un significado vacio
//	 */
	@Test
	public void testAñadirSignificadoConDatosVacios()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.addPalabra("SALUDAR", "Es saludar");
		} catch (Exception e) {
			System.out.println("La definición no puede estar vacia");
		}

	}

//	/*
//	 * Comrpueba que salta la excepcion al meterle un significado con espacios en blanco
//	 */
	@Test
	public void testAñadirSignificadoConDatosEnBlancos()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.addPalabra("SALUDAR", "  ");
		} catch (Exception e) {
			System.out.println("La definición no puede solo contener espacios");
		}

	}

//
//	/*
//	 * Comrpueba que borra la palabra
//	 */
	@Test
	public void testBorrarPalabraConDatosCorrectos()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.borrarPalabra("SALUDAR");
		} catch (Exception e) {
			System.out.println("La palabra ya esta borrada");
		}
	}

//	/*
//	 * Comrpueba que salta la excepcion al eliminar la palabra nula
//	 */
	@Test
	public void testBorrarPalabraConDatosNulos()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.borrarPalabra(null);
		} catch (Exception e) {
			System.out.println("La palabra borrada no puede ser nula");
		}
	}

//	/*
//	 * Comrpueba que salta la excepcion al eliminar la palabra vacia
//	 */
	@Test
	public void testBorrarPalabraConDatosVacios()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.borrarPalabra("");
		} catch (Exception e) {
			System.out.println("La palabra borrada no puede estar vacía ");
		}
	}

//	/*
//	 * Comrpueba que salta la excepcion al eliminar la palabra con espacios en blanco
//	 */
	@Test
	public void testBorrarPalabraConDatosEnBlancos()
			throws DiccionarioException, LetraException, LemaException, DefinicionException {
		Diccionario d1 = new Diccionario();
		try {
			d1.borrarPalabra(" ");
		} catch (Exception e) {
			System.out.println("La palabra borrada no puede solo contener espacios en blanco.");
		}
	}

//	/*
//	 * Comrpueba que se busca la palabra correctamente
//	 */
	@Test
	public void testBuscarPalabraConDatosCorrectos() throws DiccionarioException, LetraException, LemaException {
		Diccionario d1 = new Diccionario();
		try {
			d1.buscarPalabra("HOLA");
		} catch (Exception e) {
			System.out.println("La palabra no existe");
		}
	}

//	/*
//	 * Comrpueba que salta la excepcion al buscar la palabra nula
//	 */
	@Test
	public void testBuscarPalabraConDatosNulos() throws DiccionarioException, LetraException, LemaException {
		Diccionario d1 = new Diccionario();
		try {
			d1.buscarPalabra(null);
		} catch (Exception e) {
			System.out.println("La palabra buscada no puede ser nula");
		}
	}

//	/*
//	 * Comrpueba que salta la excepcion al buscar la palabra vacia
//	 */
	@Test
	public void testBuscarConDatosVacios() throws DiccionarioException, LetraException, LemaException {
		Diccionario d1 = new Diccionario();
		try {
			d1.buscarPalabra("");
		} catch (Exception e) {
			System.out.println("La palabra buscada no puede estar vacia");
		}
	}

//	/*
//	 * Comrpueba que salta la excepcion al buscar la palabra con espacios
//	 */
	@Test
	public void testBuscarPalabraConDatosEnBlancos() throws DiccionarioException, LetraException, LemaException {
		Diccionario d1 = new Diccionario();
		try {
			d1.buscarPalabra(" ");
		} catch (Exception e) {
			System.out.println("La palabra buscada no puede estar vacia");
		}
	}

//	/*
//	 * Comprueba que aparece el listado de  palabras que empiezan por la cadena introducida
//	 */
	@Test
	public void testBuscarPalabraQueEmpiecenPorDatosCorrectos() throws LetraException, LemaException {
		Diccionario d1 = new Diccionario();
		try {
			d1.listadoPalabrasQueEmpiezanPor("BA");
		} catch (Exception e) {
			System.out.println("No existe palabras que empiezan por esa letra");
		}
	}

//	/*
//	 * Comprueba que salta la excepcion al introducir una cadena nula para mostrar el listado de  palabras que empiezan por esa cadena
//	 */
	@Test
	public void testBuscarPalabraQueEmpiecenPorDatosNulos() throws LetraException, LemaException {
		Diccionario d1 = new Diccionario();
		try {
			d1.listadoPalabrasQueEmpiezanPor(null);
		} catch (Exception e) {
			System.out.println("La cadena no puede ser nula");
		}
	}

	/*
	 * Comprueba que salta la excepcion al introducir una cadena vacia para mostrar
	 * el listado de palabras que empiezan por esa cadena
	 */
	@Test
	public void testBuscarPalabraQueEmpiecenPorDatosVacios() throws LetraException, LemaException {
		Diccionario d1 = new Diccionario();
		try {
			d1.listadoPalabrasQueEmpiezanPor("");
		} catch (Exception e) {
			System.out.println("La cadena no puede estar vacía");
		}
	}

	/*
	 * Comprueba que salta la excepcion al introducir una cadena con espacios para
	 * mostrar el listado de palabras que empiezan por esa cadena
	 */
	@Test
	public void testBuscarPalabraQueEmpiecenPorDatosEnBlanco() throws LetraException, LemaException {
		Diccionario d1 = new Diccionario();
		try {
			d1.listadoPalabrasQueEmpiezanPor(" ");
		} catch (Exception e) {
			System.out.println("La cadena no puede contener espacios en blanco");
		}
	}

}
