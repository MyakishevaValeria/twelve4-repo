/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo12_4;

import java.util.ArrayList;
import java.util.List;

/**
 * класс почтового отделения в котором есть печатные издания
 */
public class PostOffice implements Observed {
    //список печатных изданий
    List<String> newspaper = new ArrayList<>();
    //список подписчиков
    List<Observer> subscribers = new ArrayList<>();
    
    /**
     * метод для добавления печатного издания
     * @param newspaper - печатные издания
     */
    public void addNewspaper(String newspaper){
        //добавляем новое издание
        this.newspaper.add(newspaper);
        //отправляем подписчикам
        notifyObservers();
    }
    
    @Override
    public void addObserver(Observer observer) {
        //добавляем наблюдателя
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        //удаляем наблюдателя
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        //передаем подписчикам издания
        for(Observer observer : subscribers){
            observer.handleEvent(this.newspaper);
        }
    }   
}
