package org.example.solution1832;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean checkIfPangram(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }

        Set<Character> set = new HashSet<>(26);
        for (int i = 0; i < sentence.length(); i++) {
            set.add(sentence.charAt(i));
        }

        return set.size() == 26;
    }
}
