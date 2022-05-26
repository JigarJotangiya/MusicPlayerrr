package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p026y.C1679d;
import com.airbnb.lottie.p026y.C1683h;
import com.airbnb.lottie.p027z.C1689b;
import com.airbnb.lottie.p027z.C1690c;
import com.airbnb.lottie.p027z.C1692e;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p119p.C3774v;

public class LottieAnimationView extends AppCompatImageView {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public static final C1490h<Throwable> f5576A = new C1453a();

    /* renamed from: z */
    private static final String f5577z = LottieAnimationView.class.getSimpleName();

    /* renamed from: g */
    private final C1490h<C1464d> f5578g = new C1454b();

    /* renamed from: h */
    private final C1490h<Throwable> f5579h = new C1455c();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C1490h<Throwable> f5580i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f5581j = 0;

    /* renamed from: k */
    private final C1473f f5582k = new C1473f();

    /* renamed from: l */
    private boolean f5583l;

    /* renamed from: m */
    private String f5584m;

    /* renamed from: n */
    private int f5585n;

    /* renamed from: o */
    private boolean f5586o = false;

    /* renamed from: p */
    private boolean f5587p = false;

    /* renamed from: q */
    private boolean f5588q = false;

    /* renamed from: r */
    private boolean f5589r = false;

    /* renamed from: s */
    private boolean f5590s = false;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f5591t = true;

    /* renamed from: u */
    private C1502q f5592u = C1502q.AUTOMATIC;

    /* renamed from: v */
    private final Set<C1492j> f5593v = new HashSet();

    /* renamed from: w */
    private int f5594w = 0;

    /* renamed from: x */
    private C1495m<C1464d> f5595x;

    /* renamed from: y */
    private C1464d f5596y;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1452a();

        /* renamed from: g */
        String f5597g;

        /* renamed from: h */
        int f5598h;

        /* renamed from: i */
        float f5599i;

        /* renamed from: j */
        boolean f5600j;

        /* renamed from: k */
        String f5601k;

        /* renamed from: l */
        int f5602l;

        /* renamed from: m */
        int f5603m;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        class C1452a implements Parcelable.Creator<SavedState> {
            C1452a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C1453a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C1453a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f5597g);
            parcel.writeFloat(this.f5599i);
            parcel.writeInt(this.f5600j ? 1 : 0);
            parcel.writeString(this.f5601k);
            parcel.writeInt(this.f5602l);
            parcel.writeInt(this.f5603m);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f5597g = parcel.readString();
            this.f5599i = parcel.readFloat();
            this.f5600j = parcel.readInt() != 1 ? false : true;
            this.f5601k = parcel.readString();
            this.f5602l = parcel.readInt();
            this.f5603m = parcel.readInt();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    class C1453a implements C1490h<Throwable> {
        C1453a() {
        }

        /* renamed from: b */
        public void mo6989a(Throwable th) {
            if (C1683h.m8465k(th)) {
                C1679d.m8417d("Unable to load composition.", th);
                return;
            }
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    class C1454b implements C1490h<C1464d> {
        C1454b() {
        }

        /* renamed from: b */
        public void mo6989a(C1464d dVar) {
            LottieAnimationView.this.setComposition(dVar);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$c */
    class C1455c implements C1490h<Throwable> {
        C1455c() {
        }

        /* renamed from: b */
        public void mo6989a(Throwable th) {
            if (LottieAnimationView.this.f5581j != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f5581j);
            }
            (LottieAnimationView.this.f5580i == null ? LottieAnimationView.f5576A : LottieAnimationView.this.f5580i).mo6989a(th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$d */
    class C1456d implements Callable<C1494l<C1464d>> {

        /* renamed from: a */
        final /* synthetic */ int f5606a;

        C1456d(int i) {
            this.f5606a = i;
        }

        /* renamed from: a */
        public C1494l<C1464d> call() {
            return LottieAnimationView.this.f5591t ? C1465e.m7644o(LottieAnimationView.this.getContext(), this.f5606a) : C1465e.m7645p(LottieAnimationView.this.getContext(), this.f5606a, (String) null);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$e */
    class C1457e implements Callable<C1494l<C1464d>> {

        /* renamed from: a */
        final /* synthetic */ String f5608a;

        C1457e(String str) {
            this.f5608a = str;
        }

        /* renamed from: a */
        public C1494l<C1464d> call() {
            return LottieAnimationView.this.f5591t ? C1465e.m7635f(LottieAnimationView.this.getContext(), this.f5608a) : C1465e.m7636g(LottieAnimationView.this.getContext(), this.f5608a, (String) null);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$f */
    class C1458f extends C1690c<T> {

        /* renamed from: c */
        final /* synthetic */ C1692e f5610c;

        C1458f(LottieAnimationView lottieAnimationView, C1692e eVar) {
            this.f5610c = eVar;
        }

        /* renamed from: a */
        public T mo6997a(C1689b<T> bVar) {
            return this.f5610c.mo7515a(bVar);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$g */
    static /* synthetic */ class C1459g {

        /* renamed from: a */
        static final /* synthetic */ int[] f5611a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.q[] r0 = com.airbnb.lottie.C1502q.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5611a = r0
                com.airbnb.lottie.q r1 = com.airbnb.lottie.C1502q.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5611a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.q r1 = com.airbnb.lottie.C1502q.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5611a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.q r1 = com.airbnb.lottie.C1502q.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.C1459g.<clinit>():void");
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        m7567A((AttributeSet) null, C1500o.lottieAnimationViewStyle);
    }

    /* renamed from: A */
    private void m7567A(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1501p.LottieAnimationView, i, 0);
        this.f5591t = obtainStyledAttributes.getBoolean(C1501p.LottieAnimationView_lottie_cacheComposition, true);
        int i2 = C1501p.LottieAnimationView_lottie_rawRes;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = C1501p.LottieAnimationView_lottie_fileName;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = C1501p.LottieAnimationView_lottie_url;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(i3);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(C1501p.LottieAnimationView_lottie_fallbackRes, 0));
            if (obtainStyledAttributes.getBoolean(C1501p.LottieAnimationView_lottie_autoPlay, false)) {
                this.f5588q = true;
                this.f5590s = true;
            }
            if (obtainStyledAttributes.getBoolean(C1501p.LottieAnimationView_lottie_loop, false)) {
                this.f5582k.mo7072g0(-1);
            }
            int i5 = C1501p.LottieAnimationView_lottie_repeatMode;
            if (obtainStyledAttributes.hasValue(i5)) {
                setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
            }
            int i6 = C1501p.LottieAnimationView_lottie_repeatCount;
            if (obtainStyledAttributes.hasValue(i6)) {
                setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
            }
            int i7 = C1501p.LottieAnimationView_lottie_speed;
            if (obtainStyledAttributes.hasValue(i7)) {
                setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(C1501p.LottieAnimationView_lottie_imageAssetsFolder));
            setProgress(obtainStyledAttributes.getFloat(C1501p.LottieAnimationView_lottie_progress, 0.0f));
            mo6983w(obtainStyledAttributes.getBoolean(C1501p.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
            int i8 = C1501p.LottieAnimationView_lottie_colorFilter;
            if (obtainStyledAttributes.hasValue(i8)) {
                C1503r rVar = new C1503r(C3410a.m14542c(getContext(), obtainStyledAttributes.getResourceId(i8, -1)).getDefaultColor());
                mo6948r(new C1560e("**"), C1493k.f5721K, new C1690c(rVar));
            }
            int i9 = C1501p.LottieAnimationView_lottie_scale;
            if (obtainStyledAttributes.hasValue(i9)) {
                this.f5582k.mo7084j0(obtainStyledAttributes.getFloat(i9, 1.0f));
            }
            int i10 = C1501p.LottieAnimationView_lottie_renderMode;
            if (obtainStyledAttributes.hasValue(i10)) {
                C1502q qVar = C1502q.AUTOMATIC;
                int i11 = obtainStyledAttributes.getInt(i10, qVar.ordinal());
                if (i11 >= C1502q.values().length) {
                    i11 = qVar.ordinal();
                }
                setRenderMode(C1502q.values()[i11]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(C1501p.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
            obtainStyledAttributes.recycle();
            C1473f fVar = this.f5582k;
            if (C1683h.m8460f(getContext()) != 0.0f) {
                z = true;
            }
            fVar.mo7086l0(Boolean.valueOf(z));
            m7575x();
            this.f5583l = true;
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    /* renamed from: H */
    private void m7568H() {
        boolean B = mo6922B();
        setImageDrawable((Drawable) null);
        setImageDrawable(this.f5582k);
        if (B) {
            this.f5582k.mo7050N();
        }
    }

    private void setCompositionTask(C1495m<C1464d> mVar) {
        m7574v();
        m7573u();
        mVar.mo7122f(this.f5578g);
        mVar.mo7121e(this.f5579h);
        this.f5595x = mVar;
    }

    /* renamed from: u */
    private void m7573u() {
        C1495m<C1464d> mVar = this.f5595x;
        if (mVar != null) {
            mVar.mo7124k(this.f5578g);
            this.f5595x.mo7123j(this.f5579h);
        }
    }

    /* renamed from: v */
    private void m7574v() {
        this.f5596y = null;
        this.f5582k.mo7083j();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r3 != false) goto L_0x0046;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7575x() {
        /*
            r5 = this;
            int[] r0 = com.airbnb.lottie.LottieAnimationView.C1459g.f5611a
            com.airbnb.lottie.q r1 = r5.f5592u
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L_0x0046
            if (r0 == r1) goto L_0x0013
            r3 = 3
            if (r0 == r3) goto L_0x0015
        L_0x0013:
            r1 = 1
            goto L_0x0046
        L_0x0015:
            com.airbnb.lottie.d r0 = r5.f5596y
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r0 = r0.mo7018q()
            if (r0 == 0) goto L_0x0027
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r0 >= r4) goto L_0x0027
            goto L_0x0044
        L_0x0027:
            com.airbnb.lottie.d r0 = r5.f5596y
            if (r0 == 0) goto L_0x0033
            int r0 = r0.mo7014m()
            r4 = 4
            if (r0 <= r4) goto L_0x0033
            goto L_0x0044
        L_0x0033:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 21
            if (r0 >= r4) goto L_0x003a
            goto L_0x0044
        L_0x003a:
            r4 = 24
            if (r0 == r4) goto L_0x0044
            r4 = 25
            if (r0 != r4) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r3 = 1
        L_0x0044:
            if (r3 == 0) goto L_0x0013
        L_0x0046:
            int r0 = r5.getLayerType()
            if (r1 == r0) goto L_0x0050
            r0 = 0
            r5.setLayerType(r1, r0)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.LottieAnimationView.m7575x():void");
    }

    /* renamed from: y */
    private C1495m<C1464d> m7576y(String str) {
        if (isInEditMode()) {
            return new C1495m<>(new C1457e(str), true);
        }
        return this.f5591t ? C1465e.m7633d(getContext(), str) : C1465e.m7634e(getContext(), str, (String) null);
    }

    /* renamed from: z */
    private C1495m<C1464d> m7577z(int i) {
        if (isInEditMode()) {
            return new C1495m<>(new C1456d(i), true);
        }
        return this.f5591t ? C1465e.m7642m(getContext(), i) : C1465e.m7643n(getContext(), i, (String) null);
    }

    /* renamed from: B */
    public boolean mo6922B() {
        return this.f5582k.mo7045I();
    }

    /* renamed from: C */
    public void mo6923C() {
        this.f5590s = false;
        this.f5588q = false;
        this.f5587p = false;
        this.f5586o = false;
        this.f5582k.mo7047K();
        m7575x();
    }

    /* renamed from: D */
    public void mo6924D() {
        if (isShown()) {
            this.f5582k.mo7048L();
            m7575x();
            return;
        }
        this.f5586o = true;
    }

    /* renamed from: E */
    public void mo6925E() {
        if (isShown()) {
            this.f5582k.mo7050N();
            m7575x();
            return;
        }
        this.f5586o = false;
        this.f5587p = true;
    }

    /* renamed from: F */
    public void mo6926F(InputStream inputStream, String str) {
        setCompositionTask(C1465e.m7637h(inputStream, str));
    }

    /* renamed from: G */
    public void mo6927G(String str, String str2) {
        mo6926F(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void buildDrawingCache(boolean z) {
        C1462c.m7603a("buildDrawingCache");
        this.f5594w++;
        super.buildDrawingCache(z);
        if (this.f5594w == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(C1502q.HARDWARE);
        }
        this.f5594w--;
        C1462c.m7604b("buildDrawingCache");
    }

    public C1464d getComposition() {
        return this.f5596y;
    }

    public long getDuration() {
        C1464d dVar = this.f5596y;
        if (dVar != null) {
            return (long) dVar.mo7005d();
        }
        return 0;
    }

    public int getFrame() {
        return this.f5582k.mo7098t();
    }

    public String getImageAssetsFolder() {
        return this.f5582k.mo7101w();
    }

    public float getMaxFrame() {
        return this.f5582k.mo7102x();
    }

    public float getMinFrame() {
        return this.f5582k.mo7103z();
    }

    public C1498n getPerformanceTracker() {
        return this.f5582k.mo7037A();
    }

    public float getProgress() {
        return this.f5582k.mo7038B();
    }

    public int getRepeatCount() {
        return this.f5582k.mo7039C();
    }

    public int getRepeatMode() {
        return this.f5582k.mo7040D();
    }

    public float getScale() {
        return this.f5582k.mo7041E();
    }

    public float getSpeed() {
        return this.f5582k.mo7042F();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C1473f fVar = this.f5582k;
        if (drawable2 == fVar) {
            super.invalidateDrawable(fVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.f5590s || this.f5588q)) {
            mo6924D();
            this.f5590s = false;
            this.f5588q = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        if (mo6922B()) {
            mo6981t();
            this.f5588q = true;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f5597g;
        this.f5584m = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f5584m);
        }
        int i = savedState.f5598h;
        this.f5585n = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(savedState.f5599i);
        if (savedState.f5600j) {
            mo6924D();
        }
        this.f5582k.mo7057U(savedState.f5601k);
        setRepeatMode(savedState.f5602l);
        setRepeatCount(savedState.f5603m);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5597g = this.f5584m;
        savedState.f5598h = this.f5585n;
        savedState.f5599i = this.f5582k.mo7038B();
        savedState.f5600j = this.f5582k.mo7045I() || (!C3774v.m16180S(this) && this.f5588q);
        savedState.f5601k = this.f5582k.mo7101w();
        savedState.f5602l = this.f5582k.mo7040D();
        savedState.f5603m = this.f5582k.mo7039C();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        if (this.f5583l) {
            if (isShown()) {
                if (this.f5587p) {
                    mo6925E();
                } else if (this.f5586o) {
                    mo6924D();
                }
                this.f5587p = false;
                this.f5586o = false;
            } else if (mo6922B()) {
                mo6923C();
                this.f5587p = true;
            }
        }
    }

    /* renamed from: q */
    public void mo6947q(Animator.AnimatorListener animatorListener) {
        this.f5582k.mo7065c(animatorListener);
    }

    /* renamed from: r */
    public <T> void mo6948r(C1560e eVar, T t, C1690c<T> cVar) {
        this.f5582k.mo7067d(eVar, t, cVar);
    }

    /* renamed from: s */
    public <T> void mo6949s(C1560e eVar, T t, C1692e<T> eVar2) {
        this.f5582k.mo7067d(eVar, t, new C1458f(this, eVar2));
    }

    public void setAnimation(int i) {
        this.f5585n = i;
        this.f5584m = null;
        setCompositionTask(m7577z(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        mo6927G(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.f5591t ? C1465e.m7646q(getContext(), str) : C1465e.m7647r(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f5582k.mo7051O(z);
    }

    public void setCacheComposition(boolean z) {
        this.f5591t = z;
    }

    public void setComposition(C1464d dVar) {
        if (C1462c.f5612a) {
            String str = f5577z;
            Log.v(str, "Set Composition \n" + dVar);
        }
        this.f5582k.setCallback(this);
        this.f5596y = dVar;
        this.f5589r = true;
        boolean P = this.f5582k.mo7052P(dVar);
        this.f5589r = false;
        m7575x();
        if (getDrawable() != this.f5582k || P) {
            if (!P) {
                m7568H();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (C1492j a : this.f5593v) {
                a.mo7116a(dVar);
            }
        }
    }

    public void setFailureListener(C1490h<Throwable> hVar) {
        this.f5580i = hVar;
    }

    public void setFallbackResource(int i) {
        this.f5581j = i;
    }

    public void setFontAssetDelegate(C1460a aVar) {
        this.f5582k.mo7053Q(aVar);
    }

    public void setFrame(int i) {
        this.f5582k.mo7054R(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f5582k.mo7055S(z);
    }

    public void setImageAssetDelegate(C1461b bVar) {
        this.f5582k.mo7056T(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f5582k.mo7057U(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m7573u();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        m7573u();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        m7573u();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f5582k.mo7058V(i);
    }

    public void setMaxProgress(float f) {
        this.f5582k.mo7060X(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f5582k.mo7062Z(str);
    }

    public void setMinFrame(int i) {
        this.f5582k.mo7063a0(i);
    }

    public void setMinProgress(float f) {
        this.f5582k.mo7066c0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f5582k.mo7068d0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f5582k.mo7070e0(z);
    }

    public void setProgress(float f) {
        this.f5582k.mo7071f0(f);
    }

    public void setRenderMode(C1502q qVar) {
        this.f5592u = qVar;
        m7575x();
    }

    public void setRepeatCount(int i) {
        this.f5582k.mo7072g0(i);
    }

    public void setRepeatMode(int i) {
        this.f5582k.mo7077h0(i);
    }

    public void setSafeMode(boolean z) {
        this.f5582k.mo7079i0(z);
    }

    public void setScale(float f) {
        this.f5582k.mo7084j0(f);
        if (getDrawable() == this.f5582k) {
            m7568H();
        }
    }

    public void setSpeed(float f) {
        this.f5582k.mo7085k0(f);
    }

    public void setTextDelegate(C1504s sVar) {
        this.f5582k.mo7087m0(sVar);
    }

    /* renamed from: t */
    public void mo6981t() {
        this.f5588q = false;
        this.f5587p = false;
        this.f5586o = false;
        this.f5582k.mo7078i();
        m7575x();
    }

    public void unscheduleDrawable(Drawable drawable) {
        C1473f fVar;
        if (!this.f5589r && drawable == (fVar = this.f5582k) && fVar.mo7045I()) {
            mo6923C();
        } else if (!this.f5589r && (drawable instanceof C1473f)) {
            C1473f fVar2 = (C1473f) drawable;
            if (fVar2.mo7045I()) {
                fVar2.mo7047K();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* renamed from: w */
    public void mo6983w(boolean z) {
        this.f5582k.mo7088n(z);
    }

    public void setMaxFrame(String str) {
        this.f5582k.mo7059W(str);
    }

    public void setMinFrame(String str) {
        this.f5582k.mo7064b0(str);
    }

    public void setAnimation(String str) {
        this.f5584m = str;
        this.f5585n = 0;
        setCompositionTask(m7576y(str));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7567A(attributeSet, C1500o.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7567A(attributeSet, i);
    }
}
