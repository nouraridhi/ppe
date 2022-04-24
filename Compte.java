package com.example.ppe.entities;
import com.example.ppe.Controller.*;
import com.example.ppe.DAO.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_CPT",
        discriminatorType=DiscriminatorType.STRING, length=2)

public class Compte {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long NumCompte;

    private String nomC;

    private String prenomC;

    private String email;

    private String mdp;


}
