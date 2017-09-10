package a13solutions.androidstudiol2c;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    private Controller controller;
    private ViewerFragment viewerFragment;
    private ButtonFragment buttonFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instantiateController();
    }

    private void instantiateController() {
        FragmentManager fm = getFragmentManager();
        viewerFragment = (ViewerFragment) fm.findFragmentById(R.id.fragViewer);
        buttonFragment = (ButtonFragment) fm.findFragmentById(R.id.fragButton);
        controller = new Controller(viewerFragment, buttonFragment);
    }
}
