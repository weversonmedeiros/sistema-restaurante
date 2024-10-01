package com.sistema_reserva.restaurante.services;

import com.sistema_reserva.restaurante.mapper.UsuarioMapper;
import com.sistema_reserva.restaurante.model.dto.UsuarioDTO;
import com.sistema_reserva.restaurante.model.dto.UsuarioRepository;
import com.sistema_reserva.restaurante.model.entity.TermoAceite;
import com.sistema_reserva.restaurante.model.entity.Usuario;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    public UsuarioDTO salvar(@Valid UsuarioDTO usuarioDTO) {
        Usuario usuario = UsuarioMapper.toEntity(usuarioDTO, TermoAceite.builder().build());
        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        return UsuarioMapper.toDTO(usuarioSalvo);
    }
}
