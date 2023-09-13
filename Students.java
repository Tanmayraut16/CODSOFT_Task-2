package Codesoft;

// import java.util.*; 
public class Students {
    private String name;
    private int numSub;
    private int rollNumber;
    private int[] marks;

    public Students(String name,int numSub, int rollNumber){
        this.name = name;
        this.rollNumber= rollNumber;
        this.numSub = numSub;
        this.marks = new int[numSub];
    }

    public void setMarks(int SubjectNo, int marks){
        this.marks[SubjectNo-1] = marks;
    }

    public String Name(){
        return name;
    }

    public int RollNumber(){
        return rollNumber;
    }

    public int TotalMarks(){
        int total =0;
        for(int mark : marks){
            total += mark;
        }

        return total;
    }

    public double AvgPercnt(){
        return (double)TotalMarks()/(numSub * 100) * 100;
    }

    public String getGrade(){
        double Percent = AvgPercnt();

        if(Percent > 90){
            return "A+";
        }
        else if(Percent >80 && Percent<=90){
            return "A";
        }
        else if(Percent >70 && Percent<=80){
            return "B";
        }
        else if(Percent >60 && Percent<=70){
            return "C";
        }
        else if(Percent >50 && Percent<=60){
            return "D";
        }
        else if(Percent >40 && Percent<=50){
            return "E";
        }
        else{
            return "F";
        }
    }
}
