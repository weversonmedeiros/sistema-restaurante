package com.sistema_reserva.restaurante.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_mesa")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD")
    private Long id;


    @Column(name = "QTD_CADEIRA", nullable = false)
    private Integer qtdCadeira;

    @ManyToOne
    @JoinColumn(name = "COD_RESTAURANTE", nullable = false)
    private Restaurante restaurante;

    @Column(name = "NUMERO", nullable = false)
    private int numero;

}
