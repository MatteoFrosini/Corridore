public class Corridore extends Thread{
    protected String nome;
    protected int metri_percorsi;

    public Corridore(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        long tempoRun = System.currentTimeMillis();
        while (metri_percorsi <= 1000){
            metri_percorsi = metri_percorsi + (int)Math.floor((Math.random() * 100) + 1);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
        System.out.println(nome + " arrivato al traguardo in " + ((System.currentTimeMillis()) - tempoRun) + " millisecondi");
    }
}
