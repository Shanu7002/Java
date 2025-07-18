package Challenge.Entities;

public class Department {
    private String departmentName;

    public Department() {

    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public String toString() {
        return departmentName;
    }
}
