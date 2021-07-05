package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements INadador, ICiclista, ICorredor {
	private Integer codigo;
	private String nombre;
	private String estilo;
	private TipoDeBicicleta bici;
	private Integer distancia;
	private Integer kmEntrenados;
	
	public Triatleta(Integer codigo, String nombre, String estilo, TipoDeBicicleta bici) {
		super(codigo,nombre);
		this.bici=bici;
		this.distancia=0;
		this.kmEntrenados=0;
		this.estilo=estilo;
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

	public TipoDeBicicleta getTipoDeBicicleta() {
		return this.bici;
	}

	public Integer getNumeroDeSocio() {
		return getCodigo();
	}

	public String getEstiloPreferido() {
		return this.estilo;
	}
	
	
	
	
}
