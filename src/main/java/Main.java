import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        int line = 1;
        boolean hasError = false;
        Scanner scanner = new Scanner();
        if (args.length < 2) {
            System.err.println("Usage: ./your_program.sh tokenize <filename>");
            System.exit(1);
        }
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
                if (c == 'f') {
                    System.out.println();
                    System.out.println("-----");
                    System.out.println();
                    continue;
                }

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
                    case '!':
                        if (idx + 1 < fileContents.length()) {
                            char next = fileContents.charAt(idx + 1);
                            switch (next) {
                                case '=':
                                    System.out.println("BANG_EQUAL != null");
                                    idx += 2;
                                    break;
                                default:

                                    System.out.println("BANG ! null");
                                    break;
                            }
                        } else {

                            System.out.println("BANG ! null");
                            break;
                        }

                    case '=':
                        if (idx + 1 < fileContents.length()) {
                            char next = fileContents.charAt(idx + 1);
                            switch (next) {
                                case '=':
                                    System.out.println("EQUAL_EQUAL == null");
                                    idx++;
                                    break;
                            }
                        } else {
                            System.out.println("EQUAL = null");
                        }
                        break;
                    default:
                        System.err.println("[line " + line + "] Error: Unexpected character: " + c);
                        hasError = true;
                        break;
                }
            }
        }
        System.out.println("EOF  null");
        if (Scanner.hasError) {
            System.exit(65);
        }
    }
}
