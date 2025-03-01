
// Conditionals, Loops & Switch Statements Example
class SwitchStatement {
    public static void main(String[] args) {
        int number = 10;

        // If-else statement
        if (number > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }

        // Switch Statement
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Invalid day");
        }
    }
}
