/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivosdir;

import java.io.File;

/**
 *
 * @author oracle
 */
public class Metodos {
    String rutaArquivosdir = "/home/oracle/NetBeansProjects/arquivos/arquivosdir/";
    
    File arquivosdir = new File(rutaArquivosdir);

    public boolean deleteDirectory(File path){
       if(arquivosdir.exists()){
           File[] files = arquivosdir.listFiles();
           for (int i = 0; i <files.length; i++){
               if(files[i].isDirectory()){
                   deleteDirectory(files[i]);
               }else{
                   
               files[i].delete();
           }
       }
   }
       return(arquivosdir.delete());
}
}
