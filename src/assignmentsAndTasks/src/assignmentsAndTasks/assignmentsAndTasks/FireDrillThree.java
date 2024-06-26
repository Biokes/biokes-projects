package assignmentsAndTasks.src.assignmentsAndTasks.assignmentsAndTasks;
import java.util.ArrayList;
public class FireDrillThree {
    public static int[] taskOne(int...num10){

        return num10;
    }
    public static String taskTwo(int [] numbers){
        StringBuilder returnValue = new StringBuilder ( );
        for (int number : numbers) {
            String output = number + "\n";
            System.out.println(output);
            returnValue.append(output);
        }
        return returnValue.toString ( );
    }
    public static StringBuilder  taskThree(int [] numbers){
        StringBuilder output = new StringBuilder( );
        for (int number : numbers) {
            System.out.print(number + " ");
            output.append (number).append (" ");
        }
        return output;
    }
    public static int[] taskFour(int [] numbers){
        ArrayList <Integer> returnValue1= new ArrayList<>();
        for(int index = 0; index < numbers.length; index++){
            if(index%2 ==0){
                System.out.print(numbers[index] + ", ");
                returnValue1.add(numbers[index]);
            }
        }
        int [] returnValue = new int[returnValue1.size()];
        for (int index = 0; index < returnValue.length; index++) {
            returnValue[index] =  returnValue1.get(index);
        }
        return returnValue;
    }
    public static int[] taskFive(int [] numbers){
        ArrayList<Integer> temporary = new ArrayList<>();
        for(int index = 0; index < numbers.length; index++){
            if(index %2 ==1){
                temporary.add(numbers[index]);
            }
        }
        int [] returningValues = new int[temporary.size()];
        for(int index = 0; index < temporary.size(); index++){
            returningValues[index] = temporary.get(index);
        }
        return returningValues;

    }
    public static int taskSix(int [] numbers){
        int sum=0;
        for(int index = 0; index < numbers.length; index++){
            if(index%2 ==0){
                sum+= numbers[index];
            }
        }
        return sum;
    }
    public static int taskSeven(int [] numbers){
        int sum=0;
        for(int index = 0; index < numbers.length; index++){
            if(index % 2 == 1){
                sum+= numbers[index];
            }
        }
        return sum;
    }
    public static int taskEight(int [] numbers){
        int least = numbers[0];
        for(int count =0; count < numbers.length;count++){
            if(numbers[count] < least && count % 2 ==1){
                least = numbers[count];
            }
        }
        return least;
    }
    public static int taskNine(int [] numbers){
        int least = numbers[1];
        for(int count =1; count < numbers.length;count++){
            if(numbers[count] < least && count % 2 == 0){
                least = numbers[count];
            }
        }
        return least;
    }
    public static int taskTen(int [] numbers){
        int maximum = numbers[0];
        for(int count =0; count < numbers.length;count++){
            if(numbers[count] > maximum && count % 2 ==0){
                maximum = numbers[count];
            }
        }
        return maximum;
    }
    public static int taskEleven(int [] numbers){
        int maximum = numbers[1];
        for(int count =0; count < numbers.length;count++){
            if(numbers[count] > maximum && count %2 == 1){
                maximum = numbers[count];
            }
        }
        return maximum;
    }
    public static int[] taskTwelve(int [] numbers){
        for(int counter = 0; counter < numbers.length; counter+=2){
            int temporary;
            temporary = numbers[counter];
            numbers[counter] = numbers[counter+1] ;
            numbers[counter+1] = temporary;
        }
        return numbers;
    }
    public static int[] taskThirteen(int [] numbers){
        for(int counter = 0; counter < numbers.length; counter+=2){
            if ( numbers[counter]% 2==1 && numbers[counter+1]% 2== 1) {
                int temporary;
                temporary = numbers[counter] ;
                numbers[counter] = numbers[counter + 1];
                numbers[counter + 1] = temporary;
            }
        }
        return numbers;
    }
    public static int[] taskFourteen(int [] numbers){
        for(int counter = 0; counter < numbers.length; counter+=2){
            if ( numbers[counter]% 2== 0 && numbers[counter+1]% 2== 0) {
                int temporary = 0;
                numbers[counter] = temporary;
                numbers[counter] = numbers[counter + 1];
                numbers[counter + 1] = temporary;
            }
        }
        return numbers;
    }
    public static int[] taskFifteen(int [] numbers){
        return getNumber(numbers);
    }
    private static int[] getNumber(int[] numbers) {
        for(int counter = 0; counter < numbers.length; counter+=2){
            if ( (numbers[counter]% 2 == 1 && numbers[counter+1]% 2== 0)|| (numbers[counter]% 2 == 0 && numbers[counter+1]% 2== 1)) {
                int temporary = numbers[counter] ;
                numbers[counter] = numbers[counter + 1];
                numbers[counter + 1] = temporary;
            }
        }
        return numbers;
    }
    public static int[] taskSixteen(int [] numbers){
        return getNumber (numbers);
    }
    public static String taskSeventeen(String input1, String input2){
        char []  temp1 = input1.toCharArray();
        char []  temp2 = input2.toCharArray();
        String output = "";
        char variable1 = temp1[0];
        char variable2 = temp1[1];
        char variable3 = temp2[0];
        char variable4 = temp2[1];
        temp1[0] = variable3;
        temp1[1] = variable4;
        temp2[0] = variable1;
        temp2[1] = variable2;
        output = String.format("%s %s",(new String(temp1)),(new String(temp2)));
        return output;
    }
    public static int[] taskEighteen(int[] given){
        for(int count = 0; count < given.length; count++){
            given[count] = given[count]%2;
        }
        return given;
    }
    public static boolean[] taskNineteen(int[] given) {
        boolean [] output = new boolean [given.length];
        for(int counter = 0; counter < given.length; counter++ ){
            output[counter] = given[counter] % 2 !=0;
        }
        return output;
    }
    public static int[] taskTwenty(int [] number){
        return new int [10];
    }
}