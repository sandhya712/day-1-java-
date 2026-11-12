public class Student {
    private int id;
    void getter(){
        System.out.println(id);
    }
    void setter(int num){
        id=num;
    }
    }
class Main{
    public static void main(String[] args) {
        Student us=new Student();
        us.setter(71230);
        us.getter();
    }
}