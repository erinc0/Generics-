    import java.util.ArrayList;
   
    public class meow {
        public static <E extends Comparable<E>> void mergeSort(ArrayList<E> array){
         mergeSort(array, 0, array.size()); //ok
        }
    
    public static  <E extends Comparable<E>> void mergeSort(ArrayList<E> array, int start, int end){
        if(end - start <= 1) return;
        int middle = (start + end) / 2;
        mergeSort(array, start, middle);
        mergeSort(array, middle, end);
        merge(array, start, middle, end);
    }
    
    public static  <E extends Comparable<E>> void merge(ArrayList<E>array, int start, int middle, int end){
        int i = start, j =middle;
        ArrayList<E> temp = new ArrayList<> (end- start);
        while (i < middle && j <end){
            if (array.get(i).compareTo(array.get(j))>0){
                temp.add(array.get(j));
                j++;
                } else{ 
                temp.add(array.get(i));
                i++;
                }
            }
        while (i< middle){
            temp.add(array.get(i));
            i++;
        }
        while (j < end) {
            temp.add(array.get(j));
            j++;
        }
        for (i = start; i<end; i++){
            array.set(i, temp.get(i-start));
        }
        }
    
        public static <E extends Comparable<E>> void bubbleSort(ArrayList<E> array){
            bubbleSort(array, 0, array.size());
    }
    
        public static <E> void woof(ArrayList<E> array, int i, int k){
            E temp= array.get(i);
            array.set(i, array.get(k));
            array.set(k, temp);
    }
    
        public static <E extends Comparable<E>> void bubbleSort(ArrayList<E> array, int start, int end){
            if (end - start <= 1)
            return;
            for (int i = start; i < end -1; i++){
            if (array.get(i).compareTo(array.get(i+1))>0){
            woof(array, i, i+1);
    
        }
      }
            bubbleSort(array, start, end -1);

    }
    }

