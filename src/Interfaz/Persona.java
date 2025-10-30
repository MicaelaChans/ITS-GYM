package Interfaz;

public abstract class Persona {
    protected String ci;
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String email;

    public Persona(String ci, String nombre, String direccion, String telefono, String email) {
        this.ci = ci;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // Getters y setters
    public String getCi() { return ci; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }

    public void setDireccion(String direccion) { this.direccion = direccion; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public void setEmail(String email) { this.email = email; }
}
