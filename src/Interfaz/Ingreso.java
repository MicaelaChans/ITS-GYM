package Interfaz;

public class Ingreso {
    private int id;
    private Socio socio;
    private String fecha;
    private String horaIngreso;
    private String horaEgreso;

    public Ingreso(int id, Socio socio, String fecha, String horaIngreso, String horaEgreso) {
        this.id = id;
        this.socio = socio;
        this.fecha = fecha;
        this.horaIngreso = horaIngreso;
        this.horaEgreso = horaEgreso;
    }

    public void registrarIngreso() {}
    public void registrarEgreso() {}
}
