import org.junit.Before;
import org.mockito.MockitoAnnotations;

public class BaseTest {

    @Before
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

}