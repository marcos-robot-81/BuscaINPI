package br.com.Busca.rebozitory;

import java.io.File;
import java.util.Scanner;

public class LerXml {
    

    public void lerMarcaXml(String nome){

        try{
        File arquivo = new File("arquivo/marca/RM2875.xml");
        Scanner sca = new Scanner(arquivo);

        while(sca.hasNextLine()){

            System.out.println(sca.nextLine());



        }
        sca.close();
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
