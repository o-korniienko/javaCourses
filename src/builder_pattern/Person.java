package builder_pattern;

import java.util.StringJoiner;

public class Person {
    private String a;
    private double b;
    private int c;
    private boolean d;
    private char e;

    private Person() {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public static class Builder {
        private Person tmp;

        public Builder() {
            this.tmp = new Person();
        }

        public Builder setA(String a) {
            tmp.a = a;
            return this;
        }

        public Builder setB(double b) {
            tmp.b = b;
            return this;
        }

        public Builder setC(int c) {
            tmp.c = c;
            return this;
        }

        public Builder setD(boolean d) {
            tmp.d = d;
            return this;
        }

        public Builder setE(char e) {
            tmp.e = e;
            return this;
        }

        public Person build() {
            return tmp;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("a='" + a + "'")
                .add("b=" + b)
                .add("c=" + c)
                .add("d=" + d)
                .add("e=" + e)
                .toString();
    }
}
