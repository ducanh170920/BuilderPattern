import Component.*;


public class House {
    private Door door;
    private boolean has_garage;
    private Garden garden;
    private Roof roof;
    private Wall wall;
    private Window window;
    private String typeHouse;

    public House(Door door, boolean has_garage,Garden garden, Roof roof, Wall wall, Window window,String typeHouse) {
        this.door = door;
        this.has_garage = has_garage;
        this.garden = garden;
        this.roof = roof;
        this.wall = wall;
        this.window = window;
        this.typeHouse = typeHouse;
    }

    public Door getDoor() {
        return door;
    }

    public boolean isHas_garage() {
        return has_garage;
    }

    public Garden getGarden() {
        return garden;
    }

    public Roof getRoof() {
        return roof;
    }

    public Wall getWall() {
        return wall;
    }

    public Window getWindow() {
        return window;
    }
    public String TypeHouse(){
        return this.typeHouse;
    }

}
