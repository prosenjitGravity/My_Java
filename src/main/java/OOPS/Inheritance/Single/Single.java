package OOPS.Inheritance.Single;

class Fahrenheit {
    private int c;

    Fahrenheit(int c) {
        this.c = c;
    }

    int ConvertCtoF() {
        return (int) (c * 1.8) + 32;
    }
}

class Celsius extends Fahrenheit {
    private int c;

    Celsius(int c) {
        super(c);
        this.c = c;
    }

    int ConvertFtoC() {
        return (int) ((c - 32) / 1.8);
    }
}

