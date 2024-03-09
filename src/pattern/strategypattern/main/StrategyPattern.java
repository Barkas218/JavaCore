package pattern.strategypattern.main;

import src.pattern.strategypattern.*;

import java.util.List;

public class StrategyPattern {

    public static void startStrategyPattern(){

        /*
        Definition:
        Defines a family of algorithms and encapsulates each one and makes them interchangeable
        The strategy let's the algorithm vary independently from the clients that use it
        */

        System.out.println("Strategy Pattern");

        FlyWithWings flyWithWings = new FlyWithWings();
        NotFlying notFlying = new NotFlying();

        Bussard bussard = new Bussard(flyWithWings);
        GummiEnte gummiEnte = new GummiEnte(notFlying);

        List<Ente> enten = List.of(bussard,gummiEnte);

        enten.forEach(s-> s.performFly());



    }

}
