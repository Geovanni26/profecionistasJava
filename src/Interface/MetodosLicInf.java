package Interface;

import java.util.List;
import Entity.LicInformatica;
public interface MetodosLicInf {
		
	public void guardar(LicInformatica informatica);
	
	public List<LicInformatica> listar();
	
	public LicInformatica buscar(int indice);
	
	public void editar(int indice, LicInformatica informatica);
	
	public void eliminar(int indice);
	
	

}
