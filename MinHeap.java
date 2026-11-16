public class MinHeap {

    int[] heap;
    int tamanho;

    // cria a heap com o tamanho escolhido
    public MinHeap(int capacidade) {
        this.heap = new int[capacidade];
        this.tamanho = 0;
    }

    // inserir valores
    public void inserir(int valor) {

        // ver se tem espaço
        if (tamanho == heap.length){
            System.out.println("Heap cheia!");
            return;
        }

        // coloca na ultima posição
        heap[tamanho] = valor;
        tamanho++;

        int indice = tamanho - 1;
        int pai = (indice - 1) / 2;
        int auxiliar;

        // compara com o pai e troca de lugar
        while (indice > 0 && heap[indice] < heap[pai]){
            auxiliar = heap[indice];
            heap[indice] = heap[pai];
            heap[pai] = auxiliar;

            indice = pai;
            pai = (indice - 1) / 2;
        }
    }

    public void mostrar() {

        for (int i = 0; i < tamanho; i++) {
            System.out.print(heap[i] + " ");
        }

        System.out.println();
    }


    // remove o menor (raiz da Min-Heap)
    public void remover() {

        // ve se ta vazio
        if (tamanho == 0) {
            System.out.println("Heap vazia!");
            return;
        }

        int removido = heap[0];

        // coloca o ultimo no primeiro
        heap[0] = heap[tamanho - 1];
        tamanho--;

        int indice = 0;
        int filho_esquerdo;
        int filho_direito;
        int menor;
        int auxiliar;

        // reorganiza verificando se um é menor que o outro
        while (true) {
            filho_esquerdo = 2 * indice + 1;
            filho_direito = 2 * indice + 2;
            menor = indice;

            if (filho_esquerdo < tamanho &&
                    heap[filho_esquerdo] < heap[menor]) {
                menor = filho_esquerdo;
            }

            if (filho_direito < tamanho &&
                    heap[filho_direito] < heap[menor]) {
                menor = filho_direito;
            }

            if (menor == indice) {
                break;
            }

            auxiliar = heap[indice];
            heap[indice] = heap[menor];
            heap[menor] = auxiliar;

            indice = menor;
        }

        System.out.println("Removido: " + removido);
    }
}