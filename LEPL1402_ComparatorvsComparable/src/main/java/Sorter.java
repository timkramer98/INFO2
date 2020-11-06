import java.util.List;
import java.awt.Color;

import java.util.Comparator;
import java.util.List;

public class Sorter {


    /*
     * Should sort the list and order the Flower by color, in this specific order : red, blue, green
     */
    public static void sortFlowerByColor(List<Flower> list){
        class SortedFlower implements Comparator<Flower>{

            @Override
            public int compare(Flower o1, Flower o2) {
                return o1.getPetalColor().getRGB() - o2.getPetalColor().getRGB();
            }
        }
        list.sort(new SortedFlower());
    }
    /*
     * Should sort the Plant by name only
     */
    public static void sortPlantByName(List<Plant> list){
        list.sort(Comparator.comparing(Plant::getName));
    }

    /*
     * Should sort the list and order the Tree by height
     */
    public static void sortTreeByHeight(List<Tree> list){
        list.sort(Comparator.comparing(Tree::getHeight));
    }
}
