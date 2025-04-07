package org.example;

import java.util.HashMap;
import java.util.List;

public class App {
    public void run() {
        ConsoleDecorations.printBanner("Zip It Lab");

        ConsoleDecorations.printBanner("Zip Same Size");
        ConsoleDecorations.printDivider("List A1");
        List<Integer> A1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        printlnList(A1);

        ConsoleDecorations.printDivider("List A2");
        List<Integer> A2 = List.of(-1, -2, -3, -4, -5, -6, -7, -8, -9);
        printlnList(A2);

        ConsoleDecorations.printDivider("zip(A1, A2)");
        List<Integer> A12 = ZipIt.zip(A1, A2);
        printlnList(A12);

        ConsoleDecorations.printBanner("Zip Diff Size");
        ConsoleDecorations.printDivider("List B1");
        List<Integer> B1 = List.of(1, 2, 3);
        printlnList(B1);

        ConsoleDecorations.printDivider("List B2");
        List<Integer> B2 = List.of(4, 5, 6, 7, 8, 9);
        printlnList(B2);

        ConsoleDecorations.printDivider("zip(B1, B2)");
        List<Integer> B12 = ZipIt.zip(B1, B2);
        printlnList(B12);

        ConsoleDecorations.printBanner("Zip String List");
        ConsoleDecorations.printDivider("List C1");
        List<String> C1 = List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        printlnList(C1);

        ConsoleDecorations.printDivider("List C2");
        List<String> C2 = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        printlnList(C2);

        ConsoleDecorations.printDivider("zip(C1, C2)");
        List<String> C12 = ZipIt.zip(C1, C2);
        printlnList(C12);

        ConsoleDecorations.printBanner("Create Hash Map");
        ConsoleDecorations.printDivider("List K");
        List<String> K = List.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
        printlnList(K);

        ConsoleDecorations.printDivider("List V");
        List<String> V = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        printlnList(V);

        ConsoleDecorations.printDivider("HashMap(K, V)");
        HashMap<String, String> H = ZipIt.hashMapify(K, V);
        printlnHashMap(H, K);

        ConsoleDecorations.printBanner("Exiting...");
    }
    private <T> void printlnList(List<T> list) {
        printList(list);
        System.out.println();
    }
    private <T> void printList(List<T> list) {
        System.out.print("[");
        for(int i = 0; i < list.size(); ++i) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(list.get(i));
        }
        System.out.print("]");
    }
    private <K, V> void printlnHashMap(HashMap<K, V> hashMap, List<K> keys) {
        printHashMap(hashMap, keys);
        System.out.println();
    }
    private <K, V> void printHashMap(HashMap<K, V> hashMap, List<K> keys) {
        System.out.print("[");
        for(int i = 0; i < keys.size(); ++i) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.print(hashMap.get(keys.get(i)));
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        new App().run();
    }
}
