/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cliente
 */
public class SistemaIT {
    
    public SistemaIT() {
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
     * Test of ListarCliente method, of class Sistema.
     */
    @Test
    public void testListarCliente() {
        System.out.println("");
        Sistema instance = new Sistema();
        instance.ListarCliente();
    }

    /**
     * Test of ListarProveedor method, of class Sistema.
     */
    @Test
    public void testListarProveedor() {
        System.out.println("");
        Sistema instance = new Sistema();
        instance.ListarProveedor();
    }

    /**
     * Test of ListarUsuarios method, of class Sistema.
     */
    @Test
    public void testListarUsuarios() {
        System.out.println("");
        Sistema instance = new Sistema();
        instance.ListarUsuarios();
    }

    /**
     * Test of ListarProductos method, of class Sistema.
     */
    @Test
    public void testListarProductos() {
        System.out.println("");
        Sistema instance = new Sistema();
        instance.ListarProductos();
    }

    /**
     * Test of ListarVentas method, of class Sistema.
     */
    @Test
    public void testListarVentas() {
        System.out.println("");
        Sistema instance = new Sistema();
        instance.ListarVentas();
    }
    /**
     * Test of LimpiarTable method, of class Sistema.
     */
    @Test
    public void testLimpiarTable() {
        System.out.println("");
        Sistema instance = new Sistema();
        instance.LimpiarTable();
    }
    /**
     * Test of main method, of class Sistema.
     */
    @Test
    public void testMain() {
        System.out.println("");
        String[] args = null;
        Sistema.main(args);
    }   
}
