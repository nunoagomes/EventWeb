/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp.web;

import java.io.File;

/**
 *
 * @author nunoandrebarbosagomes
 */
public class Directory extends File {
    
    public Directory(String directoryPath) {
        super(directoryPath);
    }
    
    private boolean isNotDirectory(){
        return !isDirectory();
    }
    
    public void createDirectory(){
        if (isNotDirectory()) {
            mkdir();
        }
    }
    
}
