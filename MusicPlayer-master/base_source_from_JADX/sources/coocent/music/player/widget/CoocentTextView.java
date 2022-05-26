package coocent.music.player.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import media.musicplayer.audioplayer.videoplayer.R;
import p443m.p444a.p447e.p448a.C9332d;

@SuppressLint({"NewApi"})
public class CoocentTextView extends TextView {
    public CoocentTextView(Context context) {
        super(context);
        m40574a(context);
    }

    /* renamed from: a */
    private void m40574a(Context context) {
        setTypeface(Typeface.createFromAsset(context.getAssets(), "arca_heavy.ttf"));
        setTextColor(C9332d.m49405b(context, R.color.white));
    }

    public boolean isFocused() {
        return true;
    }

    public CoocentTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40574a(context);
    }

    public CoocentTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40574a(context);
    }
}
