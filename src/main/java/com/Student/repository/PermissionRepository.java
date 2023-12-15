package com.Student.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {

}

