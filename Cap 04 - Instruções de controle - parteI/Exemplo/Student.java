//Figura 4.4
//Classe Student que aramazena um nome e a média do aluno
public class Student{
    private String name;
    private double average;

    //Construtor
    public Student(String name, double average){
        this.name = name;
        
        //Valida a média > 0.0 e <= 100.0; caso contrário, atribui o valor padrão de 0.0
        if(average > 0.0)
            if(average <= 100.0)
                this.average = average;
    }

    //define o nome do aluno
    public void setName(String name){
        this.name = name;
    }
    //retorna o nome do aluno
    public String getName(){
        return name;
    }

    //define a média do aluno
    public void setAverage(double average){
        if(average > 0.0)
            if(average <= 100.0)
                this.average = average;
    }
    //retorna a média do aluno
    public double getAverage(){
        return average;
    }

    //determina a letra da nota do aluno com base na média
    public String getLetterGrade(){
        String letterGrade = ""; //inicializa a letra da nota

        if(average >= 90.0)
            letterGrade = "A";
        else if(average >= 80.0)
            letterGrade = "B";
        else if(average >= 70.0)
            letterGrade = "C";
        else if(average >= 60.0)
            letterGrade = "D";
        else
            letterGrade = "F";

        return letterGrade;
    }


}