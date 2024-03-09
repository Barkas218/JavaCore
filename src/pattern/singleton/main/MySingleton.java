package pattern.singleton.main;

public class MySingleton {

    // Only Instance
    private  static MySingleton mySingleton;

    // Cannot be initalized via new Keyword ( not possible are multiple instances)
    private MySingleton(){};


    // Factory Method which returns Singleton instance and create it if not already created
    public static MySingleton getInstance(){
        if(mySingleton == null){
            synchronized (MySingleton.class){
                mySingleton = new MySingleton();
            }
        }
        return mySingleton;
    }

}
