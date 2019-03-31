package Controlador;

public class ElectronicPayment {
    private String provider;
    private String mail;
    private String password;

    public ElectronicPayment() {
    }

    public ElectronicPayment(String provider, String mail, String password) {
        this.provider = provider;
        this.mail = mail;
        this.password = password;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
