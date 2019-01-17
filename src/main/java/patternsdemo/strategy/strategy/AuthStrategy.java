package patternsdemo.strategy.strategy;

public interface AuthStrategy {
    boolean checkLogin(String name, String password);
}
