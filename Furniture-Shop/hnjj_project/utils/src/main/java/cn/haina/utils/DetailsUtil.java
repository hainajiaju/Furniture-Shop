package cn.haina.utils;

/**
 * 历史商品传参类
 */
public class DetailsUtil {
    private Integer spuId;
    private double price;
    private String name;
    private String imgPic;

    public DetailsUtil(Integer spuId, double price, String name, String imgPic) {
        this.spuId = spuId;
        this.price = price;
        this.name = name;
        this.imgPic = imgPic;
    }

    @Override
    public String toString() {
        return "DetailsUtil{" +
                "spuId=" + spuId +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", imgPic='" + imgPic + '\'' +
                '}';
    }

    public DetailsUtil() {
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPic() {
        return imgPic;
    }

    public void setImgPic(String imgPic) {
        this.imgPic = imgPic;
    }
}
