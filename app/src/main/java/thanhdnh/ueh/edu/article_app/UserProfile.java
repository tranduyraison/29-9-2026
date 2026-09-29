package thanhdnh.ueh.edu.article_app;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserProfile {
  @SerializedName(value = "id", alternate = {"user_id", "article_id"})
  @Expose
  private int id;

  @SerializedName(value = "username", alternate = {"user_name", "article_title", "title", "name"})
  @Expose
  private String username;

  @SerializedName(value = "email")
  @Expose
  private String email;

  @SerializedName(value = "description", alternate = {"article_description", "desc"})
  @Expose
  private String description;

  @SerializedName(value = "avatar_url", alternate = {"article_image", "avatar", "image"})
  @Expose
  private String avatar_url;

  @SerializedName(value = "hobby")
  @Expose
  private String hobby;

  public UserProfile() {
  }

  public UserProfile(int id, String username, String email, String description, String avatar_url, String hobby) {
    this.id = id;
    this.username = username;
    this.email = email;
    this.description = description;
    this.avatar_url = avatar_url;
    this.hobby = hobby;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUsername() {
    if (username == null || username.isEmpty()) {
      return "User " + id;
    }
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    if (email == null || email.isEmpty()) {
      return "user" + id + "@example.com";
    }
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getDescription() {
    if (description == null || description.isEmpty()) {
      return "No description available.";
    }
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAvatar_url() {
    return avatar_url;
  }

  public void setAvatar_url(String avatar_url) {
    this.avatar_url = avatar_url;
  }

  public String getHobby() {
    if (hobby == null || hobby.isEmpty()) {
      return "Reading, Photography";
    }
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }
}
