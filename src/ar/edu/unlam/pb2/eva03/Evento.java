package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Evento {

	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map<Integer, Deportista> participantes = new HashMap<>();
	
	public Evento (TipoDeEvento tipo) {
		this.tipo=tipo;
		this.numeroDeInscripcion=0;
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}
	
	public Integer Inscribir(Deportista deportista) {
		numeroDeInscripcion++;
		this.participantes.put(numeroDeInscripcion, deportista);
		return numeroDeInscripcion;
	}
	
	
}
