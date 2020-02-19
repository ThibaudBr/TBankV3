package com.TBankCorp.Webapp.controller;


import com.TBankCorp.Consumer.repository.ICDRepository;
import com.TBankCorp.Model.beans.Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
@RequestMapping(path = "/api/icd")
@CrossOrigin(origins = "http://localhost:4200")
public class ICDController extends AbstractController {

    private Logger log = LoggerFactory.getLogger(ICDController.class);

    @Autowired
    private ICDRepository icdRepository;

//    @PostMapping("/signIn")
//    public Util signInUtil(@RequestBody String mail, @RequestBody String password){
//        return (Util) icdRepository.findUtilWith
//    }
//    private Logger log = LoggerFactory.getLogger(ICDController.class);
//
//
//    // Inscription d'un utilisateur dans la base de données
//    @PostMapping(path= "/addUtil")
//    public void signIn(@RequestBody Util util) {
//        getManagerFactory().getIcdManager().addUtil(util);
//    }
}
