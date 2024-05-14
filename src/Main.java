import Comportamento.Acao;
import Comportamento.AcaoAgressiva;
import Comportamento.AcaoDefensiva;
import Comportamento.AcaoNormal;
import Personagens.Bardo;
import Personagens.Guerreiro;
import Personagens.Mago;

public class Main {
    public static void main(String[] args) {

        Acao acaoDefensiva = new AcaoDefensiva();
        Acao acaoAgressiva = new AcaoAgressiva();
        Acao acaoNormal = new AcaoNormal();

        Bardo bardo = new Bardo();
        bardo.setMovimento(acaoDefensiva);
        bardo.mover();
        bardo.Defender();

        Guerreiro guerreiro = new Guerreiro();
        guerreiro.Defender();
        guerreiro.setMovimento(acaoAgressiva);
        guerreiro.mover();
        guerreiro.Atacar();

        Mago mago = new Mago();
        mago.setMovimento(acaoAgressiva);
        mago.mover();
        mago.Atacar();
    }
}
