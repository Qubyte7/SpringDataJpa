package com.shami.SpringDataJpa.Repository;

import com.shami.SpringDataJpa.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
}
