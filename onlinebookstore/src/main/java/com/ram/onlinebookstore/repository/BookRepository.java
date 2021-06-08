package com.ram.onlinebookstore.repository;

import com.ram.onlinebookstore.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.data.domain.Pageable;


@CrossOrigin("http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long> {

    @RestResource(path = "categoryId")
    Page<Book> findByCategoryId(@Param("id") Long id, Pageable pageable);
}
