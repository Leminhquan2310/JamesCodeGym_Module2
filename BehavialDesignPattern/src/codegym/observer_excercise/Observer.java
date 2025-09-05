package codegym.observer_excercise;

import codegym.observer_excercise.Subject;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
