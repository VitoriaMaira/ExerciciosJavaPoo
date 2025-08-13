public class DataTeste {
    public static void main(String[] args) {
        // Criando um objeto Data
        Data data1 = new Data(8, 13, 2025);

        // Exibindo a data
        System.out.print("Data inicial: ");
        data1.displayData();

        // Alterando a data
        data1.setDia(1);
        data1.setMes(1);
        data1.setAno(2026);

        // Exibindo a nova data
        System.out.print("Nova data: ");
        data1.displayData();
    }
}
