import java.time.LocalDate;

public class HealthProfile {
    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String sexo;
    private double altura;
    private double peso;
    public HealthProfile(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento,
            String sexo, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getDiaNascimento() {
        return diaNascimento;
    }
    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }
    public int getMesNascimento() {
        return mesNascimento;
    }
    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
        public int calcularIdade(){
        int idade = LocalDate.now().getYear() - anoNascimento;
        return idade; 
    }
    public int fcMax(){
        return 220 - calcularIdade();
    }
    public double calcularFCAlvoMin(){
        double fcAlvoMin = fcMax()*0.5;
        return fcAlvoMin;
    }
    public double calcularFCAlvoMax(){
        double fcAlvoMax = fcMax()*0.85;
        return fcAlvoMax;
    }
    public double calcularIMC(){
        double imc = peso/(altura*altura);
        return imc;
    }
    public String classificarIMC(){
        double imc = calcularIMC();
        if(imc < 18.5){
            return "Abaixo do peso";
        } else if(imc >= 18.5 && imc < 25){
            return "Peso normal";
        } else if(imc >= 25 && imc < 30){
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
    public void displayIMC(){
        System.out.println("\n\n\n=== Índice de Massa Corporal (IMC) ===");
        System.out.printf("Seu IMC: %.2f\n", calcularIMC());
        System.out.printf("IMC < 18.5: Abaixo do peso\n");
        System.out.printf("IMC 18.5 - 24.99: Peso normal\n");
        System.out.printf("IMC 25 - 29.99: Sobrepeso\n");
        System.out.printf("IMC >= 30: Obesidade\n");
    }
}
