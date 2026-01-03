package com.example.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {
    @Test
    void addWorks() {
        assertEquals(12, MathUtil.add(5, 7));
    }

    @Test
    void mulWorks() {
        assertEquals(35, MathUtil.mul(5, 7));
    }
}