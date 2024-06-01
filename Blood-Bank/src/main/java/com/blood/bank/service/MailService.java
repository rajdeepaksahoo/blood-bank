package com.blood.bank.service;

import jakarta.mail.MessagingException;

public interface MailService {
    public void sendMail(String to,String subject,String body) throws MessagingException;
}
