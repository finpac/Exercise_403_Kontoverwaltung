/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author Patrick
 */
public class Account extends AbstractListModel{
    private final ArrayList <String> kontoBenutzer = new ArrayList();
    
    public void add(String name) {
        kontoBenutzer.add(name);
    }
    
    @Override
    public int getSize() {
        return kontoBenutzer.size(); 
    }

    @Override
    public Object getElementAt(int index) {
        return kontoBenutzer.get(index);
    }

    
    
}
