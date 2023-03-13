package gt.edu.umg.progra3.parcial1.pilas;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NotationParserTest {
    Pila pila;
    NotationParser parser;

    @Before
    public void init(){
        pila = new Node();
        parser = new NotationParser(pila);
    }

    @Test
    public void testNotationPosToInfix(){
        String posFix = "1 2 * 3 +";
        String infix = "1 * 2 + 3";
        String result = parser.posFixToInfix(posFix);
        assertEquals(infix, result);
    }
}
