public class StudentGradesTable {
    public static void main(String[] args) {
        int ahmadLabMarks = 43;
        int ahmadBonusMarks = 8;
        int ahmadTotalMarks = ahmadLabMarks + ahmadBonusMarks;

        int bobLabMarks = 27;
        int bobBonusMarks = 5;
        int bobTotalMarks = bobLabMarks + bobBonusMarks;

        int geraldLabMarks = 42;
        int geraldBonusMarks = 3;
        int geraldTotalMarks = geraldLabMarks + geraldBonusMarks;

        int harryLabMarks = 50;
        int harryBonusMarks = 10;
        int harryTotalMarks = harryLabMarks + harryBonusMarks;

        int steveLabMarks = 30;
        int steveBonusMarks = 20;
        int steveTotalMarks = steveLabMarks + steveBonusMarks;

        String tableHeaders = "Name         " + "   Lab" + "     Bonus" + "   Total";

        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println(tableHeaders);
        System.out.println("----            ---     -----   -----");
        System.out.println("Ahmad           " + ahmadLabMarks + "      " + ahmadBonusMarks + "       " + ahmadTotalMarks);
        System.out.println("Bob             " + bobLabMarks + "      " + bobBonusMarks + "       " + bobTotalMarks);
        System.out.println("Gerald          " + geraldLabMarks + "      " + geraldBonusMarks + "       " + geraldTotalMarks);
        System.out.println("Harry           " + harryLabMarks + "      " + harryBonusMarks + "      " + harryTotalMarks);
        System.out.println("Steve           " + steveLabMarks + "      " + steveBonusMarks + "      " + steveTotalMarks);
    }
}
