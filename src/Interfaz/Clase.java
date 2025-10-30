package Interfaz;

import java.util.ArrayList;

public class Clase {
    private int id;
    private String nombre;
    private String tipo; // adultos o menores
    private String horario;
    private int cupoMax;
    private Profesor profesor;
    private Actividad actividad;
    private ArrayList<Socio> inscriptos; //TEMPORAL

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getCupoMax() {
		return cupoMax;
	}

	public void setCupoMax(int cupoMax) {
		this.cupoMax = cupoMax;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Actividad getActividad() {
		return actividad;
	}

	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}

	public ArrayList<Socio> getInscriptos() {
		return inscriptos;
	}

	public void setInscriptos(ArrayList<Socio> inscriptos) {
		this.inscriptos = inscriptos;
	}

	public Clase(int id, String nombre, String tipo, String horario, int cupoMax,
                 Profesor profesor, Actividad actividad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.horario = horario;
        this.cupoMax = cupoMax;
        this.profesor = profesor;
        this.actividad = actividad;
        this.inscriptos = new ArrayList<>();
    }

    public void inscribirSocio(Socio socio) {}
    public void mostrarInscriptos() {}
}
