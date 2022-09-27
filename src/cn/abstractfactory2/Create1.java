package cn.abstractfactory2;

public class Create1 extends abstractFactoryCreate {
    @Override
    public Factory1 phone1() {
        return new Factory1();
    }

    @Override
    public Factory2 phone2() {
        return new Factory2();
    }
}
