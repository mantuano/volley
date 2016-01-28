/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.JGAsiento;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JhonAndres
 */
public class JGrsAsientoTest {
    
    public JGrsAsientoTest() {
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
     * Test of consultar method, of class JGrsAsiento.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        JGrsAsiento instance = new JGrsAsiento();
        List<JGAsiento> expResult = null;
        List<JGAsiento> result = instance.consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaindividual method, of class JGrsAsiento.
     */
    @Test
    public void testConsultaindividual() {
        System.out.println("consultaindividual");
        String parametro = "";
        JGrsAsiento instance = new JGrsAsiento();
        JGAsiento expResult = null;
        JGAsiento result = instance.consultaindividual(parametro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class JGrsAsiento.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String parametro = "";
        JGrsAsiento instance = new JGrsAsiento();
        instance.eliminar(parametro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class JGrsAsiento.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        JGAsiento v = null;
        JGrsAsiento instance = new JGrsAsiento();
        instance.insertar(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class JGrsAsiento.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        JGAsiento v = null;
        JGrsAsiento instance = new JGrsAsiento();
        instance.modificar(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
