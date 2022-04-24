package com.example.ppe.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.ppe.Controller.*;
import javax.persistence.*;
import java.util.List;
import com.example.ppe.DAO.*;
@NoArgsConstructor
@Data
@Entity
public class Categorie {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long NumCateg;

    private String nomCat;

    @OneToMany( mappedBy="categorie")
    private List<Deal> deals;


    public Categorie(long numCateg, String nomCat, List<Deal> deals) {
        NumCateg = numCateg;
        this.nomCat = nomCat;
        this.deals = deals;
    }
}
