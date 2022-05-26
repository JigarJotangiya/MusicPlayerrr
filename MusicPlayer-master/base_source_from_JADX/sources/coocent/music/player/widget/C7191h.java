package coocent.music.player.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.C0506a;
import androidx.recyclerview.widget.RecyclerView;
import media.musicplayer.audioplayer.videoplayer.R;

/* renamed from: coocent.music.player.widget.h */
/* compiled from: PersetItemDecoration */
public class C7191h extends RecyclerView.C0808o {

    /* renamed from: c */
    private static final int[] f31826c = {16843284};

    /* renamed from: a */
    private Drawable f31827a;

    /* renamed from: b */
    private int f31828b;

    public C7191h(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f31826c);
        this.f31827a = C0506a.m3152d(context, R.drawable.item_divider_perset);
        obtainStyledAttributes.recycle();
        mo27725k(i);
    }

    /* renamed from: c */
    public void mo4873c(Rect rect, int i, RecyclerView recyclerView) {
        if (this.f31828b == 1) {
            rect.set(0, 0, 0, this.f31827a.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f31827a.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: e */
    public void mo4875e(Canvas canvas, RecyclerView recyclerView) {
        if (this.f31828b == 1) {
            mo27724j(canvas, recyclerView);
        } else {
            mo27723i(canvas, recyclerView);
        }
    }

    /* renamed from: i */
    public void mo27723i(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
            this.f31827a.setBounds(right, paddingTop, this.f31827a.getIntrinsicHeight() + right, height);
            this.f31827a.draw(canvas);
        }
    }

    /* renamed from: j */
    public void mo27724j(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f31827a.setBounds(paddingLeft, bottom, width, this.f31827a.getIntrinsicHeight() + bottom);
            this.f31827a.draw(canvas);
        }
    }

    /* renamed from: k */
    public void mo27725k(int i) {
        if (i == 0 || i == 1) {
            this.f31828b = i;
            return;
        }
        throw new IllegalArgumentException("invalid orientation");
    }
}
