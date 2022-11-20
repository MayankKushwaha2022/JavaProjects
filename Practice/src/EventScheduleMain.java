
import java.util.Calendar;

public class EventScheduleMain {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();

		System.out.println("Just creating 4 EventSchedules" + "\n");

		System.out.print("EventSchedule1" + "\n");
		EventSchedule Ev = new EventSchedule();
		
		  int Y1 = cal.get(Calendar.YEAR); Ev.setYear(Y1); int M1 =
		  cal.get(Calendar.MONTH) + 1; Ev.setMonth(M1); int D1 =
		  cal.get(Calendar.DATE); Ev.setDay(D1);
		 
		System.out.println(Ev.createReport());
		System.out.println();

		System.out.print("EventSchedule2" + "\n");
		EventSchedule Ev1 = new EventSchedule();
		
		  int Y2 = cal.get(Calendar.YEAR)+1; Ev.setYear(Y2); int M2 =
		  cal.get(Calendar.MONTH) + 1; Ev.setMonth(M2); int D2 =
		  cal.get(Calendar.DATE); Ev.setDay(D2);
		 
		System.out.println(Ev1.createReport());
		System.out.println();

		System.out.print("EventSchedule3" + "\n");
		EventSchedule Ev2 = new EventSchedule();
		
		  int Y3 = cal.get(Calendar.YEAR)+2; Ev.setYear(Y3); int M3 =
		  cal.get(Calendar.MONTH) - 8; Ev.setMonth(M3); int D3 =
		  cal.get(Calendar.DATE); Ev.setDay(D3);
		 
		System.out.println(Ev2.createReport());
		System.out.println();

		System.out.print("EventSchedule4" + "\n");
		EventSchedule Ev3 = new EventSchedule(2030, 10, 21);
		
		  int Y4 = cal.get(Calendar.YEAR)+2; Ev.setYear(Y4); int M4 =
		  cal.get(Calendar.MONTH) - 8; Ev.setMonth(M4); int D4 =
		  cal.get(Calendar.DATE)-5; Ev.setDay(D4);
		 
		System.out.println(Ev3.createReport());
	}

}
