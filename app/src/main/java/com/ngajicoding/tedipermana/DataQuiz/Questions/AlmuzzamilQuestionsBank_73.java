package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlmuzzamilQuestionsBank_73 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat  Al-Muzzammil sebutkan?",
            "2. Bacakanlah ayat ke-1 dari surat  Al-Muzzammil?",
            "3. Bacakanlah ayat ke-5 dari surat  Al-Muzzammil?",
            "4. Bacakanlah ayat ke-12 dari surat  Al-Muzzammil",
            "5. Bacakanlah ayat ke-11 dari surat  Al-Muzzammil ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 23 ayat", "B. 20 ayat", "C. 15 ayat", "D. 30 ayat"},
            {"A. يٰٓأَيُّهَا الْمُزَّمِّلُ", "B. إِنَّ لَكَ فِى النَّهَارِ سَبْحًا طَوِيلًا ", "C. نِّصْفَهُۥٓ أَوِ انقُصْ مِنْهُ قَلِيلًا ", "D. إِنَّا سَنُلْقِى عَلَيْكَ قَوْلًا ثَقِيلًا "},
            {"A. إِنَّا سَنُلْقِى عَلَيْكَ قَوْلًا ثَقِيلًا ", "B. يٰٓأَيُّهَا الْمُزَّمِّلُ", "C. إِنَّ لَكَ فِى النَّهَارِ سَبْحًا طَوِيلًا", "D. وَاذْكُرِ اسْمَ رَبِّكَ وَتَبَتَّلْ إِلَيْهِ تَبْتِيلًا"},
            {"A. وَاذْكُرِ اسْمَ رَبِّكَ وَتَبَتَّلْ إِلَيْهِ تَبْتِيلًا", "B. إِنَّ لَكَ فِى النَّهَارِ سَبْحًا طَوِيلًا", "C. فَعَصَىٰ فِرْعَوْنُ الرَّسُولَ فَأَخَذْنٰهُ أَخْذًا وَبِيلًا ", "D. إِنَّ لَدَيْنَآ أَنكَالًا وَجَحِيمًا "},
            {"A. وَذَرْنِى وَالْمُكَذِّبِينَ أُو۟لِى النَّعْمَةِ وَمَهِّلْهُمْ قَلِيلًاِ", "B. يٰٓأَيُّهَا الْمُزَّمِّلُ", "C. وَاذْكُرِ اسْمَ رَبِّكَ وَتَبَتَّلْ إِلَيْهِ تَبْتِيلًا", "D. إِنَّ لَدَيْنَآ أَنكَالًا وَجَحِيمًا "}
    };

    private String mCorrectAnswers[] = {"B. 20 ayat", "A. يٰٓأَيُّهَا الْمُزَّمِّلُُّ", "A. إِنَّا سَنُلْقِى عَلَيْكَ قَوْلًا ثَقِيلًا ", " D. إِنَّ لَدَيْنَآ أَنكَالًا وَجَحِيمًا ", " A. وَذَرْنِى وَالْمُكَذِّبِينَ أُو۟لِى النَّعْمَةِ وَمَهِّلْهُمْ قَلِيلًا"};

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
