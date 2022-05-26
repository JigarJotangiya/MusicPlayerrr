package coocent.music.player.widget;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8343s;

public class MyPreference extends Preference {
    public MyPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        ((TextView) view.findViewById(16908310)).setTextColor(C8343s.m46295c(R.color.default_text_color));
        ((TextView) view.findViewById(16908304)).setTextColor(C8343s.m46295c(R.color.app_sub_title_color));
    }

    public MyPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MyPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyPreference(Context context) {
        super(context);
    }
}
