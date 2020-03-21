package uni.tbd.openday.ui.nganh;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NganhViewModel extends ViewModel {

    public String NganhName;
    public String Link;
    public int Image;
    public NganhViewModel(String nganhName, String link, int image) {
        this.NganhName = nganhName;
        this.Link = link;
        this.Image = image;
    }
}