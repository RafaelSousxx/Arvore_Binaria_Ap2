public class Main {
    public static void main(String[] args) {
        ArvoreBinariaDeBusca arvore = new ArvoreBinariaDeBusca();

        int[] valores = {2, 0, 4, 8}; // RA: 2404048 (sem repetições)

        for (int v : valores)
            arvore.inserir(v);

        System.out.println("===== ÁRVORE BINÁRIA DE BUSCA =====");
        System.out.println("RA: 2404048");
        System.out.println("Raiz: " + arvore.raiz.valor);
        System.out.print("Folhas (Nós sem filhos): ");
        arvore.exibirFolhas(arvore.raiz);
        System.out.println("\nAltura da Árvore: " + arvore.altura(arvore.raiz));

        System.out.print("\nPré-Ordem: ");
        arvore.preOrdem(arvore.raiz);
        System.out.print("\nEm Ordem: ");
        arvore.emOrdem(arvore.raiz);
        System.out.print("\nPós-Ordem: ");
        arvore.posOrdem(arvore.raiz);

        System.out.println("\n===================================");
    }
}
