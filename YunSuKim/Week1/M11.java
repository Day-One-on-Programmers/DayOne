package Week1;

public class M11 {
    public int solution(int score) {
        int grade = 0;
        if(score >= 90)
            grade = 1;
        else if(score >= 80)
            grade = 2;
        else
            grade = 3;

        // if문 : 90보다 크거나 같으면, 1

        // else if문 : 80보다 크거나 같고 ~ 90보다 작으면, 2

        // else문 : 80보다 작으면, 3

        return grade;
    }

}
