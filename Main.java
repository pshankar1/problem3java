import java.util.Scanner;
import java.util.Hashmap;
class Main {
  /***************
  runtime and algorithmic approx :6* BigO(log n)

  declaring variable to to set array elements to
  ************/
  public static void main(String[] args) {
 
    Scanner s=new Scanner(System.in);


 /***************
        //user input of array amount/size
    *******************/
    int valK;
    System.out.println("Size of Array:");
    int num=s.nextInt();//1

 /***************
    assigning user input value to array value integer

   ******************* */
    int arrayA[]=new int[num];//1


    /*********
   searching through the entered value to find k
   **********/
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    
   /******

       for loop to enter in values and run it through equation

   *******/ 
    for(int i=0;i<num;i++){//O(n)+1
      System.out.println("Positive odd integer");

      arrayA[i]=s.nextInt();


    /*********

        assigning user input for each element
        based on i iterating through each element and adds i and assigns array value to it

   ***************/ 

      /*******
             running each element through [log n]+1 equation 

        *******/ 
    
      arrayA[i]=log(arrayA[i])+1;//2
      
    }
    System.out.println("Enter k value: ");
    valK=s.nextInt();

    if(find.count(valK)){//1
     String swor= "K is in the value";
         System.out.println(swor);
    }

         
    
  
  /*******
    searching through the entered elements and equation values 
    too see if k is in array or not
   *******/ 
    
    else
      String noTswor="K is not in the value";
        System.out.println(noTswor);//1
    
    
  }
}