public class Cat extends Animal{
    public Cat(){
        super(false,"milk and meat");
    }
    @Override
    public void sound() {
        System.out.println("meow");
    }
}
