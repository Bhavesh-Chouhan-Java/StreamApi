

import com.jalaramcwa.java.test.Calculator;
import com.jalaramcwa.java.test.PersonClass;
import com.jalaramcwa.java.test.PersonImp;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ApiTest {

    @Mock
    private PersonImp personImp;

    @Test
    public void checkApi(){
        personImp = mock(PersonImp.class);
        when(personImp.fetchData()).thenReturn("Mocked Data");
        PersonClass personClass = new PersonClass(personImp);
        String result = personClass.callApi();
        verify(personImp,times(1)).fetchData();
        assertEquals("Mocked Data", result);
    }

    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.add(2,2));
    }

    @Test
    public void testDivideByZero(){
        Calculator calculator = new Calculator();
        calculator.divide(10,2);
    }
}
