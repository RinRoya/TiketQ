/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TampilanDasar;

/**
 *
 * @author OWNER
 */
public class DataBase {

    private String nama, email, jamBudal, jamTutuk, pesanan, namaPesanan;
    private int dari, ke, hari, bulan, tahun, jmlorang, kursi, hari1, bulan1, tahun1, pilihan1, pilihan2;
    private long nomorIdentitas, nomorHP, harga;

    public DataBase() {
    }
    
    public String getNamaPesanan() {
        return namaPesanan;
    }

    public void setNamaPesanan(String namaPesanan) {
        this.namaPesanan = namaPesanan;
    }

    public int getPilihan1() {
        return pilihan1;
    }

    public void setPilihan1(int pilihan1) {
        this.pilihan1 = pilihan1;
    }

    public int getPilihan2() {
        return pilihan2;
    }

    public void setPilihan2(int pilihan2) {
        this.pilihan2 = pilihan2;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        switch (pesanan) {
            case "p":
                setHarga(41000);
                setNamaPesanan("Pan Black Pizza Personal Meat");
                break;
            case "p1":
                setHarga(56000);
                setNamaPesanan("Cheecybites Pizza Personal Meat");
                break;
            case "p2":
                setHarga(50000);
                setNamaPesanan("Beef Lasagna");
                break;
            case "p3":
                setHarga(86000);
                setNamaPesanan("Pan Black Pizza Regular Chesse");
                break;
            case "p4":
                setHarga(119000);
                setNamaPesanan("Pan Black Pizza Large Super");
                break;
            case "t":
                setHarga(9000);
                setNamaPesanan("Fanta Strawberry");
                break;
            case "t1":
                setHarga(31000);
                setNamaPesanan("Combo Spicy Txtreme 1");
                break;
            case "t2":
                setHarga(46000);
                setNamaPesanan("Combo 2 - Combo 2pc");
                break;
            case "t3":
                setHarga(36000);
                setNamaPesanan("Combo Crunchy Deals 2");
                break;
            case "t4":
                setHarga(22000);
                setNamaPesanan("Shortcake Coklat");
                break;
            case "b":
                setHarga(65000);
                setNamaPesanan("Promo 2 Nasi Ayam GM + Teh Pucuk");
                break;
            case "b1":
                setHarga(46000);
                setNamaPesanan("Bakmi Bakso");
                break;
            case "b2":
                setHarga(47500);
                setNamaPesanan("Korean Popcorn Chicken");
                break;
            case "b3":
                setHarga(49500);
                setNamaPesanan("Ayam Cah Cabai");
                break;
            default:
                setHarga(14000);
                setNamaPesanan("Iced Green Tea");
        }
        this.pesanan = pesanan;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(String tiket, int pil1, int pil2) {
        long Harga = 0;
        switch (tiket) {
            case "pesawat":
                if ((pil1 == 0 && pil2 == 1) || (pil1 == 1 && pil2 == 0)) {
                    Harga = 700000;
                } else if ((pil1 == 0 && pil2 == 2) || (pil1 == 2 && pil2 == 0)) {
                    Harga = 400000;
                } else if ((pil1 == 0 && pil2 == 3) || (pil1 == 3 && pil2 == 0)) {
                    Harga = 650000;
                } else if ((pil1 == 0 && pil2 == 4) || (pil1 == 4 && pil2 == 0)) {
                    Harga = 600000;
                } else if ((pil1 == 1 && pil2 == 2) || (pil1 == 2 && pil2 == 1)) {
                    Harga = 1300000;
                } else if ((pil1 == 1 && pil2 == 3) || (pil1 == 3 && pil2 == 1)) {
                    Harga = 750000;
                } else if ((pil1 == 1 && pil2 == 4) || (pil1 == 4 && pil2 == 1)) {
                    Harga = 800000;
                } else if ((pil1 == 2 && pil2 == 3) || (pil1 == 3 && pil2 == 2)) {
                    Harga = 900000;
                } else if ((pil1 == 2 && pil2 == 4) || (pil1 == 4 && pil2 == 2)) {
                    Harga = 900000;
                } else if ((pil1 == 3 && pil2 == 4) || (pil1 == 4 && pil2 == 3)) {
                    Harga = 700000;
                } else {
                    Harga = 0;
                }

                if (getKursi() == 0) {
                    Harga += 0;
                } else if (getKursi() == 1) {
                    Harga += Harga / 2;
                }
                break;
            case "kereta":
                if ((pil1 == 0 && pil2 == 1) || (pil1 == 1 && pil2 == 0)) {
                    Harga = 300000;
                } else if ((pil1 == 0 && pil2 == 2) || (pil1 == 2 && pil2 == 0)) {
                    Harga = 100000;
                } else if ((pil1 == 0 && pil2 == 3) || (pil1 == 3 && pil2 == 0)) {
                    Harga = 200000;
                } else if ((pil1 == 0 && pil2 == 4) || (pil1 == 4 && pil2 == 0)) {
                    Harga = 250000;
                } else if ((pil1 == 1 && pil2 == 2) || (pil1 == 2 && pil2 == 1)) {
                    Harga = 350000;
                } else if ((pil1 == 1 && pil2 == 3) || (pil1 == 3 && pil2 == 1)) {
                    Harga = 150000;
                } else if ((pil1 == 1 && pil2 == 4) || (pil1 == 4 && pil2 == 1)) {
                    Harga = 150000;
                } else if ((pil1 == 2 && pil2 == 3) || (pil1 == 3 && pil2 == 2)) {
                    Harga = 200000;
                } else if ((pil1 == 2 && pil2 == 4) || (pil1 == 4 && pil2 == 2)) {
                    Harga = 250000;
                } else if ((pil1 == 3 && pil2 == 4) || (pil1 == 4 && pil2 == 3)) {
                    Harga = 50000;
                } else {
                    Harga = 0;
                }

                if (getKursi() == 0) {
                    Harga += 0;
                } else if (getKursi() == 1) {
                    Harga += Harga / 2;
                }
                break;
            case "hotel":
                if ((pil1 == 0 && pil2 == 0)) {
                    Harga = 400000;
                } else if ((pil1 == 0 && pil2 == 1)) {
                    Harga = 500000;
                } else if ((pil1 == 0 && pil2 == 2)) {
                    Harga = 1300000;
                } else if ((pil1 == 1 && pil2 == 0)) {
                    Harga = 450000;
                } else if ((pil1 == 1 && pil2 == 1)) {
                    Harga = 500000;
                } else if ((pil1 == 1 && pil2 == 2)) {
                    Harga = 950000;
                } else if ((pil1 == 2 && pil2 == 0)) {
                    Harga = 850000;
                } else if ((pil1 == 2 && pil2 == 1)) {
                    Harga = 1000000;
                } else if ((pil1 == 2 && pil2 == 2)) {
                    Harga = 2000000;
                } else if ((pil1 == 3 && pil2 == 0)) {
                    Harga = 500000;
                } else if ((pil1 == 3 && pil2 == 1)) {
                    Harga = 600000;
                } else if ((pil1 == 3 && pil2 == 2)) {
                    Harga = 850000;
                } else if ((pil1 == 4 && pil2 == 0)) {
                    Harga = 450000;
                } else if ((pil1 == 4 && pil2 == 1)) {
                    Harga = 950000;
                } else if ((pil1 == 4 && pil2 == 2)) {
                    Harga = 1150000;
                } else {
                    Harga = 0;
                }

                if (getKursi() == 0) {
                    Harga += 0;
                } else if (getKursi() == 1) {
                    Harga += Harga / 2;
                }

                int ntahun2 = getTahun();
                int nbulan2 = getBulan();
                int nhari2 = getHari();
                int ntahun3 = getTahun1();
                int nbulan3 = getBulan1();
                int nhari3 = getHari1();
                int jumlahHari = 0;

                if (ntahun3 > ntahun2) {
                    jumlahHari += 365 * (ntahun3 - ntahun2);
                } else {
                    if (nbulan3 > nbulan2) {
                        jumlahHari += 30 * (nbulan3 - nbulan2);
                    } else {
                        if (nhari3 > nhari2) {
                            jumlahHari += nhari3 - nhari2;
                        }
                    }
                }

                Harga *= jumlahHari;
                break;
        }

        this.harga = Harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public String getJamBudal() {
        return jamBudal;
    }

    public void setJamBudal(String jamBudal) {
        switch (jamBudal) {
            case "08.00":
                if ((getDari() == 0 && getKe() == 1) || (getDari() == 1 && getKe() == 0)) {
                    setJamTutuk("09.30");
                } else if ((getDari() == 0 && getKe() == 2) || (getDari() == 2 && getKe() == 0)) {
                    setJamTutuk("09.00");
                } else if ((getDari() == 0 && getKe() == 3) || (getDari() == 3 && getKe() == 0)) {
                    setJamTutuk("09.30");
                } else if ((getDari() == 0 && getKe() == 4) || (getDari() == 4 && getKe() == 0)) {
                    setJamTutuk("09.30");
                } else if ((getDari() == 1 && getKe() == 2) || (getDari() == 2 && getKe() == 1)) {
                    setJamTutuk("09.45");
                } else if ((getDari() == 3 && getKe() == 1) || (getDari() == 1 && getKe() == 3)) {
                    setJamTutuk("09.00");
                } else if ((getDari() == 4 && getKe() == 1) || (getDari() == 1 && getKe() == 4)) {
                    setJamTutuk("09.00");
                } else if ((getDari() == 2 && getKe() == 3) || (getDari() == 3 && getKe() == 2)) {
                    setJamTutuk("09.00");
                } else if ((getDari() == 2 && getKe() == 4) || (getDari() == 4 && getKe() == 2)) {
                    setJamTutuk("09.00");
                } else if ((getDari() == 3 && getKe() == 4) || (getDari() == 4 && getKe() == 3)) {
                    setJamTutuk("09.00");
                }

                break;
            case "14.00":
                if ((getDari() == 0 && getKe() == 1) || (getDari() == 1 && getKe() == 0)) {
                    setJamTutuk("15.30");
                } else if ((getDari() == 0 && getKe() == 2) || (getDari() == 2 && getKe() == 0)) {
                    setJamTutuk("15.00");
                } else if ((getDari() == 0 && getKe() == 3) || (getDari() == 3 && getKe() == 0)) {
                    setJamTutuk("15.30");
                } else if ((getDari() == 0 && getKe() == 4) || (getDari() == 4 && getKe() == 0)) {
                    setJamTutuk("15.30");
                } else if ((getDari() == 1 && getKe() == 2) || (getDari() == 2 && getKe() == 1)) {
                    setJamTutuk("15.45");
                } else if ((getDari() == 3 && getKe() == 1) || (getDari() == 1 && getKe() == 3)) {
                    setJamTutuk("15.00");
                } else if ((getDari() == 4 && getKe() == 1) || (getDari() == 1 && getKe() == 4)) {
                    setJamTutuk("15.00");
                } else if ((getDari() == 2 && getKe() == 3) || (getDari() == 3 && getKe() == 2)) {
                    setJamTutuk("15.00");
                } else if ((getDari() == 2 && getKe() == 4) || (getDari() == 4 && getKe() == 2)) {
                    setJamTutuk("15.00");
                } else if ((getDari() == 3 && getKe() == 4) || (getDari() == 4 && getKe() == 3)) {
                    setJamTutuk("15.00");
                }
                break;
            default:
                if ((getDari() == 0 && getKe() == 1) || (getDari() == 1 && getKe() == 0)) {
                    setJamTutuk("20.30");
                } else if ((getDari() == 0 && getKe() == 2) || (getDari() == 2 && getKe() == 0)) {
                    setJamTutuk("20.00");
                } else if ((getDari() == 0 && getKe() == 3) || (getDari() == 3 && getKe() == 0)) {
                    setJamTutuk("20.30");
                } else if ((getDari() == 0 && getKe() == 4) || (getDari() == 4 && getKe() == 0)) {
                    setJamTutuk("20.30");
                } else if ((getDari() == 1 && getKe() == 2) || (getDari() == 2 && getKe() == 1)) {
                    setJamTutuk("20.45");
                } else if ((getDari() == 3 && getKe() == 1) || (getDari() == 1 && getKe() == 3)) {
                    setJamTutuk("20.00");
                } else if ((getDari() == 4 && getKe() == 1) || (getDari() == 1 && getKe() == 4)) {
                    setJamTutuk("20.00");
                } else if ((getDari() == 2 && getKe() == 3) || (getDari() == 3 && getKe() == 2)) {
                    setJamTutuk("20.00");
                } else if ((getDari() == 2 && getKe() == 4) || (getDari() == 4 && getKe() == 2)) {
                    setJamTutuk("20.00");
                } else if ((getDari() == 3 && getKe() == 4) || (getDari() == 4 && getKe() == 3)) {
                    setJamTutuk("20.00");
                }
                break;
        }

        this.jamBudal = jamBudal;
    }

    public void setJamBudal1(String jamBudal) {
        switch (jamBudal) {
            case "08.00":
                if ((getDari() == 0 && getKe() == 1) || (getDari() == 1 && getKe() == 0)) {
                    setJamTutuk("19.30");
                } else if ((getDari() == 0 && getKe() == 2) || (getDari() == 2 && getKe() == 0)) {
                    setJamTutuk("11.00");
                } else if ((getDari() == 0 && getKe() == 3) || (getDari() == 3 && getKe() == 0)) {
                    setJamTutuk("15.30");
                } else if ((getDari() == 0 && getKe() == 4) || (getDari() == 4 && getKe() == 0)) {
                    setJamTutuk("16.30");
                } else if ((getDari() == 1 && getKe() == 2) || (getDari() == 2 && getKe() == 1)) {
                    setJamTutuk("22.00");
                } else if ((getDari() == 3 && getKe() == 1) || (getDari() == 1 && getKe() == 3)) {
                    setJamTutuk("12.30");
                } else if ((getDari() == 4 && getKe() == 1) || (getDari() == 1 && getKe() == 4)) {
                    setJamTutuk("13.30");
                } else if ((getDari() == 2 && getKe() == 3) || (getDari() == 3 && getKe() == 2)) {
                    setJamTutuk("16.30");
                } else if ((getDari() == 2 && getKe() == 4) || (getDari() == 4 && getKe() == 2)) {
                    setJamTutuk("16.30");
                } else if ((getDari() == 3 && getKe() == 4) || (getDari() == 4 && getKe() == 3)) {
                    setJamTutuk("15.00");
                }

                break;
            case "14.00":
                if ((getDari() == 0 && getKe() == 1) || (getDari() == 1 && getKe() == 0)) {
                    setJamTutuk("01.30");
                    setPenambahanHari();
                } else if ((getDari() == 0 && getKe() == 2) || (getDari() == 2 && getKe() == 0)) {
                    setJamTutuk("17.00");
                } else if ((getDari() == 0 && getKe() == 3) || (getDari() == 3 && getKe() == 0)) {
                    setJamTutuk("21.30");
                } else if ((getDari() == 0 && getKe() == 4) || (getDari() == 4 && getKe() == 0)) {
                    setJamTutuk("22.30");
                } else if ((getDari() == 1 && getKe() == 2) || (getDari() == 2 && getKe() == 1)) {
                    setJamTutuk("04.00");
                    setPenambahanHari();
                } else if ((getDari() == 3 && getKe() == 1) || (getDari() == 1 && getKe() == 3)) {
                    setJamTutuk("18.30");
                } else if ((getDari() == 4 && getKe() == 1) || (getDari() == 1 && getKe() == 4)) {
                    setJamTutuk("19.30");
                } else if ((getDari() == 2 && getKe() == 3) || (getDari() == 3 && getKe() == 2)) {
                    setJamTutuk("22.30");
                } else if ((getDari() == 2 && getKe() == 4) || (getDari() == 4 && getKe() == 2)) {
                    setJamTutuk("22.30");
                } else if ((getDari() == 3 && getKe() == 4) || (getDari() == 4 && getKe() == 3)) {
                    setJamTutuk("21.00");
                }
                break;
            default:
                if ((getDari() == 0 && getKe() == 1) || (getDari() == 1 && getKe() == 0)) {
                    setJamTutuk("06.30");
                    setPenambahanHari();
                } else if ((getDari() == 0 && getKe() == 2) || (getDari() == 2 && getKe() == 0)) {
                    setJamTutuk("22.00");
                } else if ((getDari() == 0 && getKe() == 3) || (getDari() == 3 && getKe() == 0)) {
                    setJamTutuk("02.30");
                    setPenambahanHari();
                } else if ((getDari() == 0 && getKe() == 4) || (getDari() == 4 && getKe() == 0)) {
                    setJamTutuk("03.30");
                    setPenambahanHari();
                } else if ((getDari() == 1 && getKe() == 2) || (getDari() == 2 && getKe() == 1)) {
                    setJamTutuk("09.00");
                    setPenambahanHari();
                } else if ((getDari() == 3 && getKe() == 1) || (getDari() == 1 && getKe() == 3)) {
                    setJamTutuk("23.30");
                } else if ((getDari() == 4 && getKe() == 1) || (getDari() == 1 && getKe() == 4)) {
                    setJamTutuk("00.30");
                    setPenambahanHari();
                } else if ((getDari() == 2 && getKe() == 3) || (getDari() == 3 && getKe() == 2)) {
                    setJamTutuk("03.30");
                    setPenambahanHari();
                } else if ((getDari() == 2 && getKe() == 4) || (getDari() == 4 && getKe() == 2)) {
                    setJamTutuk("03.30");
                    setPenambahanHari();
                } else if ((getDari() == 3 && getKe() == 4) || (getDari() == 4 && getKe() == 3)) {
                    setJamTutuk("02.00");
                    setPenambahanHari();
                }
                break;
        }

        this.jamBudal = jamBudal;
    }

    public void setPenambahanHari() {
        switch (getTahun()) {
            case 2020:
                if (getBulan() == 2) {
                    if (getHari() == 29) {
                        setHari(1);
                        setBulan(getBulan() + 1);
                    } else {
                        setHari(getHari() + 1);
                    }
                } else if (getBulan() == 4 || getBulan() == 6 || getBulan() == 9 || getBulan() == 11) {
                    if (getHari() == 30) {
                        setHari(1);
                        setBulan(getBulan() + 1);
                    } else {
                        setHari(getHari() + 1);
                    }
                } else {
                    if (getHari() == 31) {
                        setHari(1);
                        setBulan(getBulan() + 1);
                    } else {
                        setHari(getHari() + 1);
                    }
                }
                break;
            case 2014:
                if (getBulan() == 2) {
                    if (getHari() == 29) {
                        setHari(1);
                        setBulan(getBulan() + 1);
                    } else {
                        setHari(getHari() + 1);
                    }
                } else if (getBulan() == 4 || getBulan() == 6 || getBulan() == 9 || getBulan() == 11) {
                    if (getHari() == 30) {
                        setHari(1);
                        setBulan(getBulan() + 1);
                    } else {
                        setHari(getHari() + 1);
                    }
                } else {
                    if (getHari() == 31) {
                        setHari(1);
                        setBulan(getBulan() + 1);
                    } else {
                        setHari(getHari() + 1);
                    }
                }
                break;
            default:
                if (getBulan() == 2) {
                    if (getHari() == 28) {
                        setHari(1);
                        setBulan(getBulan() + 1);
                    } else {
                        setHari(getHari() + 1);
                    }
                } else if (getBulan() == 4 || getBulan() == 6 || getBulan() == 9 || getBulan() == 11) {
                    if (getHari() == 30) {
                        setHari(1);
                        setBulan(getBulan() + 1);
                    } else {
                        setHari(getHari() + 1);
                    }
                } else {
                    if (getHari() == 31) {
                        setHari(1);
                        setBulan(getBulan() + 1);
                    } else {
                        setHari(getHari() + 1);
                    }
                }
        }
    }

    public String getJamTutuk() {
        return jamTutuk;
    }

    public void setJamTutuk(String jamTutuk) {
        this.jamTutuk = jamTutuk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNomorIdentitas() {
        return nomorIdentitas;
    }

    public void setNomorIdentitas(long nomorIdentitas) {
        this.nomorIdentitas = nomorIdentitas;
    }

    public long getNomorHP() {
        return nomorHP;
    }

    public void setNomorHP(long nomorHP) {
        this.nomorHP = nomorHP;
    }

    public int getDari() {
        return dari;
    }

    public void setDari(int dari) {
        this.dari = dari;
    }

    public int getKe() {
        return ke;
    }

    public void setKe(int ke) {
        this.ke = ke;
    }

    public int getHari() {
        return hari;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getHari1() {
        return hari1;
    }

    public void setHari1(int hari1) {
        this.hari1 = hari1;
    }

    public int getBulan1() {
        return bulan1;
    }

    public void setBulan1(int bulan1) {
        this.bulan1 = bulan1;
    }

    public int getTahun1() {
        return tahun1;
    }

    public void setTahun1(int tahun1) {
        this.tahun1 = tahun1;
    }

    public int getJmlorang() {
        return jmlorang;
    }

    public void setJmlorang(int jmlorang) {
        this.jmlorang = jmlorang;
    }

    public int getKursi() {
        return kursi;
    }

    public void setKursi(int kursi) {
        this.kursi = kursi;
    }

}
