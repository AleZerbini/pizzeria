package dominios;

import java.util.ArrayList;

public final class Menu {
    /**
     * A private static method that holds the single instance of the Singleton,
     * if one has been instantiated anywhere.
     */
    private static Menu _instance = null;

    /**
     * Private constructor to prevent instantiation of single objects from anywhere other than this Class.
     */
    private Menu() {}

    /**
     * Method to return the current instance of the Singleton class if one has been instantiated
     * or, if not, create and return the new one.
     * @return Singleton - the single globally-accessible instance
     */
    public static Menu getInstance(){
        if(_instance == null){
            _instance = new Menu();
        }
        return _instance;
    }

    private ArrayList<Pizza> pizzas;
    private ArrayList<Product> beverages;
    private ArrayList<Product> desserts;


}




