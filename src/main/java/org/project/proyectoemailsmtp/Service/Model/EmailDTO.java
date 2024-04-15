package org.project.proyectoemailsmtp.Service.Model;

public class EmailDTO {

    private String destinatario;
    private String asunto;
    private String getDestinatario;

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getGetDestinatario() {
        return getDestinatario;
    }

    public void setGetDestinatario(String getDestinatario) {
        this.getDestinatario = getDestinatario;
    }
}
