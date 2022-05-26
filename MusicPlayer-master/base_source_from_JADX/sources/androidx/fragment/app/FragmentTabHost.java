package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: g */
    private final ArrayList<C0582a> f3010g = new ArrayList<>();

    /* renamed from: h */
    private Context f3011h;

    /* renamed from: i */
    private C0602j f3012i;

    /* renamed from: j */
    private int f3013j;

    /* renamed from: k */
    private TabHost.OnTabChangeListener f3014k;

    /* renamed from: l */
    private C0582a f3015l;

    /* renamed from: m */
    private boolean f3016m;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0581a();

        /* renamed from: g */
        String f3017g;

        /* renamed from: androidx.fragment.app.FragmentTabHost$SavedState$a */
        static class C0581a implements Parcelable.Creator<SavedState> {
            C0581a() {
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

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f3017g + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3017g);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f3017g = parcel.readString();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    static final class C0582a {

        /* renamed from: a */
        final String f3018a;

        /* renamed from: b */
        final Class<?> f3019b;

        /* renamed from: c */
        final Bundle f3020c;

        /* renamed from: d */
        Fragment f3021d;
    }

    @Deprecated
    public FragmentTabHost(Context context) {
        super(context, (AttributeSet) null);
        m3710c(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private C0620p m3708a(String str, C0620p pVar) {
        Fragment fragment;
        C0582a b = m3709b(str);
        if (this.f3015l != b) {
            if (pVar == null) {
                pVar = this.f3012i.mo3957i();
            }
            C0582a aVar = this.f3015l;
            if (!(aVar == null || (fragment = aVar.f3021d) == null)) {
                pVar.mo3819m(fragment);
            }
            if (b != null) {
                Fragment fragment2 = b.f3021d;
                if (fragment2 == null) {
                    Fragment a = this.f3012i.mo3953g0().mo3881a(this.f3011h.getClassLoader(), b.f3019b.getName());
                    b.f3021d = a;
                    a.mo3581C2(b.f3020c);
                    pVar.mo4069c(this.f3013j, b.f3021d, b.f3018a);
                } else {
                    pVar.mo4074h(fragment2);
                }
            }
            this.f3015l = b;
        }
        return pVar;
    }

    /* renamed from: b */
    private C0582a m3709b(String str) {
        int size = this.f3010g.size();
        for (int i = 0; i < size; i++) {
            C0582a aVar = this.f3010g.get(i);
            if (aVar.f3018a.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m3710c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f3013j = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f3010g.size();
        C0620p pVar = null;
        for (int i = 0; i < size; i++) {
            C0582a aVar = this.f3010g.get(i);
            Fragment Y = this.f3012i.mo3938Y(aVar.f3018a);
            aVar.f3021d = Y;
            if (Y != null && !Y.mo3625R0()) {
                if (aVar.f3018a.equals(currentTabTag)) {
                    this.f3015l = aVar;
                } else {
                    if (pVar == null) {
                        pVar = this.f3012i.mo3957i();
                    }
                    pVar.mo3819m(aVar.f3021d);
                }
            }
        }
        this.f3016m = true;
        C0620p a = m3708a(currentTabTag, pVar);
        if (a != null) {
            a.mo3815i();
            this.f3012i.mo3932U();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3016m = false;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f3017g);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3017g = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public void onTabChanged(String str) {
        C0620p a;
        if (this.f3016m && (a = m3708a(str, (C0620p) null)) != null) {
            a.mo3815i();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f3014k;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f3014k = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m3710c(context, attributeSet);
    }
}
