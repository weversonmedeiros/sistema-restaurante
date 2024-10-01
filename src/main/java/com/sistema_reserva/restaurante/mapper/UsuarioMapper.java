package com.sistema_reserva.restaurante.mapper;

import com.sistema_reserva.restaurante.model.dto.UsuarioDTO;
import com.sistema_reserva.restaurante.model.entity.TermoAceite;
import com.sistema_reserva.restaurante.model.entity.Usuario;

public class UsuarioMapper {
    public static Usuario toEntity(UsuarioDTO usuarioDTO, TermoAceite termoAceite) {
        return Usuario
                .builder()
                .tipoUsuario(usuarioDTO.getTipoUsuario())
                .cpf(usuarioDTO.getCpf())
                .nome(usuarioDTO.getNome())
                .senha(usuarioDTO.getSenha())
                .email(usuarioDTO.getEmail())
                .endereco(usuarioDTO.getEndereco())
                .termoAceite(termoAceite)
                .build();
    }

    public static UsuarioDTO toDTO(Usuario usuario) {
        return UsuarioDTO
                .builder()
                .id(usuario.getId())
                .tipoUsuario(usuario.getTipoUsuario())
                .cpf(usuario.getCpf())
                .nome(usuario.getNome())
                .senha(usuario.getSenha())
                .email(usuario.getEmail())
                .endereco(usuario.getEndereco())
                .codTermoAceite(usuario.getTermoAceite().getId())
                .build();

    }
}