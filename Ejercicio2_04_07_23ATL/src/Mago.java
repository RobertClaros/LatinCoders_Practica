public class Mago extends Personaje {
    private int puntosMana;

    public Mago(String nombre, int nivel, int puntosVida, int puntosMana) {
        super(nombre, nivel, puntosVida);
        this.puntosMana = puntosMana;
    }

    @Override
    public void atacar(Personaje objetivo) {
        System.out.println(nombre + " ataca a " + objetivo.nombre);
        objetivo.recibirDanio(10); // Ataque básico: reduce 10 puntos de vida al objetivo
    }

    public void lanzarHechizo(Personaje objetivo) {
        if (puntosMana >= 20) {
            System.out.println(nombre + " lanza un hechizo  contra " + objetivo.nombre);
            objetivo.recibirDanio(30);
            puntosMana -= 20;
            System.out.println("Puntos de mana restantes: " + puntosMana);
        } else {
            System.out.println("No hay suficiente mana para lanzar un hechizo.");
        }
        System.out.println("--------------------------------------------------");
    }
}
