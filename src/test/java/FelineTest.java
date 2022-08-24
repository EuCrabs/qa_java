import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest extends BaseTest {
    private final String ANIMAL_KIND;
    private final List<String> LIST;

    public FelineTest(String ANIMAL_KIND, List<String> LIST) {
        this.ANIMAL_KIND = ANIMAL_KIND;
        this.LIST = LIST;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Веган", List.of("Соя")}
        };
    }

    @Test
    public void testAnimalKind() {
        try {
            Feline feline = new Feline();
            assertEquals(LIST, feline.getFood(ANIMAL_KIND));
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}
