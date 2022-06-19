package org.ed.junit.letra;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.jacaranda.lemas.Diccionario;
import com.jacaranda.lemas.DiccionarioException;
import com.jacaranda.lemas.LemaException;
import com.jacaranda.lemas.LetraException;
import com.jacaranda.lemas.Palabra;

public class TestLetra {

	/*
	 * Comprueba que busca la palabra
	 */
	@Test
	public void testBuscarPalabra() throws LemaException {
		Palabra target = new Palabra("HOLA");
		String expected = "HOLA";
		assertEquals("La palabra no es igual", target.getNombre(), expected);

	}

	/*
	 * Comprueba que salte error al buscar la palabra nula
	 */
	@Test
	public void testbuscarPalabraConDatosNulos() throws DiccionarioException, LetraException, LemaException {
		Diccionario d1 = new Diccionario();
		try {
			d1.buscarPalabra(null);
		} catch (Exception e) {
			System.out.println("La palabra buscada no puede ser nula");
		}
	}
}
