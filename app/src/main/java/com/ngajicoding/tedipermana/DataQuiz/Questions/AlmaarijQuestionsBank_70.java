package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AlmaarijQuestionsBank_70 {

    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat Al-Ma'arij sebutkan ?",
            "2. Bacakanlah ayat ke-3 dari surat Al-Ma'arij ?",
            "3. Bacakanlah ayat ke-16 dari surat Al-Ma'arij ?",
            "4. Bacakanlah ayat ke-33 dari surat Al-Ma'arij",
            "5. Bacakanlah ayat ke-29 dari surat Al-Ma'arij ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 44 ayat", "B. 50 ayat", "C. 30 ayat", "D. 33 ayat"},
            {"A. مِّنَ اللَّـهِ ذِى الْمَعَارِجِ", "B. إِنَّهُمْ يَرَوْنَهُۥ بَعِيدًا", "C. فَاصْبِرْ صَبْرًا جَمِيلًا", "D. وَنَرَىٰهُ قَرِيبًا"},
            {"A. نَزَّاعَةً لِّلشَّوَىٰ", "B. وَصٰحِبَتِهِۦ وَأَخِيهِ ", "C. إِذَا مَسَّهُ الشَّرُّ جَزُوعًا ", "D. تَدْعُوا۟ مَنْ أَدْبَرَ وَتَوَلَّىٰ "},
            {"A. أُو۟لٰٓئِكَ فِى جَنّٰتٍ مُّكْرَمُونَ", "B. لِّلسَّآئِلِ وَالْمَحْرُومِ", "C. عَنِ الْيَمِينِ وَعَنِ الشِّمَالِ عِزِينَ", "D. وَالَّذِينَ هُم بِشَهٰدٰتِهِمْ قَآئِمُونَ"},
            {"A. نَزَّاعَةً لِّلشَّوَىِٰ", "B. وَالَّذِينَ هُمْ لِفُرُوجِهِمْ حٰفِظُونَ", "C. فَمَالِ الَّذِينَ كَفَرُوا۟ قِبَلَكَ مُهْطِعِينَ ", "D. تَدْعُوا۟ مَنْ أَدْبَرَ وَتَوَلَّىٰ "}
    };

    private String mCorrectAnswers[] = {"A. 44 ayat", "A. مِّنَ اللَّـهِ ذِى الْمَعَارِجِ", "A. نَزَّاعَةً لِّلشَّوَىٰ", "D. وَالَّذِينَ هُم بِشَهٰدٰتِهِمْ قَآئِمُونَ", " B وَالَّذِينَ هُمْ لِفُرُوجِهِمْ حٰفِظُونَ"};

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
