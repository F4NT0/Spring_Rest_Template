package dev.com.system.fanto.controller;

// Import do Controller
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExemploController{

    @GetMapping("/")
    @ResponseBody
    public String Hello(){
        return "Hello World!";
    }

    @GetMapping("/teste")
    @ResponseBody
    public String Teste(){
        return "Exemplo de Requisição GET";
    }
}