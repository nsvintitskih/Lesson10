package ds;

public abstract class Phone implements Callable, Informable{
    private String model;
    private int number;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void info();

    public abstract void receiveCall(String name);
}


