import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest extends BaseTest {
    private final String SEX;
    private final Boolean MANE;

    public LionTest(String SEX, Boolean MANE) {
        this.SEX = SEX;
        this.MANE = MANE;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
                {"test", false}
        };
    }

    @Test
    public void checkIfLionHasMane() {
        try {
            Lion lion = new Lion(SEX, feline);
            assertEquals(MANE, lion.doesHaveMane());
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
    @Test
    public void checkCountOfKittens() {
        try {
            Lion lion = new Lion(SEX, feline);

            Mockito.when(feline.getKittens()).thenReturn(5);
            assertEquals(5, lion.getKittens());
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
    @Test
    public void getFood() {
        try {
            Lion lion = new Lion(SEX, feline);
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Мясо"));
            assertEquals(List.of("Мясо"), lion.getFood());
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}
