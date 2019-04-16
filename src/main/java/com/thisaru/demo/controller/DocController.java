package com.thisaru.demo.controller;

import com.thisaru.demo.model.Document;
import com.thisaru.demo.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class DocController {


    @Autowired
    DocService docService;
    @RequestMapping(value = "/document", method = RequestMethod.POST)
    public Document save(@RequestBody Document document) {

        return docService.save(document);
    }
}
