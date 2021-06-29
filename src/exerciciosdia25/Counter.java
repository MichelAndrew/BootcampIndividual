package exerciciosdia25;

public class Counter {
    private int atual;

    public Counter(Counter copy) {
        setAtual(copy.getAtual());
    }

    public Counter() {
        atual = 0;
    }

    public Counter(int atual) {
        this.atual = atual;
    }

    public void add() {
        atual++;
    }

    public void add(int quantidade) {
        atual += quantidade;
    }

    public void subtract(int quantidade) {
        atual -= quantidade;
    }

    public void subtract() {
        atual--;
    }

    public int getAtual() {
        return atual;
    }

    public void setAtual(int atual) {
        this.atual = atual;
    }
}
