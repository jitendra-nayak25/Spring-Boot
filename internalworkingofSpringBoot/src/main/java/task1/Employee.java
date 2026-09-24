package task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    int e_id;
    String e_name;
    Department e_dept;



        Employee(int e_id, String e_name, Department e_dept) {
            this.e_id = e_id;
            this.e_name = e_name;
            this.e_dept = e_dept;
        }

        @Override
        public String toString() {
            return "Employee [e_id=" + e_id + ", e_name=" + e_name + ", e_dept=" + e_dept +"]";
        }

}