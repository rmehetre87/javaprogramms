package Interface;

interface Moveable
{
    default void moveFast(){
        System.out.println("I am moving fast, buddy !!");
    }
}
  
interface Crawlable
{
    default void crawl(){
        System.out.println("I am crawling !!");
    }
}
  
public class Animal1 implements Moveable, Crawlable 
{
    public static void main(String[] args) 
    {
        Animal1 self = new Animal1();
         
        self.moveFast();
        self.crawl();
    }
}
