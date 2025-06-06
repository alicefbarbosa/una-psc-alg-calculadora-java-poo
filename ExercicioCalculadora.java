package Lista11;

import java.util.Scanner;
import java.lang.Math;

public class ExercicioCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ExercicioCalculadora.Calculadora calculadora = new ExercicioCalculadora.Calculadora();
        String opcao;
        double numeroUm;
        double numeroDois;

        System.out.println("### Calculadora Simples ###");

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("S - Soma");
            System.out.println("U - Subtração");
            System.out.println("M - Multiplicação");
            System.out.println("D - Divisão");
            System.out.println("P - Potência");
            System.out.println("R - Raiz Quadrada (do primeiro número)");
            System.out.println("Q - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextLine().toUpperCase();


            try {
                switch (opcao) {
                    case "S":
                        System.out.print("Digite o primeiro número: ");
                        numeroUm = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        numeroDois = scanner.nextDouble();
                        System.out.println("Resultado: " + calculadora.somar(numeroUm, numeroDois));
                        break;
                    case "U":
                        System.out.print("Digite o primeiro número: ");
                        numeroUm = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        numeroDois = scanner.nextDouble();
                        System.out.println("Resultado: " + calculadora.subtrair(numeroUm, numeroDois));
                        break;
                    case "M":
                        System.out.print("Digite o primeiro número: ");
                        numeroUm = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        numeroDois = scanner.nextDouble();
                        System.out.println("Resultado: " + calculadora.multiplicar(numeroUm, numeroDois));
                        break;
                    case "D":
                        System.out.print("Digite o primeiro número: ");
                        numeroUm = scanner.nextDouble();
                        System.out.print("Digite o segundo número: ");
                        numeroDois = scanner.nextDouble();
                        String resultadoDivisao = calculadora.dividir(numeroUm, numeroDois);
                        System.out.println("Resultado: " + resultadoDivisao);
                        break;
                    case "P":
                        System.out.print("Digite a base (primeiro número): ");
                        numeroUm = scanner.nextDouble();
                        System.out.print("Digite o expoente (segundo número): ");
                        numeroDois = scanner.nextDouble();
                        System.out.println("Resultado: " + calculadora.potencia(numeroUm, numeroDois));
                        break;
                    case "R":
                        System.out.print("Digite o número para calcular a raiz quadrada: ");
                        numeroUm = scanner.nextDouble();
                        String resultadoRaiz = calculadora.raizQuadrada(numeroUm);
                        System.out.println("Resultado: " + resultadoRaiz);
                        break;
                    case "Q":
                        System.out.println("Saindo da calculadora. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite apenas números para as operações.");

                scanner.nextLine();
            } finally {

                if (!opcao.equals("Q")) {
                    if (scanner.hasNextLine()) {
                         scanner.nextLine();
                    }
                }
            }

        } while (!opcao.equals("Q"));

        scanner.close();
    }


    public static class Calculadora {

        public double somar(double numeroUm, double numeroDois) {
            return numeroUm + numeroDois;
        }

        public double subtrair(double numeroUm, double numeroDois) {
            return numeroUm - numeroDois;
        }

        public double multiplicar(double numeroUm, double numeroDois) {
            return numeroUm * numeroDois;
        }

        public String dividir(double numeroUm, double numeroDois) {
            if (numeroDois == 0) {
                return "Impossível realizar uma divisão por zero.";
            } else {
                return String.valueOf(numeroUm / numeroDois);
            }
        }

        public double potencia(double base, double expoente) {

            return Math.pow(base, expoente);
        }

        public String raizQuadrada(double numeroUm) {
            if (numeroUm < 0) {
                return "Não existe raiz de número negativo.";
            } else {
                return String.valueOf(Math.sqrt(numeroUm));
            }
        }
    }
}