import java.util.ArrayList;

public class User {
  private String birthdate;
  private int size;
  private ArrayList<Photo> photos;
  private Address address;

  public User(String cBirthday, int cSize, ArrayList<Photo> cPhoto, Address cAddress) {
    this.birthdate = cBirthday;
    this.size = cSize;
    this.photos = cPhoto;
    this.address = cAddress;
  }

  public String getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(String birthdate) {
    this.birthdate = birthdate;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public ArrayList<Photo> getPhotos() {
    return photos;
  }

  public void setPhotos(ArrayList<Photo> photos) {
    this.photos = photos;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
