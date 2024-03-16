
import com.jalaramcwa.java.test.Calculator;
import com.jalaramcwa.java.test.NewPerson;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JUnitTestCases {

    private final String Bhavesh = "Bhavesh";

    @Test
    public void testPrivateMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Calculator calculator = new Calculator();
        Method method = Calculator.class.getDeclaredMethod("subtract",int.class, int.class);
        method.setAccessible(true);
        int result = (int) method.invoke(calculator,10,4);
        calculator.add(10,20);
        Assertions.assertEquals(result,6);
    }

    @Test
    public void testStaticMethod(){
        int result = Calculator.multiply(2,3);
        Assertions.assertEquals(result,6);
    }

    @Test
    public void testConstructor(){
        int a = 10;
        int b = 20;
        Calculator c = new Calculator(a,b);
        Assertions.assertEquals(b,c.getB());
        Assertions.assertEquals(a,c.getA());
    }

    @Test
    public void testPrivateMethodFromInterface(){
        NewPerson person = new NewPerson();
        Assertions.assertEquals("ABC",person.fetchData());
    }

    @Test
    public void apiTest(){
        NewPerson newPerson = Mockito.mock(NewPerson.class);
        Mockito.when(newPerson.fetchData()).thenReturn("ABC");
        String name = newPerson.fetchData();
        Mockito.verify(newPerson).fetchData();
        Assertions.assertEquals(name,"ABC");
    }

}
