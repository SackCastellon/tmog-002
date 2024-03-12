package org.tfoc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void example1() {
        var result = solution.isValid("()");
        assertThat(result).isTrue();
    }

    @Test
    void example2() {
        var result = solution.isValid("()[]{}");
        assertThat(result).isTrue();
    }

    @Test
    void example3() {
        var result = solution.isValid("(]");
        assertThat(result).isFalse();
    }
}
