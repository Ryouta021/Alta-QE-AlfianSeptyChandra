public class Problem2 {
    //    A = 80 - 100
//    B+ = 65 - 79
//    B = 50 - 64
//    C = 35 - 49
//    D = 0 - 34
//    <0 OR >100 = INVALID
    public static void main(String[] args) {
        int studentscore = 80;

        String nilai = "";

        if (studentscore >= 80 && studentscore <= 100) {
            nilai = "A";
        } else if (studentscore >= 65 && studentscore <= 79) {
            nilai = "B+";
        } else if (studentscore >= 50 && studentscore <= 64){
            nilai = "B";
        }else if(studentscore >=35&&studentscore <=49){
            nilai = "C";
        }else if (studentscore >= 0 && studentscore <= 34){
            nilai = "D";
        }else {
            nilai = "INVALID";
        }

        System.out.println("nilainya adalah :" + nilai);
    }
}
