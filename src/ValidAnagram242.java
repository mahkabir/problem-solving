import java.util.stream.IntStream;

public class ValidAnagram242 {

        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;

            int[] store = new int[26];

            for (int i = 0; i < s.length(); i++) {
                store[s.charAt(i) - 'a']++;
                store[t.charAt(i) - 'a']--;
            }

          /*  for (int n : store) if (n != 0) return false;

            return true;*/
            return IntStream.of(store).allMatch(n -> n == 0);

        }
    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagharam";
        ValidAnagram242 solution = new ValidAnagram242();
        System.out.println("Valid Anagram? :"+solution.isAnagram(s,t));
        System.out.println("Valid Anagramtest? :"+solution.isanagramtest(s,t));   }


   /* public boolean is annaram(String s,String t){
            if(s.length()!=t.length())
                return false;
            int[] store = new int[26];
            for(int i = 0; i<s.length();i++){

            }
    }*/
    public boolean isanagramtest(String s, String t){
        if (s.length()!=t.length())
                return false;
        int [] store = new int[26];
        for(int i=0; i<s.length();i++){
            store[s.charAt(i)-'a']++;
            store[t.charAt(i)-'a']--;
        }
         return IntStream.of(store).allMatch(n->n==0);

    }
}
