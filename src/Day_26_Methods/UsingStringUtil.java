package Day_26_Methods;

import my_utilites.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {
        System.out.println(StringUtil.frequencyOfCharacters("Sevil", 'e'));
        System.out.println(StringUtil.fixFormat("MicKeY"));
        System.out.println(StringUtil.reverse("loop camp"));
        System.out.println(StringUtil.isPalindrome("Sevil")); // it will be false;
        System.out.println(StringUtil.isPalindrome("racecar")); // it will be true;
        System.out.println(StringUtil.fixFormat("apple"));
    }
}
