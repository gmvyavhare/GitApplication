package app.credila.com.gitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //This is sample only.
        System.out.println("Hello World");

        //This change for branch only
        //Add Button
        //This is also branch change
        //
        init();
    }

    private void init()
    {
        System.out.println("This is Initialization");
    }
}
