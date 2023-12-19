package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test string"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void textAndBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("test[]"));
        assertTrue(BalancedBrackets.hasBalancedBrackets("[test]"));
    }

    @Test
    public void reversedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void onlyOpenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void onlyClosedReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void oddBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }

    @Test
    public void unorderedEvenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]][[]"));
    }

    @Test
    public void unbalancedEvenReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[]"));
    }

    @Test
    public void nestedBalancedReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
}