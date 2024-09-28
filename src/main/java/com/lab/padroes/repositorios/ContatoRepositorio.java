package com.lab.padroes.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab.padroes.entidades.Contato;

@Repository
public interface ContatoRepositorio extends JpaRepository<Contato, Long> {

}
