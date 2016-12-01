import java.util.ArrayList;

/**
 * Created by angel alekhine on 11/25/2016.
 */
public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");

        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem,String item){
        int position = findItem(currentItem);
        if (position >=0){
            modifyGroceryItem(position, item);
        }
    }
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("The item " + newItem + " has been modified");
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >=0){
            removeGroceryItem(position);
        }

    }
    private void removeGroceryItem(int position){

        groceryList.remove(position);

    }

    private int findItem(String searchItem){
        //boolean exists = groceryList.contains(searchItem);
       return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }



    public void addGroceryList(String s) {
        groceryList.add(s);
    }
}
