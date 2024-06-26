package assignmentsAndTasks.src.assignmentsAndTasks.assignmentsAndTasks;

import java.util.Objects;

public class MyStack <T> {
    private final String [] stack ;
    private int nextVacant = 0;
    public MyStack(int number){
        if(number < 1)
            throw new IllegalArgumentException(String.format("%s length is not valid for creating a stack.",number));
        stack = new String[number];
    }

    public boolean isEmpty(){
        return nextVacant == 0;
    }

    public void push(String name){
        if(nextVacant+1 >stack.length )
            throw new StackOverflowError("Elements cannot be pushed beyond Stack size");
        stack[nextVacant++] = name;
    }

    public String peek(){
        String output;
        for(int counter = stack.length-1; counter >= 0; counter-- ){
            if(stack[counter] == null)
                continue;
            output = stack[counter];
            return output;
        }
        return "Stack is empty";
    }
    public void pop(){
        if(nextVacant ==0 )
            throw new RuntimeException("Stack UnderFlow.");
        stack[nextVacant-1] = null;
    }

    public Object search(T name){
        for(int count = nextVacant-1; count-- > 0;){
            if( Objects.equals(stack[count], name) )
                return count+1;
        }
        return String.format("%s not found",name);
    }
}
