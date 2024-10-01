package com.sistema_reserva.restaurante.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_termo_aceite")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TermoAceite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD")
    private Long id;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;
}
