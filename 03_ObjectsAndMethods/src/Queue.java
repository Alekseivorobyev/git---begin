import java.util.Arrays;

public class Queue
{
 public static int countQueue = 0;
 static String buyers = " ";
 public void addQueue(String name){

 }
 public void addQueue(String name, int numberPhone){addQueue(name);

 }
 public void addQueue(String name, int numberPhone, String iMail){addQueue(name, numberPhone);

  buyers = buyers + name + ", " + "Номер телефона: " + numberPhone + ", Электронная почта " + iMail + "\n";
 }
 public void print() {
  if (buyers.isEmpty()) {
   System.out.println("Очередь пуста");
  } else {

   System.out.println(buyers);
  }


  }
 }

