
package Pro2;

import Ejer2.Profesor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProfesorTest {
    
    public ProfesorTest() {
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

    /**
     * Test of toString method, of class Profesor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Profesor instance = new Profesor();
        String expResult = "Gary, Gutiérrez, 21, tarde";
        instance.nombre= "Gary";
        instance.apellido="Gutiérrez";
        instance.edad=21;
        instance.horario="tarde";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
