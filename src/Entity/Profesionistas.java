package Entity;
//Superclase
//una clase abstracta no se puede instanciar solo heredar

public abstract class Profesionistas {
	//Atributos
	String nombre;
	long cedula;
	
	//COnstructor con parametro
	public Profesionistas(String nombre, long cedula) {
		this.nombre = nombre;
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}
	
	

}
