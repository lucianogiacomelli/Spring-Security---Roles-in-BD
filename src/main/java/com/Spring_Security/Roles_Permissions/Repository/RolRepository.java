package com.Spring_Security.Roles_Permissions.Repository;

import com.Spring_Security.Roles_Permissions.Model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Roles, Long> {
}
