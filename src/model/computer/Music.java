package model.computer;

public interface Music {
    //pola -stan
    //metody - zachowanie

    //1. Nie można dodawać pól obiektu
    //2. Można tworzyć tylko stałe - domyślnie public static final
    String NAME = "Music";

    //3. Tylko metody abstrakcyjne - domyślnie public abstract

    void playMusic();

    void pauseMusic();

    void stopMusic();

    //od JAVA 8

    //4. Metody domyslne - zwykłe metody
    default void sayHallo() {
        System.out.println("Hello from default music");
    }

    //5. Metody statyczne
    static String getName() {
        privateMethod();
        return NAME;
    }

    //Prywatne statyczne metody
    private static void privateMethod() {
        System.out.println("Hello from private method");
    }
}
