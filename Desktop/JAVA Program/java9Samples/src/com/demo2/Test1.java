package com.demo2;

class InvalidAgeException extends Exception{
 InvalidAgeException(String s){
  super(s);
 }
 public String toString()
 {
  return "Candidate is less than 18 year is not allowed to vote.";
 }
}
public class Test1{

   static void validate(int age) throws InvalidAgeException{
     if(age < 18)
         throw new InvalidAgeException("invalid candidate");
     else
         System.out.println("welcome to vote");
   }
   
   public static void main(String args[]){
      try{
        validate(13);
      }catch(Exception ex){
         System.out.println("Exception occured: "+ex);
      }

      System.out.println("rest of the code...");
  }
}