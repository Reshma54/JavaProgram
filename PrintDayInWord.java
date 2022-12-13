package itpjava;

public class PrintDayInWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dayNumber=1;
		if (dayNumber==0) {
			System.out.println("Sunday");
			
		} else if(dayNumber==1){
			System.out.println("Monday");

		}
		else if (dayNumber==2) {
			System.out.println("Tuesday");
			
		} else if(dayNumber==3){
			System.out.println("Wednesday");

		}
		else if (dayNumber==4) {
			System.out.println("Thusday");
			
		} else if(dayNumber==5){
			System.out.println("Friday");

		}
		else if(dayNumber==6) {
			System.out.println("Saturday");
		}
			
		else{
			System.out.println("Invalid");

		}
		System.out.println();
		System.out.println();
		
		/*
		//by switch case
		
		switch (dayNumber) {
		case 0: {
			
			System.out.println("Sunday");
			break;
		}
		case 1:{
			System.out.println("Monday");
			break;
		}
		case 2:{
		System.out.println("Tuesday");
			break;
	}
		case 3:{
		System.out.println("Wednesday");
		break;
	}
		case 4:{
		System.out.println("Thursday");
		break;
	}
		case 5:{
		System.out.println("Friday");
		break;
	}
		case 6:{
		System.out.println("Saturday");
		break;
	}
		case 7:{
		System.out.println("Other");
		break;
	}
		default:{
		System.out.println("Other");
		break;
	}

	}

*/
		
	}

}
