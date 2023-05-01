public class Vehical {
    void driver(){
        System.out.println("Drive Speed Limit 100kmph");
    }
}
class Car extends Vehical{
    @Override
    void driver() {
        System.out.println("Drive Speed Limit 150kmph");
    }
}
class RunProgramme{
    public static void main(String[] args) {
        Vehical c = new Car();
        Vehical v = new Vehical();
        c.driver();
        v.driver();
    }
}
