/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo12_4;

/**
 * клиентский класс
 */
public class GetNewspapers {

    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        //печатные издания
        postOffice.addNewspaper("Cosmopolitan");
        postOffice.addNewspaper("Комсомольская правда");
        
        Observer firstSubscriber = new Subscriber("Иван Иванов");
        Observer secondSubscriber = new Subscriber("Антон Сидоров");
        //добавляем подписчиков
        postOffice.addObserver(firstSubscriber);
        postOffice.addObserver(secondSubscriber);
        //поступление почтового издания
        postOffice.addNewspaper("Вестник");
    }
    
}
