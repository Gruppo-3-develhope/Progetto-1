public class Somma {
    public static void main (String[] args) {
        int x = 2;
        int y = 4;
        char calc = '+';
        System.out.println("Input values: " + x + " , " + y);
        String opType = operation(calc);

        System.out.println("Operation type: " + opType + " ( " + calc + " )");
        System.out.println("Result of the operation: " + sum(x, y));
    }
    public static String operation (char calc) {

        String opType;
        switch (calc) {
            case '+':
                opType = "sum";
                break;
            case '-':
                opType = "subtraction";
                break;
            case '*':
                opType = "multiplication";
                break;
            case '/':
                opType = "division";
                break;
            case '^' :
                opType = "power";
                break;
            default:
                opType = "error: invalid char";
        }
        return opType;
    }

    public static int sum (int x, int y) {
        return x + y;
    }
}