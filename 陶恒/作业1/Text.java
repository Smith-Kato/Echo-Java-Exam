package practiseExtend;

import practiseExtend.AmericaPerson;
import practiseExtend.BeijingPerson;
import practiseExtend.ChinaPerson;

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
