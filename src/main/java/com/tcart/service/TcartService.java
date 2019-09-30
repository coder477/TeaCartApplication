package com.tcart.service;

import com.tcart.models.ChatEntry;
import com.tcart.repository.TcartDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TcartService {

    @Autowired
    public TcartDAO tcartDAO;

    public ChatEntry SaveChatData(ChatEntry chatEntry) {
        return tcartDAO.save(chatEntry);
    }

    public Integer addition(int a, int b, ChatEntry chatEntry) {
        tcartDAO.save(chatEntry);
        return a + b;
    }

}
