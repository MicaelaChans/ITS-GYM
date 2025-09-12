package Interfaz;

public class Actividad {
    private int id;
    private String nombre; // zumba, natación, etc.
    private String tipo;   // adultos o niños

    public Actividad(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void mostrarInfo() {}
}
