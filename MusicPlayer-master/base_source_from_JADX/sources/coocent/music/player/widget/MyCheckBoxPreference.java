package coocent.music.player.widget;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8343s;

public class MyCheckBoxPreference extends CheckBoxPreference {
    public MyCheckBoxPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view.findViewById(16908289);
        appCompatCheckBox.setButtonDrawable((int) R.drawable.check_button_custom);
        appCompatCheckBox.setButtonTintList(C8343s.m46302j());
        ((TextView) view.findViewById(16908310)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((TextView) view.findViewById(16908304)).setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
    }

    public MyCheckBoxPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public MyCheckBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyCheckBoxPreference(Context context) {
        super(context);
    }
}
