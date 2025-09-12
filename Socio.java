package Interfaz;

public class Socio extends Persona {
    private String tipo; // adulto, liceal, escolar, preescolar
    private String fechaInicio;
    private String infoMedica;
    private String carneSalud;
    private ReferenteAdulto referente;

    public Socio(String ci, String nombre, String direccion, String telefono, String email,
                 String tipo, String fechaInicio, String infoMedica, String carneSalud, ReferenteAdulto referente) {
        super(ci, nombre, direccion, telefono, email);
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.infoMedica = infoMedica;
        this.carneSalud = carneSalud;
        this.referente = referente;
    }

    // Métodos vacíos para la entrega
    public void renovarMembresia() {}
    public void mostrarDatos() {}
}

