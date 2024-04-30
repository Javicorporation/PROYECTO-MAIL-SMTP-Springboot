package org.project.proyectoemailsmtp.Service;

import jakarta.mail.MessagingException;
import org.project.proyectoemailsmtp.Service.Model.EmailDTO;

public interface IEmailService {
    public void sendMail(EmailDTO email) throws MessagingException;
}
