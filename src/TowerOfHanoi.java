
public class TowerOfHanoi {

    public void move(int numOfDiscs, char from, char to, char inter) {
        if(numOfDiscs == 1) {
            System.out.println("Moving Disc 1 from " + from + " to " + to);
        } else {
            move(numOfDiscs - 1, from,inter,to);
            System.out.println("Moving Disc " + numOfDiscs + " from " + from + " to " + to);
            move(numOfDiscs - 1, inter, to, from);
        }
    }

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.move(3,'A','C', 'B');
    }
}