package pattern.strategypattern;

public abstract class Ente {

    protected FlyBehaviour flyBehaviour;

    public Ente(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    public void display(){
        System.out.println(this.getClass().getName());
    }
    public void performFly(){flyBehaviour.fly();}


}
