package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.C6087j;
import com.google.android.material.internal.C6093m;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7497i;
import p159f.p243f.p245b.p304b.C7498j;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p159f.p243f.p245b.p304b.p312t.C7523d;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class BadgeDrawable extends Drawable implements C6087j.C6089b {

    /* renamed from: w */
    private static final int f27706w = C7499k.Widget_MaterialComponents_Badge;

    /* renamed from: x */
    private static final int f27707x = C7490b.badgeStyle;

    /* renamed from: g */
    private final WeakReference<Context> f27708g;

    /* renamed from: h */
    private final C7541h f27709h = new C7541h();

    /* renamed from: i */
    private final C6087j f27710i;

    /* renamed from: j */
    private final Rect f27711j = new Rect();

    /* renamed from: k */
    private final float f27712k;

    /* renamed from: l */
    private final float f27713l;

    /* renamed from: m */
    private final float f27714m;

    /* renamed from: n */
    private final SavedState f27715n;

    /* renamed from: o */
    private float f27716o;

    /* renamed from: p */
    private float f27717p;

    /* renamed from: q */
    private int f27718q;

    /* renamed from: r */
    private float f27719r;

    /* renamed from: s */
    private float f27720s;

    /* renamed from: t */
    private float f27721t;

    /* renamed from: u */
    private WeakReference<View> f27722u;

    /* renamed from: v */
    private WeakReference<FrameLayout> f27723v;

    /* renamed from: com.google.android.material.badge.BadgeDrawable$a */
    class C5907a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ View f27738g;

        /* renamed from: h */
        final /* synthetic */ FrameLayout f27739h;

        C5907a(View view, FrameLayout frameLayout) {
            this.f27738g = view;
            this.f27739h = frameLayout;
        }

        public void run() {
            BadgeDrawable.this.mo22927F(this.f27738g, this.f27739h);
        }
    }

    private BadgeDrawable(Context context) {
        this.f27708g = new WeakReference<>(context);
        C6093m.m36558c(context);
        Resources resources = context.getResources();
        this.f27712k = (float) resources.getDimensionPixelSize(C7492d.mtrl_badge_radius);
        this.f27714m = (float) resources.getDimensionPixelSize(C7492d.mtrl_badge_long_text_horizontal_padding);
        this.f27713l = (float) resources.getDimensionPixelSize(C7492d.mtrl_badge_with_text_radius);
        C6087j jVar = new C6087j(this);
        this.f27710i = jVar;
        jVar.mo24216e().setTextAlign(Paint.Align.CENTER);
        this.f27715n = new SavedState(context);
        m35297A(C7499k.TextAppearance_MaterialComponents_Badge);
    }

    /* renamed from: A */
    private void m35297A(int i) {
        Context context = (Context) this.f27708g.get();
        if (context != null) {
            m35311z(new C7523d(context, i));
        }
    }

    /* renamed from: D */
    private void m35298D(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != C7494f.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f27723v;
            if (weakReference == null || weakReference.get() != viewGroup) {
                m35299E(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(C7494f.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f27723v = new WeakReference<>(frameLayout);
                frameLayout.post(new C5907a(view, frameLayout));
            }
        }
    }

    /* renamed from: E */
    private static void m35299E(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    /* renamed from: G */
    private void m35300G() {
        Context context = (Context) this.f27708g.get();
        WeakReference<View> weakReference = this.f27722u;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f27711j);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f27723v;
            if (weakReference2 != null) {
                viewGroup = (FrameLayout) weakReference2.get();
            }
            if (viewGroup != null || C5908a.f27741a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m35302b(context, rect2, view);
            C5908a.m35363f(this.f27711j, this.f27716o, this.f27717p, this.f27720s, this.f27721t);
            this.f27709h.mo28460X(this.f27719r);
            if (!rect.equals(this.f27711j)) {
                this.f27709h.setBounds(this.f27711j);
            }
        }
    }

    /* renamed from: H */
    private void m35301H() {
        this.f27718q = ((int) Math.pow(10.0d, ((double) mo22938k()) - 1.0d)) - 1;
    }

    /* renamed from: b */
    private void m35302b(Context context, Rect rect, View view) {
        int u = this.f27715n.f27735r + this.f27715n.f27737t;
        int q = this.f27715n.f27732o;
        if (q == 8388691 || q == 8388693) {
            this.f27717p = (float) (rect.bottom - u);
        } else {
            this.f27717p = (float) (rect.top + u);
        }
        if (mo22939l() <= 9) {
            float f = !mo22941n() ? this.f27712k : this.f27713l;
            this.f27719r = f;
            this.f27721t = f;
            this.f27720s = f;
        } else {
            float f2 = this.f27713l;
            this.f27719r = f2;
            this.f27721t = f2;
            this.f27720s = (this.f27710i.mo24217f(m35307g()) / 2.0f) + this.f27714m;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mo22941n() ? C7492d.mtrl_badge_text_horizontal_edge_offset : C7492d.mtrl_badge_horizontal_edge_offset);
        int s = this.f27715n.f27734q + this.f27715n.f27736s;
        int q2 = this.f27715n.f27732o;
        if (q2 == 8388659 || q2 == 8388691) {
            this.f27716o = C3774v.m16151B(view) == 0 ? (((float) rect.left) - this.f27720s) + ((float) dimensionPixelSize) + ((float) s) : ((((float) rect.right) + this.f27720s) - ((float) dimensionPixelSize)) - ((float) s);
        } else {
            this.f27716o = C3774v.m16151B(view) == 0 ? ((((float) rect.right) + this.f27720s) - ((float) dimensionPixelSize)) - ((float) s) : (((float) rect.left) - this.f27720s) + ((float) dimensionPixelSize) + ((float) s);
        }
    }

    /* renamed from: c */
    public static BadgeDrawable m35303c(Context context) {
        return m35304d(context, (AttributeSet) null, f27707x, f27706w);
    }

    /* renamed from: d */
    private static BadgeDrawable m35304d(Context context, AttributeSet attributeSet, int i, int i2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m35308o(context, attributeSet, i, i2);
        return badgeDrawable;
    }

    /* renamed from: e */
    static BadgeDrawable m35305e(Context context, SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m35310q(savedState);
        return badgeDrawable;
    }

    /* renamed from: f */
    private void m35306f(Canvas canvas) {
        Rect rect = new Rect();
        String g = m35307g();
        this.f27710i.mo24216e().getTextBounds(g, 0, g.length(), rect);
        canvas.drawText(g, this.f27716o, this.f27717p + ((float) (rect.height() / 2)), this.f27710i.mo24216e());
    }

    /* renamed from: g */
    private String m35307g() {
        if (mo22939l() <= this.f27718q) {
            return NumberFormat.getInstance().format((long) mo22939l());
        }
        Context context = (Context) this.f27708g.get();
        if (context == null) {
            return BuildConfig.FLAVOR;
        }
        return context.getString(C7498j.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.f27718q), "+"});
    }

    /* renamed from: o */
    private void m35308o(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray h = C6093m.m36563h(context, attributeSet, C7500l.Badge, i, i2, new int[0]);
        mo22951x(h.getInt(C7500l.Badge_maxCharacterCount, 4));
        int i3 = C7500l.Badge_number;
        if (h.hasValue(i3)) {
            mo22952y(h.getInt(i3, 0));
        }
        mo22947t(m35309p(context, h, C7500l.Badge_backgroundColor));
        int i4 = C7500l.Badge_badgeTextColor;
        if (h.hasValue(i4)) {
            mo22949v(m35309p(context, h, i4));
        }
        mo22948u(h.getInt(C7500l.Badge_badgeGravity, 8388661));
        mo22950w(h.getDimensionPixelOffset(C7500l.Badge_horizontalOffset, 0));
        mo22925B(h.getDimensionPixelOffset(C7500l.Badge_verticalOffset, 0));
        h.recycle();
    }

    /* renamed from: p */
    private static int m35309p(Context context, TypedArray typedArray, int i) {
        return C7522c.m42014a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: q */
    private void m35310q(SavedState savedState) {
        mo22951x(savedState.f27728k);
        if (savedState.f27727j != -1) {
            mo22952y(savedState.f27727j);
        }
        mo22947t(savedState.f27724g);
        mo22949v(savedState.f27725h);
        mo22948u(savedState.f27732o);
        mo22950w(savedState.f27734q);
        mo22925B(savedState.f27735r);
        mo22943r(savedState.f27736s);
        mo22944s(savedState.f27737t);
        mo22926C(savedState.f27733p);
    }

    /* renamed from: z */
    private void m35311z(C7523d dVar) {
        Context context;
        if (this.f27710i.mo24215d() != dVar && (context = (Context) this.f27708g.get()) != null) {
            this.f27710i.mo24219h(dVar, context);
            m35300G();
        }
    }

    /* renamed from: B */
    public void mo22925B(int i) {
        int unused = this.f27715n.f27735r = i;
        m35300G();
    }

    /* renamed from: C */
    public void mo22926C(boolean z) {
        setVisible(z, false);
        boolean unused = this.f27715n.f27733p = z;
        if (C5908a.f27741a && mo22935i() != null && !z) {
            ((ViewGroup) mo22935i().getParent()).invalidate();
        }
    }

    /* renamed from: F */
    public void mo22927F(View view, FrameLayout frameLayout) {
        this.f27722u = new WeakReference<>(view);
        boolean z = C5908a.f27741a;
        if (!z || frameLayout != null) {
            this.f27723v = new WeakReference<>(frameLayout);
        } else {
            m35298D(view);
        }
        if (!z) {
            m35299E(view);
        }
        m35300G();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo22928a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f27709h.draw(canvas);
            if (mo22941n()) {
                m35306f(canvas);
            }
        }
    }

    public int getAlpha() {
        return this.f27715n.f27726i;
    }

    public int getIntrinsicHeight() {
        return this.f27711j.height();
    }

    public int getIntrinsicWidth() {
        return this.f27711j.width();
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public CharSequence mo22934h() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!mo22941n()) {
            return this.f27715n.f27729l;
        }
        if (this.f27715n.f27730m <= 0 || (context = (Context) this.f27708g.get()) == null) {
            return null;
        }
        if (mo22939l() <= this.f27718q) {
            return context.getResources().getQuantityString(this.f27715n.f27730m, mo22939l(), new Object[]{Integer.valueOf(mo22939l())});
        }
        return context.getString(this.f27715n.f27731n, new Object[]{Integer.valueOf(this.f27718q)});
    }

    /* renamed from: i */
    public FrameLayout mo22935i() {
        WeakReference<FrameLayout> weakReference = this.f27723v;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public boolean isStateful() {
        return false;
    }

    /* renamed from: j */
    public int mo22937j() {
        return this.f27715n.f27734q;
    }

    /* renamed from: k */
    public int mo22938k() {
        return this.f27715n.f27728k;
    }

    /* renamed from: l */
    public int mo22939l() {
        if (!mo22941n()) {
            return 0;
        }
        return this.f27715n.f27727j;
    }

    /* renamed from: m */
    public SavedState mo22940m() {
        return this.f27715n;
    }

    /* renamed from: n */
    public boolean mo22941n() {
        return this.f27715n.f27727j != -1;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo22943r(int i) {
        int unused = this.f27715n.f27736s = i;
        m35300G();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo22944s(int i) {
        int unused = this.f27715n.f27737t = i;
        m35300G();
    }

    public void setAlpha(int i) {
        int unused = this.f27715n.f27726i = i;
        this.f27710i.mo24216e().setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: t */
    public void mo22947t(int i) {
        int unused = this.f27715n.f27724g = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f27709h.mo28489x() != valueOf) {
            this.f27709h.mo28463a0(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: u */
    public void mo22948u(int i) {
        if (this.f27715n.f27732o != i) {
            int unused = this.f27715n.f27732o = i;
            WeakReference<View> weakReference = this.f27722u;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f27722u.get();
                WeakReference<FrameLayout> weakReference2 = this.f27723v;
                mo22927F(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
            }
        }
    }

    /* renamed from: v */
    public void mo22949v(int i) {
        int unused = this.f27715n.f27725h = i;
        if (this.f27710i.mo24216e().getColor() != i) {
            this.f27710i.mo24216e().setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: w */
    public void mo22950w(int i) {
        int unused = this.f27715n.f27734q = i;
        m35300G();
    }

    /* renamed from: x */
    public void mo22951x(int i) {
        if (this.f27715n.f27728k != i) {
            int unused = this.f27715n.f27728k = i;
            m35301H();
            this.f27710i.mo24220i(true);
            m35300G();
            invalidateSelf();
        }
    }

    /* renamed from: y */
    public void mo22952y(int i) {
        int max = Math.max(0, i);
        if (this.f27715n.f27727j != max) {
            int unused = this.f27715n.f27727j = max;
            this.f27710i.mo24220i(true);
            m35300G();
            invalidateSelf();
        }
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5906a();
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f27724g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f27725h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f27726i = 255;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f27727j = -1;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f27728k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public CharSequence f27729l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f27730m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f27731n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f27732o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f27733p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public int f27734q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public int f27735r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public int f27736s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public int f27737t;

        /* renamed from: com.google.android.material.badge.BadgeDrawable$SavedState$a */
        static class C5906a implements Parcelable.Creator<SavedState> {
            C5906a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Context context) {
            this.f27725h = new C7523d(context, C7499k.TextAppearance_MaterialComponents_Badge).f32732a.getDefaultColor();
            this.f27729l = context.getString(C7498j.mtrl_badge_numberless_content_description);
            this.f27730m = C7497i.mtrl_badge_content_description;
            this.f27731n = C7498j.mtrl_exceed_max_badge_number_content_description;
            this.f27733p = true;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f27724g);
            parcel.writeInt(this.f27725h);
            parcel.writeInt(this.f27726i);
            parcel.writeInt(this.f27727j);
            parcel.writeInt(this.f27728k);
            parcel.writeString(this.f27729l.toString());
            parcel.writeInt(this.f27730m);
            parcel.writeInt(this.f27732o);
            parcel.writeInt(this.f27734q);
            parcel.writeInt(this.f27735r);
            parcel.writeInt(this.f27736s);
            parcel.writeInt(this.f27737t);
            parcel.writeInt(this.f27733p ? 1 : 0);
        }

        protected SavedState(Parcel parcel) {
            this.f27724g = parcel.readInt();
            this.f27725h = parcel.readInt();
            this.f27726i = parcel.readInt();
            this.f27727j = parcel.readInt();
            this.f27728k = parcel.readInt();
            this.f27729l = parcel.readString();
            this.f27730m = parcel.readInt();
            this.f27732o = parcel.readInt();
            this.f27734q = parcel.readInt();
            this.f27735r = parcel.readInt();
            this.f27736s = parcel.readInt();
            this.f27737t = parcel.readInt();
            this.f27733p = parcel.readInt() != 0;
        }
    }
}
