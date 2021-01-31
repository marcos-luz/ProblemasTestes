public class BuscaBinaria {

  public int busca(int[] array, int chave) {
    int indiceEncontrado = -1;
    int posicaoAtual = 0;
    int tamanhoArray = array.length - 1;

    while(posicaoAtual <= tamanhoArray) {
      try {
        int meio = (posicaoAtual +tamanhoArray) / 2;

        if(array[meio] < chave) {
          posicaoAtual = meio + 1;
        }

        else if(array[meio] > chave) {
          tamanhoArray = meio - 1;
        }

        else if(array[meio] == chave) {
          indiceEncontrado = meio;
          break;
        }
      }

      catch (ArrayIndexOutOfBoundsException error) {
        break;
      }
    }
    return indiceEncontrado;
  }
}
