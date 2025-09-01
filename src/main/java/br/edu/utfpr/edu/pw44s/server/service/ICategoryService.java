package br.edu.utfpr.edu.pw44s.server.service;

import br.edu.utfpr.edu.pw44s.server.model.Category;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface ICategoryService {

    List<Category> findAll();
    Page<Category> findAll(Pageable pageable);
    Category save(Category category);
    Category findById(Long id);
    void deleteById(Long id);
    boolean existsById(Long id);
    long count();
}
