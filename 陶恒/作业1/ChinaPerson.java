package practiseExtend;

public class ChinaPerson extends Person {

    @Override
    public void averageWeight() {
        double weight = 65.0;
        System.out.println("中国人的平均体重为：" + weight + "公斤");
    }

    @Override
    public void averageHeight() {
        double height = 168.78;
        System.out.println("中国人的平均升高为：" + height + "厘米");
    }

    public void chinaGongfu(){
        System.out.println("坐如钟,站如松,睡如弓");
    }
}
