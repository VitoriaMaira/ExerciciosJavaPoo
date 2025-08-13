public class InteiroSet {
    private boolean[] conjunto;

    // Construtor - conjunto vazio
    public InteiroSet() {
        conjunto = new boolean[101]; // índices de 0 a 100
    }

    // Insere elemento
    public void insereElemento(int k) {
        if (k >= 0 && k <= 100) {
            conjunto[k] = true;
        }
    }

    // Remove elemento
    public void deleteElemento(int m) {
        if (m >= 0 && m <= 100) {
            conjunto[m] = false;
        }
    }

    // União de dois conjuntos
    public static InteiroSet union(InteiroSet a, InteiroSet b) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            resultado.conjunto[i] = a.conjunto[i] || b.conjunto[i];
        }
        return resultado;
    }

    // Interseção de dois conjuntos
    public static InteiroSet interseccao(InteiroSet a, InteiroSet b) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i <= 100; i++) {
            resultado.conjunto[i] = a.conjunto[i] && b.conjunto[i];
        }
        return resultado;
    }

    // Converte conjunto para String
    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean vazio = true;
        for (int i = 0; i <= 100; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
                vazio = false;
            }
        }
        return vazio ? "-" : sb.toString();
    }

    // Verifica se dois conjuntos são iguais
    public boolean ehIgualTo(InteiroSet outro) {
        for (int i = 0; i <= 100; i++) {
            if (this.conjunto[i] != outro.conjunto[i]) {
                return false;
            }
        }
        return true;
    }
}
