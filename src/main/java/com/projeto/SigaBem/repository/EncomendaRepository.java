package com.projeto.SigaBem.repository;

import com.projeto.SigaBem.model.Encomenda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EncomendaRepository extends JpaRepository<Encomenda, UUID> {

}
