package de.gfn.todos;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String todos = "";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEingabe: ");
            String eingabe = scanner.nextLine();
            todos += eingabe + "\n";
            System.out.println("Deine Todos: \n" + todos);

            if (eingabe.toLowerCase().equals("exit")) {
                break;
            }
        }
    }
}
