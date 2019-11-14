public class Student
{
  private String name, studentID, department;
  
  public Student()
  {
    this("","","");
  }
  public Student(String name, String studentID, String department)
  {
    this.name = name;
    this.studentID = studentID;
    this.department = department;
  }
  //get and set for all variables
  public String getName()
  {
    return this.name;
  }
  
  public String getStudentID()
  {
    return this.studentID;
  }
  
  public String getDepartment()
  {
    return this.department;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public void setStudentID(String id)
  {
    this.studentID = id;
  }
  
  public void setDepartment(String d)
  {
    this.department = d;
  }
}