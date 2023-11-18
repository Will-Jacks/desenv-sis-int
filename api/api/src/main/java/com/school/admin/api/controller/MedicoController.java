package com.school.admin.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    //Request body para dizer pra o SpringBoot que é pra retornar o corpo da requisição
    public void cadastrar(@RequestBody String json) {
        System.out.println(json);
    }
}
