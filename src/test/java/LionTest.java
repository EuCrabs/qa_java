import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }
    private final String sex;
    private final Boolean mane;

    @Mock
    Feline feline;

    public LionTest(String sex, Boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testSex() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(mane, lion.doesHaveMane());
    }
    @Test
    public void haveFiveKittens() throws Exception {
        Lion lion = new Lion(sex, feline);

        Mockito.when(feline.getKittens()).thenReturn(5);
        assertEquals(5, lion.getKittens());
    }
    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(sex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Мясо"));
        assertEquals(List.of("Мясо"), lion.getFood());
    }
}
