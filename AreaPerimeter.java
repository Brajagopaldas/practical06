class AreaPerimeter {
    public static void main(String[] args) {

        double rectangleLength = 23.66;
        double rectangleBreadth = 15.16;

        double rectanglePerimeter = 2 * (rectangleBreadth + rectangleLength);
        double rectangleArea = rectangleLength * rectangleBreadth;

        System.out.println("Rectangle Length = " + rectangleLength);
        System.out.println("Rectangle Breadth = " + rectangleBreadth);
        System.out.println("Rectangle perimeter = " + rectanglePerimeter);
        System.out.println("Rectangle Area = " + rectangleArea);

    }
}
