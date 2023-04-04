package com.mihani;


import com.mihani.entities.BricolageService;
import com.mihani.entities.Bricoleur;
import com.mihani.repositories.BricoleurRepo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.transaction.annotation.Transactional;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

@Transactional
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//
//    @Bean
//    CommandLineRunner start(BricoleurRepo bricoleurRepo) {
//        return args -> {
//            Stream.of("Bric1", "bric2", "bric3").forEach(name -> {
//                Bricoleur bricoleur = new Bricoleur();
//
//
//
//                Long i = Long.valueOf(23);
//                bricoleur.setIdUtilisateur(i);
//                bricoleur.setPrenom(name);
//                bricoleur.setNom(name);
//
//                bricoleur.setRating(4.3);
//
//
//
//
//                bricoleur.setEmail(name + "@gmail.com");
//                bricoleur.setBricoleurAvailability(true);
//                bricoleur.setDescription("contains dd ff ");
//
//                int j =3;
//
//                bricoleur.setMainPic("/assets/images/bricoleurs/bric"+j+".webp");
//
//
//                List<BricolageService> listSrv = new ArrayList<>();
//
//                listSrv.add(BricolageService.PEINTRE);
//                bricoleur.setServices(listSrv);
//
//                bricoleurRepo.save(bricoleur);
//            });
//
//        };
//    }



}
