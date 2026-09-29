package thanhdnh.ueh.edu.article_app;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class ViewUserActivity extends AppCompatActivity {
  ImageView iv_detail_avatar;
  TextView tv_detail_username, tv_detail_email, tv_detail_description, tv_detail_hobby;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_view_user);
    if (getSupportActionBar() != null) {
      getSupportActionBar().hide();
    }

    iv_detail_avatar = findViewById(R.id.iv_detail_avatar);
    tv_detail_username = findViewById(R.id.tv_detail_username);
    tv_detail_email = findViewById(R.id.tv_detail_email);
    tv_detail_description = findViewById(R.id.tv_detail_description);
    tv_detail_hobby = findViewById(R.id.tv_detail_hobby);

    int id = (int) getIntent().getLongExtra("id", 0);
    UserProfile user = UserData.getUserFromId(id);

    if (user != null) {
      if (user.getAvatar_url() != null && !user.getAvatar_url().isEmpty()) {
        Picasso.get().load(user.getAvatar_url()).resize(400, 500).centerCrop().into(iv_detail_avatar);
      }
      tv_detail_username.setText(user.getUsername());
      tv_detail_email.setText("Email: " + user.getEmail());
      tv_detail_description.setText("Description: " + user.getDescription());
      tv_detail_hobby.setText("Hobby: " + user.getHobby());
    }
  }
}