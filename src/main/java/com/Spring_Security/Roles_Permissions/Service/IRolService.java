package com.Spring_Security.Roles_Permissions.Service;

import com.Spring_Security.Roles_Permissions.Model.Permissions;
import com.Spring_Security.Roles_Permissions.Model.Roles;

import java.util.List;
import java.util.Optional;

public interface IRolService {
    List<Roles> getAllRoles();
    Optional<Roles> findById(Long id);
    Roles createRoles(Roles roles);
    void deleteById(Long id);
    Roles updateRoles(Roles roles);
}
