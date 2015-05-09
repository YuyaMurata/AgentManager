/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agmanager.ui.button;

import agmanager.property.AgentManagerProperty;
import java.util.Properties;

/**
 *
 * @author kaeru
 */
public class SaveButton {
    private final AgentManagerProperty ag;
    private final Properties prop;
    public SaveButton(String path){
         this.ag = new AgentManagerProperty(path);
         this.prop = ag.load();
         prop.clear();
    }
    
    public void execute(String text){
        for(String line : text.split("\n")){
            if(line.split("=").length == 2){
                String key = line.split("=")[0];
                String value = line.split("=")[1];
                
                System.out.println("Set Property:"+key+"-"+value);
                prop.setProperty(key, value);
            }
        }
        
        ag.update();
    }
}
