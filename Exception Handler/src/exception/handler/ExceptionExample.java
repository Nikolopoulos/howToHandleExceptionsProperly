/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception.handler;

import java.util.ArrayList;

/**
 *
 * @author Basil Nikolopoulos
 */
public class ExceptionExample {

    /**
     * @param args the command line arguments
     * 
     * The only true way to handle exceptions
     * With ideas picked up from 
     * 
     * http://stackoverflow.com/questions/5226212/how-to-open-the-default-webbrowser-using-java
     * 
     * and
     * 
     * https://scontent.fath3-1.fna.fbcdn.net/hphotos-xpf1/v/t1.0-9/12717312_1234334576579918_2896678946562161864_n.png?oh=cf7bede685eb96c6dbdb387d667a242f&oe=5760881B
     */
    public static void main(String[] args) {
        
        try{
           ArrayList f = null;
           f.add(new Object());
        }
        catch(Exception e){
            ExceptionHandler.stackOverflow(e);
            ExceptionHandler.google(e);
        }
    }
    
}
