package com.SCMOTORS.service.impl;

import com.SCMOTORS.dao.UsuarioDao;
import com.SCMOTORS.domain.Rol;
import com.SCMOTORS.domain.Usuario;
import com.SCMOTORS.service.UsuarioDetailsService;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userDetailsService")
public class UsuarioDetailsServiceImpl implements UsuarioDetailsService, UserDetailsService{
    @Autowired
    private UsuarioDao usuarioDao;
    @Autowired
    private HttpSession session;
    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioDao.findByUsername(username);

        if (usuario == null) {
            throw new UsernameNotFoundException(username);
        }
        session.removeAttribute("usuarioImagen");
        session.setAttribute("usuarioImagen", usuario.getRutaImagen());

        List<GrantedAuthority> roles = new ArrayList<>();

        for (Rol rol : usuario.getRoles()) {
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
        return new User(usuario.getUsername(), usuario.getPassword(), roles);
    }

}
    

