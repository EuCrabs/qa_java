import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}
