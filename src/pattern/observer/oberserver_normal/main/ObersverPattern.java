package pattern.observer.oberserver_normal.main;

import src.pattern.observer.oberserver_normal.Observer.CurrentCondtionsDisplay;
import src.pattern.observer.oberserver_normal.Observer.WeatherForecast;
import src.pattern.observer.oberserver_normal.Subject.WeatherStation;

public class ObersverPattern {

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

    public static void StartObserverPattern(){
        /* Create Subject */
        WeatherStation wS = new WeatherStation();

        /* Create Observers and register them directly in the construct process*/
        CurrentCondtionsDisplay cDD = new CurrentCondtionsDisplay(wS);
        WeatherForecast wF = new WeatherForecast(wS);

        /* New Data */
        for(var i= 1; i<10;i++){
            wS.getNewData(i,i);
        }

    }



}
