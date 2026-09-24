package task1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Department {
    @Value("100")
    int d_id;
    @Value("MCA")
    String d_name;

    public Department() {
    }

    @Override
    public String toString() {
        return "Department [d_id=" + d_id + ", d_name=" + d_name + "]";
    }

}
