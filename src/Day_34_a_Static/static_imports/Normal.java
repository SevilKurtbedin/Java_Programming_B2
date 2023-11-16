package Day_34_a_Static.static_imports;

import my_utilites.StringUtil;
// import from my util.package

import java.util.Arrays;

public class Normal {
    public static void main(String[] args) {
        int [] a = {2, 30, 5, 65, 7};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(StringUtil.reverse("java"));
        System.out.println(Math.PI);
    }
}
