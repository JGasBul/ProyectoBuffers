package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestionDatos {

	public GestionDatos() {

	}

	//TODO: Implementa una función para abrir ficheros

	//TODO: Implementa una función para cerrar ficheros

	public boolean compararContenido (String fichero1, String fichero2) throws IOException{
		//TODO: Implementa la función
		FileReader fr1=new FileReader(fichero1);
		BufferedReader br1=new BufferedReader(fr1);
		FileReader fr2=new FileReader(fichero2);
		BufferedReader br2=new BufferedReader(fr2);

		String Cadena1 = br1.readLine();
		String Cadena2=br2.readLine();
		boolean temp = true;

		while ((Cadena1!=null) || (Cadena2!=null) && temp) {

			if (Cadena1 == null || Cadena2== null || !Cadena1.equals(Cadena2))
				temp = false;

			Cadena1 = br1.readLine();
			Cadena2 = br2.readLine();
		} 
		fr1.close();
		fr2.close();
		br1.close();
		br2.close();


		return temp;
	}

	public int buscarPalabra (String fichero1, String palabra, boolean primera_aparicion) throws IOException{
		//TODO: Implementa la función
		FileReader fr1=new FileReader(fichero1);
		BufferedReader br1=new BufferedReader(fr1);

		String Cadena1 = br1.readLine();
		boolean encontrada = false;
		int cont=0;
		int linea=0;
		int result;
		if(primera_aparicion) {
			while ((Cadena1!=null) && encontrada==false) {
				cont++;
				if(Cadena1.compareTo(palabra)==0) {
					encontrada=true;
					linea=cont;
				}
				Cadena1=br1.readLine();
			}
			if(linea==0) {
				result=-1;
			}else {
				result=linea;
			}

		}
		else {
			while ((Cadena1!=null)) {
				cont++;
				if(Cadena1.compareTo(palabra)==0) {
					linea=cont;
				}
				Cadena1=br1.readLine();
			}
			if(linea==0) {
				result=-1;
			}else {
				result=linea;
			}

		}

		fr1.close();
		br1.close();



		return result;
	}	

}
