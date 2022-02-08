package edu.poniperro.stockx.domain.criteria;

import edu.poniperro.stockx.domain.item.Item;
import edu.poniperro.stockx.domain.item.Offer;
import edu.poniperro.stockx.domain.item.Sale;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {
    private Criteria criteria;
    private Criteria anotherCriteria;

    public AndCriteria(Criteria size, Criteria sales) {
        this.criteria = size;
        this.anotherCriteria = sales;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        ArrayList<Offer> lista_anotherCriteria = new ArrayList<Offer>(anotherCriteria.checkCriteria(item));
        ArrayList<Offer> lista_criteria = new ArrayList<Offer>(criteria.checkCriteria(item));
        ArrayList<Offer> lista_filtrada = new ArrayList<Offer>();

        int index = 0;
        for (Offer oferta : lista_anotherCriteria) {
            if (oferta.size() == lista_criteria.get(index).size()) {
                lista_filtrada.add(oferta);
            }
            index++;
        }

        return lista_filtrada;
    }
}
