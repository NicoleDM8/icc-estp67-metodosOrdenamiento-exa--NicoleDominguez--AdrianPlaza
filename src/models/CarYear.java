package models;

public class CarYear {

  int year;
  boolean IsValid;
  public CarYear(int year, boolean isValid) {
    this.year = year;
    IsValid = isValid;
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public boolean IsValid() {
    return IsValid;
  }
  public void setIsValid(boolean isValid) {
    IsValid = isValid;
  }
  @Override
  public String toString() {
    return "CarYear [year=" + year + ", IsValid=" + IsValid + "]";
  }
  

}
