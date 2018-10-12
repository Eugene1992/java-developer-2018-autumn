package java_essential.generics.dao;

public interface GenericDao<ID extends Number, T> {
    T create(T user);

    T update(T user);

    T read(ID id);

    void delete(ID id);
}
