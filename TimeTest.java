/*
 * Write the definition for a class called 'time' that has hours,minutes and second as integer data member .The has the following member function
 * void settime(int,int,int) to set the specified values of hours minuts and second bject void showtime()
 */

package itpjava;

class Time{
	private int hrs,min,secs;
	
public void setTime(int h,int m,int s) {
	hrs=h;
	min=m;
	secs=s;
}

public void showTime() {
	System.out.println(hrs +":" +min +":" + secs);
	}

public int getSeconds() {
	return hrs*3600 + min *60 +secs;
	
}

public Time add(Time t) {
	Time u= new Time();
	int x =getSeconds() + t.getSeconds();
	u.hrs=x/3600;
	u.min = x%3600/60;
	u.secs=x%60;
	
			return u;
}

public Time diff(Time t) {
	Time u= new Time();
	int x =getSeconds() - t.getSeconds();
	
	u.hrs=x/3600;
	u.min = x%3600/60;
	u.secs=x%60;
	
			return u;
}


}

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t1=new Time (),
				t2=new Time();
		
		t1.setTime(7,25,45);
		t2.setTime(3,55,50);
		
		Time t3 =t1.add(t2);
		
		Time t4=t1.diff(t2);
		
		t1.showTime();
		t2.showTime();
		t3.showTime();
		t4.showTime();

		
	}

}
