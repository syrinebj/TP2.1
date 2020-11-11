package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.hellotoast.R.id.show_count;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_MESSAGE =
            "com.example.android.hello.extra.MESSAGE";
    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Log.d(TAG,"R1 : La deuxième activité est ajoutée en tant que classe Java, le fichier de présentation (layout) XML est créé et le fichier AndroidManifest.xml est modifié pour déclarer une deuxième activité.");
        Log.d(TAG,"R2 : Le bouton Up (Haut) de la barre d'applications n'apparaît plus dans la deuxième activité pour renvoyer l'utilisateur à l'activité parent.");
        Log.d(TAG,"R3: new Intent(Context context, Class<?> class)");
        Log.d(TAG,"R4:Comme extra d'intention (Intent)");
        Log.d(TAG,"R5: Tout ce qui précède.");
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }


    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) mShowCount.setText(Integer.toString(mCount));
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, hello.class);
        String message = mShowCount.getText().toString();
        Log.d(LOG_TAG, message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}