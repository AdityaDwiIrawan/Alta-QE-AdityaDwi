class Persegi extends Bentuk {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    double hitungKeliling() {
        return sisi * 4;
    }
}