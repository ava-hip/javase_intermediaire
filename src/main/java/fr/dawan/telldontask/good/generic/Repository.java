package fr.dawan.telldontask.good.generic;

public interface Repository<T, ID> {
    T findById(ID id);
    void save(T t);
}
