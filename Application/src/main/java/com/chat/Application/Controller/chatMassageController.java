package com.chat.Application.Controller;

import com.chat.Application.Model.chatMassage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class chatMassageController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public chatMassage sendMassage( chatMassage chatMassage){
        return chatMassage;
    }


    @GetMapping("/")
    public String home(){
        return "chat";
    }

}
