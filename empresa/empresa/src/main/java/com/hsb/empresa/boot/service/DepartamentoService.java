package com.hsb.empresa.boot.service;



import com.hsb.empresa.boot.domain.Departamento;

import java.util.List;

public interface DepartamentoService {
  
  void salvar(Departamento departamento);
  
  void editar(Departamento departamento);
  
  void excluir(Long id);
  
  Departamento buscarPorId(Long id);
  
  List<Departamento> buscarTodos();
  
  boolean departamentoTemCargos(Long id);
}