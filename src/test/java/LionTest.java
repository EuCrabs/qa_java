import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

public class LionTest extends BaseTest {
    Feline feline = new Feline();
    Lion lion = new Lion("Самец", feline);

    public LionTest() throws Exception {
    }

    @Test
    public void test1() {
        System.out.println(lion.doesHaveMane());
        System.out.println(lion.getKittens());
    }
}
