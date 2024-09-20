public class Student   
{
    private String name;
    private int alter;
    private boolean matura;

    public Student()
    {
        setName("Thomas");
        setAlter(40);
        setMatura(true);
    }

    public Student(String name, int alter, boolean matura)
    {
        setName(name);
        setAlter(alter);
        setMatura(matura);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }

    public void setMatura(boolean matura)
    {
        this.matura = matura;
    }

    public String getName()
    {
        return name;
    }

    public int getAlter()
    {
        return alter;
    }

    public boolean getMatura()
    {
        return matura;
    }

    public void printStudent()
    {
        System.out.println("Student:\t" + name + "\t" + alter + "\t" + matura);
    }
}
