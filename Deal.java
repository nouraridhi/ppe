package com.example.ppe.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.ppe.DAO.*;
import javax.persistence.*;
import java.util.Date;
import com.example.ppe.Controller.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Deal {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long NumDeal;

    private String nomDeal;

    private Double ancien_prix;

    private Double pourcentage;

    private Double nouveau_prix;

    private Date temps_rest;

    private Long quantite;

  //  private Long nb_vente;

    @ManyToOne
    @JoinColumn(name="numCateg")
    private Categorie categorie;



}
