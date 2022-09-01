package ouvintes;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ChangeOuvinte implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Propriedade: "+evt.getPropertyName());
        System.out.println("Valor antigo: "+evt.getOldValue());
        System.out.println("Valor atual: "+evt.getNewValue());
        System.out.println("------------------------------------");
    }
}
