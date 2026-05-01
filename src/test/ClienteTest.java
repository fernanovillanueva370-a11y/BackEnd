import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void testCodigoCliente() {
        Cliente c = new Cliente("Maximiliano", "Diaz", "123", "DNI", "Premium");

        assertEquals("xi", c.getCodigo());
    }
}