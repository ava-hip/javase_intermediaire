package fr.dawan.comportement.observer;

public interface Subject<T> {
    void attach(Observer<T> observer);
    void detach(Observer<T> observer);
    // void notify(Observer<T> observer);
    void notify(T obj);
}
