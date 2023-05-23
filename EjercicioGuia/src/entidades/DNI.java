
package entidades;

public class DNI {

    private String DniNum;
    private int num;

    public DNI() {
    }

    public DNI(String DniNum, int num) {
        this.DniNum = DniNum;
        this.num = num;
    }

    public String getDniNum() {
        return DniNum;
    }

    public void setDniNum(String DniNum) {
        this.DniNum = DniNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "DNI{" + "DniNum=" + DniNum + ", num=" + num + '}';
    }
    
}
