package problem2;

public class IntegerList
{
    int[] list; //values in the list
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    int currNum = list.length;
    public void increaseSize(){
        int size = list.length*2;
        int[] list1 = new int[size];
        for(int i =0;i<list.length;i++){
            list1[i] = list[i];
        }
        list = list1;
    }

    public void addElement(int newVal){
        if (currNum==list.length){
            increaseSize();
        }
        list[currNum] = newVal;
        currNum ++;
    }

    public void removeFirst(int newVal){
        for(int i=0;i<list.length;i++){
            if (list[i] == newVal){
                for(int j=i;j<list.length-1;j++){
                    list[j] = list[j+1];
                    currNum--;
                }
                break;
            }
        }
    }

    public void removeAll(int newVal){
        for(int i=0;i<list.length;i++){
            if (list[i] == newVal){
                for(int j=i;j<list.length-1;j++){
                    list[j] = list[j+1];
                    currNum--;
                }
            }
        }
    }
}