package Java.implementation;

public class SupermarketArray implements Supermarket{

   
    private final String[] items;

    public SupermarketArray(final int size) {
        items = new String[size];
        lastIndex = -1;
    }


    private int lastIndex;


    @Override
    public void add(final String item) {
        if (lastIndex == items.length-1){
            System.err.println("Lista de Supermercado cheia");
        } else {
            lastIndex++;
            items[lastIndex] = item;
        }
        
        // TODO Auto-generated method stub
        
    }

    @Override
    public void print() {
        System.out.println("#################################");
        if(lastIndex < 0){
            System.out.println("Lista de Supermercado vazia");
        }
        for(int i = 0; i<= lastIndex; i++){
            System.out.println(i + " - " + items[i]);
        }
        System.out.println("##################################");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(final int index) {
        if(index >= 0 && index <=lastIndex){
            shift(index);
            lastIndex--;
        } else {
            System.err.println("Índice inválido: "+ index);
        }
        // TODO Auto-generated method stub
        
    }

    private void shift(final int index) {
        for (int i = index; i<lastIndex; i++){
            items[i] = items[i+1];
        }
    }

    
    

}
