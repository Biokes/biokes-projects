package assignmentsAndTasks.src.assignmentsAndTasks.assignmentsAndTasks;


public class MySet {
    private String[] elements = new String[5];
    private int nextVacant=0;
    private int size;
    public void add(String element1) {
        boolean resizeCondition = nextVacant == elements.length;
        if(resizeCondition) {
            resizeSet();
        }
        if(checkDuplicates(element1))
            throw new IllegalArgumentException("Set cannot Contain duplicates");
        elements[nextVacant++] = element1;
        size++;
    }

    public String getElement(int index) {
        if(index < 0)throw new IllegalArgumentException("Invalid index");
        if(isEmpty())
            throw new IllegalArgumentException("Set is empty");
            if (elements[index]==null) {
                throw new IllegalArgumentException("Set is empty");
            }
                return elements[index];
    }

    public boolean isEmpty() {
        if(nextVacant == 0 )
            return true;
        return false;
    }

    public void clear() {

    elements = new String[5];
    nextVacant=0;
    size =0;
    }
    private void resizeSet(){
        boolean resizeCondition = nextVacant == elements.length;
        if(resizeCondition) {
            String[] temp = new String[nextVacant + 4];
            System.arraycopy(elements, 0, temp,0,elements.length);
            elements = temp;
        }
    }

    public int getSize() {

        return size;
    }

    public boolean checkDuplicates(String elementGiven) {
            for(String element: elements)
                if(elementGiven.equals(element))
                    return true;
        return false;
    }

    public String[] toArray() {

        return copyElements(elements);

    }
    private String[] copyElements(String [] inputArray){
        int counter = 0;
        for( String value : inputArray ){
            if( value==null )
                break;
            counter++;
        }
        String[] output=new String[counter];

        System.arraycopy(inputArray, 0, output, 0, counter);
        return output;
    }
}