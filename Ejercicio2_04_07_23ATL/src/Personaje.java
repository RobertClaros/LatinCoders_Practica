public abstract class Personaje {
    protected String nombre;
    protected int nivel;
    protected int puntosVida;

    public Personaje(String nombre, int nivel, int puntosVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosVida = puntosVida;
    }

    public abstract void atacar(Personaje objetivo);

    public void recibirDanio(int cantidad) {
        puntosVida -= cantidad;
        if (puntosVida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        } else {
            System.out.println(nombre + " ha recibido " + cantidad + " puntos de daño.");
            System.out.println("Puntos de vida restantes: " + puntosVida);
        }
    }

    public void curarse(int cantidad) {
        puntosVida += cantidad;
        System.out.println(nombre + " se ha curado " + cantidad + " puntos de vida.");
        System.out.println("Puntos de vida restantes: " + puntosVida);
    }
}
