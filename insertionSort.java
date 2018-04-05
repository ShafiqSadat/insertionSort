
package OOP;

public class insertionSort {
    public static void main(String args[]){
        int myArray[] = {1,3,9,8,7,6,5,4,2,0};
        //lets print array befor sorting
        System.out.print("\n === Befor Sorting ===\n");
        for (int i = 0; i <myArray.length; i++) {
            System.out.format(" %d", myArray[i]);
        }
        //call method
        Sort(myArray);
        //print array after sorting
        System.out.print("\n === After Sorting ===\n");
        for (int i = 0; i <myArray.length; i++) {
            System.out.format(" %d", myArray[i]);
        }
        System.out.println();
    }
    public static void Sort(int array[]){
        int counter = array.length;
        int outer = 1;
        while(outer<counter){
            int key = array[outer];
            int inner = outer-1;
            while(inner>=0 && array[inner]>key){
                array[inner+1] = array[inner];
                inner-=1;
            }
            array[inner+1]=key;
            outer+=1;
        }
    }
}
