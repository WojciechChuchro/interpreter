public class Scanner {
    private int line = 1;
    public static boolean hasError = false;

    public void scanToken(char c) {
        switch (c) {
            case '(':
                System.out.println("LEFT_PAREN ( null");
                break;
            case ')':
                System.out.println("RIGHT_PAREN ) null");
                break;
            case '{':
                System.out.println("LEFT_BRACE { null");
                break;
            case '}':
                System.out.println("RIGHT_BRACE } null");
                break;
            case ',':
                System.out.println("COMMA , null");
                break;
            case '.':
                System.out.println("DOT . null");
                break;
            case '-':
                System.out.println("MINUS - null");
                break;
            case '+':
                System.out.println("PLUS + null");
                break;
            case ';':
                System.out.println("SEMICOLON ; null");
                break;
            case '*':
                System.out.println("STAR * null");
                break;
            case '=':
                System.out.println("EQUAL = null");
                break;
            default:
<<<<<<< Updated upstream
                System.err.printf("[line %d] Error: Unexpected character: %s\n", line, c);
                hasError = true;
=======
                System.out.println("[line " + line + "] Error: Unexpected character: " + c);
>>>>>>> Stashed changes
                break;
        }
    }
}
