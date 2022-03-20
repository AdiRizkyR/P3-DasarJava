import static java.lang.Math.round;

public class _01_MembulatkanDesimalKeYangTerdekatMenggunakanFungsiRound {
    public static void main(String[] args) {
        double varDouble = 2.73;
        long roundResult = round(varDouble);
        System.out.printf("Pembulatan Round %.2f adalah %d\n", varDouble, roundResult);

        varDouble = 2.49;
        roundResult = round(varDouble);
        System.out.printf("Pembuatan floor %.2f adalah %d\n", varDouble, roundResult);
    }
}
