
public class Test1 {

	public static void main(String[] args) {
		// @autor:Susan isla isla
		Perro r = new Perro("Rocky", 1, "OK", "11022017");
		Gato g = new Gato("Negro", 2, "OK", "05012016");
		System.out.println(r.getNombreI());
		System.out.println(g.getEstado());
		Inventario i = new Inventario();
		i.anyadirMascota(r);
		i.anyadirMascota(g);
		i.imprimirTodos();
		i.imprimirPerros();
		i.vaciar();
		i.imprimirTodos();
		i.imprimirPerros();
	}

}
