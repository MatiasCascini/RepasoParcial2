package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;


public class Corredor extends Deportista implements ICorredor{
	private Integer codigo;
	private String nombre;
	private Integer distancia;
	private Integer kmEntrenados;
	
	public Corredor(Integer codigo, String nombre, Integer distancia) {
		super(codigo, nombre);
		this.distancia=distancia;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		this.kmEntrenados=km;
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		return this.kmEntrenados;
	}

	public Integer getDistanciaPreferida() {
		return this.distancia;
	}

	public Integer getNumeroDeSocio() {
		return getCodigo();
	}
	
	
}
