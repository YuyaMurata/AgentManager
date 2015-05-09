/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agmanager.out.terminal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 *
 * @author kaeru
 */
public class TextAreaOutputStream extends ByteArrayOutputStream{
    private OutputTerminal terminal;
    
    public TextAreaOutputStream(OutputTerminal terminal){
        super();
        this.terminal = terminal;
    }
    
    public synchronized void write(byte[] b, int off, int len){
        super.write(b, off, len);
        terminal.flush();
    }
    
    public synchronized void write(int b){
        super.write(b);
        terminal.flush();
    }
    
    public synchronized void write(byte[] b) throws IOException{
        super.write(b);
        terminal.flush();
    }
}
