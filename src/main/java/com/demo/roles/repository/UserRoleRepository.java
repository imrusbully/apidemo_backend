package com.demo.roles.repository;

import com.demo.roles.entity.UserRoleEntity;
import com.demo.roles.entity.UserRoleId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserRoleRepository extends JpaRepository<UserRoleEntity, UserRoleId> {

    List<UserRoleEntity> findAllByUserId(UUID userId);

    boolean existsByUserIdAndRoleName(
            UUID userId,
            String roleName
    );
}
