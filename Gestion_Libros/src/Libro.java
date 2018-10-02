import java.io.Serializable;

public class Libro implements Serializable{
	private int año_publi,n_pg;
	private String id,titulo,autor,editor;
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	public Libro(String id, int año_publi, int n_pg, String titulo, String autor, String editor) {
		this.id = id;
		this.año_publi = año_publi;
		this.n_pg = n_pg;
		this.titulo = titulo;
		this.autor = autor;
		this.editor = editor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAño_publi() {
		return año_publi;
	}
	public void setAño_publi(int año_publi) {
		this.año_publi = año_publi;
	}
	public int getN_pg() {
		return n_pg;
	}
	public void setN_pg(int n_pg) {
		this.n_pg = n_pg;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public void print() {
		System.out.println("******************************************************************");
		System.out.println("Identificador: "+this.id);
		System.out.println("Título: "+this.titulo);
		System.out.println("Autor: "+this.autor);
		System.out.println("Año de publicación: "+this.año_publi);
		System.out.println("Editor: "+this.editor);
		System.out.println("Numero de páginas: "+this.n_pg);
		System.out.println("******************************************************************");
	}




}
