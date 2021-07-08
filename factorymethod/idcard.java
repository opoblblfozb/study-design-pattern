package idcard;

import framework.*;
import java.util.*;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner){
        System.out.println(owner + "のカードを作ります．");
        this.owner = owner;
    }
    public void use() {
        System.out.println(owner + "のカードを使います．");
    }
    public String getOwner(){
        return owner;
    }
}

public class IDCardFactory extends Factory{
    private List owners = new ArrayList();
    protected Product createProduct(String owner){
        return new IDCard(owner);
    }
    protected void registerProduct(Product product){
        owners.add((IDCard)product).getOwner();
    }
    public List getOwners(){
        return owners;
    }
}