package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador{
	private Integer codigo;
	private String nombre;
	private String estilo;
	
	public Nadador(Integer codigo, String nombre, String estilo) {
		super(codigo, nombre);
		this.estilo=estilo;
	}

	public String getEstiloPreferido() {
		return this.estilo;
	}

	public Integer getNumeroDeSocio() {
		return getCodigo();
	}
}
