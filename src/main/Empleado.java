public class Empleado extends Persona {
    private int antiguedad;
    private double sueldo;

    public Empleado(String nombre, String apellido, String documento, String tipoDocumento, int antiguedad) {
        super(nombre, apellido, documento, tipoDocumento);
        this.antiguedad = antiguedad;
        this.sueldo = calcularSueldo();
    }

    private double calcularSueldo() {
        return antiguedad * 580;
    }

    public double getSueldo() {
        return sueldo;
    }
}