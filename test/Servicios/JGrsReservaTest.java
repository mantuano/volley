/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Clases.JGreserva;
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
public class JGrsReservaTest {
    
    public JGrsReservaTest() {
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
     * Test of consultar method, of class JGrsReserva.
     */
    @Test
    public void testConsultar() {
        System.out.println("consultar");
        JGrsReserva instance = new JGrsReserva();
        List<JGreserva> expResult = null;
        List<JGreserva> result = instance.consultar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of consultaindividual method, of class JGrsReserva.
     */
    @Test
    public void testConsultaindividual() {
        System.out.println("consultaindividual");
        String parametro = "";
        JGrsReserva instance = new JGrsReserva();
        JGreserva expResult = null;
        JGreserva result = instance.consultaindividual(parametro);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class JGrsReserva.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String parametro = "";
        JGrsReserva instance = new JGrsReserva();
        instance.eliminar(parametro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class JGrsReserva.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        JGreserva v = null;
        JGrsReserva instance = new JGrsReserva();
        instance.insertar(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificar method, of class JGrsReserva.
     */
    @Test
    public void testModificar() {
        System.out.println("modificar");
        JGreserva v = null;
        JGrsReserva instance = new JGrsReserva();
        instance.modificar(v);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
