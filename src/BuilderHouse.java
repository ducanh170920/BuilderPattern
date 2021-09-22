import Component.*;

public class BuilderHouse implements Builder{
    private House house;
    private Door door;
    private boolean has_garage;
    private Garden garden;
    private Roof roof;
    private Wall wall;
    private Window window;
    private String typeHouse;

    @Override
    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public void setHasGarage(Boolean hasGarage) {
        this.has_garage = hasGarage;
    }

    @Override
    public void setWindow(Window window) {
        this.window = window;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    @Override
    public void setGarden(Garden garden) {
        this.garden = garden;
    }

    @Override
    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public void setTypeHouse(String typeHouse) {
        this.typeHouse = typeHouse;
    }

    @Override
    public House getResult() {
        return new House(this.door,this.has_garage,this.garden,this.roof,this.wall,this.window,this.typeHouse);
    }
}
