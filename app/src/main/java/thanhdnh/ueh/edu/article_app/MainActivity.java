package thanhdnh.ueh.edu.article_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  public GridView gridview;

  private final AdapterView.OnItemClickListener onitemclick = new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
      Intent intent = new Intent(getBaseContext(), ViewUserActivity.class);
      intent.putExtra("id", gridview.getAdapter().getItemId(position));
      startActivity(intent);
    }
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (getSupportActionBar() != null) {
      getSupportActionBar().hide();
    }

    gridview = findViewById(R.id.gridview);
    new UserData(getBaseContext(), gridview).loadData("https://gist.githubusercontent.com/tranduyraison/070236ae6f997575f869d5e42d034d7b/raw/92e16f65a7a83961bec95388d9c3d9c231894c7a/gistfile1.json", this);
    gridview.setOnItemClickListener(onitemclick);
  }
}