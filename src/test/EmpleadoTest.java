import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpleadoTest {

    @Test
    public void testSueldoEmpleado() {
        Empleado e = new Empleado("Juan", "Fernandez", "123", "DNI", 2);

        assertEquals(1160, e.getSueldo());
    }
}