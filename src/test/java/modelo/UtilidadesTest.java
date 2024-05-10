/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dcrio
 */
public class UtilidadesTest {
    
    public UtilidadesTest() {
    }

    @Test
    public void testMasIva19() {
        System.out.println("masIva19");
        double valor = 100;
        double expResult = 119;
        double result = Utilidades.masIva19(valor);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCalcIva19() {
        System.out.println("calcIva19");
        double valor = 100;
        double expResult = 19;
        double result = Utilidades.calcIva19(valor);
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
