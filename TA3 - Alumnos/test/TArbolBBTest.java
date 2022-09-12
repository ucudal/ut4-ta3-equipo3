/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author belu_
 */
public class TArbolBBTest {

    public TArbolBBTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @Test
    public void testSomeMethod() {
    }

    @Test
    public void testObtenerAlturaArbolVacio() {
        System.out.println("testObtenerAlturaArbolVacio");
        TArbolBB arbol = new TArbolBB();
        int expResult = -1;
        int result = arbol.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerTamanioArbolVacio() {
        System.out.println("obtener Tamanio Arbol Vacio");
        TArbolBB arbol = new TArbolBB();

        int expResult = 0;
        int result = arbol.obtenerTamanio();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaRaiz() {
        System.out.println("testObtenerAlturaRaiz");
        TArbolBB arbol = new TArbolBB();

        TElementoAB raiz = new TElementoAB("123", 123);
        arbol.insertar(raiz);
        int expResult = 0;
        int result = arbol.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaArbolCompleto() {
        System.out.println("testObtenerAlturaArbolCompleto");
        TArbolBB arbol = new TArbolBB();

        TElementoAB nodo = new TElementoAB("1", 1);
        TElementoAB nodo1 = new TElementoAB("2", 2);
        TElementoAB nodo2 = new TElementoAB("3", 3);
        TElementoAB nodo3 = new TElementoAB("4", 4);
        TElementoAB nodo4 = new TElementoAB("5", 5);

        arbol.insertar(nodo3);
        arbol.insertar(nodo1);
        arbol.insertar(nodo4);
        arbol.insertar(nodo);
        arbol.insertar(nodo2);
        int expResult = 2;
        int result = arbol.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaArbolDer() {
        System.out.println("testObtenerAlturaArbolDer");
        TArbolBB arbol = new TArbolBB();

        TElementoAB nodo = new TElementoAB("1", 1);
        TElementoAB nodo1 = new TElementoAB("2", 2);
        TElementoAB nodo2 = new TElementoAB("3", 3);
        TElementoAB nodo3 = new TElementoAB("4", 4);
        TElementoAB nodo4 = new TElementoAB("5", 5);

        arbol.insertar(nodo);
        arbol.insertar(nodo1);
        arbol.insertar(nodo2);
        arbol.insertar(nodo3);
        arbol.insertar(nodo4);
        int expResult = 4;
        int result = arbol.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerAlturaArbolIzq() {
        System.out.println("testObtenerAlturaArbolIzq");
        TArbolBB arbol = new TArbolBB();

        TElementoAB nodo = new TElementoAB("1", 1);
        TElementoAB nodo1 = new TElementoAB("2", 2);
        TElementoAB nodo2 = new TElementoAB("3", 3);
        TElementoAB nodo3 = new TElementoAB("4", 4);
        TElementoAB nodo4 = new TElementoAB("5", 5);

        arbol.insertar(nodo4);
        arbol.insertar(nodo3);
        arbol.insertar(nodo2);
        arbol.insertar(nodo1);
        arbol.insertar(nodo);
        int expResult = 4;
        int result = arbol.obtenerAltura();
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerTamanioArbol4Elementos() {
        System.out.println("obtener Tamanio Arbol 4 Elementos");
        TArbolBB arbol = new TArbolBB();

        TElementoAB nodo = new TElementoAB("1", 1);
        TElementoAB nodo1 = new TElementoAB("2", 2);
        TElementoAB nodo2 = new TElementoAB("3", 3);
        TElementoAB nodo3 = new TElementoAB("4", 4);

        arbol.insertar(nodo);
        arbol.insertar(nodo3);
        arbol.insertar(nodo2);
        arbol.insertar(nodo1);

        int expResult = 4;
        int result = arbol.obtenerTamanio();
        assertEquals(expResult, result);
    }
}
