package Day_06_Arithmetic_operators;

public class IncrementExamle2 {
    public static void main(String[] args) {
        int age = 20;
        System.out.println(age); // 20
        System.out.println(age++); // --> 20 | x = 21
        System.out.println(age); // age = 21
        System.out.println(age++); // -->21
        System.out.println(age); // --> 22
        System.out.println(age+2); // 22 + 2 = 24
        System.out.println(age); // 22
        System.out.println(age++); // 22
        System.out.println(age); // 23
        System.out.println(++age); // 24
        System.out.println(age); //24

        //                  24      25      26      27      28     28     29
        System.out.println(age++ + age++ + age++ + age++ + age + age++ + age); // 187
         }
}
