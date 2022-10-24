public class Teste {

    public int dias;
    private String ifood;

public Teste (int dias, String ifood) {

    this.dias = dias;
    this.ifood = ifood;
}
public String getIfood() {
    return this.ifood;
}
public void setIfood(String dias) {
    this.ifood = ifood;
}
public void status() {
    System.out.println("Esse é um bootcamp do " + this.ifood);
}

public static void main(String[] args) {
    
 Teste t1 = new Teste(30, "ifood");
    

}    
}