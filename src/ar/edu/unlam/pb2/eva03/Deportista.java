package ar.edu.unlam.pb2.eva03;

public class Deportista {
	
	private Integer codigo;
	private String nombre;
	
	public Deportista(Integer codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Deportista other = (Deportista) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
}
