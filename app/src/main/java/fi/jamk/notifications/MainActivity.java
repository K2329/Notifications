package fi.jamk.notifications;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    


    // this method is called from layout (activity_main)
    public void showShortToast(View view) {
        Toast.makeText(getApplicationContext(), "Lyhyempi aika", Toast.LENGTH_SHORT).show();
    }

    // this method is called from layout (activity_main)
    public void showLongToast(View view) {
        Toast.makeText(getApplicationContext(), "Pidempi aika", Toast.LENGTH_LONG).show();
    }

    // this method is called from layout (activity_main)
    public void showCustomPositionToast(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Nyt mentiin oikealle", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM|Gravity.RIGHT, 0, 0);
        toast.show();
    }

    // this method is called from layout (activity_main)
    public void showCustomLayoutToast1(View view) {
        // get layout from Activity
        LayoutInflater inflater = getLayoutInflater();
        // inflate layout from XML (toast.xml)
        View layout = inflater.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.toast));
        // get image from resource
        ImageView image = (ImageView) layout.findViewById(R.id.imageView);
        image.setImageResource(R.drawable.jyplogo);
        // set text
        TextView text = (TextView) layout.findViewById(R.id.textView);
        text.setText("Take a look at the best team in Liiga!");
        // create and show toast
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }

    // this method is called from layout (activity_main)
    public void showCustomLayoutToast(View view) {
        // get layout from Activity
        LayoutInflater inflater = getLayoutInflater();
        // inflate layout from XML (toast.xml)
        View layout = inflater.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.toast));
        // get image from resource
        ImageView image = (ImageView) layout.findViewById(R.id.imageView);
        image.setImageResource(R.drawable.redwings);
        // set text
        TextView text = (TextView) layout.findViewById(R.id.textView);
        text.setText("Take a look at the best team in the NHL!");
        // create and show toast
        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}