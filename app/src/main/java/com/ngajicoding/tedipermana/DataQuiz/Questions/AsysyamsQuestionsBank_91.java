package com.ngajicoding.tedipermana.DataQuiz.Questions;

public class AsysyamsQuestionsBank_91 {
    private String textQuestions [] = {
            "1. Ada berapakah jumlah surat  Asy-Syams sebutkan?",
            "2. Bacakanlah ayat ke-3 dari surat Asy-Syams?",
            "3. Bacakanlah ayat ke-10 dari surat  Asy-Syams?",
            "4. Bacakanlah ayat ke-15 dari surat Asy-Syams",
            "5. Bacakanlah ayat ke-12 dari surat  Asy-Syams ?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"A. 15 ayat", "B. 30 ayat", "C. 18 ayat", "D. 20 ayat"},
            {"A. وَنَفْسٍ وَمَا سَوَّىٰهَا ", "B. وَالْأَرْضِ وَمَا طَحَىٰهَا", "C. وَالنَّهَارِ إِذَا جَلَّىٰهَا ", "D. وَالسَّمَآءِ وَمَا بَنَىٰهَا"},
            {"A. وَالسَّمَآءِ وَمَا بَنَىٰهَا", "B. وَنَفْسٍ وَمَا سَوَّىٰهَا ", "C. إِذِ انۢبَعَثَ أَشْقَىٰهَا ", "D. وَقَدْ خَابَ مَن دَسَّىٰهَا"},
            {"A. وَقَدْ خَابَ مَن دَسَّىٰهَا", "B. كَذَّبَتْ ثَمُودُ بِطَغْوَىٰهَآ", "C. إِذِ انۢبَعَثَ أَشْقَىٰهَا", "D. وَلَا يَخَافُ عُقْبٰهَا "},
            {"A. إِذِ انۢبَعَثَ أَشْقَىٰهَاِ", "B. وَلَا يَخَافُ عُقْبٰهَا ", "C. وَقَدْ خَابَ مَن دَسَّىٰهَا", "D. إِذِ انۢبَعَثَ أَشْقَىٰهَا"}
    };

    private String mCorrectAnswers[] = {"A. 15 ayat", "C. وَالنَّهَارِ إِذَا جَلَّىٰهَا ", "D. وَقَدْ خَابَ مَن دَسَّىٰهَا", "D. وَلَا يَخَافُ عُقْبٰهَا ", "A. إِذِ انۢبَعَثَ أَشْقَىٰهَا"};

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
