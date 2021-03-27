package max.edu;

public class RightTriangle implements IGeometry , IPacking {
    private int a;
    private int b;

    public RightTriangle() {
    }

    public RightTriangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "RightTriangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }


    @Override
    public int getArea() {
        return a * b / 2;
    }

    @Override
    public int getPerimeter() {
        return (int) (a + b + Math.sqrt(a * a + b * b));


    }

    @Override
    public String toXml() {
        String xml = "<RightRectangle>" + '\n' +
                "<a>" + this.getA() +
                "</a>" + '\n' +
                "<b>" + this.getB() +
                "</b>" + '\n' +
                "</RightRectangle>";
        return xml;
    }

    @Override
    public String toJson() {
        String json = "RightRectangle{" + "\"" +
                "a" + "\"" + ':' + this.getA() + "," + "\"" +
                "b" + "\"" + ':' + this.getB() + "}";
        return json;
    }
}
