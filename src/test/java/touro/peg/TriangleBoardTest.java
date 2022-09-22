package touro.peg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleBoardTest {
    @Test
    public void Constructor() {
        //Given
        int emptySpot = 0;
        //When
        TriangleBoard board = new TriangleBoard(emptySpot);
        boolean[] expected = new boolean[]{false, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
        //Then
        assertArrayEquals(expected, board.getPegs());
    }

    @Test
    public void testToString() {
        //Given
        int emptySpot = 0;
        //When
        TriangleBoard board = new TriangleBoard(emptySpot);
        String expected = """
                    0
                   1 1
                  1 1 1
                 1 1 1 1
                1 1 1 1 1""";
        //Then
        assertEquals(expected, board.toString());
    }
}