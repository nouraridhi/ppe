package com.example.ppe.Controller;
import com.example.ppe.DAO.*;
import com.example.ppe.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/deals")
public class DealController {

    @Autowired
    protected DealRepository DR;

    public List<Deal> getAllD()
    {
        return DR.findAll();
    }

    public Deal ajouter(@RequestBody Deal d)
    {
        this.DR.save(d); /*findbyid*/
        return d;
    }

    @PostMapping("/AddD")
    public Deal ajouterD(@RequestBody Deal d)
    {
        return DR.save(d);
    }


    @GetMapping("GetIdD/{id}")
    public Optional<Deal> getIdD(Long id)
    {
        return DR.findById(id);
    }

    @DeleteMapping("DeleteD/{id}")
    public void delete(@PathVariable("id") Long id)
    {
        DR.deleteById(id);
    }



    @PutMapping("/UpdateD")
    public Deal modifierD(@RequestBody Deal d)
    {
        return DR.save(d);
    }


}
