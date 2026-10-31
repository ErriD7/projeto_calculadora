package calculadora;


public class TesteCalculadora {

    
    private static int aprovados = 0;

  
    private static int reprovados = 0;

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        testar(calc, 7, 5, "+", 12);   
        testar(calc, 7, 5, "-", 2);    
        testar(calc, 7, 5, "*", 35);   
        testar(calc, 20, 4, "/", 5);   
        testar(calc, 9, 0, "/", 0);   
        testar(calc, 3, 3, "%", 0);    
        testar(calc, 3, 3, null, 0);   

        System.out.println("Resumo: " + aprovados + " OK | " + reprovados + " FALHOU");
    }

   
    static void testar(Calculadora calc, int a, int b, String op, int esperado) {
        int obtido = calc.calc(a, b, op);
        boolean passou = (obtido == esperado);

        if (passou) {
            aprovados++;
        } else {
            reprovados++;
        }

        System.out.println(a + " " + op + " " + b
                + " | esperado: " + esperado
                + " | obtido: " + obtido
                + " | " + (passou ? "OK" : "FALHOU"));
        System.out.println("---");
    }
}
