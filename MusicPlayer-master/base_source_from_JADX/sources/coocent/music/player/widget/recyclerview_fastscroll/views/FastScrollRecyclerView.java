package coocent.music.player.widget.recyclerview_fastscroll.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coocent.music.player.widget.p277m.p278a.C7265a;
import coocent.music.player.widget.p277m.p279b.C7266a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class FastScrollRecyclerView extends RecyclerView implements RecyclerView.C0816s {

    /* renamed from: R0 */
    private FastScroller f32087R0;

    /* renamed from: S0 */
    private C7270d f32088S0;

    /* renamed from: T0 */
    private int f32089T0;

    /* renamed from: U0 */
    private int f32090U0;

    /* renamed from: V0 */
    private int f32091V0;
    /* access modifiers changed from: private */

    /* renamed from: W0 */
    public SparseIntArray f32092W0;

    /* renamed from: X0 */
    private C7269c f32093X0;

    /* renamed from: Y0 */
    private C7265a f32094Y0;

    /* renamed from: coocent.music.player.widget.recyclerview_fastscroll.views.FastScrollRecyclerView$b */
    public interface C7268b {
        /* renamed from: a */
        int mo27886a(RecyclerView recyclerView, int i);
    }

    /* renamed from: coocent.music.player.widget.recyclerview_fastscroll.views.FastScrollRecyclerView$c */
    private class C7269c extends RecyclerView.C0800j {
        private C7269c() {
        }

        /* renamed from: h */
        private void m41213h() {
            FastScrollRecyclerView.this.f32092W0.clear();
        }

        /* renamed from: a */
        public void mo4834a() {
            m41213h();
        }

        /* renamed from: b */
        public void mo4835b(int i, int i2) {
            m41213h();
        }

        /* renamed from: c */
        public void mo4836c(int i, int i2, Object obj) {
            m41213h();
        }

        /* renamed from: d */
        public void mo4837d(int i, int i2) {
            m41213h();
        }

        /* renamed from: e */
        public void mo4838e(int i, int i2, int i3) {
            m41213h();
        }

        /* renamed from: f */
        public void mo4839f(int i, int i2) {
            m41213h();
        }
    }

    /* renamed from: coocent.music.player.widget.recyclerview_fastscroll.views.FastScrollRecyclerView$d */
    public static class C7270d {

        /* renamed from: a */
        public int f32096a;

        /* renamed from: b */
        public int f32097b;

        /* renamed from: c */
        public int f32098c;
    }

    /* renamed from: coocent.music.player.widget.recyclerview_fastscroll.views.FastScrollRecyclerView$e */
    public interface C7271e {
        /* renamed from: a */
        String mo27887a(int i);
    }

    public FastScrollRecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: H1 */
    private int m41202H1() {
        return m41203I1(getAdapter().getItemCount());
    }

    /* renamed from: I1 */
    private int m41203I1(int i) {
        if (this.f32092W0.indexOfKey(i) >= 0) {
            return this.f32092W0.get(i);
        }
        C7268b bVar = (C7268b) getAdapter();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            this.f32092W0.put(i3, i2);
            i2 += bVar.mo27886a(this, getAdapter().getItemViewType(i3));
        }
        this.f32092W0.put(i, i2);
        return i2;
    }

    /* renamed from: L1 */
    private void m41204L1(C7270d dVar) {
        dVar.f32096a = -1;
        dVar.f32097b = -1;
        dVar.f32098c = -1;
        if (getAdapter().getItemCount() != 0 && getChildCount() != 0) {
            View childAt = getChildAt(0);
            dVar.f32096a = mo4600g0(childAt);
            if (getLayoutManager() instanceof GridLayoutManager) {
                dVar.f32096a /= ((GridLayoutManager) getLayoutManager()).mo4440W2();
            }
            dVar.f32097b = getLayoutManager().mo4916V(childAt);
            dVar.f32098c = childAt.getHeight() + getLayoutManager().mo4951n0(childAt) + getLayoutManager().mo4897I(childAt);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r1 != 3) goto L_0x0051;
     */
    /* renamed from: M1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m41205M1(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r19.getAction()
            float r2 = r19.getX()
            int r5 = (int) r2
            float r2 = r19.getY()
            int r10 = (int) r2
            if (r1 == 0) goto L_0x0040
            r2 = 1
            if (r1 == r2) goto L_0x002c
            r2 = 2
            if (r1 == r2) goto L_0x001c
            r2 = 3
            if (r1 == r2) goto L_0x002c
            goto L_0x0051
        L_0x001c:
            r0.f32091V0 = r10
            coocent.music.player.widget.recyclerview_fastscroll.views.FastScroller r6 = r0.f32087R0
            int r8 = r0.f32089T0
            int r9 = r0.f32090U0
            coocent.music.player.widget.m.a.a r11 = r0.f32094Y0
            r7 = r19
            r6.mo27893j(r7, r8, r9, r10, r11)
            goto L_0x0051
        L_0x002c:
            coocent.music.player.widget.recyclerview_fastscroll.views.FastScroller r12 = r0.f32087R0
            int r14 = r0.f32089T0
            int r15 = r0.f32090U0
            int r1 = r0.f32091V0
            coocent.music.player.widget.m.a.a r2 = r0.f32094Y0
            r13 = r19
            r16 = r1
            r17 = r2
            r12.mo27893j(r13, r14, r15, r16, r17)
            goto L_0x0051
        L_0x0040:
            r0.f32089T0 = r5
            r0.f32091V0 = r10
            r0.f32090U0 = r10
            coocent.music.player.widget.recyclerview_fastscroll.views.FastScroller r3 = r0.f32087R0
            coocent.music.player.widget.m.a.a r8 = r0.f32094Y0
            r4 = r19
            r6 = r10
            r7 = r10
            r3.mo27893j(r4, r5, r6, r7, r8)
        L_0x0051:
            coocent.music.player.widget.recyclerview_fastscroll.views.FastScroller r1 = r0.f32087R0
            boolean r1 = r1.mo27894k()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.widget.recyclerview_fastscroll.views.FastScrollRecyclerView.m41205M1(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: J1 */
    public int mo27865J1(int i, int i2) {
        return (((getPaddingTop() + i2) + i) + getPaddingBottom()) - getHeight();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K1 */
    public int mo27866K1(int i, int i2, int i3) {
        return mo27865J1(i * i2, i3);
    }

    /* renamed from: N1 */
    public void mo27867N1() {
        if (getAdapter() != null) {
            int itemCount = getAdapter().getItemCount();
            if (getLayoutManager() instanceof GridLayoutManager) {
                itemCount = (int) Math.ceil(((double) itemCount) / ((double) ((GridLayoutManager) getLayoutManager()).mo4440W2()));
            }
            if (itemCount == 0) {
                this.f32087R0.mo27907x(-1, -1);
                return;
            }
            m41204L1(this.f32088S0);
            if (this.f32088S0.f32096a < 0) {
                this.f32087R0.mo27907x(-1, -1);
            } else if (getAdapter() instanceof C7268b) {
                mo27870Q1(this.f32088S0, 0);
            } else {
                mo27869P1(this.f32088S0, itemCount, 0);
            }
        }
    }

    /* renamed from: O1 */
    public String mo27868O1(float f) {
        int i;
        int itemCount = getAdapter().getItemCount();
        if (itemCount == 0) {
            return BuildConfig.FLAVOR;
        }
        int i2 = 1;
        if (getLayoutManager() instanceof GridLayoutManager) {
            i2 = ((GridLayoutManager) getLayoutManager()).mo4440W2();
            i = (int) Math.ceil(((double) itemCount) / ((double) i2));
        } else {
            i = itemCount;
        }
        mo4537D1();
        m41204L1(this.f32088S0);
        float f2 = ((float) itemCount) * f;
        int K1 = (int) (((float) mo27866K1(i, this.f32088S0.f32098c, 0)) * f);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getLayoutManager();
        int i3 = i2 * K1;
        try {
            int i4 = this.f32088S0.f32098c;
            linearLayoutManager.mo4470A2(i3 / i4, -(K1 % i4));
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!(getAdapter() instanceof C7271e)) {
            return BuildConfig.FLAVOR;
        }
        if (f == 1.0f) {
            f2 -= 1.0f;
        }
        return ((C7271e) getAdapter()).mo27887a((int) f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public void mo27869P1(C7270d dVar, int i, int i2) {
        int i3;
        int K1 = mo27866K1(i, dVar.f32098c, i2);
        int availableScrollBarHeight = getAvailableScrollBarHeight();
        if (K1 <= 0) {
            this.f32087R0.mo27907x(-1, -1);
            return;
        }
        int paddingTop = (int) ((((float) (((getPaddingTop() + i2) + (dVar.f32096a * dVar.f32098c)) - dVar.f32097b)) / ((float) K1)) * ((float) availableScrollBarHeight));
        if (C7266a.m41186a(getResources())) {
            i3 = 0;
        } else {
            i3 = getWidth() - this.f32087R0.mo27892i();
        }
        this.f32087R0.mo27907x(i3, paddingTop);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q1 */
    public void mo27870Q1(C7270d dVar, int i) {
        int i2;
        int J1 = mo27865J1(m41202H1(), i);
        int availableScrollBarHeight = getAvailableScrollBarHeight();
        if (J1 <= 0) {
            this.f32087R0.mo27907x(-1, -1);
            return;
        }
        int paddingTop = (int) ((((float) (((getPaddingTop() + i) + m41203I1(dVar.f32096a)) - dVar.f32097b)) / ((float) J1)) * ((float) availableScrollBarHeight));
        if (C7266a.m41186a(getResources())) {
            i2 = 0;
        } else {
            i2 = getWidth() - this.f32087R0.mo27892i();
        }
        this.f32087R0.mo27907x(i2, paddingTop);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        mo27867N1();
        this.f32087R0.mo27889g(canvas);
    }

    /* access modifiers changed from: protected */
    public int getAvailableScrollBarHeight() {
        return getHeight() - this.f32087R0.mo27891h();
    }

    public int getScrollBarThumbHeight() {
        return this.f32087R0.mo27891h();
    }

    public int getScrollBarWidth() {
        return this.f32087R0.mo27892i();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        mo4633k(this);
    }

    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        return m41205M1(motionEvent);
    }

    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        m41205M1(motionEvent);
    }

    public void setAdapter(RecyclerView.C0797h hVar) {
        if (getAdapter() != null) {
            getAdapter().unregisterAdapterDataObserver(this.f32093X0);
        }
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f32093X0);
        }
        super.setAdapter(hVar);
    }

    public void setAutoHideDelay(int i) {
        this.f32087R0.mo27896n(i);
    }

    public void setAutoHideEnabled(boolean z) {
        this.f32087R0.mo27897o(z);
    }

    public void setPopUpTypeface(Typeface typeface) {
        this.f32087R0.mo27904u(typeface);
    }

    public void setPopupBgColor(int i) {
        this.f32087R0.mo27899q(i);
    }

    public void setPopupPosition(int i) {
        this.f32087R0.mo27900r(i);
    }

    public void setPopupTextColor(int i) {
        this.f32087R0.mo27901s(i);
    }

    public void setPopupTextSize(int i) {
        this.f32087R0.mo27903t(i);
    }

    public void setStateChangeListener(C7265a aVar) {
        this.f32094Y0 = aVar;
    }

    public void setThumbColor(int i) {
        this.f32087R0.mo27905v(i);
    }

    public void setThumbInactiveColor(boolean z) {
        this.f32087R0.mo27906w(z);
    }

    public void setTrackColor(int i) {
        this.f32087R0.mo27908y(i);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32088S0 = new C7270d();
        this.f32087R0 = new FastScroller(context, this, attributeSet);
        this.f32093X0 = new C7269c();
        this.f32092W0 = new SparseIntArray();
    }
}
