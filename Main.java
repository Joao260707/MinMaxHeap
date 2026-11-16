public class Main {
    public static void main(String[] args) {

        System.out.println("|Teste Max-Heap |");
        MaxHeap minhaMaxHeap = new MaxHeap(10);

        minhaMaxHeap.inserir(10);
        minhaMaxHeap.inserir(20);
        minhaMaxHeap.inserir(30);
        minhaMaxHeap.inserir(40);
        minhaMaxHeap.inserir(15);

        System.out.println("Antes:");
        minhaMaxHeap.mostrar();

        minhaMaxHeap.remover(); // Remove o maior valor (40)

        System.out.println("Depois:");
        minhaMaxHeap.mostrar();

        System.out.println("\n| Testando Min-Heap |");
        MinHeap minhaMinHeap = new MinHeap(10);

        minhaMinHeap.inserir(10);
        minhaMinHeap.inserir(20);
        minhaMinHeap.inserir(30);
        minhaMinHeap.inserir(40);
        minhaMinHeap.inserir(15);

        System.out.println("Antes:");
        minhaMinHeap.mostrar();

        minhaMinHeap.remover(); // Remove o menor valor (10)

        System.out.println("Depois:");
        minhaMinHeap.mostrar();
    }
}