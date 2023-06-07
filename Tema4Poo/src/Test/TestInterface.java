package Test;

import EntradaSalida.Tools;
import Interfaces.MetodosOperaciones;

public class TestInterface {

	public static void main(String args[]) {
		menu();
	}
		public static void menu()
		{
			String menu="Insertar,Buscar,Visualizar,Salir";
			MetodosOperaciones oper=new MetodosOperaciones(10);
			String sel="";
			do{
				sel=Tools.boton(menu);
				switch(sel) {
				case "Insertar":if(oper.insertaDato(Tools.leerString("Escribe un nombre")))
					{System.out.println("Datos insertados!!"+oper.verDatos());
					
					}
				
				else System.out.println("Array lleno");
				break;
				
				case "Buscar": if(oper.vectorVacio() ) System.out.println("Array vacio, intenta ingresando");
				else {
					if(oper.buscarDato(Tools.leerString("Escribe el nombre buscar"))==-9)System.out.print("El valor no existe");
					else System.out.println("El dato si existe");
				
				}
				break;
				case "Visualizar": oper.ordenarDat();
				System.out.println("Datos insertados!!"+oper.verDatos());
				case "Salir": break;
				}
			}while(!sel.equalsIgnoreCase("Salir"));
			
		}
			
		}
	



