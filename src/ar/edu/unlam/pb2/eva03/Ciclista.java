package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;


public class Ciclista extends Deportista implements ICiclista{
	private Integer codigo;
	private String nombre;
	private String bici;
	
	public Ciclista(Integer codigo, String nombre, String bici) {
		super(codigo, nombre);
		this.bici=bici;
	}

	public String getTipoDeBicicleta() {
		return this.bici;
	}

	public Integer getNumeroDeSocio() {
		return getCodigo();
	}
}
