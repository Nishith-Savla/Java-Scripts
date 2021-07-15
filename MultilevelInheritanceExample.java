public class MultilevelInheritanceExample {
    public static void main (String[] args) {
        Test test = new Test(46, "Nishith", "Computer", 90, 80, 95);
        Result result = new Result(46, "Nishith", "Computer", 90, 80, 95, test.calculateTotal(), test.calculatePercentage());
        result.displayResult();
    }
}

class Student {

    protected int rollNo;
    protected String name;
    protected String branch;

    public Student(int rollNo, String name, String branch) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }
}

class Test extends Student {

    protected int sub1;
    protected int sub2;
    protected int sub3;

    public Test(int rollNo, String name, String branch, int sub1, int sub2, int sub3) {
        super(rollNo, name, branch);
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }

    public int getSub1() {
        return sub1;
    }

    public void setSub2(int sub2) {
        this.sub2 = sub2;
    }

    public int getSub2() {
        return sub2;
    }

    public void setSub3(int sub3) {
        this.sub3 = sub3;
    }

    public int getSub3() {
        return sub3;
    }

    public int calculateTotal() {
        return sub1 + sub2 + sub3;
    }

    public float calculatePercentage() {
        return calculateTotal()/3;
    }

}

class Result extends Test {

    protected int total;
    protected float percentage;

    public Result(int rollNo, String name, String branch, int sub1, int sub2, int sub3, int total, float percentage) {
        super(rollNo, name, branch, sub1, sub2, sub3);
        this.total = total;
        this.percentage = percentage;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public float getPercentage() {
        return percentage;
    }

    public void displayResult() {
        System.out.println("RollNo: " + rollNo + " Name: " + name + " Branch: " + branch);
        System.out.println("Marks: " + sub1 + ' ' + sub2 + ' ' + sub3);
        System.out.println("Total: " + total + " & Percentage: " + percentage);
    }
}
