package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //Test 1:
    @Test
    public void onlyBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //Test 2: null returns false
    @Test
    public void nullReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(null));
    }

    //Test 3: String containing only non-bracket characters returns false
    @Test
    public void nonBracketCharactersReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("apple"));
    }

    //Test 4: an empty string returns true (considered balanced)
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //Test 5: string contains 2 opening brackets and 1 closing bracket returns false
    @Test
    public void imbalancedOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Laun[chCode]"));
    }

    //Test 6: string contains 1 opening bracket and 2 closing bracket returns false
    @Test
    public void imbalancedClosingBracketsReturnFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]Code]"));
    }

    //Test 7: returns true if string contains multiple sets of balanced brackets
    @Test
    public void multipleBalancedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][][][][][][][]"));
    }

    //Test 8: returns false if closing bracket is before an opening bracket
    @Test
    public void closingBracketFirstReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch[Code"));
    }

    //Test 9: returns false if opening bracket is only present
    @Test
    public void onlyOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //Test 10: return false if closing bracket is only present
    @Test
    public void onlyClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    //Test 11: returns true when balanced brackets are within balanced brackets
    @Test
    public void balancedInsideBalanced(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[LaunchCode]]]"));
    }

    //Test 12:
    @Test
    public void unbalancedInsideBalanced () {
        assertFalse((BalancedBrackets.hasBalancedBrackets("[Launch][[Code]")));
    }
}
