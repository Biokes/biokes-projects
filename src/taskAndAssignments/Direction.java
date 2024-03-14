package taskAndAssignments;

public enum Direction{
    EAST("NORTH", "SOUTH"),
    NORTH("WEST", "EAST"),
    SOUTH("EAST", "WEST"),
    WEST("SOUTH", "NORTH");
    private final String right;
    private final String left;

    Direction(String left, String right){
        this.left=left;
        this.right=right;
    }

    private Direction direction;

    public Direction turnLeft(){
        return Direction.valueOf(this.left);
    }

    public Direction turnRight(){
        return Direction.valueOf(this.right);
    }
}
