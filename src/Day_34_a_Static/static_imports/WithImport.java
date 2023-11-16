package Day_34_a_Static.static_imports;

import java.util.Arrays;

import static java.lang.Math.*; // .lang

import static java.util.Arrays.*;

import static my_utilites.StringUtil.*;

public class WithImport {
    public static void main(String[] args) {
        int [] a = {2, 30, 5, 65, 7};
        sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(PI);
        System.out.println(reverse("loop"));
    }
}
