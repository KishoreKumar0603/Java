package TapAcademy;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        // Your code here
        int count = 0;
        System.out.println(countVowels(s,count,s.length() - 1));
    }
    public static int countVowels(String str, int count, int index)
    {
        if(index < 0 || str.isEmpty()) return count;
        if(isVowel(str.charAt(index))) count++;

        return countVowels(str,count,index-1);
    }


    public static boolean isVowel(char ch)
    {
        if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
        {
            return true;
        } 
        return false;
    }
}