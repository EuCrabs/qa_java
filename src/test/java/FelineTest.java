import com.example.Feline;
import com.example.Predator;

public class FelineTest {

    static Predator feline = new Feline();

    public static void main(String[] args) throws Exception {
        System.out.println(feline.eatMeat());
    }
}