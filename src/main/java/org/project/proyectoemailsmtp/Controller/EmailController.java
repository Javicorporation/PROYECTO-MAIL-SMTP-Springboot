package org.project.proyectoemailsmtp.Controller;

import jakarta.mail.MessagingException;
import org.project.proyectoemailsmtp.Service.IEmailService;
import org.project.proyectoemailsmtp.Service.Implement.EmailServiceImpl;
import org.project.proyectoemailsmtp.Service.Model.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Email")
public class EmailController {

    @Autowired
    IEmailService iEmailService;

    @PostMapping("/Envio")
    private ResponseEntity<String> sendEmail (@RequestBody EmailDTO emailDTO) throws MessagingException {
        iEmailService.sendMail(emailDTO);
        return  new ResponseEntity<>("correo envia correctamente", HttpStatus.OK);
    }
}
