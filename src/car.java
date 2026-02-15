public class car {
    String brand;
    int speed;
    car(String brand , int speed){
     this.brand = brand;
     this.speed = speed;
    }

    int increaseSpeed(int n){
        speed *= n;
        return speed;
    }
    void showInfo(){
        System.out.println(brand + "" + speed);
    }
}
