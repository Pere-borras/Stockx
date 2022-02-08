package edu.poniperro.stockx.domain.item;

import java.util.ArrayList;
import java.util.Optional;

public class Ask implements Offer {
    private String size;
    private int ask;

    public Ask(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }

    /**@Override
    public int compareTo(Offer oferta) {
        Optional <Offer> valor =
        return oferta.compareTo(oferta.value());
    }*/

    @Override
    public int value() {
        return this.ask;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int compareTo(Offer ask) {
        if (this.ask > ask.value()) {
            return 1;
        }
        else if (this.ask > ask.value()){
            return 0;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "\t" + "\t" + this.size + "\t" + this.ask + "\n";
    }
}
