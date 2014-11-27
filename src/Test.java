import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		//thread
		/*new Thread(()->{
			System.out.println("hello world");
		}).start();*/
		
		
		//inner class
		//1.7
		User user1 = new User();
		User user2 = new User();
		user1.setAge(20);
		user2.setAge(10);
		
		List<User> users = new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		
		Collections.sort(users, new Comparator<User>(){
			@Override
			public int compare(User user1, User user2){
				System.out.println(user1.getAge() - user2.getAge());
				return user1.getAge() - user2.getAge();
			}
		});
		
		//1.8
		Collections.sort(users,(u1,u2) ->u1.getAge() - u2.getAge());
		
		
		
	}
	
	public static void oncePerSecond() throws InterruptedException
	  {
	    while (true)
	    {
	      timeFlies();
	      Thread.sleep(1000);
	    }
	  }

	public static void timeFlies()
	  {System.out.println("Time flies when you're having fun(ctionally)..."); }


}

