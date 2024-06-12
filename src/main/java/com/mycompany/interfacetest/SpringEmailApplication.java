/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailApplication {
    @Autowired
    private EmailService senderService;
    
    @EventListener(ApplicationReadyEvent.class)
    public void sendMail() {
        senderService.sendEmail(MainPage.studentsCardEmailRecepient, MainPage.studentsCardEmailSubject, MainPage.studentsCardEmailContent);
    }
}
