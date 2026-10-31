package calculadora;
public class Calculadora {

   
    private static final String SOMA = "+";

    private static final String SUBTRACAO = "-";

  
    private static final String MULTIPLICACAO = "*";

    private static final String DIVISAO = "/";

    private static final int RESULTADO_PADRAO = 0;


    public int calc(int a, int b, String op) {
        
        if (op == null) {
            System.out.println("Operacao invalida! Nenhum operador informado");
            return RESULTADO_PADRAO;
        }

        switch (op) {
            case SOMA:
                return somar(a, b);
            case SUBTRACAO:
                return subtrair(a, b);
            case MULTIPLICACAO:
                return multiplicar(a, b);
            case DIVISAO:
                return dividir(a, b);
            default:
                System.out.println("Operacao invalida: '" + op + "'");
                return RESULTADO_PADRAO;
        }
    }

    
    private int somar(int a, int b) {
        return a + b;
    }

  
    private int subtrair(int a, int b) {
        return a - b;
    }

    
    private int multiplicar(int a, int b) {
        return a * b;
    }

   
    private int dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro! nao e possivel dividir por zero");
            return RESULTADO_PADRAO;
        }
        return a / b;
    }
}
