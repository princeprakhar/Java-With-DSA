//Q. The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
//
//        For example, "ACGAATTCCG" is a DNA sequence.
//        When studying DNA, it is useful to identify repeated sequences within the DNA.
//
//        Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.
//
//
//        Example 1:
//
//        Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
//        Output: ["AAAAACCCCC","CCCCCAAAAA"]
//
//        Example 2:
//
//        Input: s = "AAAAAAAAAAAAA"
//        Output: ["AAAAAAAAAA"]



package interview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.next();

        Set<String> seen = new HashSet<>(); // Set to store seen sequences
        Set<String> repeated = new HashSet<>(); // Set to store repeated sequences

        for (int i = 0; i <= s.length() - 10; i++) {
            String sequence = s.substring(i, i + 10); // Extract 10-letter substring

            if (seen.contains(sequence)) {
                repeated.add(sequence); // If we've seen this sequence before, add to repeated set
            } else {
                seen.add(sequence); // Otherwise, mark this sequence as seen
            }
        }

        // Print all repeated sequences
        for (String seq : repeated) {
            System.out.println(seq);
        }

        sc.close();
    }
}
