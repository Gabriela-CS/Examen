package Interfaces;

import EntradaSalida.Tools;

public class MetodosOperaciones implements Operaciones{


		private String nombres[];
		private byte j;
		
		public MetodosOperaciones(int i)
		{
			nombres=new String[i];
			j=-1;
			
		}
		
		@Override
		public boolean vectorEspacio() {
			return (j<nombres.length-1);
		}

		@Override
		public boolean vectorVacio() {
			return (j==-1);
		}

		@Override
		public boolean insertaDato(String nom) {

			if(vectorEspacio())
			{
				nombres[j+1]=nom;
				j++;
				return true;
			}
			else return false;
		}

		@Override
		public int buscarDato(String nom) {
			for(int i=0; i<=j; i++) {
				if(nom.equals(nombres[i])) return i;
			}
			return -9;
		}

		@Override
		public void ordenarDat() {
			byte k,l;
			String aux;
			for(k=0;k<j; k++)
				for(l=(byte) (k+1);l<j; l++)
				{
					if(nombres[k].compareTo(nombres[l])>0)
					{
						aux=nombres[k];
						nombres[k]=nombres[l];
						nombres[l]=aux;
					}
				}
			
		}

		@Override
		public String verDatos() {
			String cad="";
			for(byte i=0; i<j; i++) {
				cad+=i+"["+nombres[i]+"]\n";
			}
	        return cad;
		}

	}


