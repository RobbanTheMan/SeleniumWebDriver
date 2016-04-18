
public class StartPage extends IPage{

	public StartPage(){
		
		driver.get("http://nackademin.se");
	}
	
	public ITCoursePage gotoITCourse(){
		return new ITCoursePage();
		
	}
}
