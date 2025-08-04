public class TriangleClassifier {
    public static String getTriangleName(int edge1, int edge2, int edge3) {
        if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0) return "không phải là tam giác";
        else if (edge1 + edge2 < edge3 || edge1 + edge3 < edge2 || edge2 + edge3 < edge1)
            return "không phải là tam giác";
        else if (edge1 == edge2 && edge1 == edge3) return "tam giác đều";
        else if (edge1 == edge2 || edge1 == edge3 || edge2 == edge3) return "tam giác cân";
        else return "tam giác thường";
    }
}
