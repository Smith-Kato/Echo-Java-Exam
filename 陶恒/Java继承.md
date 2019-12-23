#### text

```java
public class Text {
    public static void main(String[] args) {
        ChinaPerson chinaPerson = new ChinaPerson();
        AmericaPerson americaPerson = new AmericaPerson();
        BeijingPerson beijingPerson = new BeijingPerson();

        chinaPerson.speakHell();
        System.out.println();
        chinaPerson.averageHeight();
        americaPerson.averageHeight();
        beijingPerson.averageHeight();
        System.out.println();
        chinaPerson.averageWeight();
        americaPerson.averageWeight();
        beijingPerson.averageWeight();
        System.out.println();
        chinaPerson.chinaGongfu();
        americaPerson.americaBoxing();
        beijingPerson.beijingOpera();
    }
}

```

#### Person

```java
public class Person {
    protected double height;
    protected double weight;

    public void speakHell(){
        System.out.println("您好！");
        System.out.println("How do you do？");
        System.out.println("您好！");
    }

    public void averageHeight(){

    }

    public void averageWeight(){

    }
}
```

#### ChinaPerson

```java
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
```



#### AmericaPerson

```java
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
```



#### BeijingPerson

```java
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
```

