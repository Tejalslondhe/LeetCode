import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
  public int romanToInt(String s) {

    Map<Character, Integer> m = new HashMap<>();

    m.put('I', 1);
    m.put('V', 5);
    m.put('X', 10);
    m.put('L', 50);
    m.put('C', 100);
    m.put('D', 500);
    m.put('M', 1000);

    int num = 0;

    for (int i = 0; i < s.length(); i++) {

      if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
        num -= m.get(s.charAt(i));
      } else {
        num += m.get(s.charAt(i));
      }
    }
    return num;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // creating instance
    Solution sol = new Solution();
    System.out.println("Enter the Roman value:");
    int result = sol.romanToInt(sc.next());
    System.out.println(result);
  }
}
