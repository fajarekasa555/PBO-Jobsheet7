package jobsheet7.tugas.overriding;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan sambil memeriksa tugas mahasiswa");
    }

    public void lembur() {
        System.out.println("Dosen sering lembur menyiapkan materi kuliah");
    }
}
