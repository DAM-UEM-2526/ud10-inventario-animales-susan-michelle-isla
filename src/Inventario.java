import java.util.ArrayList;
import java.util.List;

public class Inventario {
//atributo privado 
	///en primero queria crear un ArrayList<Mascotas>
	//private ArrayList<Mascotas> listaMacotas= new ArrayList<>();
	private List<Mascotas> ListaMascotas;
	
	public Inventario() {
		ListaMascotas = new ArrayList<>();
	}
	//vaciar() para haci borrar todo 
	public void vaciar() {
		ListaMascotas.clear();
	}
	
	//metodo para insertar animales
	public void anyadirMascota(Mascotas a) {
		ListaMascotas.add(a);
	}
	
	//metodo para insertar eliminar animlaes
	public void eliminarMascota(String nombreI) {
		ListaMascotas.remove(nombreI);
	}
	//imprimir los nombres de los animales
	public void imprimirTodos() {
		for (Mascotas m : ListaMascotas) {
			System.out.println(m.getNombreI());
		}
	}
	//
	
}
