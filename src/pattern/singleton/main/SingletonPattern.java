package pattern.singleton.main;

public class SingletonPattern {

    public static void start(){

        /*
            Definition

                Ensures a class has only one instance and provides
                a global point of access to it

            Advantages

                1) Lazy Loading: initalize init only when it is necessary
                2) Only need one instance ( e.g. Database connection)

            Extras



            How to Write
                1) Private constructor
                2) Private static instance
                3) Factory method for creating instance ( static at class level)

         */

        MySingleton mySingleton = MySingleton.getInstance();

        // Not possible
        //MySingleton mySingleton1 = new MySingleton();

    }

}
