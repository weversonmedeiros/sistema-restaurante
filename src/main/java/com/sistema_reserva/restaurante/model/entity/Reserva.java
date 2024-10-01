package com.sistema_reserva.restaurante.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_reserva")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USUARIO_COD")
    private Usuario usuario;

    @Column(name = "COMENTARIO")
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "RESTAURANTE_COD")
    private Restaurante restaurante;

    @Column(name = "DATA_AGENDAMENTO")
    private LocalDateTime dataAgendamento;

    @OneToOne
    @JoinColumn(name = "MESA_COD")
    private Mesa mesa;

    @Column(name = "CHECKED_IN")
    private boolean checkedIn;

    @Column(name = "CHECKED_OUT")
    private boolean checkedOut;

}
