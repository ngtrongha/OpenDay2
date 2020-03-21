package uni.tbd.openday.ui.khoa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import uni.tbd.openday.R;

public class KhoaFragment extends Fragment {

    private KhoaViewModel khoaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        khoaViewModel =
                ViewModelProviders.of(this).get(KhoaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_khoa, container, false);

        Button khoa01 = (Button) root.findViewById(R.id.bt_khoa01);
        Button khoa02 = (Button) root.findViewById(R.id.bt_khoa02);
        Button khoa03 = (Button) root.findViewById(R.id.bt_khoa03);
        khoa01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        return root;
    }
}
