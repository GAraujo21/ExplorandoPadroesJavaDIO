package Personagens;

import Comportamento.Acao;
import Comportamento.AcaoAgressiva;
import Comportamento.AcaoDefensiva;
import Comportamento.AcaoNormal;

public class Guerreiro {
    private int forca = 40;
    private int magia = 0;
    private int carisma = 2;
    private Acao movimento;

    public Guerreiro() {

    }

    public void mover(){
        movimento.mover();
    }

    public void Atacar(){
        if (movimento instanceof AcaoNormal){
            System.out.println("O guerreiro causou " + forca + " de dano ao inimigo!");
        }else if(movimento instanceof AcaoAgressiva){
            forca = forca * forca + 2;
            System.out.println("O guerreiro causou " + forca + " de dano ao inimigo!");
        }else if (movimento instanceof AcaoDefensiva){
            forca -= 2;
            System.out.println("O guerreiro causou " + forca + " de dano ao inimigo!");
        }else{
            System.out.println("O personagem precisa decidir qual será seu moviemento, antes de defender");
        }
    }

    public void Defender(){
        if (movimento instanceof AcaoNormal){
            System.out.println("O guerreiro conseguiu negar " + carisma + " de dano recebido!");
        }else if(movimento instanceof AcaoAgressiva){
            carisma -= 2;
            System.out.println("O guerreiro conseguiu negar " + carisma + " de dano recebido!");
        }else if (movimento instanceof AcaoDefensiva){
            carisma += 5;
            System.out.println("O guerreiro conseguiu negar " + carisma + " de dano recebido!");
        }else{
            System.out.println("O personagem precisa decidir qual será seu moviemento, antes de defender");
        }
    }

    public Guerreiro(int forca) {
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getMagia() {
        return magia;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public Acao getMovimento() {
        return movimento;
    }

    public void setMovimento(Acao movimento) {
        this.movimento = movimento;
    }

    public Guerreiro(int forca, int magia, int carisma, Acao movimento) {
        this.forca = forca;
        this.magia = magia;
        this.carisma = carisma;
        this.movimento = movimento;
    }
}
