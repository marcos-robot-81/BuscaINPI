package br.com.Busca.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.Busca.rebozitory.BaixaXML;
import br.com.Busca.rebozitory.LerXml;


@Controller
@RequestMapping("/busca/marca")
public class MarcaController {
    
    @PostMapping("/nome")
    public void busca(@RequestParam String nome){

        LerXml ler = new LerXml();
        
        ler.lerMarcaXml(nome);


        //BaixaXML b = new BaixaXML();
        //b.BaixaMarca("https://revistas.inpi.gov.br/txt/RM2875.zip");


    }
}
