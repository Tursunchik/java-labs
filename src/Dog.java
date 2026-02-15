public class Dog {
    String name;
    int age;

    Dog(String s , int n){
        name = s;
        age = n;
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog("Balto" , 20);
        Dog dog2 = dog1;

        System.out.println(dog2.name);
    }
}
