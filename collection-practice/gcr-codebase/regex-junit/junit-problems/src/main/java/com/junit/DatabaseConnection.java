package com.junit;

public class DatabaseConnection{
    boolean isConnected = false;
    
    public void connect(){
        isConnected = true;
    }

    public void disconnect(){
        isConnected = false;
    }

    public boolean getStatus(){
        return isConnected;
    }
}
