package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;

public class ZipIt {
    public static <T> List<T> zip(List<T> a, List<T> b) {
        List<T> z = new ArrayList<>();
        int minSize = Math.min(a.size(), b.size());
        for(int i = 0; i < minSize; ++i) {
            z.add(a.get(i));
            z.add(b.get(i));
        }
        for(int i = minSize; i < a.size(); ++i) {
            z.add(a.get(i));
        }
        for(int i = minSize; i < b.size(); ++i) {
            z.add(b.get(i));
        }
        return z;
    }
    public static <K, V> HashMap<K, V> hashMapify(List<K> keys, List<V> values) {
        if(keys.size() != values.size()) {
            throw new InputMismatchException("keys.sizes() != values.size()");
        }
        HashMap<K, V> hashMap = new HashMap<>();
        for(int i = 0; i < keys.size(); ++i) {
            hashMap.put(keys.get(i), values.get(i));
        }
        return hashMap;
    }
}
