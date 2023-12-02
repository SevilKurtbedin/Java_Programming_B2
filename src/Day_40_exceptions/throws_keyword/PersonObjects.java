package Day_40_exceptions.throws_keyword;

import Day_40_exceptions.throws_keyword.Person;

public class PersonObjects {
    public static void main(String[] args) {

        Person obj = new Person();

        //obj.setName("Tom Jerry");

        try {
            obj.setName("Tom Jerry");
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            obj.setAge(-50);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println(obj.getName()); //--> ""
        System.out.println("DONE");






    }
}
