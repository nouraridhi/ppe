package com.example.ppe.DAO;
import com.example.ppe.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ppe.Controller.*;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie,Long> {
}
