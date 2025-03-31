package ListaJava;

public class ClassePrincipal {

    public static void temperatura() {
        Util.iniciarInput();

        float celsius = Util.lerFloat("Insira a temperatura em C°:");
        float fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("\nC° para F° = %.2f" + fahrenheit);
    }

    public static void salarioLiquido() {
        Util.iniciarInput();

        float salario = Util.lerFloat("Insira o salário bruto: ");

        float salarioL = salario - (salario * 0.085f);

        salarioL -= salarioL * 0.266f;

        Util.print("Salário Líquido: " + salarioL + "\nSalário Bruto: " + salario);
    }

    public static void brecho() {
        Util.iniciarInput();

        float valorP = Util.lerFloat("Insira o valor do Produto:");
        float valorV;

        if (valorP < 50) {
            valorV = valorP * 1.45f;
        } else {
            valorV = valorP * 1.3f;
        }
        Util.print("O valor de venda do produto é: " + valorV);
    }

    public static void fidelidade() {
        Util.iniciarInput();

        int livros = Util.lerInt("Insira a quantia de livros comprados:");

        while (livros < 0) {
            livros = Util.lerInt("Insira um número válido:");
        }

        int pontos;

        switch (livros) {
            case 0:
                pontos = 0;
            case 1:
                pontos = 5;
            case 2:
                pontos = 15;
            case 3:
                pontos = 30;
            default:
                pontos = 60;
        }

        Util.print("A sua pontuação é: " + pontos);
    }

    public static void calculadora() {
        Util.iniciarInput();

        int resposta = 1;

        Util.print("-----Calculadora-----");

        while (resposta == 1) {

            float n = Util.lerFloat("\nInsira um valor:");
            float n2 = Util.lerFloat("Insira outro valor:");

            Util.print("\nSelecione a operação:");
            Util.print("1 - Soma (+)\n2 - Subtração (-)\n3 - Multiplicação (*)\n4 - Divisão (/)\n5 - Encerrar");

            int operacao = Util.lerInt("");

            float resultado = 0;

            switch (operacao) {
                case 1:
                    resultado = n + n2;
                    break;
                case 2:
                    resultado = n - n2;
                    break;
                case 3:
                    resultado = n * n2;
                    break;
                case 4:
                    resultado = n / n2;
                    break;
                case 5:
                    resposta = 0;
                    break;
                default:
                Util.print("Insira uma operação válida.");
            }

            if (operacao >= 1 && operacao <= 4) {
                Util.print("Resultado: " + resultado);
            }
        }
    }

    public static void inss() {
        Util.iniciarInput();

        float salario = Util.lerFloat("Insira o salário:");

        if (salario > 600) {
            if (salario <= 1200) {
                salario -= salario * 0.2f;
            } else if (salario <= 2000) {
                salario -= salario * 0.25f;
            } else {
                salario -= salario * 0.3f;
            }
        }

        System.out.printf("\nO salário com desconto do INSS é R$%.2f" + salario);
    }

    public static void idade() {
        Util.iniciarInput();

        int idade = Util.lerInt("Insira sua idade:");

        if (idade > 65) {
            Util.print("Você é idoso");
        } else if (idade < 18) {
            Util.print("Você é menor de idade");
        } else {
            Util.print("Você é maior de idade");
        }
    }

    public static void eleitor() {
        Util.iniciarInput();

        int nascimento = Util.lerInt("Insira seu ano de nascimento:");
        int ano = Util.lerInt("Insira o ano atual:");
        int idade = ano - nascimento;

        if (idade < ano) {
            if (idade < 16) {
                Util.print("Você não é eleitor");
            } else if (idade < 18 || idade > 65) {
                Util.print("Você é eleitor facultativo");
            } else {
                Util.print("Você é eleitor obrigatório");
            }
        } else {
            Util.print("Data de nascimento inválida");
        }
    }

    public static void planoSaude() {
        Util.iniciarInput();

        String nome = Util.lerString("Insira seu nome:");
        int idade = Util.lerInt("Insira sua idade:");

        int valor;

        if (idade <= 10) {
            valor = 30;
        } else if (idade <= 29) {
            valor = 60;
        } else if (idade <= 45) {
            valor = 120;
        } else if (idade <= 59) {
            valor = 150;
        } else if (idade <= 65) {
            valor = 250;
        } else {
            valor = 400;
        }

        Util.print(nome + ", você deve pagar R$" + valor + " pelo plano de saúde");
    }

    public static void notas() {
        Util.iniciarInput();

        int soma = 0;
        int resposta = 1;

        do {
            soma += Util.lerInt("Insira a nota:");
            resposta = Util.lerInt("Deseja adicionar outra nota? Digite 1 (sim) ou 2 (não):");
        } while (resposta == 1);

        Util.print("Somatório das notas: " + soma);
    }

    public static void tabuada() {
        Util.iniciarInput();

        int n = Util.lerInt("Digite um numero para formar sua tabuada:");

        for (int x = 1; x <= 10; x++) {
            Util.print(n + "x" + x + " = " + x * n);
        }
    }

    public static void somaSucessiva() {
        Util.iniciarInput();

        int mult = 0;
        int x = 1;

        int n = Util.lerInt("Digite um numero: ");
        int n2 = Util.lerInt("Digite outro numero: ");

        while (x <= n) {
            mult += n2;
            x++;
        }

        Util.print("Resultado da multiplicação: " + mult);
    }

    public static void somaDivPor4Menor200() {

        int soma = 0;
        int x = 1;

        while (x < 200) {
            if (x % 4 == 0) {
                soma += x;
            }
            x++;
        }

        Util.print("Resultado da soma dos numeros inteiros divisiveis por 4 menores que 200: " + soma);
    }

    public static void fatorial() {
        Util.iniciarInput();

        int fat = 1;
        int x = 1;

        int n = Util.lerInt("Insira um numero para ser calculado o fatorial:");

        while (x <= n) {
            fat *= x;
            x++;

        }

        Util.print("Resultado do fatorial: " + fat);
    }

    public static void fibonacci() {
        Util.iniciarInput();

        int ant = 0;
        int at = 1;
        int prox = ant + at;

        int n = Util.lerInt("insira o enésimo valor da serie de fibonacci:");

        for (int x = 1; x < n; x++) {
            ant = at;
            at = prox;
            prox = ant + at;
        }

        Util.print("Resultado : " + at);
    }

    public static void mediaMaiorMenor() {
        Util.iniciarInput();

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        int resposta;

        do {
            int media = 0;

            media += Util.lerInt("insira a primeira nota do aluno:");
            media += Util.lerInt("insira a segunda nota do aluno:");
            media /= 2;

            Util.print("Média do aluno: " + media);

            if (media <= menor) {
                menor = media;
            }

            if (media >= maior) {
                maior = media;
            }

            resposta = Util.lerInt("Deseja continuar ? sim (1) não (2)");

        } while (resposta == 1);

        Util.print("A maior média foi : " + maior);
        Util.print("A menor média foi : " + menor);
    }

    public static void main(String[] args) {
        Util.iniciarInput();

        Util.print("Selecione o algoritmo a ser executado:");
        Util.print("\nDigite:\n");
        Util.print("Celsius para Fahrenheit --- (1)\n "
                + "Calcular salário líquido --- (2)\n"
                + "Preço de venda de produto do brechó --- (3)\n"
                + "Pontos de fidelidade da livraria --- (4)\n"
                + "Calculadora --- (5)\n"
                + "Desconto do INSS --- (6)\n"
                + "Maior idade ou idoso --- (7)\n"
                + "Eleitor facultativo ou obrigatório --- (8)\n"
                + "Custo do plano de saúde --- (9)\n"
                + "Somatório de notas --- (10)\n"
                + "Tabuada --- (11)\n"
                + "Soma sucessiva de dois números --- (12)\n"
                + "Soma dos numeros inteiros divisiveis por 4 menores que 200 --- (13)\n"
                + "Fatorial --- (14)\n"
                + "Fibonacci --- (15)\n"
                + "Menor e maior média dos alunos --- (16)\n");

        int resposta = Util.lerInt("");

        switch (resposta) {
            case 1:
                temperatura();
                break;
            case 2:
                salarioLiquido();
                break;
            case 3:
                brecho();
                break;
            case 4:
                fidelidade();
                break;
            case 5:
                calculadora();
                break;
            case 6:
                inss();
                break;
            case 7:
                idade();
                break;
            case 8:
                eleitor();
                break;
            case 9:
                planoSaude();
                break;
            case 10:
                notas();
                break;
            case 11:
                tabuada();
                break;
            case 12:
                somaSucessiva();
                break;
            case 13:
                somaDivPor4Menor200();
                break;
            case 14:
                fatorial();
                break;
            case 15:
                fibonacci();
                break;
            case 16:
                mediaMaiorMenor();
                break;
            default:
                resposta = Util.lerInt("Insira uma opção válida");
                break;
        }

        Util.fecharInput();
    }
}
