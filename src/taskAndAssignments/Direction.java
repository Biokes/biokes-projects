package taskAndAssignments;

public enum Direction{
    EAST("NORTH", "SOUTH"), WEST("SOUTH", "NORTH"), NORTH("WEST", "EAST"), SOUTH("EAST", "WEST");
    private final String right;
    private final String left;

    Direction(String left, String right){
        this.left=left;
        this.right=right;
    }

    public void turnLeft(){
        di
    }
}
