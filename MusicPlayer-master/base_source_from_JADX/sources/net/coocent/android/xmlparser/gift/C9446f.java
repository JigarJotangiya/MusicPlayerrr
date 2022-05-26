package net.coocent.android.xmlparser.gift;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: net.coocent.android.xmlparser.gift.f */
/* compiled from: GiftItemDecoration */
public class C9446f extends RecyclerView.C0808o {

    /* renamed from: a */
    private int f36388a;

    /* renamed from: b */
    private Paint f36389b;

    public C9446f(int i, int i2) {
        this.f36388a = i;
        Paint paint = new Paint();
        this.f36389b = paint;
        paint.setColor(i2);
    }

    /* renamed from: d */
    public void mo4874d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        super.mo4874d(rect, view, recyclerView, zVar);
        rect.bottom = this.f36388a;
    }

    /* renamed from: f */
    public void mo4876f(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0826z zVar) {
        super.mo4876f(canvas, recyclerView, zVar);
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft();
        int paddingRight = recyclerView.getPaddingRight();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            Canvas canvas2 = canvas;
            canvas2.drawRect((float) paddingLeft, (float) childAt.getBottom(), (float) paddingRight, (float) (childAt.getBottom() + this.f36388a), this.f36389b);
        }
    }
}
