package buildingCompany.interfaces;

import java.util.List;

public interface IFindItem<T> {
    int Search(T item, List<T> times);
}
