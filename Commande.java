package com.example.ppe.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.ppe.DAO.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.example.ppe.Controller.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

public class Commande {
    @Id
    private Long numCom;
}
