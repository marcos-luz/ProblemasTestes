import static org.junit.Assert.assertEquals;
import org.junit.BeforeEach;
import org.junit.Test;

class BuscaBinariaTeste {

    private BuscaBinaria binaria;
    private int[] array;
    private int chave;

    @BeforeEach
    void setUp() {
        binaria = new BuscaBinaria();
    }

    // Array vazio
    @Test
    void arrayVazio1() {
        array = new int[]{};
        chave = 16;

        assertEquals(-1, binaria.busca(array, chave));
    }

    @Test
    void arrayVazio2() {
        array = new int[]{};
        chave = -2;

        assertEquals(-1, binaria.busca(array, chave));
    }

    @Test
    void arrayVazio3() {
        array = new int[]{};
        chave = 90;

        assertEquals(-1, binaria.busca(array, chave));
    }

    // Numero inexistente
    @Test
    void numeroInexistenteArray1() {
        array = new int[]{6};
        chave = 1;

        assertEquals(-1, binaria.busca(array, chave));
    }

    @Test
    void numeroInexistenteArray2() {
        array = new int[]{2, 6, 13, 23, 25, 39};
        chave = 0;

        assertEquals(-1, binaria.busca(array, chave));
    }

    @Test
    void numeroInexistenteArray3() {
        array = new int[]{1, 5, 10, 15, 18, 26, 28, 35, 45};
        chave = 60;

        assertEquals(-1, binaria.busca(array, chave));
    }

    //--------------------- Array Impar -----------------------/

    // Numero no inicio do array impar
    @Test
    void numeroExistenteInicioArrayImpar1() {
        array = new int[]{6, 16, 34, 35, 44};
        chave = 16;

        assertEquals(1, binaria.busca(array, chave));
    }

    @Test
    void numeroExistenteInicioArrayImpar2() {
        array = new int[]{1, 6, 13, 24, 35, 43, 56};
        chave = 1;

        assertEquals(0, binaria.busca(array, chave));
    }

    @Test
    void numeroExistentInicioArrayImpar3() {
        array = new int[]{1, 5, 10, 15, 18, 26, 28, 35, 45};
        chave = 15;

        assertEquals(3, binaria.busca(array, chave));
    }

    // Numero no fim do array impar
    @Test
    void numeroExistenteFimArrayImpar1() {
        array = new int[]{6, 16, 34, 35, 44};
        chave = 35;

        assertEquals(3, binaria.busca(array, chave));
    }

    @Test
    void numeroExistenteFimArrayImpar2() {
        array = new int[]{1, 6, 13, 24, 35, 43, 56};
        chave = 43;

        assertEquals(5, binaria.busca(array, chave));
    }

    @Test
    void numeroExistenteFimArrayImpar3() {
        array = new int[]{1, 5, 10, 15, 18, 26, 28, 35, 45};
        chave = 45;

        assertEquals(8, binaria.busca(array, chave));
    }

    // Numero no meio do array impar
    @Test
    void numeroExistenteMeioArrayImpar1() {
        array = new int[]{6, 16, 34, 35, 44};
        chave = 34;

        assertEquals(2, binaria.busca(array, chave));
    }

    @Test
    void numeroExistenteMeioArrayImpar2() {
        array = new int[]{1, 6, 13, 24, 35, 43, 56};
        chave = 24;

        assertEquals(3, binaria.busca(array, chave));
    }

    @Test
    void numeroExistenteMeioArrayImpar3() {
        array = new int[]{1, 5, 10, 15, 18, 26, 28, 35, 45};
        chave = 18;

        assertEquals(4, binaria.busca(array, chave));
    }

    // Numero negativo no array impar
    @Test
    void numerosNegativosArrayImpar1() {
        array = new int[]{-20, -12, -5, 14, 24};
        chave = -12;

        assertEquals(1, binaria.busca(array, chave));
    }

    @Test
    void numerosNegativosArrayImpar2() {
        array = new int[]{-32, -21, -12, -3, 25, 43, 56};
        chave = 25;

        assertEquals(4, binaria.busca(array, chave));
    }

    @Test
    void numerosNegativosArrayImpar3() {
        array = new int[]{-55, -51, -47, -39, -25, -18, -15, -9, -1};
        chave = -1;

        assertEquals(8, binaria.busca(array, chave));
    }

    //--------------------- Array Par -----------------------/

    // Numero no inicio do array par
    @Test
    void numeroExistenteInicioArrayPar1() {
        array = new int[]{4, 28, 34, 35};
        chave = 4;

        assertEquals(0, binaria.busca(array, chave));
    }

    @Test
    void numeroExistenteInicioArrayPar2() {
        array = new int[]{2, 6, 13, 23, 25, 39};
        chave = 13;

        assertEquals(2, binaria.busca(array, chave));
    }

    @Test
    void numeroExistenteInicioArrayPar3() {
        array = new int[]{9, 16, 23, 25, 39, 40, 46, 47};
        chave = 16;

        assertEquals(1, binaria.busca(array, chave));
    }

    // Numero no fim do array par
    @Test
    void numeroExistenteFimArrayPar1() {
        array = new int[]{4, 28, 34, 35};
        chave = 34;

        assertEquals(2, binaria.busca(array, chave));
    }

    @Test
    void numeroExistenteFimArrayPar2() {
        array = new int[]{2, 6, 13, 23, 25, 39};
        chave = 25;

        assertEquals(4, binaria.busca(array, chave));
    }

    @Test
    void numeroExistenteFimArrayPar3() {
        array = new int[]{9, 16, 23, 25, 39, 40, 46, 47};
        chave = 47;

        assertEquals(7, binaria.busca(array, chave));
    }

    // Numero negativo no array par
    @Test
    void numerosNegativosArrayPar1() {
        array = new int[]{-12, -2, 14, 35};
        chave = -2;

        assertEquals(1, binaria.busca(array, chave));
    }

    @Test
    void numerosNegativosArrayPar2() {
        array = new int[]{-17, -11, -6, -1, 25, 39};
        chave = 25;

        assertEquals(4, binaria.busca(array, chave));
    }

    @Test
    void numerosNegativosArrayPar3() {
        array = new int[]{-59, -51, -43, -38, -26, -23, -19, -2};
        chave = -38;

        assertEquals(3, binaria.busca(array, chave));
    }
}
