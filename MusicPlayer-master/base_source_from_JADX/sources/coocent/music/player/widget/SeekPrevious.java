package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import p342g.p343a.p344a.p355g.C8287e;

public class SeekPrevious extends SeekPlay {
    public SeekPrevious(Context context) {
        super(context);
    }

    public int getProgress() {
        int r = ((int) C8287e.m45865r()) - 1;
        if (r < 0) {
            return 0;
        }
        return r;
    }

    public SeekPrevious(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SeekPrevious(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
