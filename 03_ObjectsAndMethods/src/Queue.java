public class Queue
{
 public static int countQueue = 0;
 static String buyers = " ";

 public void addQueue(String name){

 }
 public void addQueue(String name, int numberPhone){addQueue(name);

 }
 public void addQueue(String name, int numberPhone, String iMail){addQueue(name, numberPhone);

  buyers = buyers + name + ", " + "Номер телефона: " + numberPhone + ", Электронная почта " + iMail + "\n" ;
 }
 String[] array = buyers.split("\n");

 {
  StringBuilder new_queue = new StringBuilder();//мы создали пустую новую очередь
for (int m = 0; m<10; m ++){
 System.out.println(array [m]);
}
  for (int k = 10; k < array.length; k++) {
   new_queue.append(array[k] + "\n");//Эта строка добавляет нового покупателя
  }
 }

 public void print() {
  if (buyers.isEmpty()) {
   System.out.println("Очередь пуста");
  } else {

   System.out.println(buyers);
  }


  }
 }

