package practiseExtend;

public class BeijingPerson extends ChinaPerson {
    @Override
    public void averageHeight() {
        double height = 172.5;
        System.out.println("北京人的平均身高:" + height + "cm");
    }

    @Override
    public void averageWeight() {
        double weight = 70;
        System.out.println("北京人的平均体重:" + weight + "公斤");
    }

    public void beijingOpera(){
        System.out.println("花脸、青衣、花旦和老生");
    }
}
