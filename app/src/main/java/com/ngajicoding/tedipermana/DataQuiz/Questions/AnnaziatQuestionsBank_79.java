package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AnnaziatQuestionsBank_79 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat An-Naziat sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat An-Naziat?",
            "3. Bacakanlah ayat ke-15 dari surat An-Naziat?",
            "4. Bacakanlah ayat ke-20 dari surat An-Naziat",
            "5. Bacakanlah ayat ke-30 dari surat An-Naziat ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 43 ayat", "B. 30 ayat", "C. 45 ayat", "D. 46 ayat"},
            {"A. وَالسّٰبِحٰتِ سَبْحًا ", "B. وَالنّٰزِعٰتِ غَرْقًا", "C. وَالسّٰبِحٰتِ سَبْحًا", "D. فَالْمُدَبِّرٰتِ أَمْرًا"},
            {"A. فَقُلْ هَل لَّكَ إِلَىٰٓ أَن تَزَكَّىٰ", "B. هَلْ أَتَىٰكَ حَدِيثُ مُوسَىٰٓ", "C. فَإِنَّمَا هِىَ زَجْرَةٌ وٰحِدَةٌ", "D. اذْهَبْ إِلَىٰ فِرْعَوْنَ إِنَّهُۥ طَغَىٰ"},
            {"A. فَقُلْ هَل لَّكَ إِلَىٰٓ أَن تَزَكَّىٰ", "B. ثُمَّ أَدْبَرَ يَسْعَىٰ ", "C. فَحَشَرَ فَنَادَىٰ", "D. فَأَرَىٰهُ الْءَايَةَ الْكُبْرَىٰ"},
            {"A. وَالْأَرْضَ بَعْدَ ذٰلِكَ دَحَىٰهَآِ", "B. وَالْجِبَالَ أَرْسَىٰهَا", "C. مَتٰعًا لَّكُمْ وَلِأَنْعٰمِكُمْ ", "D. يَوْمَ يَتَذَكَّرُ الْإِنسٰنُ مَا سَعَىٰ"}
    };

    private String mCorrectAnswers[] = {"D. 46 ayat", "A. وَالسّٰبِحٰتِ سَبْحًا ", "B. هَلْ أَتَىٰكَ حَدِيثُ مُوسَىٰٓ", "D. فَأَرَىٰهُ الْءَايَةَ الْكُبْرَىٰ", "A. وَالْأَرْضَ بَعْدَ ذٰلِكَ دَحَىٰهَآ"};

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
