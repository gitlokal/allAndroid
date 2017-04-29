package ui;

/**
 * Created by bartek on 30.07.16.
 */
public interface Observable {

    public void attach(Observer observer);

    public void detach(Observer observer);

    public void inform();
}
