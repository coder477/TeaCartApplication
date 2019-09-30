package com.tcart.controller;

import com.tcart.models.ChatEntry;
import com.tcart.service.TcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tcart")
public class TcartController {

    @Autowired
    public TcartService tcartService;

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public ResponseEntity TestService() {
        return ResponseEntity.ok("Hii hello");

    }

    @RequestMapping(method = RequestMethod.POST, value = "/savechat")
    public ResponseEntity SaveChatHistory(@RequestBody ChatEntry chatEntry) {
        //validation
        return ResponseEntity.ok(tcartService.SaveChatData(chatEntry));
    }

}

