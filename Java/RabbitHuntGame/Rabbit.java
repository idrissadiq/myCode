package rabbithunt;

public class Rabbit extends Animal {

    // instance variables
    private boolean canSeeFoxNow = false;
    private int directionToFox;
    private int currentDirection = Model.STAY;

    public Rabbit(Model model, int row, int column) {
        super(model, row, column);
    }


    int decideMove() {

        // look all around for fox
        canSeeFoxNow = false;
        for (int i = Model.MIN_DIRECTION; i <= Model.MAX_DIRECTION; i++) {
            if (look(i) == Model.FOX) {
                canSeeFoxNow = true;
                directionToFox = i;
            }
        }
        // if fox has been seen,
        // move away from its last known position
        // since the fox moves in clockwise fashion this is designed to move away from the fox
        // and the edge if possible first, assuming the fox is moving in its usual manner
        if (canSeeFoxNow) {
            if (canMove(Model.turn(directionToFox, 5))) {
                return currentDirection = Model.turn(directionToFox, 5);
            } else if (canMove(Model.turn(directionToFox, 3))) {
                return currentDirection = Model.turn(directionToFox, 3);
            } else if (canMove(Model.turn(directionToFox, 6))) {
                return currentDirection = Model.turn(directionToFox, 6);
            } else if (canMove(Model.turn(directionToFox, 2))) {
                return currentDirection = Model.turn(directionToFox, 2);
            } else if (canMove(Model.turn(directionToFox, 4))) {
                return currentDirection = Model.turn(directionToFox, 4);
            } else if (canMove(Model.turn(directionToFox, 1))) {
                return currentDirection = Model.turn(directionToFox, 1);
            } else if (canMove(Model.turn(directionToFox, 7))) {
                return currentDirection = Model.turn(directionToFox, 7);
            }
        }
        return Model.STAY;

    }
}


