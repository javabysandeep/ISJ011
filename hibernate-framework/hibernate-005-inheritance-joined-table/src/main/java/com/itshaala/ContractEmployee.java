package com.itshaala;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "contract_employee_tbl")
public class ContractEmployee extends Employee {
    private int invoiceAmount;

}
