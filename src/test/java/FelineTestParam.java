import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTestParam extends BaseTest {
    private String animalKind;
    private List<String> list;

    public FelineTestParam(String animalKind, List<String> list) {
        this.animalKind = animalKind;
        this.list = list;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void testAnimalKind() throws Exception {
        Feline feline = new Feline();
        assertEquals(list, feline.getFood(animalKind));
    }
}
