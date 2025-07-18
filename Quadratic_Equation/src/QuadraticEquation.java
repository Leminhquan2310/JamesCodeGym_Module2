public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double c, double b, double a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * 2 - 4 * this.a * this.c;
    }

    public double getRoot1 () {
        return (-getB() + Math.sqrt(getB() * getB() - 4 * getA() * getC())) / (2 * getA());
    }

    public double getRoot2 () {
        return (-getB() - Math.sqrt(getB() * getB() - 4 * getA() * getC())) / (2 * getA());
    }
}
