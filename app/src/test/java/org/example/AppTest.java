package org.example;


import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void zipSameSize() {
        List<Integer> A = List.of(1, 3, 5, 7, 9, 11);
        List<Integer> B = List.of(2, 4, 6, 8, 10, 12);
        List<Integer> ABe = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> ABr = ZipIt.zip(A, B);
        assertEquals(ABe, ABr);
    }
    @Test
    void zipDiffSize() {
        List<Integer> A = List.of(1, 3, 5);
        List<Integer> B = List.of(2, 4, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> ABe = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<Integer> ABr = ZipIt.zip(A, B);
        assertEquals(ABe, ABr);
    }
    @Test
    void zipString() {
        List<String> A = List.of("1", "3", "5");
        List<String> B = List.of("2", "4", "6", "7", "8", "9", "10", "11", "12");
        List<String> ABe = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12");
        List<String> ABr = ZipIt.zip(A, B);
        assertEquals(ABe, ABr);
    }
    @Test
    void HashMap() {
        List<String> K = List.of("one", "two", "three", "four", "five");
        List<Integer> V = List.of(1, 2, 3, 4, 5);
        HashMap<String, Integer> KVe = new HashMap<String, Integer>();
        KVe.put("one", 1);
        KVe.put("two", 2);
        KVe.put("three", 3);
        KVe.put("four", 4);
        KVe.put("five", 5);
        HashMap<String, Integer> KVr = ZipIt.hashMapify(K, V);
        assertEquals(KVe, KVr);
    }
}
