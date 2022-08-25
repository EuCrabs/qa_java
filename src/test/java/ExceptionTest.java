import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Extra test class for checking Exceptions
public class ExceptionTest extends BaseTest {

    // Exception in Lion class
    @Test(expected = Exception.class)
    public void catchExceptionWhenLionHasInvalidSex() throws Exception {
        Lion lion = new Lion("Test", feline);
    }

    @Test
    public void checkExceptionTextForLion() {
        try {
            Lion lion = new Lion("Test", feline);
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    // Exception in Feline class
    @Test(expected = Exception.class)
    public void catchExceptionWhenFelineHasInvalidAnimalKind() throws Exception {
        feline = new Feline();
        feline.getFood("Test");
    }

    @Test
    public void checkExceptionTextForFeline() {
        try {
            feline = new Feline();
            feline.getFood("Test");
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }
}