public class InteiroSetTeste {
    public static void main(String[] args) {
        InteiroSet set1 = new InteiroSet();
        InteiroSet set2 = new InteiroSet();

        // Inserindo elementos
        set1.insereElemento(10);
        set1.insereElemento(20);
        set2.insereElemento(20);
        set2.insereElemento(30);

        // Exibindo conjuntos
        System.out.println("Set1: " + set1.toSetString());
        System.out.println("Set2: " + set2.toSetString());

        // União
        InteiroSet uniao = InteiroSet.union(set1, set2);
        System.out.println("União: " + uniao.toSetString());

        // Interseção
        InteiroSet intersec = InteiroSet.interseccao(set1, set2);
        System.out.println("Interseção: " + intersec.toSetString());

        // Comparação
        System.out.println("São iguais? " + set1.ehIgualTo(set2));

        // Removendo elemento e exibindo
        set1.deleteElemento(10);
        System.out.println("Set1 após remoção: " + set1.toSetString());
    }
}
