public class Main {
    public static void main(String[] args) {
        Personaje guerrero = new Guerrero("Aragorn", 10, 100, 20);
        Personaje mago = new Mago("Gandalf", 10, 80, 50);
        Personaje arquero = new Arquero("Legolas", 10, 90, 70);

        guerrero.atacar(mago);
        ((Mago) mago).lanzarHechizo(guerrero);
        arquero.atacar(mago);
        ((Mago) mago).lanzarHechizo(arquero);
        guerrero.atacar(arquero);
        arquero.atacar(guerrero);
        arquero.atacar(guerrero);
        arquero.atacar(guerrero);
    }
}
