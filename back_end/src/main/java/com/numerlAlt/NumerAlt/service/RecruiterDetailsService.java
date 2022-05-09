package com.numerlAlt.NumerAlt.service;

import com.numerlAlt.NumerAlt.entity.Recruiter;
import com.numerlAlt.NumerAlt.repository.RecruiterRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RecruiterDetailsService implements UserDetailsService {
    @Autowired
    private RecruiterRepositoryInterface recruiterRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Recruiter recruiter = recruiterRepository.findByEmail(email);
        if (recruiter == null) {
            throw new UsernameNotFoundException("No user found with username: " + email);
        }
        boolean enabled = true;
        boolean accountNonExpired = true;
        boolean credentialsNonExpired = true;
        boolean accountNonLocked = true;
//        List<String> roles = Arrays.asList(recruiter.getRole());
//
//        return new org.springframework.security.core.userdetails.User(
//                recruiter.getEmail(), recruiter.getPassword().toLowerCase(), enabled, accountNonExpired,
//                credentialsNonExpired, accountNonLocked, getAuthorities(roles));
        return null;
    }

    private static List<GrantedAuthority> getAuthorities (List<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }
        return authorities;
    }
}
