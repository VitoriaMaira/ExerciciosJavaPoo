public class EmpregadoTeste {
    public static void main(String[] args) {
        // Criando dois empregados
        Empregado emp1 = new Empregado("João", "Silva", 2000);
        Empregado emp2 = new Empregado("Maria", "Souza", 3000);

        // Exibindo salários anuais
        System.out.println(emp1.getNome() + " " + emp1.getSobrenome() +
                " - Salário anual: R$ " + emp1.getSalarioAnual());
        System.out.println(emp2.getNome() + " " + emp2.getSobrenome() +
                " - Salário anual: R$ " + emp2.getSalarioAnual());

        // Aumento de 10%
        emp1.aplicarAumento(10);
        emp2.aplicarAumento(10);

        // Exibindo salários anuais após aumento
        System.out.println("\nApós aumento de 10%:");
        System.out.println(emp1.getNome() + " " + emp1.getSobrenome() +
                " - Salário anual: R$ " + emp1.getSalarioAnual());
        System.out.println(emp2.getNome() + " " + emp2.getSobrenome() +
                " - Salário anual: R$ " + emp2.getSalarioAnual());
    }
}
