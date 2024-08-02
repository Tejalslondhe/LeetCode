/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r*/

class MergeString {
  public String mergeAlternately(String word1, String word2) {
    StringBuilder result = new StringBuilder();
    int maxLength = Math.max(word1.length(), word2.length());

    for (int i = 0; i < maxLength; i++) {
      if (i < word1.length()) {
        result.append(word1.charAt(i));
      }
      if (i < word2.length()) {
        result.append(word2.charAt(i));
      }
    }

    return result.toString();
  }

  public static void main(String[] args) {
    MergeString solution = new MergeString();
    String mergedString = solution.mergeAlternately("abc", "pqr");
    System.out.println(mergedString); // Output: apbqcr

    mergedString = solution.mergeAlternately("ab", "pqrs");
    System.out.println(mergedString); // Output: apbqrs

    mergedString = solution.mergeAlternately("abcd", "pq");
    System.out.println(mergedString); // Output: apbqcd
  }
}
