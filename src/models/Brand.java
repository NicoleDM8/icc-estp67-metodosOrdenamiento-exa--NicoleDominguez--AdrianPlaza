package models;

import java.util.Arrays;

public class Brand {
  private String brandName;
  private CarModel[] carModels;
  
  public Brand(String brandName, CarModel[] carModels) {
    this.brandName = brandName;
    this.carModels = carModels;
  }
  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public CarModel[] getCarModels() {
    return carModels;
  }

  public void setCarModels(CarModel[] carModels) {
    this.carModels = carModels;
  }
  public int getTotalValidYears() {
    int total = 0;
    if (this.carModels != null) {
        for (CarModel modelo : this.carModels) {
            if (modelo != null && modelo.getYears() != null) {
                for (CarYear year : modelo.getYears()) {
                    if (year != null && year.IsValid()) {
                        total++;
                    }
                }
            }
        }
    }
    return total;
  }
  @Override
  public String toString() {
    return "Brand [brandName=" + brandName + ", carModels=" + Arrays.toString(carModels) + "]";
  }
  
}



