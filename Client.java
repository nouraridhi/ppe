package com.example.ppe.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import com.example.ppe.DAO.*;
import com.example.ppe.Controller.*;
@Data
@Entity
@DiscriminatorValue("client")
public class Client extends Compte {
}
