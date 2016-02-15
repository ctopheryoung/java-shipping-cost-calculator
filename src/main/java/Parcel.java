public class Parcel {
  private int mWidth;
  private int mHeight;
  private int mDepth;
  private double mWeight;

  public Parcel(int width, int height, int depth, double weight) {
    mWidth = width;
    mHeight = height;
    mDepth = depth;
    mWeight = weight;
  }

  public int getVolume() {
    return mWidth * mHeight * mDepth;
  }
}
