public class Parcel {
  private double mWidth;
  private double mHeight;
  private double mDepth;
  private double mWeight;
  private double mVolume;
  private double mBasicShippingCost;

  public Parcel(double width, double height, double depth, double weight) {
    mWidth = width;
    mHeight = height;
    mDepth = depth;
    mWeight = weight;
  }

  public double getVolume() {
    return mVolume = mWidth * mHeight * mDepth;
  }

  public double getBasicShippingCost() {
    mBasicShippingCost = getVolume() * mWeight / 10.0;
    mBasicShippingCost = Math.round(mBasicShippingCost * 100);
    mBasicShippingCost = mBasicShippingCost / 100;
    return mBasicShippingCost;
  }

  public double speedModifier(double shipSpeed) {
    return getBasicShippingCost() * shipSpeed;
  }
}
