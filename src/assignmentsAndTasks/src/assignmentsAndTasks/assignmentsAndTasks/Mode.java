package assignmentsAndTasks.src.assignmentsAndTasks.assignmentsAndTasks;

import java.util.Arrays;

public class Mode{
    public static int[] mode_value(int[] numbers){
        int count=0;
        int new_count=0;
        int mode=numbers[1];
        Arrays.sort(numbers);
        for( int num : numbers ){
            for( int num1 : numbers ){
                if( num==num1 ) count+=1;
            }
            if( count>=new_count ){
                mode=num;
                new_count=count;
            }
            count=0;
        }
        return new int[]{new_count, mode};
    }
}