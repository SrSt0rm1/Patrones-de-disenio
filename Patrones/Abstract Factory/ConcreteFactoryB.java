/**
 * ConcreteFactoryB
 */
public class ConcreteFactoryB implements AbstractFactory {

    @Override

    public Castle createCastle(){
        return new ConcreteCastleB();
    }
    
    @Override
    public Tower createTower() {
        return new ConcreteTowerB();
    }
}