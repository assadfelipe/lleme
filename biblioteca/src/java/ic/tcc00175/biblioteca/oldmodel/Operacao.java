/* Generated by Together */
package ic.tcc00175.biblioteca.oldmodel;

import java.util.Calendar;
import java.util.Date;

abstract public class Operacao extends BusinessObject {

    public Operacao() {
        this.data = Calendar.getInstance().getTime();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        if (data != null) {
            this.data = data;
        }
    }

    public boolean isPendente() {
        return false;
    }

    public abstract Devolucao getLnkDevolucao();

    public abstract Material getLnkMaterial();
    private Date data = null;
}