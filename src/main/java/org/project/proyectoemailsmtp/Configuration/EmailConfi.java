package org.project.proyectoemailsmtp.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@PropertySource("classpath: email.properties")
public class EmailConfi {
    @Value("${email.username}")
    private String correo;

    @Value("${eamil.password}")
    private String password;
}
