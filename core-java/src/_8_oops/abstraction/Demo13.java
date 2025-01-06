package _8_oops.abstraction;

public class Demo13 {
    public static void main(String[] args) {

        @FunctionalInterface
        interface NumberProcessor {
            int process(int number);
        }

        //1. creating subclass of a functional interface using traditional way
        class NumberProcessorImpl implements NumberProcessor {
            @Override
            public int process(int number) {
                return number * number;
            }
        }

        NumberProcessor numberProcessor1 = new NumberProcessorImpl();
        System.out.println("traditional way "+numberProcessor1.process(10));

        //2. creating subclass of a functional interface using anonymous class
        NumberProcessor numberProcessor2 = new NumberProcessor() {
            @Override
            public int process(int number) {
                return number * number;
            }
        };
        System.out.println("anonymous class "+numberProcessor2.process(20));

        //3. creating subclass of a functional interface using Lambda expression
        NumberProcessor numberProcessor3 =  (number) -> {return number * number;};
        System.out.println("lambda Expression "+numberProcessor3.process(30));


    }
}
