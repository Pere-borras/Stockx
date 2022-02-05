package edu.poniperro.stockx.domain.item;
import java.util.List;

public interface Item {
    public int getBid();

    public int getAsk();

    public int getSale();

    public void add(Offer oferta);

    public void setBid(int puja);

    public void setAsk(int demanda);

    public void setSale(int venta);

    public List<Offer> offers();
}
