package CollectionsFrameworkSelf;

import java.lang.ref.WeakReference;

public class GarbageCollectorExample {

    public static void main(String[] args) {
        WeakReference<Phone> weakReference = new WeakReference<>(new Phone("Apple", "iPhone 18"));
        System.out.println(weakReference.get());
        System.gc();
        try {
            Thread.sleep(10000);
        } catch (Exception e){

        }
        System.out.println(weakReference.get());
//        System.gc();
    }
}

class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Student{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
