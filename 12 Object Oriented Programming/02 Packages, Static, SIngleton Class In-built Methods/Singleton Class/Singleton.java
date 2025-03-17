package com.anirudh.lecture2;

public class Singleton {
    private Singleton()
    {
    }
    private static Singleton instance;
    //This function will return the above instance
    public static Singleton getInstance()
    {
        //Check if an object is created if not create one and return
        if(instance == null)
            instance = new Singleton();
        return instance;
    }
}
