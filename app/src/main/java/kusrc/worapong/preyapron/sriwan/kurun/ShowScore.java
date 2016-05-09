package kusrc.worapong.preyapron.sriwan.kurun;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class ShowScore extends AppCompatActivity {

    //Explicit
    private TextView titleTextView, scoreTextView, detailTextView;
    private String titleString, scoreString, detailString;
    private ImageView imageView;
    private boolean bolStatus = false; // คะแนนไม่ผ่าน
    private String[] resultStrings;
    private int userGoldAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_score);

        resultStrings = getIntent().getStringArrayExtra("Result");
        userGoldAnInt = getIntent().getIntExtra("Gold", 0);

        //Bind Widget
        bindWidget();

        //ShowView
        titleString = getIntent().getStringExtra("Base");
        scoreString = Integer.toString(getIntent().getIntExtra("Score", 0));
        titleTextView.setText(titleString);
        scoreTextView.setText(scoreString + "/5");
        imageView.setImageResource(getIntent().getIntExtra("Icon", R.drawable.base1));

        if (Integer.parseInt(scoreString) >= 3) {
            detailTextView.setText("ยินดีด้วยคุณได้ไปต่อ");
            userGoldAnInt += 1;
            bolStatus = true;
        } else {
            detailTextView.setText("ลองใหม่อีกครั้ง");
            bolStatus = false;
        }

    }   // Main Method

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.textView12);
        scoreTextView = (TextView) findViewById(R.id.textView13);
        detailTextView = (TextView) findViewById(R.id.textView14);
        imageView = (ImageView) findViewById(R.id.imageView8);
    }

    public void clickNextShowScore(View view) {

        if (bolStatus) {
            // Score OK 3/5

            //อัพเพื่อเปลี่ยน Gold
            OkHttpClient okHttpClient = new OkHttpClient();
            RequestBody requestBody = new FormEncodingBuilder()
                    .add("isAdd", "true")
                    .add("id", resultStrings[0])
                    .add("Gold", Integer.toString(userGoldAnInt))
                    .build();
            Request.Builder builder = new Request.Builder();
            Request request = builder.url("http://swiftcodingthai.com/keng/php_edit_gold.php")
                    .post(requestBody).build();
            Call call = okHttpClient.newCall(request);
            call.enqueue(new Callback() {
                @Override
                public void onFailure(Request request, IOException e) {

                }

                @Override
                public void onResponse(Response response) throws IOException {

                }
            });

            Intent intent = new Intent(ShowScore.this, MapsActivity.class);
            intent.putExtra("Result", resultStrings);
            intent.putExtra("Status", false);
            startActivity(intent);
        } else {
            // Score False
            finish();
        }

    }   // clickNext

}   // Main Class
