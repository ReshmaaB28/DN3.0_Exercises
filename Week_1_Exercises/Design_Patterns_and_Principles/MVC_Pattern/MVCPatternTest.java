package MVC_Pattern;

// MVCPatternTest.java
public class MVCPatternTest {
    public static void main(String[] args) {
        // Create model
        Student student = new Student("John Doe", 1, "A");

        // Create view
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Update and display student details
        controller.updateView();

        // Modify student details
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Display updated student details
        controller.updateView();
    }
}

