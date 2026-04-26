public class KlietnKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlietnKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    public int getIdKlienta() {
        return idKlienta;}
    public String getImie() {
        return imie;}
    public String getNazwisko() {
        return nazwisko;}
    public String getEmail() {
        return email;}
    @Override
    public String toString() {
        return String.format("Klient #%d: %s %s <%s>", idKlienta, imie, nazwisko, email);}

}
