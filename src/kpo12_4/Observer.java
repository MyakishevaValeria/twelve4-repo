/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kpo12_4;

import java.util.List;

public interface Observer {
    /**
     * метод обработки событий
     * @param newspaper - лист строк печатных изданий
     */
    public void handleEvent(List<String> newspaper);
}
