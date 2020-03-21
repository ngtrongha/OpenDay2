package uni.tbd.openday.ui.nganh;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import uni.tbd.openday.R;

public class NganhFragment extends Fragment {

    private NganhViewModel nganhViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        nganhViewModel =
                ViewModelProviders.of(this).get(NganhViewModel.class);
        View root = inflater.inflate(R.layout.fragment_nganh, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        return root;
    }
}
