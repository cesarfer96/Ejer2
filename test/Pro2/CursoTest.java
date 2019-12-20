
package Pro2;

import Ejer2.Curso;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CursoTest {
    
    public CursoTest() {
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
     * Test of toString method, of class Curso.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Curso instance = new Curso();
        String expResult = "6, Mate, 3";
        instance.id = 6;
        instance.nombre = "Mate";
        instance.creditos = 3;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
