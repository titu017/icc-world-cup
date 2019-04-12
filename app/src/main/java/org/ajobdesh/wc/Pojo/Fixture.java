package org.ajobdesh.wc.Pojo;

public class Fixture {
    private String matchNoTv;
    private String one_dateTv;
    private String two_timeTv;
    private String three_locationTv;
    private int four_image1Iv;
    private int five_image2Iv;
    private String six_team1Tv;
    private String seven_team2Tv;

    public Fixture(String matchNoTv, String one_dateTv, String two_timeTv, String three_locationTv, int four_image1Iv, int five_image2Iv, String six_team1Tv, String seven_team2Tv) {
        this.matchNoTv = matchNoTv;
        this.one_dateTv = one_dateTv;
        this.two_timeTv = two_timeTv;
        this.three_locationTv = three_locationTv;
        this.four_image1Iv = four_image1Iv;
        this.five_image2Iv = five_image2Iv;
        this.six_team1Tv = six_team1Tv;
        this.seven_team2Tv = seven_team2Tv;
    }

    public Fixture() {

    }

    public String getMatchNoTv() {
        return matchNoTv;
    }

    public void setMatchNoTv(String matchNoTv) {
        this.matchNoTv = matchNoTv;
    }

    public String getOne_dateTv() {
        return one_dateTv;
    }

    public void setOne_dateTv(String one_dateTv) {
        this.one_dateTv = one_dateTv;
    }

    public String getTwo_timeTv() {
        return two_timeTv;
    }

    public void setTwo_timeTv(String two_timeTv) {
        this.two_timeTv = two_timeTv;
    }

    public String getThree_locationTv() {
        return three_locationTv;
    }

    public void setThree_locationTv(String three_locationTv) {
        this.three_locationTv = three_locationTv;
    }

    public int getFour_image1Iv() {
        return four_image1Iv;
    }

    public void setFour_image1Iv(int four_image1Iv) {
        this.four_image1Iv = four_image1Iv;
    }

    public int getFive_image2Iv() {
        return five_image2Iv;
    }

    public void setFive_image2Iv(int five_image2Iv) {
        this.five_image2Iv = five_image2Iv;
    }

    public String getSix_team1Tv() {
        return six_team1Tv;
    }

    public void setSix_team1Tv(String six_team1Tv) {
        this.six_team1Tv = six_team1Tv;
    }

    public String getSeven_team2Tv() {
        return seven_team2Tv;
    }

    public void setSeven_team2Tv(String seven_team2Tv) {
        this.seven_team2Tv = seven_team2Tv;
    }
}
