package gradedcodeassignment;

public class HrDept extends SuperDept{
	
	public String deptName() {
		return "Hr Dept";
	}
	public String getTodayWork() {
		return "complete your documents submission";
	}
	public String getWorkDeadline() {
		return "complete by EOD";
	}
    public String doActivity() {
    	return "Team Lunch";
    }
	}

