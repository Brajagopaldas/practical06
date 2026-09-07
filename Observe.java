class Observe {
    public static void main(String[] args) {

        int a = 10;
        double b = 20.5;

        double result = a + b;

        System.out.println("Int value = " + a);
        System.out.println("Double value = " + b);
        System.out.println("Result = " + result);
        System.out.println("Data type of result = " + ((Object) result).getClass().getSimpleName());
    }
}
