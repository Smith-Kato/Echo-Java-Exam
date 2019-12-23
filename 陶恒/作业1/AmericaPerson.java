package practiseExtend;

public class AmericaPerson extends Person {
    double height = 176.0;
    double weight = 75.0;
    @Override
    public void averageHeight() {
        System.out.println("American's average height: " + this.height + "cm");
    }

    @Override
    public void averageWeight() {
        System.out.println("American's average weight: " + this.weight + "kg");
    }

    public void americaBoxing(){
        System.out.println("直拳、钩拳、组合拳");
    }
}
