class PersegiPanjang extends Bentuk {
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    double hitungKeliling() {
        return 2 * panjang * lebar;
    }
}
