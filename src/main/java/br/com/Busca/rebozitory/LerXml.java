package br.com.Busca.rebozitory;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import br.com.Busca.DTO.MarcaDTO;
import br.com.Busca.processos.ProcessoMarca;

public class LerXml {
    

    public void lerMarcaXml(String nome){

        int n = 2875;
        try{
        File arquivo = new File("arquivo/marca/RM"+n+".xml");
        Scanner sca = new Scanner(arquivo);
        StringBuffer resposta ;
        List<ProcessoMarca> lista;

        System.out.println(nome);

        while(sca.hasNextLine()){
            String linha = sca.nextLine();

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
