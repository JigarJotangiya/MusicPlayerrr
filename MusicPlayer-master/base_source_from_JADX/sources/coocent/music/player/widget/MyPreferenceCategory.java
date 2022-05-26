package coocent.music.player.widget;

import android.content.Context;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import p342g.p343a.p344a.p358i.C8343s;

public class MyPreferenceCategory extends PreferenceCategory {
    public MyPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onBindView(View view) {
        super.onBindView(view);
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setAllCaps(false);
            textView.setTextColor(C8343s.m46300h());
            textView.setTextAlignment(5);
        }
    }
}
