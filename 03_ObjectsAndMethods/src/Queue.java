public class Queue
{
 static Queue queue = new Queue();
 static int countQueue = 0;
 public void addQueue(String name){
  Queue queue = new Queue();
  countQueue++;
 }
 public void addQueue(String name, int numberPhone){addQueue(name);
  Queue queue = new Queue();
  countQueue++;
 }
 public void addQueue(String name, int numberPhone, String iMail){addQueue(name, numberPhone);
  Queue queue = new Queue();
  countQueue++;
 }
 public void flush(){
if (countQueue >= 10) return;
 }

}

