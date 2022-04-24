package com.example.ppe.Controller;
import com.example.ppe.DAO.*;
import com.example.ppe.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/categories")
public class CategorieController {


    @Autowired
    protected CategorieRepository CAR;

    public List<Categorie> getAllCat()
    {
        return CAR.findAll();
    }

    public Categorie ajouter(@RequestBody Categorie ca)
    {
        this.CAR.save(ca); /*findbyid*/
        return ca;
    }

    @PostMapping("/AddCat")
    public Categorie ajouterCat(@RequestBody Categorie ca)
    {
        return CAR.save(ca);
    }

    @GetMapping("/GetAllCat")
    public List<Categorie> afficherToutCat()
    {
        return CAR.findAll();
    }


    @GetMapping("GetIdCat/{id}")
    public Optional<Categorie> getIdCat(Long id)
    {
        return CAR.findById(id);
    }

    @DeleteMapping("DeleteCat/{id}")
    public void delete(@PathVariable("id") Long id)
    {
        CAR.deleteById(id);
    }



    @PutMapping("/UpdateCat")
    public Categorie modifierCat(@RequestBody Categorie ca)
    {
        return CAR.save(ca);
    }
}
