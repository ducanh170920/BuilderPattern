public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        BuilderHouse builder = new BuilderHouse();
        director.ConstructModernHouse(builder);

        House house = builder.getResult();
        System.out.println(house.TypeHouse());

    }
}
