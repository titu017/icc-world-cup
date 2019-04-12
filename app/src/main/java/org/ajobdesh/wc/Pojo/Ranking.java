package org.ajobdesh.wc.Pojo;

public class Ranking {
    private String one_positionTv;
    private int two_flagTv;
    private String three_TeamTv;
    private String four_WeightedMatchesTv;
    private String five_PointsTv;
    private String six_Rating;

    public Ranking() {
    }

    public Ranking(String one_positionTv, int two_flagTv, String three_TeamTv, String four_WeightedMatchesTv, String five_PointsTv, String six_Rating) {
        this.one_positionTv = one_positionTv;
        this.two_flagTv = two_flagTv;
        this.three_TeamTv = three_TeamTv;
        this.four_WeightedMatchesTv = four_WeightedMatchesTv;
        this.five_PointsTv = five_PointsTv;
        this.six_Rating = six_Rating;
    }

    public String getOne_positionTv() {
        return one_positionTv;
    }

    public void setOne_positionTv(String one_positionTv) {
        this.one_positionTv = one_positionTv;
    }

    public int getTwo_flagTv() {
        return two_flagTv;
    }

    public void setTwo_flagTv(int two_flagTv) {
        this.two_flagTv = two_flagTv;
    }

    public String getThree_TeamTv() {
        return three_TeamTv;
    }

    public void setThree_TeamTv(String three_TeamTv) {
        this.three_TeamTv = three_TeamTv;
    }

    public String getFour_WeightedMatchesTv() {
        return four_WeightedMatchesTv;
    }

    public void setFour_WeightedMatchesTv(String four_WeightedMatchesTv) {
        this.four_WeightedMatchesTv = four_WeightedMatchesTv;
    }

    public String getFive_PointsTv() {
        return five_PointsTv;
    }

    public void setFive_PointsTv(String five_PointsTv) {
        this.five_PointsTv = five_PointsTv;
    }

    public String getSix_Rating() {
        return six_Rating;
    }

    public void setSix_Rating(String six_Rating) {
        this.six_Rating = six_Rating;
    }
}
