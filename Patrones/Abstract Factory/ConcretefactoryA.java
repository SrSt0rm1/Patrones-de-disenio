
// Implementación de la fábrica concreta A
class ConcreteFactoryA implements AbstractFactory {
    @Override
    public Castle createCastle() {
        return new ConcreteCastleA();
    }

    @Override
    public Tower createTower() {
        return new ConcreteTowerA();
    }
}