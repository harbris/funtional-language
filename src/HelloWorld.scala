import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._
object HelloWorld{
  
/*  def oncePerSecond(callback: () => Unit) {
    while (true) { callback(); Thread sleep 1000 }
  }
  def main(args: Array[String]) {
    //oncePerSecond(() =>println("time flies like an arrow..."))
    
    //ex Lamda
    def a = (x :Int,y :Int)=>x+y;
    println(a(1,2));
  }*/
  
 /*def oncePerSecond(callback: () => Unit)
  {
    while (true)
    {
      callback()
      Thread.sleep(1000)
    }
  }

  def main(args: Array[String])
  {
    oncePerSecond(() => 
      Console.println("Time flies... oh, you get the idea."))
  }*/
  
  def periodicCall(seconds: Int, callback: () => Unit)
  {
    while (true)
    {
      callback()
      Thread.sleep(seconds * 1000)
    }
  }

  def main(args: Array[String])
  {
    periodicCall(1, () => 
      Console.println("Time flies... oh, you get the idea."))
  }
  

}