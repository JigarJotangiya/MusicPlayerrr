package coocent.music.player.widget.rtl;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.C1184a;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
import p082e.p109h.p115l.C3653i;
import p082e.p109h.p115l.C3655j;

public class RtlViewPager extends ViewPager {

    /* renamed from: p0 */
    private int f32229p0 = 0;

    /* renamed from: q0 */
    private HashMap<ViewPager.C1180i, C7300c> f32230q0 = new HashMap<>();

    /* renamed from: coocent.music.player.widget.rtl.RtlViewPager$b */
    private class C7299b extends C7301a {
        public C7299b(C1184a aVar) {
            super(aVar);
        }

        /* renamed from: a */
        public void mo6293a(View view, int i, Object obj) {
            if (RtlViewPager.this.m41370Y()) {
                i = (mo6295e() - i) - 1;
            }
            super.mo6293a(view, i, obj);
        }

        /* renamed from: b */
        public void mo4039b(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.m41370Y()) {
                i = (mo6295e() - i) - 1;
            }
            super.mo4039b(viewGroup, i, obj);
        }

        /* renamed from: f */
        public int mo6296f(Object obj) {
            int f = super.mo6296f(obj);
            if (!RtlViewPager.this.m41370Y()) {
                return f;
            }
            if (f == -1 || f == -2) {
                return -2;
            }
            return (mo6295e() - f) - 1;
        }

        /* renamed from: g */
        public CharSequence mo6297g(int i) {
            if (RtlViewPager.this.m41370Y()) {
                i = (mo6295e() - i) - 1;
            }
            return super.mo6297g(i);
        }

        /* renamed from: h */
        public float mo6298h(int i) {
            if (RtlViewPager.this.m41370Y()) {
                i = (mo6295e() - i) - 1;
            }
            return super.mo6298h(i);
        }

        /* renamed from: i */
        public Object mo6299i(View view, int i) {
            if (RtlViewPager.this.m41370Y()) {
                i = (mo6295e() - i) - 1;
            }
            return super.mo6299i(view, i);
        }

        /* renamed from: j */
        public Object mo4041j(ViewGroup viewGroup, int i) {
            if (RtlViewPager.this.m41370Y()) {
                i = (mo6295e() - i) - 1;
            }
            return super.mo4041j(viewGroup, i);
        }

        /* renamed from: p */
        public void mo6302p(View view, int i, Object obj) {
            if (RtlViewPager.this.m41370Y()) {
                i = (mo6295e() - i) - 1;
            }
            super.mo6302p(view, i, obj);
        }

        /* renamed from: q */
        public void mo4045q(ViewGroup viewGroup, int i, Object obj) {
            if (RtlViewPager.this.m41370Y()) {
                i = (mo6295e() - i) - 1;
            }
            super.mo4045q(viewGroup, i, obj);
        }
    }

    /* renamed from: coocent.music.player.widget.rtl.RtlViewPager$c */
    private class C7300c implements ViewPager.C1180i {

        /* renamed from: a */
        private final ViewPager.C1180i f32234a;

        public C7300c(ViewPager.C1180i iVar) {
            this.f32234a = iVar;
        }

        /* renamed from: d */
        public void mo6207d(int i, float f, int i2) {
            int width = RtlViewPager.this.getWidth();
            C1184a V = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.m41370Y() && V != null) {
                int e = V.mo6295e();
                float f2 = (float) width;
                int h = ((int) ((1.0f - V.mo6298h(i)) * f2)) + i2;
                while (i < e && h > 0) {
                    i++;
                    h -= (int) (V.mo6298h(i) * f2);
                }
                i = (e - i) - 1;
                i2 = -h;
                f = ((float) i2) / (f2 * V.mo6298h(i));
            }
            this.f32234a.mo6207d(i, f, i2);
        }

        /* renamed from: r */
        public void mo6209r(int i) {
            this.f32234a.mo6209r(i);
        }

        /* renamed from: s */
        public void mo6210s(int i) {
            C1184a X = RtlViewPager.super.getAdapter();
            if (RtlViewPager.this.m41370Y() && X != null) {
                i = (X.mo6295e() - i) - 1;
            }
            this.f32234a.mo6210s(i);
        }
    }

    public RtlViewPager(Context context) {
        super(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public boolean m41370Y() {
        return this.f32229p0 == 1;
    }

    /* renamed from: J */
    public void mo6217J(ViewPager.C1180i iVar) {
        C7300c remove = this.f32230q0.remove(iVar);
        if (remove != null) {
            super.mo6217J(remove);
        }
    }

    /* renamed from: N */
    public void mo6218N(int i, boolean z) {
        C1184a adapter = super.getAdapter();
        if (adapter != null && m41370Y()) {
            i = (adapter.mo6295e() - i) - 1;
        }
        super.mo6218N(i, z);
    }

    /* renamed from: c */
    public void mo6230c(ViewPager.C1180i iVar) {
        C7300c cVar = new C7300c(iVar);
        this.f32230q0.put(iVar, cVar);
        super.mo6230c(cVar);
    }

    public C1184a getAdapter() {
        C7299b bVar = (C7299b) super.getAdapter();
        if (bVar == null) {
            return null;
        }
        return bVar.mo28006v();
    }

    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        C1184a adapter = super.getAdapter();
        return (adapter == null || !m41370Y()) ? currentItem : (adapter.mo6295e() - currentItem) - 1;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f32229p0 = savedState.f32232h;
        super.onRestoreInstanceState(savedState.f32231g);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        if (i3 != this.f32229p0) {
            C1184a adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.f32229p0 = i3;
            if (adapter != null) {
                adapter.mo6300l();
                setCurrentItem(i2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f32229p0);
    }

    public void setAdapter(C1184a aVar) {
        if (aVar != null) {
            aVar = new C7299b(aVar);
        }
        super.setAdapter(aVar);
        setCurrentItem(0);
    }

    public void setCurrentItem(int i) {
        C1184a adapter = super.getAdapter();
        if (adapter != null && m41370Y()) {
            i = (adapter.mo6295e() - i) - 1;
        }
        super.setCurrentItem(i);
    }

    public void setOnPageChangeListener(ViewPager.C1180i iVar) {
        super.setOnPageChangeListener(new C7300c(iVar));
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = C3653i.m15716a(new C7297a());
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final Parcelable f32231g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final int f32232h;

        /* renamed from: coocent.music.player.widget.rtl.RtlViewPager$SavedState$a */
        class C7297a implements C3655j<SavedState> {
            C7297a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f32231g, i);
            parcel.writeInt(this.f32232h);
        }

        private SavedState(Parcelable parcelable, int i) {
            this.f32231g = parcelable;
            this.f32232h = i;
        }

        private SavedState(Parcel parcel, ClassLoader classLoader) {
            this.f32231g = parcel.readParcelable(classLoader == null ? getClass().getClassLoader() : classLoader);
            this.f32232h = parcel.readInt();
        }
    }

    public RtlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
