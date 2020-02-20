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

    @PostMapping("/signIn/{idConnexion}")
    public Util signInUtil(@PathVariable String idConnexion, @RequestBody String password){
        return (Util) icdRepository.findUtilWithMailAndPassword(idConnexion,password);
    }

    @PostMapping("/signUp")
    public Util signUp(@RequestBody Util util ){
      return  icdRepository.save(util);
    }


}
