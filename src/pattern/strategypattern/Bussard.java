package pattern.strategypattern;

public class Bussard extends Ente{
    public Bussard(FlyBehaviour flyBehaviour) {
        super(flyBehaviour);
    }

    @Override
    public void display(){
        System.out.println("I' am a bussard");
    }

}
