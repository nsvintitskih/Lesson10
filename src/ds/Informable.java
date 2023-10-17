package ds;

public interface Informable {
    default void info(){
        System.out.println("Info phone of Informable");
    }
}
