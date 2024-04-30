package org.project.proyectoemailsmtp.Service.Implement;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.project.proyectoemailsmtp.Service.IEmailService;
import org.project.proyectoemailsmtp.Service.Model.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class EmailServiceImpl implements IEmailService {
    @Autowired
    JavaMailSender javaMailSender;
    TemplateEngine templateEngine;

    public EmailServiceImpl(JavaMailSender javaMailSender, TemplateEngine templateEngine) {
        this.javaMailSender = javaMailSender;
        this.templateEngine = templateEngine;
    }

    @Override
    public void sendMail(EmailDTO email) throws MessagingException {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true,"UTF-8");

        helper.setTo(email.getDestinatario());
        helper.setSubject(email.getAsunto());

        Context context = new Context();
        context.setVariable("message", email.getMessage());
        String contenidoHtml = templateEngine.process("Email", context);



    }


}
