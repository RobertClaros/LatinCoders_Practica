public class Arquero extends Personaje {
    private int precisionAtaque;

    public Arquero(String nombre, int nivel, int puntosVida, int precisionAtaque) {
        super(nombre, nivel, puntosVida);
        this.precisionAtaque = precisionAtaque;
    }

    @Override
    public void atacar(Personaje objetivo) {

            System.out.println(nombre + " realiza un ataque certero contra " + objetivo.nombre);
            objetivo.recibirDanio(15);
        System.out.println("--------------------------------------------------");

    }
}
