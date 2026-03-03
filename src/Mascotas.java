//@autor:Susan isla isla
public abstract class Mascotas {
//clase Abstacta
	protected String nombreI;
	protected int edad;
	protected String estado;
	protected String fechaNacimiento;

	//constructores 
	public Mascotas(String nombreI, int edad, String estado, String fechaNacimiento) {
		this.nombreI = nombreI;
		this.edad = edad;
		this.estado = estado;
		this.fechaNacimiento = fechaNacimiento;
	}
	//getters necesarios 

	public String getNombreI() {
		return nombreI;
	}

	public void setNombreI(String nombreI) {
		this.nombreI = nombreI;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	}
