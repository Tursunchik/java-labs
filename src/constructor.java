public class constructor {
    public static void main(String[] args) {
        Student s1 =  new Student("Bob" , 20);
    }

 class   Student {
    String name;
    int age;


    Student(String name , int age){
        this.name = name;
        this.age = age;
    }
    }
}
