public class Main //this is the main method //
{
    public static void main(String[] args)
    {
        Student student1=new Student("Jhon","Murph",90,80);
        Student student2=new Student("Craig","Oleg",75,60);  //creating student
        Student student3=new Student("Mike","Blast",55,20);
        Student[] array={student1,student2,student3};//creating an array//
        for(int i=0;i<array.length;i++)
        {
            System.out.println("The full name of the "+(i+1)+" student is "+array[i].getFirstName()+" "+
                    array[i].getSurname()+" "+array[i].getAverageMark());//prints the full name and the avrege mark//
        }
    }
}
