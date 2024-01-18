package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"MARIA", "PAULO", "ANDRE", "JULIA", "JUNIOR", "FABIO"};

        int candidatoAtual = 0;
        int candidatosSelecionados = 0;
        double salarioBase = 200.0;
        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double valorPretendidio = valorPretendido();

            System.out.println("O candidato "+ candidato + " selecionol esse valor " + valorPretendidio);

            candidatosSelecionados++;
            candidatoAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0, 2500.0);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO");
        }else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDA RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
