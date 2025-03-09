package streams.entity;
import java.math.BigDecimal;

public class Item {
    private String name;
    private String description;

    private BigDecimal price;

    public Item(String name, String description, BigDecimal price)
    {
        this.name =name;
        this.description = description;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public BigDecimal getPrice(){
        return  this.price;
    }

    public  void setPrice(BigDecimal price){
        this.price = price;
    }
}
