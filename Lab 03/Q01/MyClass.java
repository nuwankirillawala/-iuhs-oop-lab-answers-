public class MyClass {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(7);

        circle1.calculateArea();
        circle1.calculatePerimeter();
        circle1.displayAreaPerimeter();

        circle2.calculateArea();
        circle2.calculatePerimeter();
        circle2.displayAreaPerimeter();
    }
}

// Result:
// A circle with radius 5 is created
// The area of the circle is: 78.53982
// The perimeter of the circle is: 31.41593

// A circle with radius 7 is created
// The area of the circle is: 154.94948
// The perimeter of the circle is: 44.42881
