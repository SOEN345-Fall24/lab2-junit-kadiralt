import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleTest{

    Example e = new Example(3,4);

    @Test public void Function_ATest(){

        assertEquals(5, e.Function_A(2));
        assertEquals(-4, e.Function_A(-1));
    }

    @Test public void Function_BTest(){
        assertEquals(7, e.Function_B(3));
        assertEquals(4, e.Function_B(8));
    }
}