    import java.util.ArrayList;
    import java.util.Random;

   public class Student <T extends Comparable <T>> implements Comparable<Student<T>>{
    private T grade;

    public T getGrade(){
        return grade;
    }
    public void setGrade(T grade){
        this.grade = grade;
    }
    public Student(T o){
        setGrade(o);
    }

    public int compareTo(Student<T> o){
        return getGrade().compareTo(o.getGrade());
    }

    public static void main (String[] args){ 

        ArrayList<Student<Float>> array = new ArrayList<>();
        int arrayLength = 5;
         Random random = new Random(0);
        for (int i = 0; i< arrayLength; i++){
            array.add(new Student<Float>(random.nextFloat(0, 10)));
        }
        for (Student<Float> stu: array){
        System.out.println(stu.getGrade());
    }
    meow.mergeSort(array);
System.out.println("After mergesort");
for(Student<Float> stu: array){
    System.out.println(stu.getGrade());
}
System.out.println("After bubblesort");
meow.bubbleSort(array);
for(Student <Float> stu: array){
    System.out.println(stu.getGrade());
}
    
        }
    }
