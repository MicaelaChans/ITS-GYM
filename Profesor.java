package Interfaz;

public class Profesor extends Persona {
    private String especialidad; // instructor, sala, niños
    private String horario;
    private double sueldo;

    public Profesor(String ci, String nombre, String direccion, String telefono, String email,
                    String especialidad, String horario, double sueldo) {
        super(ci, nombre, direccion, telefono, email);
        this.especialidad = especialidad;
        this.horario = horario;
        this.sueldo = sueldo;
    }

    // Métodos vacíos (solo encabezados para primera entrega)
    public void asignarClase(Clase clase) {}
    public void calcularBono() {}
}
