package Entity;

//Clase donden se hereda

public class LicInformatica extends Profesionistas {
	//Atributos
	String pc;
	String lenguajes;
	String ide;
	
	public LicInformatica(String nombre, long cedula, String pc, String lenguajes, String ide) {
		super(nombre, cedula);//Se utiliza para la harencia
		this.pc = pc;
		this.lenguajes = lenguajes;
		this.ide = ide;
	}

	@Override
	public String toString() {
		return "LicInformatica [nombre=" + nombre + ", cedula=" + cedula + ", pc=" + pc + ", lenguajes=" + lenguajes
				+ ", ide=" + ide + "]\n";
	}
	
	//SET Y GET

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(String lenguajes) {
		this.lenguajes = lenguajes;
	}

	public String getIde() {
		return ide;
	}

	public void setIde(String ide) {
		this.ide = ide;
	}
	
	

	

}
