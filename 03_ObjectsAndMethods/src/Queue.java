public class Queue
{
 public static int countQueue = 0;
 static String buyers = " ";
 public static void increaseCount(int count) {
  Queue.countQueue = Queue.countQueue + count;
 }
 public Queue() {
  increaseCount(1);
  buyers = "Список покупателей:";
 }
 public void addQueue(String name){
  countQueue++;
 }
 public void addQueue(String name, int numberPhone){addQueue(name);
  countQueue++;
 }
 public void addQueue(String name, int numberPhone, String iMail){addQueue(name, numberPhone);
  countQueue++;
  buyers = buyers + countQueue + "\n" + name + ", " + "Номер телефона: " + numberPhone
           + "Электронная почта" + iMail;
 }
 public void flush(){
  if(countQueue <= 10) {
   System.out.println(countQueue);
  }
  else {
   return;
  }

  }
 }

