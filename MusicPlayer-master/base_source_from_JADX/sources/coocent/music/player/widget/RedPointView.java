package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import media.musicplayer.audioplayer.videoplayer.R;

public class RedPointView extends TextView {
    public RedPointView(Context context) {
        super(context);
        m40758a();
    }

    /* renamed from: a */
    private void m40758a() {
        setBackground(getResources().getDrawable(R.drawable.red_point_shape));
        setVisibility(8);
    }

    public RedPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40758a();
    }

    public RedPointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m40758a();
    }
}
