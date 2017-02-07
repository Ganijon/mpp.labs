package lesson10.lab.practice;

import java.util.logging.Level;
import java.util.logging.Logger;

class GenericClass<T> {
    T value;

    public static void main(String[] args) {
/*        GenericClass<Float> floatClass = new GenericClass<>(0.67f);
        Float f = floatClass.getValue();
        floatClass.setValue(7.0F);
*/
        GenericClass<Double> doubleClass = new GenericClass<>(3.14);
        Double d = doubleClass.getValue();
        doubleClass.setValue(7.0);

        GenericClass<String> stringClass = new GenericClass<>("Hello");
        String s = stringClass.getValue();
        stringClass.setValue("Hi");

    }

    public GenericClass(T value) {
        this.value = value;
    }

    public T getValue() {
        if (value == null) {
            try {
                Class<T> klass = (Class<T>) value.getClass();
                value = klass.newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(GenericClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return value;
    }

    public void setValue(T t) {
        value = t;
    }
}
