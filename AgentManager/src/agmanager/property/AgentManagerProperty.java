/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agmanager.property;

import agmanager.ui.button.SaveButton;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kaeru
 */
public class AgentManagerProperty {
    private final Properties prop;
    private final String path;
    
    public AgentManagerProperty(String path){
        this.prop = new Properties();
        this.path = path;
        create();
    }
    
    private void create(){
        File f = new File(path);
        if(!f.exists()){
            System.out.println("File Create "+path);
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(AgentManagerProperty.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void delete(){
        File f = new File(path);
        if(f.exists()){ 
            System.out.println("File Delete "+path);
            f.delete();
        }
    }
    
    public Properties load(){
        System.out.println("Load Properties " + path);
        
        try {
            prop.load(new FileInputStream(path));
        } catch (IOException ex) {
            Logger.getLogger(SaveButton.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return prop;
    }
    
    public void update(){
        System.out.println("Update Properties "+path);
        
        try {
            prop.store(new FileOutputStream(path), null);
        } catch (IOException ex) {
            Logger.getLogger(AgentManagerProperty.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
