/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

/**
 *
 * @author Christian
 */
public class Vino {
    int index;
    long price;
    String country,description,designation,points,province,region_1,region_2,taster_name,taster_twitter_handle,title,variety,winery;

    public Vino(int index, String country, String description, String designation, String points, long price, String province, String region_1, String region_2, String taster_name, String taster_twitter_handle, String title, String variety, String winery) {
        this.index = index;
        this.country = country;
        this.description = description;
        this.designation = designation;
        this.points = points;
        this.price = price;
        this.province = province;
        this.region_1 = region_1;
        this.region_2 = region_2;
        this.taster_name = taster_name;
        this.taster_twitter_handle = taster_twitter_handle;
        this.title = title;
        this.variety = variety;
        this.winery = winery;
    }

    public Vino(long price, String country, String description, String title) {
        this.price = price;
        this.country = country;
        this.description = description;
        this.title = title;
    }
    
    

    public int getIndex() {
        return index;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    public String getDesignation() {
        return designation;
    }

    public String getPoints() {
        return points;
    }

    public long getPrice() {
        return price;
    }

    public String getProvince() {
        return province;
    }

    public String getRegion_1() {
        return region_1;
    }

    public String getRegion_2() {
        return region_2;
    }

    public String getTaster_name() {
        return taster_name;
    }

    public String getTaster_twitter_handle() {
        return taster_twitter_handle;
    }

    public String getTitle() {
        return title;
    }

    public String getVariety() {
        return variety;
    }

    public String getWinery() {
        return winery;
    }

    @Override
    public String toString() {
        return "Vino{" + "price=" + price + ", country=" + country + ", description=" + description + ", title=" + title + '}';
    }

    

    
    
    
}
