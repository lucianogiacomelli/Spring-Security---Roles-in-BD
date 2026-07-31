package com.Spring_Security.Roles_Permissions.Repository;

import com.Spring_Security.Roles_Permissions.Model.Permissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permissions, Long> {

}
