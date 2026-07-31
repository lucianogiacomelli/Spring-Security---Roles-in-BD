package com.Spring_Security.Roles_Permissions.Repository;

import com.Spring_Security.Roles_Permissions.Model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Roles, Long> {
}
