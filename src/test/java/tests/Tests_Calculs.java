package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests_Calculs {
    static int a = 20;
    static int b = 4;

    @Test
    void Sumar() {
        assertEquals(24,Main.sumar(a,b));
    }

    @Test
    void Restar() {
        assertEquals(16,Main.restar(a,b));
    }

    @Test
    void Multiplicar() {
        assertEquals(80,Main.mult(a,b));
    }

    @Test
    void Dividir() {
        assertEquals(5,Main.div(a,b));
    }
}
