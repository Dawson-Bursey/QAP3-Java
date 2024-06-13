package ProblemTwo;









public class TestClasses {
    public static void main(String[] args) {
       Shape S = new Shape("Red", true);
        System.out.println(S.toString());

        Circle C = new Circle(5.0);
        System.out.println(C.toString());
        System.out.println("Area: " + C.getArea() + ", Perimeter: " + C.getPerimeter());

        Circle C1 = new Circle(5.0,"blue",true);
        System.out.println(C1.toString());
        System.out.println("Area: " + C1.getArea() + ", Perimeter: " + C1.getPerimeter());

        Rectangle R = new Rectangle(2.0,3.0);
        System.out.println(R.toString());
        System.out.println("Area: " + R.getArea() + ", Perimeter: " + R.getPerimeter());

        Rectangle R1 = new Rectangle(2.0,3.0,"green",false);
        System.out.println(R1.toString());
        System.out.println("Area: " + R1.getArea() + ", Perimeter: " + R1.getPerimeter());

        Square Sq = new Square(4.0);
        System.out.println(Sq.toString());
        System.out.println("Area: " + Sq.getArea() + ", Perimeter: " + Sq.getPerimeter());

        Square Sq1 = new Square(4.0,"yellow",true);
        System.out.println(Sq1.toString());
        System.out.println("Area: " + Sq1.getArea() + ", Perimeter: " + Sq1.getPerimeter());
    }
}
