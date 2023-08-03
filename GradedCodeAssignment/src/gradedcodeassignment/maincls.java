package gradedcodeassignment;
import gradedcodeassignment.AdminDept;
import gradedcodeassignment.HrDept;
import gradedcodeassignment.TechDept;
import gradedcodeassignment.SuperDept;
public class maincls {

	public static void main(String[] args) {
		AdminDept obj1=new AdminDept();
		HrDept obj2 = new HrDept();
		TechDept obj3 = new TechDept();
		System.out.println("Welcome to"+obj1.deptName());
		System.out.println(obj1.getTodayWork());
		System.out.println(obj1.getWorkDeadline());
		System.out.println(obj1.isTodayAHoliday());
		System.out.println("");
		System.out.println("Welcome to "+ obj2.deptName());
		System.out.println(obj2.doActivity());
		System.out.println("Fill todays timesheet and mark your attendence");
		System.out.println(obj2.getTodayWork());
		System.out.println(obj2.isTodayAHoliday());
		System.out.println("");
		System.out.println("Welcome to "+ obj3.deptName());
		System.out.println(obj3.getTodayWork());
		System.out.println(obj3.getWorkDeadline());
		System.out.println(obj3.getTechStackInfo());
		System.out.println(obj3.isTodayAHoliday());
	}

}
