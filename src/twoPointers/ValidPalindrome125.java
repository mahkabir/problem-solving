package twoPointers;

public class ValidPalindrome125 {

    private boolean isPalindrome(String s) {
     int i=0;
     int j = s.length()-1;

     while(i<j){
         Character start = s.charAt(i);
         Character end = s.charAt(j);
         if(!Character.isLetterOrDigit(start)){
             i++;
             continue;
         }
         if(!Character.isLetterOrDigit(end)){
             j--;
             continue;
         }
         if(Character.toLowerCase(start)!=(Character.toLowerCase(end))){
             return false;
         }
         i++;
         j--;
     }


     return true;
    }

    private boolean isPalindromePractice(String value){
        int i =0;
        int j = value.length()-1;
        while (i<j){
            Character start = value.charAt(i);
            Character end  =  value.charAt(j);
            if (!Character.isLetterOrDigit(start)){
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)){
                j--;
                continue;
            }
            if (Character.toLowerCase(start)!=Character.toLowerCase(end)){
                return false;
            }
            i++;
            j--;
        }


        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: panama";
        ValidPalindrome125 solution = new ValidPalindrome125();
        System.out.println("Valid Palindrome? :"+solution.isPalindromePractice(s));
    }
}
