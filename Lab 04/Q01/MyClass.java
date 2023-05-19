public class MyClass {

    public static void main(String[] args) {
        Rectangle garden = new Rectangle();
        garden.setWidth(20);
        garden.setHeight(10);

        Rectangle pond = new Rectangle();
        pond.setWidth(4);
        pond.setHeight(2);

        int areaOfGarden = garden.calculateArea();
        int areaOfPond = pond.calculateArea();
        int areaOfGrass = areaOfGarden - areaOfPond;

        int costOfCuttingGrass = areaOfGrass * 150;

        System.out.println("The total cost needed to cut the grass of the garden is: " + costOfCuttingGrass);
    }
}

// Result:
// The total cost needed to cut the grass of the garden is: 2250