package shell;

import btree.Btree;

import java.util.Scanner;

public class Shell {

    private final Shell singletonShell;

    private ShellHandler shellHandler;

    public Shell(Btree btree) {
        singletonShell = this;
        shellHandler = singletonShell.init();
        singletonShell.run(shellHandler);
        singletonShell.deInit();
    }

    private ShellHandler init() {
        //초기화 수행
        Scanner scanner = new Scanner(System.in);
        ShellHandler handler = new ShellHandler(scanner);
        System.out.println("hi! this is B-tree sim");
        return handler;
    }

    public void run(ShellHandler handler) {
        Scanner scanner = handler.getScanner();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println("bye!!");
                break;
            }
            System.out.println(input);
            System.out.println("holl");
        }

    }

    private void deInit() {

    }
}
