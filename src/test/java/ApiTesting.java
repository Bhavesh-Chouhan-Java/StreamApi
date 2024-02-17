
import com.jalaramcwa.test.PersonClass;
import com.jalaramcwa.test.PersonImp;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class ApiTesting {


    @Mock
    private PersonImp personImp;

    @Test
    public void apiTest(){

        personImp = mock(PersonImp.class);

        when(personImp.fetchData()).thenReturn("Hello");

        PersonClass personClass = new PersonClass(personImp);

        String result =  personClass.callApi();

        verify(personImp, times(1)).fetchData();

        assertEquals("Hello",result);

    }
}
