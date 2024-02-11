public class ConstructorOverloading {
    int num;
    String name;
    String address;
    String City;

    public ConstructorOverloading() {
    }

    public ConstructorOverloading(int num) {
        this.num = num;
    }

    public ConstructorOverloading(String city) {
        City = city;
    }
}
