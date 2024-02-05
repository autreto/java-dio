public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Pedro";
        String segundoNome = "Autreto";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    // Metodo que retorna o nome completo formatado
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
