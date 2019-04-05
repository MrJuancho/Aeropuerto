package Controlador;

public class CardInformation {
    private String CardNumber;
    private String expDate;
    private String CCV;
    private int Fondos;

    public CardInformation() {
    }

    public CardInformation(String cardNumber, String expDate, String CCV, int fondos) {
        CardNumber = cardNumber;
        this.expDate = expDate;
        this.CCV = CCV;
        this.Fondos = fondos;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getCCV() {
        return CCV;
    }

    public void setCCV(String CCV) {
        this.CCV = CCV;
    }

    public int getFondos() {
        return Fondos;
    }

    public void setFondos(int Fondos) {
        this.Fondos = Fondos;
    }
}
