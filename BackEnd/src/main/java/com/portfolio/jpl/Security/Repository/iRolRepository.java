package com.portfolio.jpl.Security.Repository;

import com.portfolio.jpl.Security.Entity.Rol;
import com.portfolio.jpl.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
   Optional<Rol> finByRolNombre(RolNombre rolNombre); 

    public Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
