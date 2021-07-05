package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Club {

	private String nombre;
	private Set<Deportista> socios = new HashSet<>();
	private Map<String, Evento> competencias = new HashMap<>();
	
	public Club (String nombre) {
		this.nombre=nombre;
	}

	public void agregarDeportista(Deportista deportista) {
		this.socios.add(deportista);
	}

	public Integer getCantidadSocios() {
		return socios.size();
	}

	public void crearEvento(TipoDeEvento tipo, String nombreEvento) {
		Evento compe1= new Evento(tipo);
		competencias.put(nombreEvento, compe1);
	}

	public Integer inscribirEnEvento(String nombreEvento, Deportista deportista) throws NoEstaPreparado {
		
		switch (competencias.get(nombreEvento).getTipo()) {
		case CARRERA_10K:case CARRERA_21K:case CARRERA_42K:case CARRERA_5K:
			if(deportista instanceof ICorredor) {
				return competencias.get(nombreEvento).Inscribir(deportista);
			}else
				throw new NoEstaPreparado();
			
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:case CARRERA_NATACION_EN_PICINA:
			if(deportista instanceof INadador) {
				return competencias.get(nombreEvento).Inscribir(deportista);
			}else 
				throw new NoEstaPreparado();
			
		case DUATLON:
			if(deportista instanceof ICiclista) {
				if(deportista instanceof ICorredor)
					return competencias.get(nombreEvento).Inscribir(deportista);
			}else
				throw new NoEstaPreparado();
			break;

		case TRIATLON_IRONMAN:case TRIATLON_MEDIO:case TRIATLON_OLIMPICO:case TRIATLON_SHORT:
			if(deportista instanceof ICiclista) {
				if(deportista instanceof ICorredor)
					if(deportista instanceof INadador)
						return competencias.get(nombreEvento).Inscribir(deportista);
			}else
				throw new NoEstaPreparado();
			break;

		default:
			break;
		}
		
		return 0;
	}
	
	
	
}
