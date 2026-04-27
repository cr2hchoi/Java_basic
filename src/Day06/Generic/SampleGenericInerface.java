package Day06.Generic;




    interface ISample<T> {
        public void addElement(T t, int index);
        public T getElement(int index);
    }

    class Sample1<T> implements ISample<T> {
        private T[] array;

        public Sample1() {
            array = (T[]) new Object[10];
        }

        @Override
        public void addElement(T element, int index) {
            array[index] = element;
        }

        @Override
        public T getElement(int index) {
            return array[index];
        }
    }

public class  SampleGenericInerface {
    public static void main(String[] args) {
        Sample1<String> sample = new Sample1<>();
        sample.addElement("This is string", 5);
        sample.getElement(5);
    }
}