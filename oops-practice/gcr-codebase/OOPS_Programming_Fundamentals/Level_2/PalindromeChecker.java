// package oops-practice.gcr-codebase.OOPS_Programming_Fundamentals.Level_2;

// class PalindromeChecker{

//     private String text;

//     public PalindromeChecker(String text){

//         this.text=text;
//     }

//     public boolean isPalindrome(){

//         String rev="";

//         for(int i=text.length()-1;i>=0;i--){

//             rev+=text.charAt(i);
//         }

//         return text.equalsIgnoreCase(rev);
//     }

//     public void display(){

//         if(isPalindrome())
//             System.out.println("Palindrome");
//         else
//             System.out.println("Not Palindrome");
//     }
// }

// public class Palindrome{

//     public static void main(String[] args){

//         PalindromeChecker p=new PalindromeChecker("madam");

//         p.display();
//     }
// }
public class PalindromeChecker {

    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String rev = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }

        return text.equalsIgnoreCase(rev);
    }

    public void display() {
        if (isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {

        PalindromeChecker p = new PalindromeChecker("madam");
        p.display();
    }
}