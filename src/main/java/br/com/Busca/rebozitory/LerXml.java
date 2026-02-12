package br.com.Busca.rebozitory;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import br.com.Busca.processos.ProcessoMarca;
import br.com.Busca.processos.processo;

import br.com.Busca.Debug.*;

public class LerXml {
    
    Debug d = new Debug();

    public void lerMarcaXml(String nome){

        int n = 2875;
        try{
        File arquivo = new File("arquivo/marca/RM"+n+".xml");
        Scanner sca = new Scanner(arquivo);
        List<ProcessoMarca> lista;

        ProcessoMarca m = new ProcessoMarca();

        // ler arquivo
        while(sca.hasNextLine()){
            String linha = sca.nextLine();

            // nomero do procesaor
            if(linha.toLowerCase().contains("processo")){

                m.setNumnero( Integer.parseInt( linha.substring(
                    linha.indexOf("=") +2,
                    linha.indexOf(">") -1
                )));
            }

            // codigo e nome
            if(linha.toLowerCase().contains("despacho") && !(linha.toLowerCase().contains("despachos")) ){
            
                m.setCodigo( 
                    linha.substring( linha.indexOf("=")+2 ,
                    (linha.substring(linha.indexOf("=") )).indexOf(" ") -1 + (linha.indexOf("=")) )
                );

                d.p(

                    linha.substring( (linha.substring(linha.indexOf("=") +2 )).indexOf("=") +1  ,
                    linha.indexOf("/") -2)


                );
                m.setNome(

                    linha.substring( (linha.substring(linha.indexOf("=") +2 )).indexOf("=") +1 ,
                    linha.indexOf("/") -2)

                );
            }

            // 
            if(linha.toLowerCase().contains("nome-razao-social")){
                
                
            }

            //
             if(linha.toLowerCase().contains(nome.toLowerCase())){
                System.out.println(linha);
             }
            


        }
        sca.close();
        }catch (Exception e){
            System.err.println(e);
        }
    }


    private ProcessoMarca busca(){
        ProcessoMarca m = new ProcessoMarca();
        return m;
    }


}
