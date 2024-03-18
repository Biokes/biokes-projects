package eStore;

import MentrualApp.InvalidDateException;

public class InvalidQuantityException extends RuntimeException{
    public InvalidQuantityException(){
        super("Invalid Quantity.");
    }
}
