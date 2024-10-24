import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_15 {
public static void main(String[] args) {
   File file = new File("Exercise12_15.txt");

      if (!file.exists()) {
         try ( // Create the file
            PrintWriter output = new PrintWriter(file);
      ) {
         for (int i = 1; i <= 100; i++) {
            output.print((int)(Math.random() * 100) + " ");
         }
      } catch (FileNotFoundException e) {
   e.printStackTrace();
}  
   }
   Scanner input;
   try {
      input = new Scanner(file);
      int[] newArray = new int[100];
      while (input.hasNext()) {
      int i = input.nextInt();
      
      //int number = 0;
      //for(int j = 0; j < 100; j++){
         newArray[i] = (int)(Math.random() * 100);
         //}
         
   }
   selectionSort(newArray);
   for(int k = 0; k < 100; k++){
      System.out.print(newArray[k] + " ");
   }
}     catch (FileNotFoundException e) {
      e.printStackTrace();
   }
      
}
   public static void selectionSort(int[] list){
      for (int i = 0; i < list.length - 1; i++) {
         int currentMin = list[i];
         int currentMinIndex = i;
         
         for (int j = i + 1; j < list.length; j++) {
            if (currentMin > list[j]) {
               currentMin = list[j];
               currentMinIndex = j;
            }
         }
         
         if (currentMinIndex != i) {
            list[currentMinIndex] = list[i];
            list[i] = currentMin;
         }
      }
   }
}