import com.example.Cat;
import com.example.Feline;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatTest extends BaseTest {

    static Feline feline = new Feline();
    static Cat cat = new Cat(feline);

    @Test
    public void test1() {

        assertEquals("Мяу", cat.getSound());

    }

    @Test
    public void test2() throws Exception {
        List<String> exp = new ArrayList(Arrays.asList("Животные", "Птицы", "Рыба"));
        assertEquals(exp, cat.getFood());
    }
}
