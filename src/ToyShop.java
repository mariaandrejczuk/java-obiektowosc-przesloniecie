
public class ToyShop {  //miejsce do przechowywania wszystkich zabawek
    private Bear[] bears = new Bear[10];
    private int indexBear = 0;

    public void addBear(Bear bear) {
        if (indexBear < bears.length) {
            bears[indexBear++] = bear;
        }
    }
}
