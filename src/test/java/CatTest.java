import com.example.Cat;
import com.example.Feline;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    static Feline feline;

    @Test
    public void catHasSound() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void catEatMeat() throws Exception {
        Cat cat = new Cat(feline);
        List<String> list = List.of("Животные", "Птицы");
        Mockito.when(feline.eatMeat()).thenReturn(list);
        assertEquals(list, cat.getFood());
    }
}
