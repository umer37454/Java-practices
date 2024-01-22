package practices.tutorials.InnerClasses;

public class OuterClass {
    static int outerField = 45;

    public static void main(String[] args) {
        System.out.println("Inner Class");

        OuterClass outer = new OuterClass();
        OuterClass.Inner inner = outer.new Inner();

        inner.innerClassMethod();

        OuterClass.NestedClass nested = new OuterClass.NestedClass();
        nested.nestedMethod(outerField);

        outer.outerMethod();
        outer.anonymousMethod();
    }

    // inner class
    public class Inner {
        OuterClass outer = new OuterClass();

        public void innerMethod() {
            System.out.println("Hello from Inner");
        }

        public void innerClassMethod() {
            System.out.println("Member Class");
        }
    }

    public static class NestedClass{
        public void nestedMethod(int number){
            System.out.println("Nested Class " + number);
        }
    }

    public void outerMethod(){
        class LocaleClass{
            public void localMethod(){
                System.out.println("Local inner class method");
            }
        }

        LocaleClass local = new LocaleClass();
        local.localMethod();
    }

    public void anonymousMethod() {
        class Anonymous {
            String name;
            int number;

            public Anonymous(String name, int number) {
                this.name = name;
                this.number = number;
            }

            @Override
            public String toString(){
                return this.name + this.number;
            }

            public void run() {
                System.out.println("Method will be overridden");
            }
        }

        Anonymous anonymous = new Anonymous("John", 42) {
            public void run (){
                System.out.println(this.name + " is running");
            }
        };

        anonymous.run();
    }
}
