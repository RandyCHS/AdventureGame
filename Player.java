import java.util.ArrayList;

public class Player
{
    private ArrayList<String> inventory;
    
    public Player()
    {
        inventory = new ArrayList<String>();
    }
    
    public boolean has(String item) 
    {
        return inventory.indexOf(item) > -1;
    }
    
    public void take(String item)
    {
        inventory.add(item);
    }
    
    public boolean drop(String item)
    {
        int index = inventory.indexOf(item);
        if (index > -1)
        {
            inventory.remove(index);
            return true;
        }
        return false;
    }
}