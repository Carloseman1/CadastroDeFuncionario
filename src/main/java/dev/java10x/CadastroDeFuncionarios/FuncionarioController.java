package dev.java10x.CadastroDeFuncionarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FuncionarioController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Esse é minha primeira mensagem nessa rota!";

    }
}