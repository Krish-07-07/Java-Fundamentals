public class StringQues {
    
    static void printString(String str){
        int n = str.length();
        for(int i = 0;i<n;i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getLengthOfString(String str){
        char[] arr = str.toCharArray();
        int len =arr.length;
        return len;
    }

    static int countVowel(String str){
        int count = 0;
        for(int i = 0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch=='i' || ch=='o' ||ch=='u'||ch == 'A' || ch == 'E'|| ch=='I' || ch=='O' ||ch=='U'){
                count++;
            }
        }
        return count;
    }
    
    static String reverseString(String str){
       String reverse ="";
       int n = str.length();
       for(int i =n-1;i>=0;i--){
        char ch = str.charAt(i);
        reverse = reverse + ch;
       }
       return reverse;
    }

    static boolean isPalindrome(String str){
        String original = str;
        String resevrse = reverseString(str);
        for(int i = 0 ; i<original.length();i++){
            char ch1 = original.charAt(i);
            char ch2 = resevrse.charAt(i);
            if(ch1!= ch2){
                return false;
            }
        }
        return true;
    }





    static void main(){
        String name = "NOON";
        System.out.println(isPalindrome(name));
       // System.out.println(reverseString(name));
      // System.out.println(countVowel(name));
      // System.out.println(getLengthOfString(name));
        //printString(name);
    }
    
}
