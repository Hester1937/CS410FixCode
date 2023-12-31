import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringManipulationTest {

    private StringManipulationInterface manipulatedstring;

    @BeforeEach
    public void setUp() {
        manipulatedstring = new StringManipulation();
    }

    @AfterEach
    public void tearDown() {
        manipulatedstring = null;
    }

    @Test
    public void testCount1() {
        manipulatedstring.setString("This is my string");
        int length = manipulatedstring.count();
        assertEquals(4, length);
    }

    @Test
    public void testCount2() {
        manipulatedstring.setString("");
        int length = manipulatedstring.count();
        assertEquals(0, length);
    }

    @Test
    public void testCount3() {
        manipulatedstring.setString("Hello, world!");
        int length = manipulatedstring.count();
        assertEquals(2, length);
    }

    @Test
    public void testCount4() {
        manipulatedstring.setString("  Spaces   between  words ");
        int length = manipulatedstring.count();
        assertEquals(3, length);
    }

    public void testCount5() {
        manipulatedstring.setString(" ABCDEFD ");
        int length = manipulatedstring.count();
        assertEquals(1, length);
    }

    @Test
    public void testRemoveNthCharacter1() {
        manipulatedstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("I' bttr uts0e 16tsinths trn6 rgh?", manipulatedstring.removeNthCharacter(3, false));
    }

    @Test
    public void testRemoveNthCharacter2() {
        manipulatedstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("I'  b tt r  ut s0 e  16 ts in th s  tr n6  r gh ?", manipulatedstring.removeNthCharacter(3, true));
    }

    @Test
    public void testRemoveNthCharacter3() {
        manipulatedstring.setString("Hello");
        String result = manipulatedstring.removeNthCharacter(0, true);
        assertEquals("Hello", result);
    }

    @Test
    public void testRemoveNthCharacter4() {
        manipulatedstring.setString(null);
        String result = manipulatedstring.removeNthCharacter(3, true);
        assertNull(result);
    }

    @Test
    public void testRemoveNthCharacter5() {
        manipulatedstring.setString("Testing");
        String result = manipulatedstring.removeNthCharacter(2, true);
        assertEquals("Tsting", result);
    }

    @Test
    public void testRemoveNthCharacter6() {
        manipulatedstring.setString("Hello, World!");
        String result = manipulatedstring.removeNthCharacter(8, true);
        assertEquals("Hello, Wold!", result);
    }

    @Test
    public void testRemoveNthCharacter7() {
        manipulatedstring.setString("Testing");
        String result = manipulatedstring.removeNthCharacter(10, false);
        assertEquals("Testing", result);
    }

    @Test
    public void testGeSubStrings1() {
        manipulatedstring.setString("This is my string");
        String [] sStings = manipulatedstring.getSubStrings(3, 4);

        assertEquals(sStings[0], "my");
        assertEquals(sStings[1], "string");
    }

    @Test
    public void testGetSubStrings2() {
        manipulatedstring.setString("I love programming");
        String[] subStrings = manipulatedstring.getSubStrings(1, 2);

        assertEquals(subStrings[0],"love");
        assertEquals(subStrings[1],"programming");
    }
    @Test
    public void testGetSubStrings3() {
        manipulatedstring.setString("");
        String[] subStrings = manipulatedstring.getSubStrings(0, 1);
        assertEquals(0, subStrings.length);
    }
    @Test
    public void testGeSubStrings3() {
        manipulatedstring.setString("Hello, World!");
        String[] subStrings = manipulatedstring.getSubStrings(0, 1);

        assertEquals(subStrings[0],"Hello," );
        assertEquals(subStrings[1],"World!" );
    }
    @Test
    public void testGeSubStrings4() {
        manipulatedstring.setString("I am amazing");
        String[] subStrings = manipulatedstring.getSubStrings(0, 0);

        assertEquals(subStrings[0],"I");
    }
    @Test
    public void testGeSubStrings5() {
        manipulatedstring.setString("Java is a programming language");
        String[] subStrings = manipulatedstring.getSubStrings(4, 6);

        assertEquals("programming", subStrings[0]);
        assertEquals("language", subStrings[1]);
    }

    @Test
    public void testRestoreString1()
    {
        manipulatedstring.setString("art");
        int [] array;
        array=new int[]{1,0,2};
        String restoreString = manipulatedstring.restoreString(array);
        assertEquals(restoreString, "rat");
    }

    @Test
    public void testRestoreString2() {
        manipulatedstring.setString("testing");
        int[] indices = {0, 1, 2, 3, 4, 5, 6};
        String restoredString = manipulatedstring.restoreString(indices);
        assertEquals("testing", restoredString);
    }

    @Test
    public void testRestoreString3() {
        manipulatedstring.setString("");
        int[] indices = {};
        String restoredString = manipulatedstring.restoreString(indices);
        assertEquals("", restoredString);
    }

    @Test
    public void testRestoreString4() {
        manipulatedstring.setString("hello");
        int[] indices = {4, 3, 2, 1, 0};
        String restoredString = manipulatedstring.restoreString(indices);
        assertEquals("olleh", restoredString);
    }

    @Test
    public void testRestoreString5() {
        manipulatedstring.setString("abcde");
        int[] indices = {2, 0, 1, 4, 3};
        String restoredString = manipulatedstring.restoreString(indices);
        assertEquals("cabed", restoredString);
    }

}
