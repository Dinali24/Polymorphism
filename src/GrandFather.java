public class GrandFather {
    void swim(){
        System.out.println("Swimming!!");
    }
}
class Father extends GrandFather{
    @Override
    void swim() {
        System.out.println("Swimming in river!!");
    }
}
class Son extends Father{
    @Override
    void swim() {
        System.out.println("Swimming in pool!!");
    }
    public static void main(String[] args) {
        GrandFather f1,f2,f3;
        f1 = new GrandFather();
        f2 = new Father();
        f3 = new Son();
        f1.swim();
        f2.swim();
        f3.swim();


    }
}


