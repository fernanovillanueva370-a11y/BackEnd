public class Persona {
    protected String nombre;
    protected String apellido;
    protected String documento;
    protected String tipoDocumento;

    public Persona(String nombre, String apellido, String documento, String tipoDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
    }

    // getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
}