package Assignment.Module4;

public class GarbageCollection {

        public static void main(String[] args) {

            GarbageCollection obj1 = new GarbageCollection();
            GarbageCollection obj2 = new GarbageCollection();

            obj1 = null;   // object eligible for garbage collection
            obj2 = null;

            System.gc();   // request JVM to run Garbage Collector

            System.out.println("Garbage Collection requested");
        }
    }

