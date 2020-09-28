/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopractica3_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import localidad.coatepec;
import localidad.veracruz;
import localidad.villaEmilianoZapata;
import localidad.xalapaEnriquez;
import localidad.xico;

/**
 *
 * @author Toño
 */
public class EjercicioPractica3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        //Se declara la colección datos
        List<Datos> datos = new ArrayList<>();
        File fileIn;
        fileIn=new File("C:\\ejercicioPractica3_1\\Testdata.csv");
        FileReader fileToRead;
        fileToRead = new FileReader(fileIn);
        BufferedReader bufferedReader;
        bufferedReader=new BufferedReader(fileToRead);
        String lineaLeida = null;
        
        //Se declaran colecciones
        List<veracruz> Veracruz = new ArrayList<>();
        List<coatepec> Coatepec = new ArrayList<>();
        List<villaEmilianoZapata> VillaEZ = new ArrayList<>();
        List<xalapaEnriquez> XalapaEnriquez = new ArrayList<>();
        List<xico> Xico = new ArrayList<>();
        
        
        
        
        while((lineaLeida = bufferedReader.readLine()) != null){
            System.out.println(""+lineaLeida);
            File archivoPorCentroEducativo;
            String[] temp = lineaLeida.split(";");
            String localidad = temp[0];
            String clave = temp[1];
            String turno = temp[2];
            String centroEducativo = temp[3];
            String domicilio = temp[4];
            int numExterior = Integer.parseInt(temp[5]);
            int codigoPostal = Integer.parseInt(temp[6]);
            int lada = Integer.parseInt(temp[7]);
            int telefono = Integer.parseInt(temp[8]);
            int docentesMujeres = Integer.parseInt(temp[9]);
            int docentesHombres = Integer.parseInt(temp[10]);
            int alumnosMujeres = Integer.parseInt(temp[11]);
            int alumnosHombres = Integer.parseInt(temp[12]);
            
            datos.add(new Datos(localidad, clave, turno, centroEducativo, domicilio, numExterior, codigoPostal, lada, telefono, docentesMujeres, docentesHombres, alumnosMujeres, alumnosHombres));
            
            
            //Directorios
            File directorio = new File("C:\\ejercicioPractica3_1\\"+localidad+"");
            
            if(!directorio.exists()){
                directorio.mkdir();
            }
            
            if(localidad.equals("VERACRUZ")){
                    archivoPorCentroEducativo = new File("C:\\ejercicioPractica3_1\\VERACRUZ\\"+clave+"-"+turno+".txt");
                    FileWriter fw=new FileWriter(archivoPorCentroEducativo);
                    BufferedWriter bwriter = new BufferedWriter(fw);
                    bwriter.write(lineaLeida);   
                    bwriter.flush();
                    bwriter.close();        
            }else if(localidad.contains("XALAPA-ENR")){
                    archivoPorCentroEducativo = new File("C:\\ejercicioPractica3_1\\XALAPA-ENR�QUEZ\\"+clave+"-"+turno+".txt");
                    FileWriter fw=new FileWriter(archivoPorCentroEducativo);
                    BufferedWriter bwriter = new BufferedWriter(fw);
                    bwriter.write(lineaLeida);   
                    bwriter.flush();
                    bwriter.close();
            }else if(localidad.equals("VILLA EMILIANO ZAPATA (EL CARRIZAL)")){
                    archivoPorCentroEducativo = new File("C:\\ejercicioPractica3_1\\VILLA EMILIANO ZAPATA (EL CARRIZAL)\\"+clave+"-"+turno+".txt");
                    FileWriter fw=new FileWriter(archivoPorCentroEducativo);
                    BufferedWriter bwriter = new BufferedWriter(fw);
                    bwriter.write(lineaLeida);   
                    bwriter.flush();
                    bwriter.close();                   
            }else if(localidad.equals("COATEPEC")){
                    archivoPorCentroEducativo = new File("C:\\ejercicioPractica3_1\\COATEPEC\\"+clave+"-"+turno+".txt");
                    FileWriter fw=new FileWriter(archivoPorCentroEducativo);
                    BufferedWriter bwriter = new BufferedWriter(fw);
                    bwriter.write(lineaLeida);   
                    bwriter.flush();
                    bwriter.close(); 
            }else if(localidad.equals("XICO")){
                    archivoPorCentroEducativo = new File("C:\\ejercicioPractica3_1\\XICO\\"+clave+"-"+turno+".txt");
                    FileWriter fw=new FileWriter(archivoPorCentroEducativo);
                    BufferedWriter bwriter = new BufferedWriter(fw);
                    bwriter.write(lineaLeida);   
                    bwriter.flush();
                    bwriter.close();
            }
        }
        bufferedReader.close();  
    }   
}
