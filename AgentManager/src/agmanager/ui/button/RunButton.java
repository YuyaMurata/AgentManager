/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agmanager.ui.button;

/**
 *
 * @author kaeru
 */
public class RunButton {
    private final String javaAgentRun = "java -cp $CLASSPATH $CETA_HOME/rda."; 
    
    public RunButton(){
    }
      
    public void command(){
        System.out.println("Test Out Run!!");
        System.out.println("");
        System.err.println("Test Err Run!!");
        System.err.println("");
    }
}
 