package org.tfoc;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

/**
 * The class containing the solution to this exercise
 */
public class Solution {
    private static final Map<Character, Character> pairs = Map.of('(', ')', '[', ']', '{', '}');

    public boolean isValid(String string) {
        Deque<Character> open = new LinkedList<>();
        return string.chars()
            .mapToObj(i -> (char) i)
            .allMatch(bracket -> {
                if (pairs.containsKey(bracket)) {
                    open.push(bracket);
                    return true;
                } else {
                    return bracket.equals(pairs.get(open.pop()));
                }
            });
    }
}
