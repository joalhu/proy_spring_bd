/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.upt.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 *
 * @author Bernardo
 */
@Controller
public class AppController {
 @Autowired

    @RequestMapping(value="index.htm", method=RequestMethod.GET)
    public String home(){
        return "index";
    }

}


