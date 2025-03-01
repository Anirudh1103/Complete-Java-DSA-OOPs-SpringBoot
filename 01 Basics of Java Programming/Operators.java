
// Operators Example - Demonstrating different types of operators in Java
class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b)); // AND
        System.out.println("a | b: " + (a | b)); // OR
        System.out.println("a ^ b: " + (a ^ b)); // XOR
        System.out.println("~a: " + (~a)); // Complement

        // Assignment Operators
        int c = 10;
        System.out.println("\nAssignment Operators:");
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2: " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c);

        // Unary Operators
        int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("d++: " + (d++)); // Post-increment
        System.out.println("++d: " + (++d)); // Pre-increment
        System.out.println("d--: " + (d--)); // Post-decrement
        System.out.println("--d: " + (--d)); // Pre-decrement

        // Shift Operators
        int e = 8; // 1000 in binary
        System.out.println("\nShift Operators:");
        System.out.println("e << 2: " + (e << 2)); // Left shift
        System.out.println("e >> 2: " + (e >> 2)); // Right shift
        System.out.println("e >>> 2: " + (e >>> 2)); // Unsigned right shift
    }
}
