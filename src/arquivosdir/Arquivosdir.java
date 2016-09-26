
package arquivosdir;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Arquivosdir {

   
    public static void main(String[] args) throws IOException {
        
        
                
        /*Crear directorio
        new File ("/home/oracle/NetBeansProjects/arquivos/");
        arquivosdir.mkdir();*/
        String rutaArquivosdir="/home/oracle/NetBeansProjects/arquivos/arquivosdir/";
        File arquivosdir =new File (rutaArquivosdir);
        arquivosdir.mkdirs();  
        
                //Crear archivo.txt
        arquivosdir = new File(rutaArquivosdir+"Products1.txt");
        arquivosdir.createNewFile();
        
                //¿Existe?
        if(arquivosdir.exists()==true){
            System.out.println("Si, existe el archivo"+" "+arquivosdir);
        }else
            System.out.println("No, no existe el archivo"+" "+arquivosdir);
        
        //Crear archivo .txt (2)
        arquivosdir = new File(rutaArquivosdir+"subdir");
        arquivosdir.mkdir();
        arquivosdir = new File(rutaArquivosdir+"subdir/Products2.txt");
        arquivosdir.createNewFile();
        
        //¿Existe? (2)"/home/oracle/NetBeansProjects/arquivos/arquivosdir/
        if(arquivosdir.exists()==true){
            System.out.println("Si, existe el archivo"+" "+arquivosdir);
        }else
            System.out.println("No, no existe el archivo"+" "+arquivosdir);
        
        //Amosar os directorios
        arquivosdir = new File(rutaArquivosdir);
        
        String [] a = arquivosdir.list();
        for (int i = 0; i <a.length;i++){
            System.out.println(a[i]);
        }
        
        //Muestra la ruta
        arquivosdir = new File(rutaArquivosdir);
        System.out.println(arquivosdir.getPath());
        
        
        
        
        
        
        
        
    }
}

