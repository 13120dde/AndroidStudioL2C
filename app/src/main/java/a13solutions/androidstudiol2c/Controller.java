package a13solutions.androidstudiol2c;

/**
 * Created by 13120dde on 2017-09-10.
 */

public class Controller {

    private int index = 0;
    private ViewerFragment viewerFragment;
    private ButtonFragment buttonFragment;

    public Controller(ViewerFragment viewerFragment, ButtonFragment buttonFragment) {
        this.viewerFragment=viewerFragment;
        this.buttonFragment=buttonFragment;
        buttonFragment.setController(this);
    }

    public void increment() {
        viewerFragment.setText(++index);
    }
}
