import java.util.*;

public class GroupAnagrams {
    static class Solution1 {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> res = new HashMap<>();

            for (String s : strs) {
                int[] count = new int[26];

                for (char c : s.toCharArray()) {
                    count[c - 'a']++;
                }

                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 26; i++) {
                    sb.append('#');
                    sb.append(count[i]);
                }
                String key = sb.toString();

                if (!res.containsKey(key)) {
                    res.put(key, new ArrayList<>());
                }
                res.get(key).add(s);
            }

            return new ArrayList<>(res.values());
        }
    }
//-------------------------------------------------------------------------
    class Solution2 {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for (String word : strs) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);

                if (!map.containsKey(sortedWord)) {
                    map.put(sortedWord, new ArrayList<>());
                }

                map.get(sortedWord).add(word);
            }

            return new ArrayList<>(map.values());
        }
    }
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        String [] a = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = solution.groupAnagrams(a);
      /*  for (List<String> group : result) {
            System.out.println(group);
        }*/
        System.out.println("Output: " + result);
    }

}
