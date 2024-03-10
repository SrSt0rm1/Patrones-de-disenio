// Clase principal para probar las fábricas abstractas
public class Main {
    public static void main(String[] args) {
        // Usando la fábrica A
        AbstractFactory factoryA = new ConcreteFactoryA();
        Castle castleA = factoryA.createCastle();
        Tower towerA = factoryA.createTower();

        System.out.println("Factory A:");
        System.out.println(castleA);
        System.out.println(towerA);

        // Usando la fábrica B
        AbstractFactory factoryB = new ConcreteFactoryB();
        Castle castleB = factoryB.createCastle();
        Tower towerB = factoryB.createTower();

        System.out.println("\nFactory B:");
        System.out.println(castleB);
        System.out.println(towerB);
    }
}