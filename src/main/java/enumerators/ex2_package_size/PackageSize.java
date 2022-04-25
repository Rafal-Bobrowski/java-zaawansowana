package enumerators.ex2_package_size;

public enum PackageSize {
    SMALL(10, 80),
    MEDIUM(80, 120),
    LARGE(120, 180),
    UNKNOWN(0,0);

    final int minSize;
    final int maxSize;

    PackageSize(int minSize, int maxSize) {
        this.maxSize = maxSize;
        this.minSize = minSize;
    }

    static PackageSize getPackageSize(int minSize, int maxSize){
        for (PackageSize packageSize : values()){
            if (packageSize.minSize <= minSize && packageSize.maxSize >= maxSize){
                return packageSize;
            }
        }
        return UNKNOWN;
    }
}
