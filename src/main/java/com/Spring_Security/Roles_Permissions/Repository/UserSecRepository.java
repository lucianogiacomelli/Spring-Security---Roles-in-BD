package com.Spring_Security.Roles_Permissions.Repository;

import com.Spring_Security.Roles_Permissions.Model.UserSec;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserSecRepository extends JpaRepository<UserSec, Long> {

    Optional<UserSec> findUserEntityByUsername(String username);


}
