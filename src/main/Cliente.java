public class Cliente extends Persona {
    private String categoria;
    private String codigo;

    public Cliente(String nombre, String apellido, String documento, String tipoDocumento, String categoria) {
        super(nombre, apellido, documento, tipoDocumento);
        this.categoria = categoria;
        this.codigo = generarCodigo();
    }

    private String generarCodigo() {
        return "" + nombre.charAt(2) + apellido.charAt(1);
    }

    public String getCodigo() {
        return codigo;
    }
}