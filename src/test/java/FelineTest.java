import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest extends BaseTest {
    private final String animalKind;
    private final List<String> list;

    public FelineTest(String animalKind, List<String> list) {
        this.animalKind = animalKind;
        this.list = list;
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
            assertEquals(list, feline.getFood(animalKind));
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
