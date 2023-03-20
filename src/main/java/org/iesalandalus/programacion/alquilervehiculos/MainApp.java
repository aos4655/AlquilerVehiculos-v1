package org.iesalandalus.programacion.alquilervehiculos;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.alquilervehiculos.controlador.Controlador;
import org.iesalandalus.programacion.alquilervehiculos.modelo.Modelo;
import org.iesalandalus.programacion.alquilervehiculos.modelo.ModeloCascada;
import org.iesalandalus.programacion.alquilervehiculos.modelo.negocio.memoria.FactoriaFuenteDatos;
import org.iesalandalus.programacion.alquilervehiculos.vista.FactoriaVista;
import org.iesalandalus.programacion.alquilervehiculos.vista.Vista;
import org.iesalandalus.programacion.alquilervehiculos.vista.texto.VistaTexto;

public class MainApp {

	public static void main(String[] args) throws OperationNotSupportedException {
		Modelo modelo = new ModeloCascada(FactoriaFuenteDatos.MEMORIA.crear());
		Vista vista = FactoriaVista.TEXTO.crear();
		Controlador controlador = new Controlador(modelo, vista);
		controlador.comenzar();
	}

}
