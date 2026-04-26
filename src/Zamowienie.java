import java.util.ArrayList;

public class Zamowienie {

    private int NumerZamowienia;
    private KlietnKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    private static int KolejnyNumer = 1;

    public Zamowienie(KlietnKawiarni klient) {
        this.NumerZamowienia = KolejnyNumer++;
        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.oplacone = false;}

    public void dodajProdukt(ProduktMenu produkt) {
        produkty.add(produkt);}

    public double policzWartosc() {
        double suma = 0;
        for (ProduktMenu p : produkty) {
            suma += p.getCena();}
        return suma;}
    public int policzLiczbeProduktow() {
        return produkty.size();}
    public void oznaczJakoOplacone() {
        oplacone = true;}

    public static int pobierzKolejnyNumer() {
        return KolejnyNumer;}
    public String toString() {
        String status = oplacone ? "OPLACONE" : "NIEOPLACONE";
        String wynik = "Zamowienie #" + NumerZamowienia + " " + status + "\n";
        wynik += "Klient: " + klient.getImie() + "\n";
        for (ProduktMenu p : produkty) {
            wynik += "  " + p + "\n";
        }
        wynik += "Suma: " + policzWartosc() + " zl";
        return wynik;}
}