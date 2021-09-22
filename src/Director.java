import Component.*;

public class Director {

    public void ConstructModernHouse(Builder builder){
        builder.setDoor(new Door(2,"red"));
        builder.setWall(new Wall(4,"Ion"));
        builder.setHasGarage(true);
        builder.setRoof(new Roof("cement"));
        builder.setWindow(new Window(4));
        builder.setGarden(new Garden());
        builder.setTypeHouse("Modern House");
    }
    public void ConstructTraditionalHouse(Builder builder){
        builder.setDoor(new Door(1,"brown"));
        builder.setWall(new Wall(2,"Tree"));
        builder.setRoof(new Roof("straw"));
        builder.setWindow(new Window(2));
        builder.setGarden(new Garden());
        builder.setTypeHouse("Traditional House");
    }
}
