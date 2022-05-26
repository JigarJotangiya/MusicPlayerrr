package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
/* compiled from: DividerItemDecoration */
public class C0875i extends RecyclerView.C0808o {

    /* renamed from: d */
    private static final int[] f3918d = {16843284};

    /* renamed from: a */
    private Drawable f3919a;

    /* renamed from: b */
    private int f3920b;

    /* renamed from: c */
    private final Rect f3921c = new Rect();

    public C0875i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f3918d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f3919a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        mo5280k(i);
    }

    /* renamed from: i */
    private void m5421i(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager().mo4910Q(childAt, this.f3921c);
            int round = this.f3921c.right + Math.round(childAt.getTranslationX());
            this.f3919a.setBounds(round - this.f3919a.getIntrinsicWidth(), i2, round, i);
            this.f3919a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: j */
    private void m5422j(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.mo4635l0(childAt, this.f3921c);
            int round = this.f3921c.bottom + Math.round(childAt.getTranslationY());
            this.f3919a.setBounds(i2, round - this.f3919a.getIntrinsicHeight(), i, round);
            this.f3919a.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: d */
    public void mo4874d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        Drawable drawable = this.f3919a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f3920b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    /* renamed from: f */
    public void mo4876f(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        if (recyclerView.getLayoutManager() != null && this.f3919a != null) {
            if (this.f3920b == 1) {
                m5422j(canvas, recyclerView);
            } else {
                m5421i(canvas, recyclerView);
            }
        }
    }

    /* renamed from: k */
    public void mo5280k(int i) {
        if (i == 0 || i == 1) {
            this.f3920b = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }
}
