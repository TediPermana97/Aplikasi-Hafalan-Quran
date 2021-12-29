package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AnnabaQuestionsBank_78 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat An-Naba sebutkan ?",
            "2. Bacakanlah ayat ke-5 dari surat An-Naba ?",
            "3. Bacakanlah ayat ke-10 dari surat An-Naba?",
            "4. Bacakanlah ayat ke-20 dari surat An-Naba?",
            "5. Bacakanlah ayat ke-34 dari surat An-Naba ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 35 ayat", "B. 30 ayat", "C. 45 ayat", "D. 40 ayat"},
            {"A. عَنِ النَّبَإِ الْعَظِيمِ", "B. أَلَمْ نَجْعَلِ الْأَرْضَ مِهٰدًا", "C. ثُمَّ كَلَّا سَيَعْلَمُونَ", "D. عَمَّ يَتَسَآءَلُونَ"},
            {"A. وَجَعَلْنَا الَّيْلَ لِبَاسًا", "B. وَبَنَيْنَا فَوْقَكُمْ سَبْعًا شِدَادًا", "C. وَخَلَقْنٰكُمْ أَزْوٰجًا", "D. وَجَعَلْنَا سِرَاجًا وَهَّاجًا"},
            {"A. إِنَّ جَهَنَّمَ كَانَتْ مِرْصَادًا", "B. لّٰبِثِينَ فِيهَآ أَحْقَابًا ", "C. وَسُيِّرَتِ الْجِبَالُ فَكَانَتْ سَرَابًا", "D. وَفُتِحَتِ السَّمَآءُ فَكَانَتْ أَبْوٰبًا"},
            {"A. جَزَآءً مِّن رَّبِّكَ عَطَآءً حِسَابًاِ", "B. وَكَأْسًا دِهَاقًا", "C. وَكَوَاعِبَ أَتْرَابًا ", "D. وَجَعَلْنَا سِرَاجًا وَهَّاجًا"}
    };

    private String mCorrectAnswers[] = {"D. 40 ayat", "C. ثُمَّ كَلَّا سَيَعْلَمُونَ", "A. وَجَعَلْنَا الَّيْلَ لِبَاسًا", "C. وَسُيِّرَتِ الْجِبَالُ فَكَانَتْ سَرَابًا", "B. وَكَأْسًا دِهَاقًا"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
