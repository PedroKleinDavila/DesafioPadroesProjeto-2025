import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FonteDeDados{
    private List<Integer> lst;
    private List<Observer> observers = new ArrayList<>();
    public FonteDeDados(){
        lst = new LinkedList<>();
    }

    public void addObserver(Observer o){
        observers.add(o);
    }
    
    public void removeObserver(Observer o){
        observers.remove(o);
    }
    

    public void add(Integer value){
        if (value < 0) throw new IllegalArgumentException("Valor invalido");
        lst.add(value);
        for(Observer o : observers){
            o.atualizar(value);
        }
    }

    public int quantidade(){
        return lst.size();
    }

    public List<Integer> getValores(){
        return new ArrayList<>(lst);
    }
}