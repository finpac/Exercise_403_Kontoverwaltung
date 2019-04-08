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
    @Override
    public int getSize() {
        return kontoBenutzer.size(); 
    }

    @Override
    public Object getElementAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
