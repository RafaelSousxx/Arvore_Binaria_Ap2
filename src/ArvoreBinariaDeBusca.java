public class ArvoreBinariaDeBusca {
    No raiz;

    // Inserção normal em uma BST (sem duplicados)
    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private No inserirRec(No atual, int valor) {
        if (atual == null) return new No(valor);

        if (valor < atual.valor)
            atual.esquerda = inserirRec(atual.esquerda, valor);
        else if (valor > atual.valor)
            atual.direita = inserirRec(atual.direita, valor);

        return atual;
    }

    // Percurso Pré-Ordem (raiz → esquerda → direita)
    public void preOrdem(No atual) {
        if (atual != null) {
            System.out.print(atual.valor + " ");
            preOrdem(atual.esquerda);
            preOrdem(atual.direita);
        }
    }

    // Percurso Em Ordem (esquerda → raiz → direita)
    public void emOrdem(No atual) {
        if (atual != null) {
            emOrdem(atual.esquerda);
            System.out.print(atual.valor + " ");
            emOrdem(atual.direita);
        }
    }

    // Percurso Pós-Ordem (esquerda → direita → raiz)
    public void posOrdem(No atual) {
        if (atual != null) {
            posOrdem(atual.esquerda);
            posOrdem(atual.direita);
            System.out.print(atual.valor + " ");
        }
    }

    // Exibir folhas
    public void exibirFolhas(No atual) {
        if (atual != null) {
            if (atual.esquerda == null && atual.direita == null)
                System.out.print(atual.valor + " ");
            exibirFolhas(atual.esquerda);
            exibirFolhas(atual.direita);
        }
    }

    // Calcular altura
    public int altura(No atual) {
        if (atual == null) return 0;
        return 1 + Math.max(altura(atual.esquerda), altura(atual.direita));
    }
}
