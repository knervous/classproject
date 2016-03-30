/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassProject;

import Controllers.MainController;

/**
 *
 * @author pcj105
 */
public class ClassProject implements Runnable{

    private MainController mainController;
    
    public static void main(String[] args){
        
    }
    
    @Override
    public void run()
    {
        mainController = new MainController();
    }
    
    
    
}
