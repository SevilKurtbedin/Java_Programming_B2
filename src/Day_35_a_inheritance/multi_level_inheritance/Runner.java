package Day_35_a_inheritance.multi_level_inheritance;

public class Runner {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.a = 2;
        obj1.b = 3;

        B obj2 = new B();
        obj2.a = 1;
        obj2.b = 2;
        obj2.c = 3;
        obj2.d = 4;

        C obj3 = new C();
        obj3.a = 1;
        obj3.b = 1;
        obj3.c = 1;
        obj3.d = 1;
        obj3.e = 1;
        obj3.f = 1;
    }
}
