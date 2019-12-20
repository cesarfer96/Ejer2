
package Pro2;

import Ejer2.Estudiante;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class EstudianteTest {
    
    public EstudianteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testToString() {
        System.out.println("toString");
        Estudiante instance = new Estudiante();
        String expResult = "Carlitos, Lopez, 1, 100";
        instance.nombre= "Carlitos";
        instance.apellido="Lopez";
        instance.edad=1;
        instance.nota=100;
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
