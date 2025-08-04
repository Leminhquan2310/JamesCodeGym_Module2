import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TriangleClassifierTest {


    @Test
    void getTriangleName1() {
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 2;
        String expected = "tam giác đều";
        String input = TriangleClassifier.getTriangleName(edge1, edge2, edge3);
        assertEquals(expected, input);
    }

    @Test
    void getTriangleName2() {
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 3;
        String expected = "tam giác cân";
        String input = TriangleClassifier.getTriangleName(edge1, edge2, edge3);
        assertEquals(expected, input);
    }

    @Test
    void getTriangleName3() {
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        String expected = "tam giác thường";
        String input = TriangleClassifier.getTriangleName(edge1, edge2, edge3);
        assertEquals(expected, input);
    }

    @Test
    void getTriangleName4() {
        int edge1 = 8;
        int edge2 = 2;
        int edge3 = 3;
        String expected = "không phải là tam giác";
        String input = TriangleClassifier.getTriangleName(edge1, edge2, edge3);
        assertEquals(expected, input);
    }

    @Test
    void getTriangleName5() {
        int edge1 = -1;
        int edge2 = 2;
        int edge3 = 1;
        String expected = "không phải là tam giác";
        String input = TriangleClassifier.getTriangleName(edge1, edge2, edge3);
        assertEquals(expected, input);
    }

    @Test
    void getTriangleName6() {
        int edge1 = 0;
        int edge2 = 1;
        int edge3 = 1;
        String expected = "không phải là tam giác";
        String input = TriangleClassifier.getTriangleName(edge1, edge2, edge3);
        assertEquals(expected, input);
    }
}