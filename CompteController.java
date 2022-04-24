package com.example.ppe.Controller;
import com.example.ppe.DAO.*;
import com.example.ppe.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/comptes")
public class CompteController {


    @Autowired
    protected CompteRepository CR;

    public List<Compte> getAllC()
    {
        return CR.findAll();
    }

    public Compte ajouter(@RequestBody Compte c)
    {
        this.CR.save(c); /*findbyid*/
        return c;
    }

    @PostMapping("/AddC")
    public Compte ajouterC(@RequestBody Compte c)
    {
        return CR.save(c);
    }

    @GetMapping("/GetAllC")
    public List<Compte> afficherToutC()
    {
        return CR.findAll();
    }

    @GetMapping("GetIdC/{id}")
    public Optional<Compte> getIdC(Long id)
    {
        return CR.findById(id);
    }

    @DeleteMapping("DeleteC/{id}")
    public void delete(@PathVariable("id") Long id)
    {
        CR.deleteById(id);
    }



    @PutMapping("/UpdateC")
    public Compte modifierD(@RequestBody Compte c)
    {
        return CR.save(c);
    }
}
