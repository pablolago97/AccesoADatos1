package arquivosdir;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Arquivosdir {

    public static void main(String[] args) throws IOException {

        //Crear directorio
        /*new File ("/home/oracle/NetBeansProjects/arquivos/");
         arquivosdir.mkdir();*/
        String rutaArquivosdir = "/home/oracle/NetBeansProjects/arquivos/arquivosdir/";
        File arquivosdir = new File(rutaArquivosdir);
        arquivosdir.mkdirs();

        //Crear un 'File' (.txt) de nombre 'Producst1'
        arquivosdir = new File(rutaArquivosdir + "Products1.txt");
        arquivosdir.createNewFile();

        //Comprueba si existe el fichero
        if (arquivosdir.exists() == true) {
            System.out.println("¿Existe el archivo 'Products1'?\nExiste el archivo" + " " + arquivosdir + "\n");
        } else {
            System.out.println("\n¿Existe el archivo 'Products1'?\nNo existe el archivo" + " " + arquivosdir + "\n");
        }

        //Crea un 'File' (.txt) llamado 'Products2'
        arquivosdir = new File(rutaArquivosdir + "subdir");
        arquivosdir.mkdir();
        arquivosdir = new File(rutaArquivosdir + "subdir/Products2.txt");
        arquivosdir.createNewFile();

        //Comprueba si existe el archivo
        if (arquivosdir.exists() == true) {
            System.out.println("¿Existe el archivo 'Products2'?\nExiste el archivo" + " " + arquivosdir + "\n");
        } else {
            System.out.println("\n¿Existe el archivo 'Products2'?\nNo existe el archivo" + " " + arquivosdir + "\n");
        }

        //Mostrar los directorios
        System.out.println("Archivos y subdirectorios:");
        arquivosdir = new File(rutaArquivosdir);

        String[] a = arquivosdir.list();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //Muestra la ruta
        System.out.println("\nRuta del primer directorio creado:");
        arquivosdir = new File(rutaArquivosdir);
        System.out.println(arquivosdir.getPath());

        //Información sobre el primer objeto 'File'
        arquivosdir = new File(rutaArquivosdir + "Products1.txt");
        System.out.println("\nNombre del fichero:" + arquivosdir.getName() + "\n" + "Ruta del fichero:"
                + arquivosdir.getPath() + "\n" + "¿Es posible escribir en él?" + arquivosdir.canWrite()
                + "\n" + "¿Es posible leerlo?" + arquivosdir.canRead()+"\n"+"Longitud en 'bytes':"+arquivosdir.length());
        
        //Cambiar los permisos del archivo 'Products1'
        arquivosdir.setReadOnly();
        boolean x=true;
        while(x==true){
            System.out.println("\n--PERMISO CAMBIADO: 'SOLO LECTURA'--\n");
            x=false;
        }
        arquivosdir.setWritable(true);
        while(x==false){
            System.out.println("\n--PERMISO CAMBIADO: 'ESCRITURA AÑADIDO'--\n");
            System.out.println("Permisos actuales: 'LECTURA Y ESCRITURA");
            x=true;
        }
        
        //Borrar el archivo 'Products1'
       
       if(arquivosdir.delete()==true){
           System.out.println("Archivo 'Products1' eliminado con éxito");
       }
       
       //Borrar todos los archivos
       arquivosdir = new File(rutaArquivosdir+"subdir/Products2.txt");
       
       if(arquivosdir.delete()==true){
           System.out.println("Archivo 'Producst2' eliminado con éxito");
       }
       
       arquivosdir = new File(rutaArquivosdir+"subdir");
       
       if(arquivosdir.delete()==true){
           System.out.println("Directorio 'subdir' eliminado con éxito");
       }
       
       arquivosdir = new File(rutaArquivosdir);
       
       if(arquivosdir.delete()==true){
           
           System.out.println("Directorio 'arquivosdir' eliminado con éxito");
       }
       
       Metodos obx = new Metodos();
       obx.borrar(arquivosdir);
     
               }
           }
       
       
       
       
        
        

    


