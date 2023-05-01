public class CBL {
    void Name(){
        System.out.println("CBL!!");
    }
}
class Biscuit extends CBL{
    @Override
    void Name() {
        System.out.println("Biscuts!!");
    }
}
class Choclate extends Biscuit{
    @Override
    void Name() {
        System.out.println("Choclate");
    }
}
class Cake extends Choclate{
    @Override
    void Name() {
        System.out.println("Cake!!");
    }
}
class TestProgramme{
    public static void main(String[] args) {
        CBL c1 = new CBL ();
        CBL c2 = new Biscuit();
        CBL c3 = new Choclate();
        CBL c4 = new Cake();
        c1.Name();
        c2.Name();
        c3.Name();
        c4.Name();


    }
}