public class TestClass {
    public static void main(String[] args) {
        StudyGroup studyGroup = new StudyGroup();
        System.out.println("grupa składa się z prowadzącego: "+studyGroup.teacher.getFirstName()
                +" "+studyGroup.teacher.getLastName()+", oraz studentów: "+
        studyGroup.student1.getFirstName()+" "+studyGroup.student1.getLastName()
                +" i "+studyGroup.student2.getFirstName()+" "
                +studyGroup.student2.getLastName());
    }
}
