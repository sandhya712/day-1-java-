public class Car{
    String color="red";
    void speed(){
        System.out.println("500km/hr");
    }
}
class Main{
    public static void main(String[] args) {
        Car bmw=new Car();
        System.out.println(bmw.color);
        bmw.speed();
    }
}