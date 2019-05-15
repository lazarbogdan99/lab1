public class Student
{   //here all the variables are declared
    private String firstName;
    private String surname;
    private int coursework;
    private int testMark;
    private int studentLab;

     Student(String first, String last,int coursework, int testMark) //constructor//
    {
        setFirstName(first);
        setSurname(last);
        setCoursework(coursework);
        setTestMark(testMark);
    }

    //set the firstname by insetring a string
    public void setFirstName(String first)
    {
        this.firstName=first;
    }

    //set the firstname  by insetring a string
    public void setSurname(String last)
    {
        this.surname=last;
    }

    //set the coursework mark  by insetring an integer
    public void setCoursework(int task)
    {
        this.coursework=task;
    }

    //set the test mark  by insetring an integer
    public void setTestMark(int mark)
    {
        this.testMark=mark;
    }

    //get the firstname and then it returns it
    public String getFirstName()
    {
        return this.firstName;
    }

    //get the surname and then it returns it
    public String getSurname()
    {
        return this.surname;
    }

    //get the coursework and then it returns it
    public int getCoursework()
    {
        return this.coursework;
    }

    //get the test mark and then it returns it
    public int getTestMark()
    {
        return this.testMark;
    }

    //this method computes the average between test mark and coursework mark  and then it returns it
    public double getAverageMark()
    {
        return (double)(this.testMark+this.coursework)/2;
    }
}