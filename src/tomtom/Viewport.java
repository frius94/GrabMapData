package tomtom;

public class Viewport {
    private TopLeftPoint topLeftPoint;
    private BtmRightPoint btmRightPoint;

    public Viewport(TopLeftPoint topLeftPoint, BtmRightPoint btmRightPoint) {
        this.topLeftPoint = topLeftPoint;
        this.btmRightPoint = btmRightPoint;
    }

    public TopLeftPoint getTopLeftPoint() {
        return topLeftPoint;
    }

    public void setTopLeftPoint(TopLeftPoint topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public BtmRightPoint getBtmRightPoint() {
        return btmRightPoint;
    }

    public void setBtmRightPoint(BtmRightPoint btmRightPoint) {
        this.btmRightPoint = btmRightPoint;
    }
}
