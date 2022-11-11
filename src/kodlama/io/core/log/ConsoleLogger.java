package kodlama.io.core.log;

public class ConsoleLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Konsola loglandı: " +data);
    }
}
