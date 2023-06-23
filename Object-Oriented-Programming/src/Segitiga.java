public class Segitiga{
    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }


    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }


    double hitungKeliling() {
        return alas * tinggi;
    }
}
