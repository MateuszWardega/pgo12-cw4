import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzeń = new ArrayList<>();
    private ArrayList<Klient> listaKlientów = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzeń.add(wydarzenie);
    }

    public void dodajWydarzenie(String nazwa, double cena) {
        Wydarzenie wydarzenie = new Wydarzenie(nazwa, cena);
        listaWydarzeń.add(wydarzenie);
    }

    public void dodajWydarzenie(String nazwa, double cena, String data) {
        Wydarzenie wydarzenie = new Wydarzenie(nazwa, cena, data);
        listaWydarzeń.add(wydarzenie);
    }

    public void dodajWydarzenie(String nazwa, double cena, String data, String miejsce) {
        Wydarzenie wydarzenie = new Wydarzenie(nazwa, cena, data, miejsce);
        listaWydarzeń.add(wydarzenie);
    }

    public void dodajKlienta(Klient klient) {
        listaKlientów.add(klient);
    }

    public void dodajKlienta(String imię, String nazwisko, String email) {
        Klient klient = new Klient(imię, nazwisko, email);
        listaKlientów.add(klient);
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.getDostępneMiejsca() > 0) {
            klient.dodajRezerwację(wydarzenie);
            wydarzenie.zarezerwujMiejsce();
            System.out.println("Rezerwacja dla " + klient.getImię() + " " + klient.getNazwisko() +
                    " na wydarzenie: " + wydarzenie.getNazwa() + " została pomyślnie zrealizowana.");
        } else {
            System.out.println("Brak dostępnych miejsc na to wydarzenie.");
        }
    }

    public Wydarzenie znajdźWydarzenie(String nazwa) {
        for (Wydarzenie wydarzenie : listaWydarzeń) {
            if (wydarzenie.getNazwa().equalsIgnoreCase(nazwa)) {
                return wydarzenie;
            }
        }
        return null;
    }

    public Klient znajdźKlienta(String nazwisko) {
        for (Klient klient : listaKlientów) {
            if (klient.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return klient;
            }
        }
        return null;
    }

    public void zmieńCenęWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdźWydarzenie(nazwa);
        if (wydarzenie != null) {
            wydarzenie.setCena(nowaCena);
            System.out.println("Cena wydarzenia " + nazwa + " została zmieniona na " + nowaCena + " zł.");
        } else {
            System.out.println("Nie znaleziono wydarzenia o nazwie " + nazwa);
        }
    }
}
