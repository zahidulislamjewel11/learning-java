package com.zahid.bracketpair;

import static com.zahid.bracketpair.BalancedBracket.isBalanced;;

public class BalancedBracketTest {
    public static void main(String[] args) {
        String[] brackets = {
                "(()){}()", "({})", "({}(", "){})"
        };

        for (String bracket : brackets) {
            boolean balanced = isBalanced(bracket);
            System.out.println(bracket + " balanced = "+  balanced);
        }
    }
}
