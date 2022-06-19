package org.ed.junit.palabra;

import org.junit.Test;

import com.jacaranda.lemas.DefinicionException;
import com.jacaranda.lemas.LemaException;
import com.jacaranda.lemas.Palabra;
import com.jacaranda.lemas.Significado;

public class testPalabra {

	/*
	 * Comrpueba que añade el significado
	 */
	@Test
	public void testAñadirSignificadoConDatosCorrectos() throws LemaException, DefinicionException {
		Palabra p1 = new Palabra("SALUDAR");
		Significado s2 = new Significado("Es saludar");
		try {
			p1.addSignificado(s2);
		} catch (Exception e) {
			System.out.println("Ya existe el significado");
		}

	}

//	/*
//	 * Comrpueba que salta la excepcion de que ya existe
//	 */
	@Test
	public void testAñadirSignificadoConDatosIncorrectos() throws LemaException, DefinicionException {
		Palabra p1 = new Palabra("SALUDAR");
		Significado s2 = new Significado("Es decir adiós");
		try {
			p1.addSignificado(s2);
		} catch (Exception e) {
			System.out.println("Ya existe el significado");
		}

	}

}
