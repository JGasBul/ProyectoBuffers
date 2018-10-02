import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Gestion {

	public Gestion() {

	}

	public boolean guardar_libro(Libro libro) {
		boolean fin=true;
		ObjectOutputStream out=null;
		try {
			out=new ObjectOutputStream(new FileOutputStream(libro.getId()+".dat"));
			out.writeObject(libro);
			out.close();
		} catch (IOException e) {
			fin=false;
		}
		return fin;

	}
	public Libro recuperar_libro(String identificador) {
		Libro l=null;
		ObjectInputStream in=null;
		try {
			in=new ObjectInputStream(new FileInputStream(identificador+".dat"));
			l=(Libro) in.readObject();
			in.close();
		} catch (IOException e) {
			System.err.println("Error IO");
		} catch (ClassNotFoundException e) {
			System.err.println("Libro no encontrado");
		}
		return l;
	}
	public void recuperar_todos(){
		ArrayList<Libro> libros =new ArrayList<Libro>();
		libros.add(recuperar_libro("1"));
		libros.add(recuperar_libro("2"));
		libros.add(recuperar_libro("3"));

		Iterator it=libros.iterator();
		while(it.hasNext()) {
			Libro l=(Libro) it.next();
			l.print();
		}
	}

}
