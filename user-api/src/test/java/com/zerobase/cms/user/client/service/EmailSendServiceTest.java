package com.zerobase.cms.user.client.service;

import com.zerobase.cms.user.client.MailgunClient;
import com.zerobase.cms.user.client.mailgun.SendMailForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailSendServiceTest {

    @Autowired
    private MailgunClient mailgunClient;

    @Test
    public void EmailTest() {
        SendMailForm form = SendMailForm.builder()
                .from("zerobase-test@sandboxe5492c3b0e9d4a30b0bb6c637aa6c4e4.mailgun.org")
                .to("nadoran78@gmail.com")
                .subject("Test Mail is arrived")
                .text("I love Java")
                .build();
        mailgunClient.sendEmail(form);

    }

}