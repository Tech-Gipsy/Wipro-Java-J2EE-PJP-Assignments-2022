// Create an employee class with properties of your choice. Create an object of this class and also create a clone of the same. After making the clone, change the properties of the original employee object and print the properties of both the original and clone object and note down your observation.
package wrapper;

 class employee implements Cloneable {
    private String name;
    private int id;
    public employee(String n,int i) {
        this.name = n;
        this.id=i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public employee clone() throws CloneNotSupportedException {

            return (employee) super.clone();

    }
}
public class w4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        employee e = new employee("Winnie",1024);
        employee eclone = e.clone();
        eclone.setName("Bunu");
        System.out.println(eclone.getName());
        System.out.println(e.getName());
    }
}
