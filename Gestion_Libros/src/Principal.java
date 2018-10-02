import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		Libro l=new Libro("1",1999,90,"Penepolis","Alexelcapo","FelipeCircunferenciaCompleta");
		Libro l2=new Libro("2",7894,1000,"Maincra","Mojang","PC");

		l.print();
		l2.print();
		Gestion g=new Gestion();
		if(g.guardar_libro(l)) {
			System.out.println("Libro guardado con exito");
		}else {
			System.out.println("Error al guardar");
		} 
		System.out.println("Ahora cambiamos para que el libro numero dos pase a ser el uno accediendo al fichero uno");
		l2=g.recuperar_libro("1");
		l2.print();
		System.out.println("Ahora crearemos un tercer libro y los pediremos todos");
		Libro l3=new Libro("3",1500,500,"supercalifragilisticoespialidoso","Mary Poppins","Eustaquio");
		if(g.guardar_libro(l3)) {
			System.out.println("Libro guardado con exito");
		}else {
			System.out.println("Error al guardar");
		} 
		g.recuperar_todos();
	}

}
