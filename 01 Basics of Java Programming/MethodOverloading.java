
// Method Overloading Example
class MethodOverloading {
    // Method with two integer parameters
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method with three integer parameters
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println("Multiplication (2 params): " + multiply(5, 10));
        System.out.println("Multiplication (3 params): " + multiply(2, 3, 4));
    }
}
