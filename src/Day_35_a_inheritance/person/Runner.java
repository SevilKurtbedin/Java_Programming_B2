package Day_35_a_inheritance.person;

public class Runner {
    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.name = "Eyad";
        personOne.age = 25;
        personOne.favoriteHobby = "Java";
        personOne.talk();
        //objOne.study();
        // .study() method is in CHILD class and nothing inherits
        // from CHILD to PARENT. Since I am trying to reach it with Parent class object, not able to.

        Student studentOne = new Student();
        studentOne.name = "Valentina";
        studentOne.age = 25;
        studentOne.favoriteHobby = "Of course Java";
        studentOne.talk();
        studentOne.study();
    }
}
