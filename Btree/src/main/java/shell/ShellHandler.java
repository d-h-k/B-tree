package shell;

import java.util.Scanner;

public class ShellHandler {
    Scanner scanner;

    public ShellHandler(Scanner scanner) {
        this.scanner = scanner;
    }

    public Scanner getScanner() {
        return scanner;
    }
}
