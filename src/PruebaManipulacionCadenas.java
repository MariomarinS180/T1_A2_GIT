import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class TDACadenaEspecialConString{
	private String cadena; 
	
	public String getCadena() {
		return cadena;
	}//get
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}//set

	public String invertirCadenaPorletra() {
		String cadInv = "";
		for (int i = this.cadena.length() - 1; i >= 0; i--) {
			cadInv = cadInv + cadena.substring(i, i + 1);
		}
		return cadInv;
	}
	//invertirCadenaPorLetra
	
	public String invertirCadenaPorPalabra() {
		cadena = "";
		String [] particion = cadena.split(" ");
		String parte1 = particion[0];
		String parte2 = particion[1];
		String parte3 = particion[2];

		String [] particiones = {parte2, parte1, parte3};
		return particiones[3];
	}//invertirCadenaPorPalabra
	
	
	public String agregarCaracterEnPosicion(char pos, int car) {
		String palabra = "";
		for (int i = 0; i < this.cadena.length(); i++) {
			if (i == car) {
				palabra = palabra + pos;
			}
			palabra = palabra + this.cadena.substring(i, i + 1);
		}
		return palabra;	
	}//agregarCaracterEnPosicion				
}//Class TDACadenaEspecialConString

public class PruebaManipulacionCadenas {

	public static void main(String[] args) {

		int num = 0;
		//=============================================================
		
		FileWriter archivo = null;
		PrintWriter pr = null;
		
		try {
			archivo = new FileWriter("./Registros/NumsControl", true);
			pr = new PrintWriter(archivo);
			
			for (int i = 0; i < 10; i++) {
				num = (int)(Math.random()* (18074999 - 18070001 +1)+18070001);
				
				if (num >= 18070001) {
					pr.println("S"+num);
				}if (num >= 18071001) {
					pr.println("M"+num);
				}if (num >= 18072001) {
					pr.println("I"+num);
				}if (num >= 18073001) {
					pr.println("L"+num);
				}if (num >= 18070001) {
					pr.println("C"+num);
				}
			}
			System.out.println("Se registraron Números de Control.");
		} catch (Exception e) {
		e.printStackTrace();
		}finally {
			pr.close();
		}	
		
		TDACadenaEspecialConString td1 = new TDACadenaEspecialConString();
		td1.setCadena("Hola Mundo");
	}//main
}//class
