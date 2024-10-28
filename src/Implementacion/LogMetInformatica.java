package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Entity.LicInformatica;
import Interface.MetodosLicInf;

public class LogMetInformatica implements MetodosLicInf{
	
	//Declarar lista
	
	List<LicInformatica> lista = new ArrayList<LicInformatica>();
	

	@Override
	public void guardar(LicInformatica informatica) {
		
		lista.add(informatica);
		
	}

	@Override
	public List<LicInformatica> listar() {
		return lista;
	}

	@Override
	public LicInformatica buscar(int indice) {
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, LicInformatica informatica) {
		
		lista.set(indice, informatica);
		
	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);
	}
	
	//Buscar por indice y nombre
	public void indiceNombre() {
		System.out.println("Registros ordenados por índice");
		
		for(int i=0; i<lista.size(); i++) {
			System.out.printf("\n[%d]"+ lista.get(i).getNombre(),i);
			
		}
	}
	
	

}
