public class Exams {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (Workbook 6.2).
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");
        
        String[] studentList = {"Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"};

        
        
        // Compare your result to what's on Learn the Part.
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i] +" you will take seat" + i);
        }

    }
}
