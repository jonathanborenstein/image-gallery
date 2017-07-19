package com.example.image;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface SiteUserRepository extends JpaRepository<SiteUser, Long> {

    Optional<SiteUser> findByName(String name);
}
