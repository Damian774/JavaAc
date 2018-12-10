package altkom.pl.excercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import service.MathService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathAppTest {

    @Mock
    MathService mathService;

    @InjectMocks
    MathApp mathApp = new MathApp();


    @Test
    public void multiply() {
        when(mathService.multiply(10,20)).thenReturn(200);
        assertEquals(300,mathApp.pomnozIDodaj(10,20,100));
    }
}