package a13solutions.androidstudiol2c;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ViewerFragment extends Fragment {


    private TextView tvCounter;

    public ViewerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_viewer, container, false);
        instantiateComponents(view);
        return  view;
    }

    private void instantiateComponents(View view) {
        tvCounter = view.findViewById(R.id.tvCounter);
    }

    public void setText(int number){
        tvCounter.setText(String.valueOf(number));
    }

}
