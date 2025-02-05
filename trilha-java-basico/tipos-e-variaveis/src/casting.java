public class casting {
    public static void main(String[] args) {
        short numeroCurto = 1;

        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // casting

        System.out.println(numeroCurto2);
    }
}
