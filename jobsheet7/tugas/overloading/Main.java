package jobsheet7.tugas.overloading;

public class Main {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Total sudut (1 parameter): " + s.totalSudut(60));
        System.out.println("Total sudut (2 parameter): " + s.totalSudut(60, 70));
        System.out.println("Keliling (3 sisi): " + s.keliling(3, 4, 5));
        System.out.println("Sisi miring (2 sisi): " + s.keliling(3, 4));
    }
}
