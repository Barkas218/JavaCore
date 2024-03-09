package pattern.strategypattern;

public class NotFlying implements FlyBehaviour{

    @Override
    public void fly(){
        System.out.println("not flying");
    }

}
