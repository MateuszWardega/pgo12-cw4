import java.util.ArrayList;

public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostępneMiejsca = 100;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public int getDostępneMiejsca() {
        return dostępneMiejsca;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getCena() {
        return cena;
    }

    public void zarezerwujMiejsce() {
        if (dostępneMiejsca > 0) {
            dostępneMiejsca--;
        } else {
            System.out.println("Brak dostępnych miejsc.");
        }
    }

    @Override
    public String toString() {
        return "Wydarzenie: " + nazwa + ", Data: " + data + ", Miejsce: " + miejsce +
                ", Cena: " + cena + " zł, Dostępne miejsca: " + dostępneMiejsca + "/" + maxLiczbaMiejsc;
    }
}
