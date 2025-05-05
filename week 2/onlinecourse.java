class OnlineCourse{
	String courseName;
	int courseDuration;
	double fees;
	private static String institutename="Any";
	
	public OnlineCourse(String courseName,int courseDuration,double fees){
		this.courseName=courseName;
		this.courseDuration=courseDuration;
		this.fees=fees;
	}
	
	public void displayCourseDetails()
	{
		System.out.print("courseName:"+courseName);
		System.out.print("courseDuration:"+courseDuration);
		System.out.print("fees:"+fees);
		System.out.print("institutename:"+institutename);
		
	}
	
	public static void updateInstituteName(String newinstituteName)
	{
		institutename=newinstituteName;
	}
	
	public static void main(String[] args){
		OnlineCourse course1=new OnlineCourse("cse",4,45.36);
		OnlineCourse course2=new OnlineCourse("ece",6,369);
		
		course1.displayCourseDetails();
		System.out.println();
		course2.displayCourseDetails();
		System.out.println();
		
		OnlineCourse.updateInstituteName("SRM");
		System.out.println("After updating:");
		course1.displayCourseDetails();
		System.out.println();
		course2.displayCourseDetails();
		System.out.println();
	}
}
		