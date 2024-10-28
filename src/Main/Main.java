package Main;

import java.util.Scanner;

import Entity.LicInformatica;
import Implementacion.LogMetInformatica;

public class Main {
	public static void main(String[] args) {

		Scanner lectura = null;//Reserva en memoria

		//Atributos ddel objeto
		String nombre;
		long cedula;

		//atributos subclase
		String pc;
		String lenguajes;
		String ide;

		//Declaramosnuestro 
		LicInformatica informatica;

		int menuPrin, menuInfor, subMenu, indice;

		LogMetInformatica impInformatica = new LogMetInformatica();

		do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1.- MENU INFORMATICA");
			System.out.println("2.- SALIR");
			lectura = new Scanner(System.in);
			menuPrin=lectura.nextInt();

			switch (menuPrin) {
			case 1:
				do {
					System.out.println("MENU DE INFORMATICA");
					System.out.println("1.- ALTA");
					System.out.println("2.- MOSTRAR");
					System.out.println("3.- BUSCAR");
					System.out.println("4.- EDITAR");
					System.out.println("5.- ELIMINAR");
					System.out.println("6.- REGRESAR M.P.");
					lectura = new Scanner(System.in);
					menuInfor = lectura.nextInt();

					switch (menuInfor) {
					case 1:
						System.out.println("INGRESE EL NOMBRE");
						lectura = new Scanner(System.in);
						nombre= lectura.nextLine();

						System.out.println("INGRESE LA CÉDULA");
						lectura = new Scanner(System.in);
						cedula = lectura.nextLong();

						System.out.println("INGRESE LA PC");
						lectura = new Scanner(System.in);
						pc=lectura.nextLine();

						System.out.println("INGRESE LENGUAJE");
						lectura = new Scanner(System.in);
						lenguajes = lectura.nextLine();

						System.out.println("INGRESE IDE");
						lectura = new Scanner(System.in);
						ide = lectura.nextLine();

						//objeto
						informatica = new LicInformatica(nombre, cedula, pc, lenguajes, ide);

						//guardar
						impInformatica.guardar(informatica);
						System.out.println("Se guardó con éxito");


						break;
					case 2:
						impInformatica.listar();

						break;
					case 3:
						impInformatica.indiceNombre();

						System.out.println("\nIngrese  el índice a buscar ");
						lectura = new Scanner(System.in);
						indice= lectura.nextInt();

						//Buscar 
						informatica = impInformatica.buscar(indice);
						System.out.println("Se encontró"+ informatica);

						break;
					case 4:
						//editar 
						impInformatica.indiceNombre();

						System.out.println("\nIngrese  el índice a editar ");
						lectura = new Scanner(System.in);
						indice= lectura.nextInt();

						//Buscar 
						informatica = impInformatica.buscar(indice);
						System.out.println("Se encontró"+ informatica);

						do {
							System.out.println("SUBMENU PARA EDITAR ");
							System.out.println("1-  NOMBRE ");
							System.out.println("2.- LENGUAJES ");
							System.out.println("3.- REGRESAR M.I. ");
							lectura = new Scanner(System.in);
							subMenu=lectura.nextInt();

							switch (subMenu) {
							case 1:
								System.out.println("INGRESE EL NUEVO NOMBRE ");
								lectura=  new Scanner(System.in);
								nombre=lectura.nextLine();

								//Actualización

								informatica.setNombre(nombre);
								impInformatica.editar(indice, informatica);
								System.out.println("Se editó el nombre con éxito");

								break;
							case 2:
								System.out.println("INGRESE EL NUEVO lenguaje ");
								lectura=  new Scanner(System.in);
								lenguajes=lectura.nextLine();

								//Actualizamos
								informatica.setLenguajes(lenguajes);
								impInformatica.editar(indice, informatica);
								System.out.println("Se editó el lenguaje con éxito");

								break;
							case 3:
								break;

							default:
								break;
							}

						} while (subMenu<3);


						break;
					case 5:
						//CAso para eliminar
						impInformatica.indiceNombre();
						
						System.out.println("\nIngrese el  índice a eliminar");
						lectura = new Scanner(System.in);
						indice=lectura.nextInt();
						
						//eliminamos
						impInformatica.eliminar(indice);
						System.out.println("Se eliminó el registro");

						

						break;
					case 6:

						break;
					default:
						break;
					}

				} while (menuInfor < 6);
				break;

			default:
				break;
			}


		}while(menuPrin < 3);

	}
}
