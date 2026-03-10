/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab Informatika
 */
public class InvalidInput extends Exception {
    public InvalidInput(){
}
    public InvalidInput(String message){
        super(message);
    }

    public InvalidInput(Throwable cause){
        super(cause);
    }
}