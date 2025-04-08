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
                System.out.println("[line " + line + "] Error: Unexpected character: " + c);
                hasError = true;
                break;
        }
    }
}
