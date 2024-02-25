package org.open_library_project.be.book.repository;

import org.open_library_project.be.book.model.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, String> {
}
