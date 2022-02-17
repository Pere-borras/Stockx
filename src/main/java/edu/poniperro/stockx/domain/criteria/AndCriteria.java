package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria anotherCriteria;

    public AndCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> lista_anotherCriteria = new ArrayList<Offer>(anotherCriteria.checkCriteria(item));
        List<Offer> lista_criteria = new ArrayList<Offer>(criteria.checkCriteria(item));

        Stream<Offer> lista_filtrada = lista_anotherCriteria.
                stream().
                filter(o -> o.size().equals(lista_criteria.get(0).size()));

        return lista_filtrada.collect(Collectors.toList());
    }
}
