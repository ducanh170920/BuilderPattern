import Component.*;

public interface Builder {
    void setTypeHouse(String typeHouse);
    void setDoor(Door door);
    void setHasGarage(Boolean hasGarage);
    void setWindow(Window window);
    void setRoof(Roof roof);
    void setGarden(Garden garden);
    void setWall(Wall wall);
    House getResult();
}
