public class Guerrero extends Personaje {
    private int golpe;

    public Guerrero(String nombre, int nivel, int puntosVida, int fuerzaAtaque) {
        super(nombre, nivel, puntosVida);
        this.golpe = fuerzaAtaque;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " realiza un ataque poderoso contra " + objetivo.nombre);
        objetivo.recibirDanio(golpe * 2);
        System.out.println("--------------------------------------------------");
    }
}
