package com.projeto.SigaBem;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@Table(name = "encomenda")
public class Encomenda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;
    private String nomeDestinatario;
    private String cepOrigem;
    private String cepDestino;
    private LocalDate dataPrevistaEntrega;
    private LocalDate dataConsulta;
    private BigDecimal vlTotalFrete;

}
