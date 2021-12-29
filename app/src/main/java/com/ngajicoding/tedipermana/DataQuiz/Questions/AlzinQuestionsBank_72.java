package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlzinQuestionsBank_72 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat  Al-Jinn sebutkan ?",
            "2. Bacakanlah ayat ke-21 dari surat Al-Jinn?",
            "3. Bacakanlah ayat ke-4 dari surat  Al-Jinn?",
            "4. Bacakanlah ayat ke-7 dari surat  Al-Jinn?",
            "5. Bacakanlah ayat ke-20 dari surat  Al-Jinn?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 22 ayat", "B. 27 ayat", "C. 40 ayat", "D. 28 ayat"},
            {"A. قُلْ إِنَّمَآ أَدْعُوا۟ رَبِّى وَلَآ أُشْرِكُ بِهِۦٓ أَحَدًا", "B. وَأَمَّا الْقٰسِطُونَ فَكَانُوا۟ لِجَهَنَّمَ حَطَبًا", "C. قُلْ إِنِّى لَآ أَمْلِكُ لَكُمْ ضَرًّا وَلَا رَشَدًا", "D. عٰلِمُ الْغَيْبِ فَلَا يُظْهِرُ عَلَىٰ غَيْبِهِۦٓ أَحَدًا "},
            {"A. وَأَنَّهُۥ كَانَ يَقُولُ سَفِيهُنَا عَلَى اللَّـهِ شَطَطًا", "B. وَأَمَّا الْقٰسِطُونَ فَكَانُوا۟ لِجَهَنَّمَ حَطَبًا", "C. وَأَنَّهُۥ تَعٰلَىٰ جَدُّ رَبِّنَا مَا اتَّخَذَ صٰحِبَةً وَلَا وَلَدًا", "D. قُلْ إِنَّمَآ أَدْعُوا۟ رَبِّى وَلَآ أُشْرِكُ بِهِۦٓ أَحَدًا "},
            {"A. وَأَنَّهُمْ ظَنُّوا۟ كَمَا ظَنَنتُمْ أَن لَّن يَبْعَثَ اللَّـهُ أَحَدًا", "B. قُلْ إِنِّى لَآ أَمْلِكُ لَكُمْ ضَرًّا وَلَا رَشَدًا", "C. وَأَمَّا الْقٰسِطُونَ فَكَانُوا۟ لِجَهَنَّمَ حَطَبًا", "D. قُلْ إِنِّى لَآ أَمْلِكُ لَكُمْ ضَرًّا وَلَا رَشَدًا"},
            {"A. وَأَنَّ الْمَسٰجِدَ لِلَّـهِ فَلَا تَدْعُوا۟ مَعَ اللَّـهِ أَحَدًا ِ", "B. قُلْ إِنَّمَآ أَدْعُوا۟ رَبِّى وَلَآ أُشْرِكُ بِهِۦٓ أَحَدًا ", "C. قُلْ إِنِّى لَآ أَمْلِكُ لَكُمْ ضَرًّا وَلَا رَشَدًا", "D. وَأَمَّا الْقٰسِطُونَ فَكَانُوا۟ لِجَهَنَّمَ حَطَبًا"}
    };

    private String mCorrectAnswers[] = {"D. 28 ayat", "C. قُلْ إِنِّى لَآ أَمْلِكُ لَكُمْ ضَرًّا وَلَا رَشَدًا", "A. وَأَنَّهُۥ كَانَ يَقُولُ سَفِيهُنَا عَلَى اللَّـهِ شَطَطًا", "A وَأَنَّهُمْ ظَنُّوا۟ كَمَا ظَنَنتُمْ أَن لَّن يَبْعَثَ اللَّـهُ أَحَدًا", "B. قُلْ إِنَّمَآ أَدْعُوا۟ رَبِّى وَلَآ أُشْرِكُ بِهِۦٓ أَحَدًا "};

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
