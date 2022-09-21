public class Frase2x {
        public static void main(String[] args) {
            int tamanho, p, i;
            String frase = new String("EU NAO SEI JAVA");
            String frase2x = "";

            tamanho = frase.length();
            p = 0;

            for (i = 0; i < tamanho; i++) {
                if (frase.charAt(i) == ' ') {
                    frase2x = frase2x + frase.substring(p, i+1) + frase.substring(p, i+1);
                    p = i+1;
                }
            }
            frase2x = frase2x + frase.substring(p,tamanho) + " " + frase.substring(p, tamanho);
            System.out.println(frase2x);

        }
}
