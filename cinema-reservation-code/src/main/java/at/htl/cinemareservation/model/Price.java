package at.htl.cinemareservation.model;

public class Price {
    private long id ;
    private Presentation presentation;
    private Row row;
    private double specialPrice;

    public Price(Presentation presentation, Row row, double specialPrice) {
        this.presentation = presentation;
        this.row = row;
        this.specialPrice = specialPrice;
    }
    public Price(Presentation presentation, Row row) {
        this.presentation = presentation;
        this.row = row;
    }

    public Presentation getPresentation() {
        return presentation;
    }

    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }

    public Row getRow() {
        return row;
    }

    public void setRow(Row row) {
        this.row = row;
    }

    public double getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(double specialPrice) {
        this.specialPrice = specialPrice;
    }
}
