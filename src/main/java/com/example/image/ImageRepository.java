package com.example.image;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long>{

	Image findByName(String text);

	Image findFirstByName(String text);

}
