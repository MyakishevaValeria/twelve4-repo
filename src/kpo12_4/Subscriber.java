/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo12_4;

import java.util.List;

/**
 * класс реализации наблюдателя
 */
public class Subscriber implements Observer {
    String name;
    
    public Subscriber(String name){
        this.name = name;
    }
    
    @Override
    public void handleEvent(List<String> newspaper) {
       System.out.println(name+" получил печатные издания "+ newspaper);
    }
    
}
