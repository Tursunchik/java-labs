public class encapsulation {
    public static void main(String[] args) {
        
    }
    class Student{
        private String name;
        private int age;

        public void setName(String name){
if(name.isEmpty()){
    System.out.println("The name is empty!");
} else {
    this.name = name;
}
            
        }

        public String getName(){
            return name;
        }

public void setAge(int age){
    if(age > 0){
        this.age = age;
    }
}

public int getAge(){
    return age;
}
    }
}
