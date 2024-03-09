package pattern.observer.oberserver_generic.main;

public class ObersverPatternGeneric {

    /*
        1) Definition of Observer Pattern / Fan out

            When one object changes state
            all of it depends are notified and updated automatically

        2) Architecture

            Event
                    --- NewData which changes State of Subject --->
            Weatherstation ( Subject / Publisher / Topic)
                                ---Notify-->
            CurrentDisplay + Forecasting Display (Subscriber / Oberserver)

        3) Bad way
           If the observer have to get the state they have to ask a lot of times and that's how happens unnecessary circles

     */



}
