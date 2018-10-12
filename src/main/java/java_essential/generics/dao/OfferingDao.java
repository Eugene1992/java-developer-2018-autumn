package java_essential.generics.dao;

import java_essential.class_into_class.inner.Offering;

public interface OfferingDao extends GenericDao<Long, Offering> {
    Offering getByName(String name);
}
