package jobsheet7.tugas.overriding;

public class Main {
    public static void main(String[] args) {
        Manusia louis;

        louis = new Dosen();
        louis.bernafas();
        louis.makan();

        louis = new Mahasiswa();
        louis.bernafas();
        louis.makan();
    }
}
