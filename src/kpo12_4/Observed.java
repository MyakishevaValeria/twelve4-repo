/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo12_4;

public interface Observed {
    /**
     * метод для добавления наблюдателя
     * @param observer 
     */
    public void addObserver(Observer observer);
    /**
     * метод для удаления подписчика
     * @param observer 
     */
    public void removeObserver(Observer observer);
    /**
     * метод для уведомления наблюдателей
     */
    public void notifyObservers();
}
