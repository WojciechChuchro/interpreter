import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
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
                scanner.scanToken(c);
            }
        }
        System.out.println("EOF  null");
        if (Scanner.hasError) {
            System.exit(65);
        }
    }
}
