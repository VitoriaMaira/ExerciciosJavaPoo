public class FaturaTeste {
    public static void main(String[] args) {

        Fatura f1 = new Fatura("001", "Mouse sem fio", 2, 50.0);


        System.out.println("Número da fatura: " + f1.getNumero());
        System.out.println("Descrição: " + f1.getDescricao());
        System.out.println("Quantidade: " + f1.getQuantidade());
        System.out.println("Preço por item: R$ " + f1.getPrecoPorItem());
        System.out.println("Total da fatura: R$ " + f1.getTotalFatura());
    }
}
