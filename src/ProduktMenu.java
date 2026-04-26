public class ProduktMenu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int LiczbaProduktow = 0;

    public ProduktMenu(String kod, String nazwa,double cena, String kategoria){
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        LiczbaProduktow++;}
    public String getKod() {
        return kod;}
    public String getNazwa() {
        return nazwa;}
    public double getCena() {
        return cena;}
    public String getKategoria() {
        return kategoria;}
    public int getLiczbaProduktow() {
        return LiczbaProduktow;}
}

