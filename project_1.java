/* Mya Moxley */
import java.util.ArrayList;
import java.util.Scanner;


public class project_1{
   static Scanner input = new Scanner(System.in);

   public static void main(String[] args){

      ArrayList<String> numTask = new ArrayList<>();

      
      System.out.println("1. Add Task");
      System.out.println("2. Remove Task");
      System.out.println("3. Update Task");
      System.out.println("4. List all Tasks");
      System.out.println("0. Exit");
      int selection = input.nextInt();
      input.nextLine();


      while(true){
      if (selection==1) {
         addTask(numTask);
      } else if (selection==2) {
         removeTask(numTask);
      } else if (selection==3) {
         updateTask(numTask);
      } else if (selection==4) {
         listAll(numTask);
      } else if (selection==0){
         System.exit(0);
      }
      System.out.println("Please make a selection");
      selection = input.nextInt();
      input.nextLine();

   }
   }



/* Add task */
   static ArrayList<String> addTask(ArrayList<String>a){
      System.out.println("Adding a task");
         String task = input.nextLine();
         a.add(task);
         return a;


   }
/* Remove Task */
   static ArrayList<String> removeTask(ArrayList<String>a){
      System.out.println("Removing a Task");
         String task = input.nextLine();
         a.remove(task);
         return a;
   }
/* Update Task */
   static ArrayList<String> updateTask(ArrayList<String>a){
      System.out.println("You chose : Update a Task");
      System.out.println("Whats the index of the task you'd like to remove?");
      int ind = input.nextInt();
      input.nextLine();

      System.out.println("What would you like to update it to");
      

         String task = input.nextLine();

         a.set(ind, new String(task));
         return a;
   }

/* List All Tasks */
static void listAll(ArrayList<String> a){
   System.out.println("Print all Tasks");
      System.out.println(a);


}

}





