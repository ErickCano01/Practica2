package pract2;

import java.util.Scanner;

public class Pract2 {
	public static void main(String args[]) {
		Scanner tec= new Scanner(System.in);
		int pri=0,op=0;
		String nombre="",genero="",especie="",rendimiento="",marca="",sabor="",fecha="",funcion="",cantidad="";
		int edad=0,precio=0,durabilidad=0;
		while(pri<6) {
		System.out.println("Eliga una opcion");
		System.out.println("1) Clase 1");
		System.out.println("2) Clase 2 ");
		System.out.println("3) Clase 3 ");
		System.out.println("4) Clase 4 ");
		System.out.println("5) Clase 5 ");
		System.out.println("6) Salir ");
		pri= tec.nextInt();
		
		switch (pri) {
		case 1:
			System.out.println("Clase mascotas:");
			System.out.println("1) Capturar atributos");
			System.out.println("2) imprimir objetos");
			op= tec.nextInt();
			
			switch(op) {
			case 1:
				nombre=tec.nextLine();
				System.out.println("Ingrese el nombre");
				nombre=tec.nextLine();
				
				System.out.println("Ingrese el Genero con Macho o Hembra");
				genero=tec.nextLine();
				
				System.out.println("Ingrese la especie como gato o perro");
				especie=tec.nextLine();
				
				System.out.println("Ingrese la edad");
				edad=tec.nextInt();
				
				fecha=tec.nextLine();
				System.out.println("Ingrese la Fecha de nacimiento como 4/03/2001");
				fecha=tec.nextLine();

				break;
			case 2:
				System.out.println("Nombre: "+nombre);
				System.out.println("Genero: " +genero);
				System.out.println("Especie: "+especie);
				System.out.println("Edad: "+edad+" Años");
				System.out.println("Fecha de nacimiento: "+fecha);
				System.out.println("");
				break;
			}
			break;
		case 2:
			System.out.println("Clase Electrodomesticos");
			System.out.println("1) Capturar atributos");
			System.out.println("2) imprimir objetos");
			op= tec.nextInt();
			
			switch(op) {
			case 1:
				nombre=tec.nextLine();
				System.out.println("Ingrese el Nombre");
				nombre=tec.nextLine();
				
				System.out.println("Ingrese la Marca");
				marca=tec.nextLine();
				
				System.out.println("Ingrese la Durabilidad en años");
				durabilidad=tec.nextInt();
				
				rendimiento=tec.nextLine();
				System.out.println("Ingrese el Rendimiento");
				rendimiento=tec.nextLine();
				
				System.out.println("Ingrese el Precio");
				precio=tec.nextInt();
				break;
			case 2:
				System.out.println("Nombre: "+nombre);
				System.out.println("Marca: " +marca);
				System.out.println("Dura: "+durabilidad+" Años");
				System.out.println("Rendimiento: "+rendimiento);
				System.out.println("Precio: $"+precio);
				System.out.println("");
				break;
			}
			break;
		case 3:
			System.out.println("Clase Jugos");
			System.out.println("1) Capturar atributos");
			System.out.println("2) imprimir objetos");
			op= tec.nextInt();
			
			switch(op) {
			case 1:
				nombre=tec.nextLine();
				System.out.println("Ingrese el Nombre");
				nombre=tec.nextLine();
				
				System.out.println("Ingrese la Marca");
				marca=tec.nextLine();
				
				System.out.println("Ingrese el Precio");
				precio=tec.nextInt();
				
				sabor=tec.nextLine();
				System.out.println("Ingrese el Sabor");
				sabor=tec.nextLine();
				
				System.out.println("Ingrese la Caducidad como 18/02/2025");
				fecha=tec.nextLine();

				break;
			case 2:
				System.out.println("Nombre: "+nombre);
				System.out.println("Marca: " +marca);
				System.out.println("Precio: $"+precio);
				System.out.println("Precio: $"+sabor);
				System.out.println("Caduce el: "+fecha);
				System.out.println("");
				break;
			}
			break;
		case 4:
			System.out.println("Clase Gym");
			System.out.println("1) Capturar atributos");
			System.out.println("2) imprimir objetos");
			op= tec.nextInt();
			
			switch(op) {
			case 1:
				nombre=tec.nextLine();
				System.out.println("Ingrese el Nombre");
				nombre=tec.nextLine();
				
				System.out.println("Ingrese la Marca");
				marca=tec.nextLine();
				
				System.out.println("Ingrese la Durabilidad en años");
				durabilidad=tec.nextInt();
				
				System.out.println("Ingrese el Precio");
				precio=tec.nextInt();
				
				funcion=tec.nextLine();
				System.out.println("Ingrese la funcion como pierna o brazos");
				funcion=tec.nextLine();

				break;
			case 2:
				System.out.println("Nombre: "+nombre);
				System.out.println("Marca: " +marca);
				System.out.println("Dura: "+durabilidad+" Años");
				System.out.println("Precio: $"+precio);
				System.out.println("Función: "+funcion);
				System.out.println("");
				break;
			}
			break;
		case 5:
			System.out.println("Clase Comida para mascotas");
			System.out.println("1) Capturar atributos");
			System.out.println("2) imprimir objetos");
			op= tec.nextInt();
			
			switch(op) {
			case 1:
				nombre=tec.nextLine();
				System.out.println("Ingrese el Nombre");
				nombre=tec.nextLine();
				
				System.out.println("Ingrese la Marca");
				marca=tec.nextLine();
				
				System.out.println("Ingrese el Precio");
				precio=tec.nextInt();
				
				sabor=tec.nextLine();
				System.out.println("Ingrese el Sabor");
				sabor=tec.nextLine();
				
				System.out.println("Cantidad de comida en Kg");
				cantidad=tec.nextLine();

				break;
			case 2:
				System.out.println("Nombre: "+nombre);
				System.out.println("Marca: " +marca);
				System.out.println("Precio: $"+precio);
				System.out.println("Precio: $"+sabor);
				System.out.println("cantidad: "+cantidad+"Kg");
				System.out.println("");
				break;
			}
			break;
		case 6:
			System.out.println("Adios");
			break;
		}
		}
	}
	
}
