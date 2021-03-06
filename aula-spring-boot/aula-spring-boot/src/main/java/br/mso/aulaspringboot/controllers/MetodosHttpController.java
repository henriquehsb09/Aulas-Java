package br.mso.aulaspringboot.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

  @GetMapping
  public String get() {
    return "Requisição do tipo GET";
  }
  
  @PostMapping
  public String post() {
    return "Requisição do tipo POST";
  }
  
  @PutMapping
  public String put() {
    return "Requisição do tipo PUT";
  }
  
  @PatchMapping
  public String patch() {
    return "Requisição do tipo PATCH";
  }
  
  @DeleteMapping
  public String delete() {
    return "Requisição do tipo DELETE";
  }

}
