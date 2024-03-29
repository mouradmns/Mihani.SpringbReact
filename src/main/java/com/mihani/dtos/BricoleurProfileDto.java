package com.mihani.dtos;

import com.mihani.entities.BricolageService;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;
import java.util.Date;
import java.util.List;


    @Data
public class BricoleurProfileDto {

    private Long id ;
    private String prenom;
    private String nom;
    @Enumerated(EnumType.STRING)
    private List<BricolageService> services;

    private Double Rating;
    private String mainPic;

    private Boolean BricoleurAvailability;
    private Integer totalWorkHours;
    private String email ;
    private String Tel;
    private String ville;
    private String description;
    private Date dateInscription;
}

