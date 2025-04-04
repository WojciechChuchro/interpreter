import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    private static void scanToken(char c) {
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
            default:
                System.out.println("[line 1] Error: Unexpected character:" + c);
                break;
        }
    }
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: ./your_program.sh tokenize <filename>");
            System.exit(1);
        }
        char a = '1';
        String command = args[0];
        String filename = args[1];

        if (!command.equals("tokenize")) {
            System.err.println("Unknown command: " + command);
            System.exit(1);
        }

        String fileContents = "";
        try {
            fileContents = Files.readString(Path.of(filename));
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.exit(1);
        }

        if (!fileContents.isEmpty()) {
            for (int idx = 0; idx < fileContents.length(); idx++) {

                char c = fileContents.charAt(idx);
                scanToken(c);

            }

        }
        System.out.println("EOF  null");
    }
}
