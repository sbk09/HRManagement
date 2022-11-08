package com.example.entiry;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "countries")
public class Country {

    @Id
    @Column(name = "COUNTRY_ID")
    private String countryId;
    @Column(name = "COUNTRY_NAME")
    private String countryName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "REGION_ID",referencedColumnName = "REGION_ID")
    private Regions region;
}
