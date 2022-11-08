package com.example.entiry;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "regions")
public class Regions {

    @Id
    @Column(name = "REGION_ID")
    private Long regionId;
    @Column(name = "REGION_NAME")
    private String regionName;
}
