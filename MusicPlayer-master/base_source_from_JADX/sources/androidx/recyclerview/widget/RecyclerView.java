package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C0832a;
import androidx.recyclerview.widget.C0835a0;
import androidx.recyclerview.widget.C0839b0;
import androidx.recyclerview.widget.C0851f;
import androidx.recyclerview.widget.C0881k;
import androidx.recyclerview.widget.C0913w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p082e.p109h.p115l.C3656k;
import p082e.p109h.p118o.C3703i;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3762j;
import p082e.p109h.p119p.C3763k;
import p082e.p109h.p119p.C3764l;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.C3787w;
import p082e.p109h.p119p.p120e0.C3735b;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p147t.C4132a;
import p082e.p147t.C4133b;
import p082e.p147t.C4135d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class RecyclerView extends ViewGroup implements C3763k {

    /* renamed from: I0 */
    private static final int[] f3539I0 = {16843830};

    /* renamed from: J0 */
    static final boolean f3540J0;

    /* renamed from: K0 */
    static final boolean f3541K0;

    /* renamed from: L0 */
    static final boolean f3542L0;

    /* renamed from: M0 */
    static final boolean f3543M0;

    /* renamed from: N0 */
    private static final boolean f3544N0;

    /* renamed from: O0 */
    private static final boolean f3545O0;

    /* renamed from: P0 */
    private static final Class<?>[] f3546P0;

    /* renamed from: Q0 */
    static final Interpolator f3547Q0 = new C0791c();

    /* renamed from: A */
    boolean f3548A;

    /* renamed from: A0 */
    private final int[] f3549A0;

    /* renamed from: B */
    boolean f3550B;

    /* renamed from: B0 */
    final int[] f3551B0;

    /* renamed from: C */
    private int f3552C;

    /* renamed from: C0 */
    final List<C0792c0> f3553C0;

    /* renamed from: D */
    boolean f3554D;

    /* renamed from: D0 */
    private Runnable f3555D0;

    /* renamed from: E */
    boolean f3556E;

    /* renamed from: E0 */
    private boolean f3557E0;

    /* renamed from: F */
    private boolean f3558F;

    /* renamed from: F0 */
    private int f3559F0;

    /* renamed from: G */
    private int f3560G;

    /* renamed from: G0 */
    private int f3561G0;

    /* renamed from: H */
    boolean f3562H;

    /* renamed from: H0 */
    private final C0839b0.C0841b f3563H0;

    /* renamed from: I */
    private final AccessibilityManager f3564I;

    /* renamed from: J */
    private List<C0814q> f3565J;

    /* renamed from: K */
    boolean f3566K;

    /* renamed from: L */
    boolean f3567L;

    /* renamed from: M */
    private int f3568M;

    /* renamed from: N */
    private int f3569N;

    /* renamed from: O */
    private C0802l f3570O;

    /* renamed from: P */
    private EdgeEffect f3571P;

    /* renamed from: Q */
    private EdgeEffect f3572Q;

    /* renamed from: R */
    private EdgeEffect f3573R;

    /* renamed from: S */
    private EdgeEffect f3574S;

    /* renamed from: T */
    C0803m f3575T;

    /* renamed from: U */
    private int f3576U;

    /* renamed from: V */
    private int f3577V;

    /* renamed from: W */
    private VelocityTracker f3578W;

    /* renamed from: a0 */
    private int f3579a0;

    /* renamed from: b0 */
    private int f3580b0;

    /* renamed from: c0 */
    private int f3581c0;

    /* renamed from: d0 */
    private int f3582d0;

    /* renamed from: e0 */
    private int f3583e0;

    /* renamed from: f0 */
    private C0815r f3584f0;

    /* renamed from: g */
    private final C0822x f3585g;

    /* renamed from: g0 */
    private final int f3586g0;

    /* renamed from: h */
    final C0820v f3587h;

    /* renamed from: h0 */
    private final int f3588h0;

    /* renamed from: i */
    SavedState f3589i;

    /* renamed from: i0 */
    private float f3590i0;

    /* renamed from: j */
    C0832a f3591j;

    /* renamed from: j0 */
    private float f3592j0;

    /* renamed from: k */
    C0851f f3593k;

    /* renamed from: k0 */
    private boolean f3594k0;

    /* renamed from: l */
    final C0839b0 f3595l;

    /* renamed from: l0 */
    final C0790b0 f3596l0;

    /* renamed from: m */
    boolean f3597m;

    /* renamed from: m0 */
    C0881k f3598m0;

    /* renamed from: n */
    final Runnable f3599n;

    /* renamed from: n0 */
    C0881k.C0883b f3600n0;

    /* renamed from: o */
    final Rect f3601o;

    /* renamed from: o0 */
    final C0826z f3602o0;

    /* renamed from: p */
    private final Rect f3603p;

    /* renamed from: p0 */
    private C0817t f3604p0;

    /* renamed from: q */
    final RectF f3605q;

    /* renamed from: q0 */
    private List<C0817t> f3606q0;

    /* renamed from: r */
    C0797h f3607r;

    /* renamed from: r0 */
    boolean f3608r0;

    /* renamed from: s */
    C0809p f3609s;

    /* renamed from: s0 */
    boolean f3610s0;

    /* renamed from: t */
    C0821w f3611t;

    /* renamed from: t0 */
    private C0803m.C0805b f3612t0;

    /* renamed from: u */
    final List<C0821w> f3613u;

    /* renamed from: u0 */
    boolean f3614u0;

    /* renamed from: v */
    final ArrayList<C0808o> f3615v;

    /* renamed from: v0 */
    C0913w f3616v0;

    /* renamed from: w */
    private final ArrayList<C0816s> f3617w;

    /* renamed from: w0 */
    private C0801k f3618w0;

    /* renamed from: x */
    private C0816s f3619x;

    /* renamed from: x0 */
    private final int[] f3620x0;

    /* renamed from: y */
    boolean f3621y;

    /* renamed from: y0 */
    private C3764l f3622y0;

    /* renamed from: z */
    boolean f3623z;

    /* renamed from: z0 */
    private final int[] f3624z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C0787a implements Runnable {
        C0787a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3550B && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f3621y) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f3556E) {
                    recyclerView2.f3554D = true;
                } else {
                    recyclerView2.mo4695v();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class C0788a0 {
        /* renamed from: a */
        public abstract View mo4718a(C0820v vVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C0789b implements Runnable {
        C0789b() {
        }

        public void run() {
            C0803m mVar = RecyclerView.this.f3575T;
            if (mVar != null) {
                mVar.mo4864v();
            }
            RecyclerView.this.f3614u0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    class C0790b0 implements Runnable {

        /* renamed from: g */
        private int f3632g;

        /* renamed from: h */
        private int f3633h;

        /* renamed from: i */
        OverScroller f3634i;

        /* renamed from: j */
        Interpolator f3635j;

        /* renamed from: k */
        private boolean f3636k = false;

        /* renamed from: l */
        private boolean f3637l = false;

        C0790b0() {
            Interpolator interpolator = RecyclerView.f3547Q0;
            this.f3635j = interpolator;
            this.f3634i = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        private int m4761a(int i, int i2) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                abs = abs2;
            }
            return Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), 2000);
        }

        /* renamed from: c */
        private void m4762c() {
            RecyclerView.this.removeCallbacks(this);
            C3774v.m16201g0(RecyclerView.this, this);
        }

        /* renamed from: b */
        public void mo4720b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f3633h = 0;
            this.f3632g = 0;
            Interpolator interpolator = this.f3635j;
            Interpolator interpolator2 = RecyclerView.f3547Q0;
            if (interpolator != interpolator2) {
                this.f3635j = interpolator2;
                this.f3634i = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3634i.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            mo4721d();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4721d() {
            if (this.f3636k) {
                this.f3637l = true;
            } else {
                m4762c();
            }
        }

        /* renamed from: e */
        public void mo4722e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m4761a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f3547Q0;
            }
            if (this.f3635j != interpolator) {
                this.f3635j = interpolator;
                this.f3634i = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3633h = 0;
            this.f3632g = 0;
            RecyclerView.this.setScrollState(2);
            this.f3634i.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3634i.computeScrollOffset();
            }
            mo4721d();
        }

        /* renamed from: f */
        public void mo4723f() {
            RecyclerView.this.removeCallbacks(this);
            this.f3634i.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3609s == null) {
                mo4723f();
                return;
            }
            this.f3637l = false;
            this.f3636k = true;
            recyclerView.mo4695v();
            OverScroller overScroller = this.f3634i;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f3632g;
                int i4 = currY - this.f3633h;
                this.f3632g = currX;
                this.f3633h = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f3551B0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo4540G(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f3551B0;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo4692u(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3607r != null) {
                    int[] iArr3 = recyclerView3.f3551B0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo4654p1(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f3551B0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C0823y yVar = recyclerView4.f3609s.f3659g;
                    if (yVar != null && !yVar.mo5040g() && yVar.mo5041h()) {
                        int b = RecyclerView.this.f3602o0.mo5057b();
                        if (b == 0) {
                            yVar.mo5051r();
                        } else if (yVar.mo5039f() >= b) {
                            yVar.mo5049p(b - 1);
                            yVar.mo5043j(i, i2);
                        } else {
                            yVar.mo5043j(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f3615v.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f3551B0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo4542H(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f3551B0;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo4546J(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C0823y yVar2 = RecyclerView.this.f3609s.f3659g;
                if ((yVar2 != null && yVar2.mo5040g()) || !z) {
                    mo4721d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    C0881k kVar = recyclerView7.f3598m0;
                    if (kVar != null) {
                        kVar.mo5294f(recyclerView7, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.mo4570a(i7, currVelocity);
                    }
                    if (RecyclerView.f3543M0) {
                        RecyclerView.this.f3600n0.mo5300b();
                    }
                }
            }
            C0823y yVar3 = RecyclerView.this.f3609s.f3659g;
            if (yVar3 != null && yVar3.mo5040g()) {
                yVar3.mo5043j(0, 0);
            }
            this.f3636k = false;
            if (this.f3637l) {
                m4762c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo4535C1(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    class C0791c implements Interpolator {
        C0791c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    public static abstract class C0792c0 {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        C0797h<? extends C0792c0> mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        C0820v mScrapContainer = null;
        C0792c0 mShadowedHolder = null;
        C0792c0 mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public C0792c0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: package-private */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: package-private */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: package-private */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: package-private */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: package-private */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: package-private */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: package-private */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C3774v.m16178Q(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo4595e0(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final C0797h<? extends C0792c0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            C0797h adapter;
            int e0;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (e0 = this.mOwnerRecyclerView.mo4595e0(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, e0);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        /* access modifiers changed from: package-private */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: package-private */
        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        /* access modifiers changed from: package-private */
        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C3774v.m16178Q(this.itemView);
        }

        /* access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: package-private */
        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: package-private */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f3627c = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C3774v.m16238z(this.itemView);
            }
            recyclerView.mo4664s1(this, 4);
        }

        /* access modifiers changed from: package-private */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.mo4664s1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* access modifiers changed from: package-private */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m4652s(this);
        }

        /* access modifiers changed from: package-private */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: package-private */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
        }

        /* access modifiers changed from: package-private */
        public void setScrapContainer(C0820v vVar, boolean z) {
            this.mScrapContainer = vVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        /* access modifiers changed from: package-private */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public void unScrap() {
            this.mScrapContainer.mo5005J(this);
        }

        /* access modifiers changed from: package-private */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C0793d implements C0839b0.C0841b {
        C0793d() {
        }

        /* renamed from: a */
        public void mo4769a(C0792c0 c0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3609s.mo4952n1(c0Var.itemView, recyclerView.f3587h);
        }

        /* renamed from: b */
        public void mo4770b(C0792c0 c0Var, C0803m.C0806c cVar, C0803m.C0806c cVar2) {
            RecyclerView.this.mo4636m(c0Var, cVar, cVar2);
        }

        /* renamed from: c */
        public void mo4771c(C0792c0 c0Var, C0803m.C0806c cVar, C0803m.C0806c cVar2) {
            RecyclerView.this.f3587h.mo5005J(c0Var);
            RecyclerView.this.mo4638o(c0Var, cVar, cVar2);
        }

        /* renamed from: d */
        public void mo4772d(C0792c0 c0Var, C0803m.C0806c cVar, C0803m.C0806c cVar2) {
            c0Var.setIsRecyclable(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3566K) {
                if (recyclerView.f3575T.mo4845b(c0Var, c0Var, cVar, cVar2)) {
                    RecyclerView.this.mo4565T0();
                }
            } else if (recyclerView.f3575T.mo4847d(c0Var, cVar, cVar2)) {
                RecyclerView.this.mo4565T0();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C0794e implements C0851f.C0853b {
        C0794e() {
        }

        /* renamed from: a */
        public void mo4773a(View view) {
            C0792c0 k0 = RecyclerView.m4641k0(view);
            if (k0 != null) {
                k0.onEnteredHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: b */
        public void mo4774b() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                RecyclerView.this.mo4529A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: c */
        public int mo4775c(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        /* renamed from: d */
        public C0792c0 mo4776d(View view) {
            return RecyclerView.m4641k0(view);
        }

        /* renamed from: e */
        public void mo4777e(int i) {
            C0792c0 k0;
            View childAt = getChildAt(i);
            if (!(childAt == null || (k0 = RecyclerView.m4641k0(childAt)) == null)) {
                if (!k0.isTmpDetached() || k0.shouldIgnore()) {
                    k0.addFlags(256);
                } else {
                    throw new IllegalArgumentException("called detach on an already detached child " + k0 + RecyclerView.this.mo4559Q());
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: f */
        public void mo4778f(View view) {
            C0792c0 k0 = RecyclerView.m4641k0(view);
            if (k0 != null) {
                k0.onLeftHiddenState(RecyclerView.this);
            }
        }

        /* renamed from: g */
        public void mo4779g(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.mo4703z(view);
        }

        public View getChildAt(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        public int getChildCount() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: h */
        public void mo4782h(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.mo4529A(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: i */
        public void mo4783i(View view, int i, ViewGroup.LayoutParams layoutParams) {
            C0792c0 k0 = RecyclerView.m4641k0(view);
            if (k0 != null) {
                if (k0.isTmpDetached() || k0.shouldIgnore()) {
                    k0.clearTmpDetachFlag();
                } else {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + k0 + RecyclerView.this.mo4559Q());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C0795f implements C0832a.C0833a {
        C0795f() {
        }

        /* renamed from: a */
        public void mo4784a(int i, int i2) {
            RecyclerView.this.mo4547J0(i, i2);
            RecyclerView.this.f3608r0 = true;
        }

        /* renamed from: b */
        public void mo4785b(C0832a.C0834b bVar) {
            mo4792i(bVar);
        }

        /* renamed from: c */
        public void mo4786c(int i, int i2, Object obj) {
            RecyclerView.this.mo4539F1(i, i2, obj);
            RecyclerView.this.f3610s0 = true;
        }

        /* renamed from: d */
        public void mo4787d(C0832a.C0834b bVar) {
            mo4792i(bVar);
        }

        /* renamed from: e */
        public C0792c0 mo4788e(int i) {
            C0792c0 c0 = RecyclerView.this.mo4575c0(i, true);
            if (c0 != null && !RecyclerView.this.f3593k.mo5223n(c0.itemView)) {
                return c0;
            }
            return null;
        }

        /* renamed from: f */
        public void mo4789f(int i, int i2) {
            RecyclerView.this.mo4549K0(i, i2, false);
            RecyclerView.this.f3608r0 = true;
        }

        /* renamed from: g */
        public void mo4790g(int i, int i2) {
            RecyclerView.this.mo4545I0(i, i2);
            RecyclerView.this.f3608r0 = true;
        }

        /* renamed from: h */
        public void mo4791h(int i, int i2) {
            RecyclerView.this.mo4549K0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3608r0 = true;
            recyclerView.f3602o0.f3711d += i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo4792i(C0832a.C0834b bVar) {
            int i = bVar.f3789a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3609s.mo4435S0(recyclerView, bVar.f3790b, bVar.f3792d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3609s.mo4438V0(recyclerView2, bVar.f3790b, bVar.f3792d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3609s.mo4441X0(recyclerView3, bVar.f3790b, bVar.f3792d, bVar.f3791c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3609s.mo4437U0(recyclerView4, bVar.f3790b, bVar.f3792d, 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    static /* synthetic */ class C0796g {

        /* renamed from: a */
        static final /* synthetic */ int[] f3642a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$h$a[] r0 = androidx.recyclerview.widget.RecyclerView.C0797h.C0798a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3642a = r0
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.C0797h.C0798a.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3642a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$h$a r1 = androidx.recyclerview.widget.RecyclerView.C0797h.C0798a.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0796g.<clinit>():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static abstract class C0797h<VH extends C0792c0> {
        private boolean mHasStableIds = false;
        private final C0799i mObservable = new C0799i();
        private C0798a mStateRestorationPolicy = C0798a.ALLOW;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$h$a */
        public enum C0798a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                C3656k.m15717a("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f3627c = true;
                }
                C3656k.m15718b();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean canRestoreState() {
            int i = C0796g.f3642a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                C3656k.m15717a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C3656k.m15718b();
            }
        }

        public int findRelativeAdapterPositionIn(C0797h<? extends C0792c0> hVar, C0792c0 c0Var, int i) {
            if (hVar == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final C0798a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo4826a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo4827b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo4829d(i, 1);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo4831f(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo4828c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo4829d(i, i2);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo4831f(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo4832g(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo4832g(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(C0800j jVar) {
            this.mObservable.registerObserver(jVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(C0798a aVar) {
            this.mStateRestorationPolicy = aVar;
            this.mObservable.mo4833h();
        }

        public void unregisterAdapterDataObserver(C0800j jVar) {
            this.mObservable.unregisterObserver(jVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo4830e(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo4830e(i, i2, obj);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    static class C0799i extends Observable<C0800j> {
        C0799i() {
        }

        /* renamed from: a */
        public boolean mo4826a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo4827b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0800j) this.mObservers.get(size)).mo4834a();
            }
        }

        /* renamed from: c */
        public void mo4828c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0800j) this.mObservers.get(size)).mo4838e(i, i2, 1);
            }
        }

        /* renamed from: d */
        public void mo4829d(int i, int i2) {
            mo4830e(i, i2, (Object) null);
        }

        /* renamed from: e */
        public void mo4830e(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0800j) this.mObservers.get(size)).mo4836c(i, i2, obj);
            }
        }

        /* renamed from: f */
        public void mo4831f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0800j) this.mObservers.get(size)).mo4837d(i, i2);
            }
        }

        /* renamed from: g */
        public void mo4832g(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0800j) this.mObservers.get(size)).mo4839f(i, i2);
            }
        }

        /* renamed from: h */
        public void mo4833h() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0800j) this.mObservers.get(size)).mo4840g();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class C0800j {
        /* renamed from: a */
        public void mo4834a() {
        }

        /* renamed from: b */
        public void mo4835b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo4836c(int i, int i2, Object obj) {
            mo4835b(i, i2);
        }

        /* renamed from: d */
        public void mo4837d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo4838e(int i, int i2, int i3) {
        }

        /* renamed from: f */
        public void mo4839f(int i, int i2) {
        }

        /* renamed from: g */
        public void mo4840g() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public interface C0801k {
        /* renamed from: a */
        int mo4841a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static class C0802l {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo4842a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class C0803m {

        /* renamed from: a */
        private C0805b f3644a = null;

        /* renamed from: b */
        private ArrayList<C0804a> f3645b = new ArrayList<>();

        /* renamed from: c */
        private long f3646c = 120;

        /* renamed from: d */
        private long f3647d = 120;

        /* renamed from: e */
        private long f3648e = 250;

        /* renamed from: f */
        private long f3649f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        public interface C0804a {
            /* renamed from: a */
            void mo4869a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        interface C0805b {
            /* renamed from: a */
            void mo4870a(C0792c0 c0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        public static class C0806c {

            /* renamed from: a */
            public int f3650a;

            /* renamed from: b */
            public int f3651b;

            /* renamed from: a */
            public C0806c mo4871a(C0792c0 c0Var) {
                mo4872b(c0Var, 0);
                return this;
            }

            /* renamed from: b */
            public C0806c mo4872b(C0792c0 c0Var, int i) {
                View view = c0Var.itemView;
                this.f3650a = view.getLeft();
                this.f3651b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m4806e(C0792c0 c0Var) {
            int i = c0Var.mFlags & 14;
            if (c0Var.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = c0Var.getOldPosition();
            int absoluteAdapterPosition = c0Var.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i : i | 2048;
        }

        /* renamed from: A */
        public void mo4843A(long j) {
            this.f3647d = j;
        }

        /* renamed from: a */
        public abstract boolean mo4844a(C0792c0 c0Var, C0806c cVar, C0806c cVar2);

        /* renamed from: b */
        public abstract boolean mo4845b(C0792c0 c0Var, C0792c0 c0Var2, C0806c cVar, C0806c cVar2);

        /* renamed from: c */
        public abstract boolean mo4846c(C0792c0 c0Var, C0806c cVar, C0806c cVar2);

        /* renamed from: d */
        public abstract boolean mo4847d(C0792c0 c0Var, C0806c cVar, C0806c cVar2);

        /* renamed from: f */
        public abstract boolean mo4848f(C0792c0 c0Var);

        /* renamed from: g */
        public boolean mo4849g(C0792c0 c0Var, List<Object> list) {
            return mo4848f(c0Var);
        }

        /* renamed from: h */
        public final void mo4850h(C0792c0 c0Var) {
            mo4861s(c0Var);
            C0805b bVar = this.f3644a;
            if (bVar != null) {
                bVar.mo4870a(c0Var);
            }
        }

        /* renamed from: i */
        public final void mo4851i() {
            int size = this.f3645b.size();
            for (int i = 0; i < size; i++) {
                this.f3645b.get(i).mo4869a();
            }
            this.f3645b.clear();
        }

        /* renamed from: j */
        public abstract void mo4852j(C0792c0 c0Var);

        /* renamed from: k */
        public abstract void mo4853k();

        /* renamed from: l */
        public long mo4854l() {
            return this.f3646c;
        }

        /* renamed from: m */
        public long mo4855m() {
            return this.f3649f;
        }

        /* renamed from: n */
        public long mo4856n() {
            return this.f3648e;
        }

        /* renamed from: o */
        public long mo4857o() {
            return this.f3647d;
        }

        /* renamed from: p */
        public abstract boolean mo4858p();

        /* renamed from: q */
        public final boolean mo4859q(C0804a aVar) {
            boolean p = mo4858p();
            if (aVar != null) {
                if (!p) {
                    aVar.mo4869a();
                } else {
                    this.f3645b.add(aVar);
                }
            }
            return p;
        }

        /* renamed from: r */
        public C0806c mo4860r() {
            return new C0806c();
        }

        /* renamed from: s */
        public void mo4861s(C0792c0 c0Var) {
        }

        /* renamed from: t */
        public C0806c mo4862t(C0826z zVar, C0792c0 c0Var) {
            C0806c r = mo4860r();
            r.mo4871a(c0Var);
            return r;
        }

        /* renamed from: u */
        public C0806c mo4863u(C0826z zVar, C0792c0 c0Var, int i, List<Object> list) {
            C0806c r = mo4860r();
            r.mo4871a(c0Var);
            return r;
        }

        /* renamed from: v */
        public abstract void mo4864v();

        /* renamed from: w */
        public void mo4865w(long j) {
            this.f3646c = j;
        }

        /* renamed from: x */
        public void mo4866x(long j) {
            this.f3649f = j;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo4867y(C0805b bVar) {
            this.f3644a = bVar;
        }

        /* renamed from: z */
        public void mo4868z(long j) {
            this.f3648e = j;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    private class C0807n implements C0803m.C0805b {
        C0807n() {
        }

        /* renamed from: a */
        public void mo4870a(C0792c0 c0Var) {
            c0Var.setIsRecyclable(true);
            if (c0Var.mShadowedHolder != null && c0Var.mShadowingHolder == null) {
                c0Var.mShadowedHolder = null;
            }
            c0Var.mShadowingHolder = null;
            if (!c0Var.shouldBeKeptAsChild() && !RecyclerView.this.mo4576c1(c0Var.itemView) && c0Var.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(c0Var.itemView, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C0808o {
        @Deprecated
        /* renamed from: c */
        public void mo4873c(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: d */
        public void mo4874d(Rect rect, View view, RecyclerView recyclerView, C0826z zVar) {
            mo4873c(rect, ((LayoutParams) view.getLayoutParams()).mo4706a(), recyclerView);
        }

        @Deprecated
        /* renamed from: e */
        public void mo4875e(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: f */
        public void mo4876f(Canvas canvas, RecyclerView recyclerView, C0826z zVar) {
            mo4875e(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: g */
        public void mo4877g(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: h */
        public void mo4878h(Canvas canvas, RecyclerView recyclerView, C0826z zVar) {
            mo4877g(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static abstract class C0809p {

        /* renamed from: a */
        C0851f f3653a;

        /* renamed from: b */
        RecyclerView f3654b;

        /* renamed from: c */
        private final C0835a0.C0837b f3655c;

        /* renamed from: d */
        private final C0835a0.C0837b f3656d;

        /* renamed from: e */
        C0835a0 f3657e;

        /* renamed from: f */
        C0835a0 f3658f;

        /* renamed from: g */
        C0823y f3659g;

        /* renamed from: h */
        boolean f3660h = false;

        /* renamed from: i */
        boolean f3661i = false;

        /* renamed from: j */
        boolean f3662j = false;

        /* renamed from: k */
        private boolean f3663k = true;

        /* renamed from: l */
        private boolean f3664l = true;

        /* renamed from: m */
        int f3665m;

        /* renamed from: n */
        boolean f3666n;

        /* renamed from: o */
        private int f3667o;

        /* renamed from: p */
        private int f3668p;

        /* renamed from: q */
        private int f3669q;

        /* renamed from: r */
        private int f3670r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$a */
        class C0810a implements C0835a0.C0837b {
            C0810a() {
            }

            /* renamed from: a */
            public int mo4972a(View view) {
                return C0809p.this.mo4911R(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: b */
            public int mo4973b() {
                return C0809p.this.mo4934f0();
            }

            /* renamed from: c */
            public int mo4974c() {
                return C0809p.this.mo4955p0() - C0809p.this.mo4936g0();
            }

            /* renamed from: d */
            public int mo4975d(View view) {
                return C0809p.this.mo4915U(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }

            public View getChildAt(int i) {
                return C0809p.this.mo4900J(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$b */
        class C0811b implements C0835a0.C0837b {
            C0811b() {
            }

            /* renamed from: a */
            public int mo4972a(View view) {
                return C0809p.this.mo4916V(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public int mo4973b() {
                return C0809p.this.mo4938h0();
            }

            /* renamed from: c */
            public int mo4974c() {
                return C0809p.this.mo4919X() - C0809p.this.mo4932e0();
            }

            /* renamed from: d */
            public int mo4975d(View view) {
                return C0809p.this.mo4908P(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }

            public View getChildAt(int i) {
                return C0809p.this.mo4900J(i);
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$c */
        public interface C0812c {
            /* renamed from: a */
            void mo4977a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$p$d */
        public static class C0813d {

            /* renamed from: a */
            public int f3673a;

            /* renamed from: b */
            public int f3674b;

            /* renamed from: c */
            public boolean f3675c;

            /* renamed from: d */
            public boolean f3676d;
        }

        public C0809p() {
            C0810a aVar = new C0810a();
            this.f3655c = aVar;
            C0811b bVar = new C0811b();
            this.f3656d = bVar;
            this.f3657e = new C0835a0(aVar);
            this.f3658f = new C0835a0(bVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: L */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m4844L(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0809p.m4844L(int, int, int, int, boolean):int");
        }

        /* renamed from: M */
        private int[] m4845M(View view, Rect rect) {
            int[] iArr = new int[2];
            int f0 = mo4934f0();
            int h0 = mo4938h0();
            int p0 = mo4955p0() - mo4936g0();
            int X = mo4919X() - mo4932e0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - f0;
            int min = Math.min(0, i);
            int i2 = top - h0;
            int min2 = Math.min(0, i2);
            int i3 = width - p0;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - X);
            if (mo4922a0() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: g */
        private void m4846g(View view, int i, boolean z) {
            C0792c0 k0 = RecyclerView.m4641k0(view);
            if (z || k0.isRemoved()) {
                this.f3654b.f3595l.mo5178b(k0);
            } else {
                this.f3654b.f3595l.mo5191p(k0);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (k0.wasReturnedFromScrap() || k0.isScrap()) {
                if (k0.isScrap()) {
                    k0.unScrap();
                } else {
                    k0.clearReturnedFromScrapFlag();
                }
                this.f3653a.mo5214c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3654b) {
                int m = this.f3653a.mo5222m(view);
                if (i == -1) {
                    i = this.f3653a.mo5218g();
                }
                if (m == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3654b.indexOfChild(view) + this.f3654b.mo4559Q());
                } else if (m != i) {
                    this.f3654b.f3609s.mo4886C0(m, i);
                }
            } else {
                this.f3653a.mo5212a(view, i, false);
                layoutParams.f3627c = true;
                C0823y yVar = this.f3659g;
                if (yVar != null && yVar.mo5041h()) {
                    this.f3659g.mo5044k(view);
                }
            }
            if (layoutParams.f3628d) {
                k0.itemView.invalidate();
                layoutParams.f3628d = false;
            }
        }

        /* renamed from: j0 */
        public static C0813d m4847j0(Context context, AttributeSet attributeSet, int i, int i2) {
            C0813d dVar = new C0813d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4135d.RecyclerView, i, i2);
            dVar.f3673a = obtainStyledAttributes.getInt(C4135d.RecyclerView_android_orientation, 1);
            dVar.f3674b = obtainStyledAttributes.getInt(C4135d.RecyclerView_spanCount, 1);
            dVar.f3675c = obtainStyledAttributes.getBoolean(C4135d.RecyclerView_reverseLayout, false);
            dVar.f3676d = obtainStyledAttributes.getBoolean(C4135d.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: o */
        public static int m4848o(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: u0 */
        private boolean m4849u0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int f0 = mo4934f0();
            int h0 = mo4938h0();
            int p0 = mo4955p0() - mo4936g0();
            int X = mo4919X() - mo4932e0();
            Rect rect = this.f3654b.f3601o;
            mo4910Q(focusedChild, rect);
            if (rect.left - i >= p0 || rect.right - i <= f0 || rect.top - i2 >= X || rect.bottom - i2 <= h0) {
                return false;
            }
            return true;
        }

        /* renamed from: w1 */
        private void m4850w1(C0820v vVar, int i, View view) {
            C0792c0 k0 = RecyclerView.m4641k0(view);
            if (!k0.shouldIgnore()) {
                if (!k0.isInvalid() || k0.isRemoved() || this.f3654b.f3607r.hasStableIds()) {
                    mo4969y(i);
                    vVar.mo5000D(view);
                    this.f3654b.f3595l.mo5187k(k0);
                    return;
                }
                mo4960r1(i);
                vVar.mo4999C(k0);
            }
        }

        /* renamed from: x0 */
        private static boolean m4851x0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: z */
        private void m4852z(int i, View view) {
            this.f3653a.mo5215d(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4879A(RecyclerView recyclerView) {
            this.f3661i = true;
            mo4896H0(recyclerView);
        }

        /* renamed from: A0 */
        public void mo4880A0(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f3626b;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A1 */
        public void mo4881A1(RecyclerView recyclerView) {
            mo4884B1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B */
        public void mo4882B(RecyclerView recyclerView, C0820v vVar) {
            this.f3661i = false;
            mo4475J0(recyclerView, vVar);
        }

        /* renamed from: B0 */
        public void mo4883B0(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect p0 = this.f3654b.mo4653p0(view);
            int i3 = i + p0.left + p0.right;
            int i4 = i2 + p0.top + p0.bottom;
            int L = m4844L(mo4955p0(), mo4957q0(), mo4934f0() + mo4936g0() + layoutParams.leftMargin + layoutParams.rightMargin + i3, layoutParams.width, mo4495l());
            int L2 = m4844L(mo4919X(), mo4920Y(), mo4938h0() + mo4932e0() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, mo4496m());
            if (mo4894G1(view, L, L2, layoutParams)) {
                view.measure(L, L2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: B1 */
        public void mo4884B1(int i, int i2) {
            this.f3669q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f3667o = mode;
            if (mode == 0 && !RecyclerView.f3541K0) {
                this.f3669q = 0;
            }
            this.f3670r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3668p = mode2;
            if (mode2 == 0 && !RecyclerView.f3541K0) {
                this.f3670r = 0;
            }
        }

        /* renamed from: C */
        public View mo4885C(View view) {
            View T;
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView == null || (T = recyclerView.mo4564T(view)) == null || this.f3653a.mo5223n(T)) {
                return null;
            }
            return T;
        }

        /* renamed from: C0 */
        public void mo4886C0(int i, int i2) {
            View J = mo4900J(i);
            if (J != null) {
                mo4969y(i);
                mo4940i(J, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f3654b.toString());
        }

        /* renamed from: C1 */
        public void mo4887C1(int i, int i2) {
            this.f3654b.setMeasuredDimension(i, i2);
        }

        /* renamed from: D */
        public View mo4473D(int i) {
            int K = mo4901K();
            for (int i2 = 0; i2 < K; i2++) {
                View J = mo4900J(i2);
                C0792c0 k0 = RecyclerView.m4641k0(J);
                if (k0 != null && k0.getLayoutPosition() == i && !k0.shouldIgnore() && (this.f3654b.f3602o0.mo5060e() || !k0.isRemoved())) {
                    return J;
                }
            }
            return null;
        }

        /* renamed from: D0 */
        public void mo4888D0(int i) {
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView != null) {
                recyclerView.mo4541G0(i);
            }
        }

        /* renamed from: D1 */
        public void mo4425D1(Rect rect, int i, int i2) {
            mo4887C1(m4848o(i, rect.width() + mo4934f0() + mo4936g0(), mo4930d0()), m4848o(i2, rect.height() + mo4938h0() + mo4932e0(), mo4927c0()));
        }

        /* renamed from: E */
        public abstract LayoutParams mo4427E();

        /* renamed from: E0 */
        public void mo4889E0(int i) {
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView != null) {
                recyclerView.mo4543H0(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E1 */
        public void mo4890E1(int i, int i2) {
            int K = mo4901K();
            if (K == 0) {
                this.f3654b.mo4698x(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < K; i7++) {
                View J = mo4900J(i7);
                Rect rect = this.f3654b.f3601o;
                mo4910Q(J, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f3654b.f3601o.set(i5, i6, i3, i4);
            mo4425D1(this.f3654b.f3601o, i, i2);
        }

        /* renamed from: F */
        public LayoutParams mo4428F(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* renamed from: F0 */
        public void mo4891F0(C0797h hVar, C0797h hVar2) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F1 */
        public void mo4892F1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f3654b = null;
                this.f3653a = null;
                this.f3669q = 0;
                this.f3670r = 0;
            } else {
                this.f3654b = recyclerView;
                this.f3653a = recyclerView.f3593k;
                this.f3669q = recyclerView.getWidth();
                this.f3670r = recyclerView.getHeight();
            }
            this.f3667o = 1073741824;
            this.f3668p = 1073741824;
        }

        /* renamed from: G */
        public LayoutParams mo4429G(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        /* renamed from: G0 */
        public boolean mo4893G0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: G1 */
        public boolean mo4894G1(View view, int i, int i2, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.f3663k || !m4851x0(view.getWidth(), i, layoutParams.width) || !m4851x0(view.getHeight(), i2, layoutParams.height);
        }

        /* renamed from: H */
        public int mo4895H() {
            return -1;
        }

        /* renamed from: H0 */
        public void mo4896H0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: H1 */
        public boolean mo4474H1() {
            return false;
        }

        /* renamed from: I */
        public int mo4897I(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3626b.bottom;
        }

        @Deprecated
        /* renamed from: I0 */
        public void mo4898I0(RecyclerView recyclerView) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: I1 */
        public boolean mo4899I1(View view, int i, int i2, LayoutParams layoutParams) {
            return !this.f3663k || !m4851x0(view.getMeasuredWidth(), i, layoutParams.width) || !m4851x0(view.getMeasuredHeight(), i2, layoutParams.height);
        }

        /* renamed from: J */
        public View mo4900J(int i) {
            C0851f fVar = this.f3653a;
            if (fVar != null) {
                return fVar.mo5217f(i);
            }
            return null;
        }

        /* renamed from: J0 */
        public void mo4475J0(RecyclerView recyclerView, C0820v vVar) {
            mo4898I0(recyclerView);
        }

        /* renamed from: J1 */
        public void mo4476J1(RecyclerView recyclerView, C0826z zVar, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: K */
        public int mo4901K() {
            C0851f fVar = this.f3653a;
            if (fVar != null) {
                return fVar.mo5218g();
            }
            return 0;
        }

        /* renamed from: K0 */
        public View mo4430K0(View view, int i, C0820v vVar, C0826z zVar) {
            return null;
        }

        /* renamed from: K1 */
        public void mo4902K1(C0823y yVar) {
            C0823y yVar2 = this.f3659g;
            if (!(yVar2 == null || yVar == yVar2 || !yVar2.mo5041h())) {
                this.f3659g.mo5051r();
            }
            this.f3659g = yVar;
            yVar.mo5050q(this.f3654b, this);
        }

        /* renamed from: L0 */
        public void mo4477L0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3654b;
            mo4904M0(recyclerView.f3587h, recyclerView.f3602o0, accessibilityEvent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L1 */
        public void mo4903L1() {
            C0823y yVar = this.f3659g;
            if (yVar != null) {
                yVar.mo5051r();
            }
        }

        /* renamed from: M0 */
        public void mo4904M0(C0820v vVar, C0826z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3654b.canScrollVertically(-1) && !this.f3654b.canScrollHorizontally(-1) && !this.f3654b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0797h hVar = this.f3654b.f3607r;
                if (hVar != null) {
                    accessibilityEvent.setItemCount(hVar.getItemCount());
                }
            }
        }

        /* renamed from: M1 */
        public boolean mo4431M1() {
            return false;
        }

        /* renamed from: N */
        public boolean mo4905N() {
            RecyclerView recyclerView = this.f3654b;
            return recyclerView != null && recyclerView.f3597m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: N0 */
        public void mo4906N0(C3736c cVar) {
            RecyclerView recyclerView = this.f3654b;
            mo4907O0(recyclerView.f3587h, recyclerView.f3602o0, cVar);
        }

        /* renamed from: O */
        public int mo4432O(C0820v vVar, C0826z zVar) {
            return -1;
        }

        /* renamed from: O0 */
        public void mo4907O0(C0820v vVar, C0826z zVar, C3736c cVar) {
            if (this.f3654b.canScrollVertically(-1) || this.f3654b.canScrollHorizontally(-1)) {
                cVar.mo13109a(8192);
                cVar.mo13153y0(true);
            }
            if (this.f3654b.canScrollVertically(1) || this.f3654b.canScrollHorizontally(1)) {
                cVar.mo13109a(4096);
                cVar.mo13153y0(true);
            }
            cVar.mo13117e0(C3736c.C3738b.m16067b(mo4447l0(vVar, zVar), mo4432O(vVar, zVar), mo4967w0(vVar, zVar), mo4949m0(vVar, zVar)));
        }

        /* renamed from: P */
        public int mo4908P(View view) {
            return view.getBottom() + mo4897I(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P0 */
        public void mo4909P0(View view, C3736c cVar) {
            C0792c0 k0 = RecyclerView.m4641k0(view);
            if (k0 != null && !k0.isRemoved() && !this.f3653a.mo5223n(k0.itemView)) {
                RecyclerView recyclerView = this.f3654b;
                mo4434Q0(recyclerView.f3587h, recyclerView.f3602o0, view, cVar);
            }
        }

        /* renamed from: Q */
        public void mo4910Q(View view, Rect rect) {
            RecyclerView.m4644m0(view, rect);
        }

        /* renamed from: Q0 */
        public void mo4434Q0(C0820v vVar, C0826z zVar, View view, C3736c cVar) {
        }

        /* renamed from: R */
        public int mo4911R(View view) {
            return view.getLeft() - mo4924b0(view);
        }

        /* renamed from: R0 */
        public View mo4912R0(View view, int i) {
            return null;
        }

        /* renamed from: S */
        public int mo4913S(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f3626b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: S0 */
        public void mo4435S0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: T */
        public int mo4914T(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f3626b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: T0 */
        public void mo4436T0(RecyclerView recyclerView) {
        }

        /* renamed from: U */
        public int mo4915U(View view) {
            return view.getRight() + mo4946k0(view);
        }

        /* renamed from: U0 */
        public void mo4437U0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: V */
        public int mo4916V(View view) {
            return view.getTop() - mo4951n0(view);
        }

        /* renamed from: V0 */
        public void mo4438V0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: W */
        public View mo4917W() {
            View focusedChild;
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3653a.mo5223n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: W0 */
        public void mo4918W0(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: X */
        public int mo4919X() {
            return this.f3670r;
        }

        /* renamed from: X0 */
        public void mo4441X0(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo4918W0(recyclerView, i, i2);
        }

        /* renamed from: Y */
        public int mo4920Y() {
            return this.f3668p;
        }

        /* renamed from: Y0 */
        public void mo4442Y0(C0820v vVar, C0826z zVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: Z */
        public int mo4921Z() {
            RecyclerView recyclerView = this.f3654b;
            C0797h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: Z0 */
        public void mo4443Z0(C0826z zVar) {
        }

        /* renamed from: a0 */
        public int mo4922a0() {
            return C3774v.m16151B(this.f3654b);
        }

        /* renamed from: a1 */
        public void mo4923a1(C0820v vVar, C0826z zVar, int i, int i2) {
            this.f3654b.mo4698x(i, i2);
        }

        /* renamed from: b0 */
        public int mo4924b0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3626b.left;
        }

        @Deprecated
        /* renamed from: b1 */
        public boolean mo4925b1(RecyclerView recyclerView, View view, View view2) {
            return mo4970y0() || recyclerView.mo4530A0();
        }

        /* renamed from: c */
        public void mo4926c(View view) {
            mo4929d(view, -1);
        }

        /* renamed from: c0 */
        public int mo4927c0() {
            return C3774v.m16153C(this.f3654b);
        }

        /* renamed from: c1 */
        public boolean mo4928c1(RecyclerView recyclerView, C0826z zVar, View view, View view2) {
            return mo4925b1(recyclerView, view, view2);
        }

        /* renamed from: d */
        public void mo4929d(View view, int i) {
            m4846g(view, i, true);
        }

        /* renamed from: d0 */
        public int mo4930d0() {
            return C3774v.m16155D(this.f3654b);
        }

        /* renamed from: d1 */
        public void mo4490d1(Parcelable parcelable) {
        }

        /* renamed from: e */
        public void mo4931e(View view) {
            mo4933f(view, -1);
        }

        /* renamed from: e0 */
        public int mo4932e0() {
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: e1 */
        public Parcelable mo4492e1() {
            return null;
        }

        /* renamed from: f */
        public void mo4933f(View view, int i) {
            m4846g(view, i, false);
        }

        /* renamed from: f0 */
        public int mo4934f0() {
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: f1 */
        public void mo4935f1(int i) {
        }

        /* renamed from: g0 */
        public int mo4936g0() {
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g1 */
        public void mo4937g1(C0823y yVar) {
            if (this.f3659g == yVar) {
                this.f3659g = null;
            }
        }

        /* renamed from: h */
        public void mo4494h(String str) {
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView != null) {
                recyclerView.mo4652p(str);
            }
        }

        /* renamed from: h0 */
        public int mo4938h0() {
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h1 */
        public boolean mo4939h1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3654b;
            return mo4942i1(recyclerView.f3587h, recyclerView.f3602o0, i, bundle);
        }

        /* renamed from: i */
        public void mo4940i(View view, int i) {
            mo4943j(view, i, (LayoutParams) view.getLayoutParams());
        }

        /* renamed from: i0 */
        public int mo4941i0(View view) {
            return ((LayoutParams) view.getLayoutParams()).mo4706a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: i1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo4942i1(androidx.recyclerview.widget.RecyclerView.C0820v r8, androidx.recyclerview.widget.RecyclerView.C0826z r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f3654b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo4919X()
                int r11 = r7.mo4938h0()
                int r8 = r8 - r11
                int r11 = r7.mo4932e0()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f3654b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo4955p0()
                int r11 = r7.mo4934f0()
                int r10 = r10 - r11
                int r11 = r7.mo4936g0()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo4919X()
                int r10 = r7.mo4938h0()
                int r8 = r8 - r10
                int r10 = r7.mo4932e0()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f3654b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo4955p0()
                int r11 = r7.mo4934f0()
                int r10 = r10 - r11
                int r11 = r7.mo4936g0()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f3654b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.mo4700x1(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0809p.mo4942i1(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$z, int, android.os.Bundle):boolean");
        }

        /* renamed from: j */
        public void mo4943j(View view, int i, LayoutParams layoutParams) {
            C0792c0 k0 = RecyclerView.m4641k0(view);
            if (k0.isRemoved()) {
                this.f3654b.f3595l.mo5178b(k0);
            } else {
                this.f3654b.f3595l.mo5191p(k0);
            }
            this.f3653a.mo5214c(view, i, layoutParams, k0.isRemoved());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j1 */
        public boolean mo4944j1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f3654b;
            return mo4947k1(recyclerView.f3587h, recyclerView.f3602o0, view, i, bundle);
        }

        /* renamed from: k */
        public void mo4945k(View view, Rect rect) {
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo4653p0(view));
            }
        }

        /* renamed from: k0 */
        public int mo4946k0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3626b.right;
        }

        /* renamed from: k1 */
        public boolean mo4947k1(C0820v vVar, C0826z zVar, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: l */
        public boolean mo4495l() {
            return false;
        }

        /* renamed from: l0 */
        public int mo4447l0(C0820v vVar, C0826z zVar) {
            return -1;
        }

        /* renamed from: l1 */
        public void mo4948l1(C0820v vVar) {
            for (int K = mo4901K() - 1; K >= 0; K--) {
                if (!RecyclerView.m4641k0(mo4900J(K)).shouldIgnore()) {
                    mo4954o1(K, vVar);
                }
            }
        }

        /* renamed from: m */
        public boolean mo4496m() {
            return false;
        }

        /* renamed from: m0 */
        public int mo4949m0(C0820v vVar, C0826z zVar) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m1 */
        public void mo4950m1(C0820v vVar) {
            int j = vVar.mo5017j();
            for (int i = j - 1; i >= 0; i--) {
                View n = vVar.mo5021n(i);
                C0792c0 k0 = RecyclerView.m4641k0(n);
                if (!k0.shouldIgnore()) {
                    k0.setIsRecyclable(false);
                    if (k0.isTmpDetached()) {
                        this.f3654b.removeDetachedView(n, false);
                    }
                    C0803m mVar = this.f3654b.f3575T;
                    if (mVar != null) {
                        mVar.mo4852j(k0);
                    }
                    k0.setIsRecyclable(true);
                    vVar.mo5030y(n);
                }
            }
            vVar.mo5012e();
            if (j > 0) {
                this.f3654b.invalidate();
            }
        }

        /* renamed from: n */
        public boolean mo4448n(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: n0 */
        public int mo4951n0(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3626b.top;
        }

        /* renamed from: n1 */
        public void mo4952n1(View view, C0820v vVar) {
            mo4958q1(view);
            vVar.mo4998B(view);
        }

        /* renamed from: o0 */
        public void mo4953o0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f3626b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f3654b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3654b.f3605q;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: o1 */
        public void mo4954o1(int i, C0820v vVar) {
            View J = mo4900J(i);
            mo4960r1(i);
            vVar.mo4998B(J);
        }

        /* renamed from: p */
        public void mo4500p(int i, int i2, C0826z zVar, C0812c cVar) {
        }

        /* renamed from: p0 */
        public int mo4955p0() {
            return this.f3669q;
        }

        /* renamed from: p1 */
        public boolean mo4956p1(Runnable runnable) {
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: q */
        public void mo4502q(int i, C0812c cVar) {
        }

        /* renamed from: q0 */
        public int mo4957q0() {
            return this.f3667o;
        }

        /* renamed from: q1 */
        public void mo4958q1(View view) {
            this.f3653a.mo5225p(view);
        }

        /* renamed from: r */
        public int mo4503r(C0826z zVar) {
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r0 */
        public boolean mo4959r0() {
            int K = mo4901K();
            for (int i = 0; i < K; i++) {
                ViewGroup.LayoutParams layoutParams = mo4900J(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: r1 */
        public void mo4960r1(int i) {
            if (mo4900J(i) != null) {
                this.f3653a.mo5226q(i);
            }
        }

        /* renamed from: s */
        public int mo4450s(C0826z zVar) {
            return 0;
        }

        /* renamed from: s0 */
        public boolean mo4961s0() {
            return this.f3661i;
        }

        /* renamed from: s1 */
        public boolean mo4962s1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo4963t1(recyclerView, view, rect, z, false);
        }

        /* renamed from: t */
        public int mo4452t(C0826z zVar) {
            return 0;
        }

        /* renamed from: t0 */
        public boolean mo4504t0() {
            return this.f3662j;
        }

        /* renamed from: t1 */
        public boolean mo4963t1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] M = m4845M(view, rect);
            int i = M[0];
            int i2 = M[1];
            if ((z2 && !m4849u0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo4694u1(i, i2);
            }
            return true;
        }

        /* renamed from: u */
        public int mo4505u(C0826z zVar) {
            return 0;
        }

        /* renamed from: u1 */
        public void mo4964u1() {
            RecyclerView recyclerView = this.f3654b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: v */
        public int mo4453v(C0826z zVar) {
            return 0;
        }

        /* renamed from: v0 */
        public final boolean mo4965v0() {
            return this.f3664l;
        }

        /* renamed from: v1 */
        public void mo4966v1() {
            this.f3660h = true;
        }

        /* renamed from: w */
        public int mo4454w(C0826z zVar) {
            return 0;
        }

        /* renamed from: w0 */
        public boolean mo4967w0(C0820v vVar, C0826z zVar) {
            return false;
        }

        /* renamed from: x */
        public void mo4968x(C0820v vVar) {
            for (int K = mo4901K() - 1; K >= 0; K--) {
                m4850w1(vVar, K, mo4900J(K));
            }
        }

        /* renamed from: x1 */
        public int mo4455x1(int i, C0820v vVar, C0826z zVar) {
            return 0;
        }

        /* renamed from: y */
        public void mo4969y(int i) {
            m4852z(i, mo4900J(i));
        }

        /* renamed from: y0 */
        public boolean mo4970y0() {
            C0823y yVar = this.f3659g;
            return yVar != null && yVar.mo5041h();
        }

        /* renamed from: y1 */
        public void mo4507y1(int i) {
        }

        /* renamed from: z0 */
        public boolean mo4971z0(View view, boolean z, boolean z2) {
            boolean z3 = this.f3657e.mo5167b(view, 24579) && this.f3658f.mo5167b(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: z1 */
        public int mo4456z1(int i, C0820v vVar, C0826z zVar) {
            return 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C0814q {
        /* renamed from: a */
        void mo4978a(View view);

        /* renamed from: b */
        void mo4979b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C0815r {
        /* renamed from: a */
        public abstract boolean mo4980a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C0816s {
        boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);

        void onRequestDisallowInterceptTouchEvent(boolean z);

        void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C0817t {
        /* renamed from: a */
        public void mo4984a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: b */
        public void mo4985b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0818u {

        /* renamed from: a */
        SparseArray<C0819a> f3677a = new SparseArray<>();

        /* renamed from: b */
        private int f3678b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class C0819a {

            /* renamed from: a */
            final ArrayList<C0792c0> f3679a = new ArrayList<>();

            /* renamed from: b */
            int f3680b = 5;

            /* renamed from: c */
            long f3681c = 0;

            /* renamed from: d */
            long f3682d = 0;

            C0819a() {
            }
        }

        /* renamed from: g */
        private C0819a m4999g(int i) {
            C0819a aVar = this.f3677a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0819a aVar2 = new C0819a();
            this.f3677a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4986a() {
            this.f3678b++;
        }

        /* renamed from: b */
        public void mo4987b() {
            for (int i = 0; i < this.f3677a.size(); i++) {
                this.f3677a.valueAt(i).f3679a.clear();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4988c() {
            this.f3678b--;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo4989d(int i, long j) {
            C0819a g = m4999g(i);
            g.f3682d = mo4994j(g.f3682d, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo4990e(int i, long j) {
            C0819a g = m4999g(i);
            g.f3681c = mo4994j(g.f3681c, j);
        }

        /* renamed from: f */
        public C0792c0 mo4991f(int i) {
            C0819a aVar = this.f3677a.get(i);
            if (aVar == null || aVar.f3679a.isEmpty()) {
                return null;
            }
            ArrayList<C0792c0> arrayList = aVar.f3679a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo4992h(C0797h hVar, C0797h hVar2, boolean z) {
            if (hVar != null) {
                mo4988c();
            }
            if (!z && this.f3678b == 0) {
                mo4987b();
            }
            if (hVar2 != null) {
                mo4986a();
            }
        }

        /* renamed from: i */
        public void mo4993i(C0792c0 c0Var) {
            int itemViewType = c0Var.getItemViewType();
            ArrayList<C0792c0> arrayList = m4999g(itemViewType).f3679a;
            if (this.f3677a.get(itemViewType).f3680b > arrayList.size()) {
                c0Var.resetInternal();
                arrayList.add(c0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public long mo4994j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo4995k(int i, long j, long j2) {
            long j3 = m4999g(i).f3682d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public boolean mo4996l(int i, long j, long j2) {
            long j3 = m4999g(i).f3681c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0820v {

        /* renamed from: a */
        final ArrayList<C0792c0> f3683a;

        /* renamed from: b */
        ArrayList<C0792c0> f3684b = null;

        /* renamed from: c */
        final ArrayList<C0792c0> f3685c = new ArrayList<>();

        /* renamed from: d */
        private final List<C0792c0> f3686d;

        /* renamed from: e */
        private int f3687e;

        /* renamed from: f */
        int f3688f;

        /* renamed from: g */
        C0818u f3689g;

        /* renamed from: h */
        private C0788a0 f3690h;

        public C0820v() {
            ArrayList<C0792c0> arrayList = new ArrayList<>();
            this.f3683a = arrayList;
            this.f3686d = Collections.unmodifiableList(arrayList);
            this.f3687e = 2;
            this.f3688f = 2;
        }

        /* renamed from: H */
        private boolean m5011H(C0792c0 c0Var, int i, int i2, long j) {
            c0Var.mBindingAdapter = null;
            c0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = c0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.f3689g.mo4995k(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.f3607r.bindViewHolder(c0Var, i);
            this.f3689g.mo4989d(c0Var.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            m5012b(c0Var);
            if (!RecyclerView.this.f3602o0.mo5060e()) {
                return true;
            }
            c0Var.mPreLayoutPosition = i2;
            return true;
        }

        /* renamed from: b */
        private void m5012b(C0792c0 c0Var) {
            if (RecyclerView.this.mo4704z0()) {
                View view = c0Var.itemView;
                if (C3774v.m16238z(view) == 0) {
                    C3774v.m16237y0(view, 1);
                }
                C0913w wVar = RecyclerView.this.f3616v0;
                if (wVar != null) {
                    C3704a n = wVar.mo5404n();
                    if (n instanceof C0913w.C0914a) {
                        ((C0913w.C0914a) n).mo5411o(view);
                    }
                    C3774v.m16217o0(view, n);
                }
            }
        }

        /* renamed from: q */
        private void m5013q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m5013q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: r */
        private void m5014r(C0792c0 c0Var) {
            View view = c0Var.itemView;
            if (view instanceof ViewGroup) {
                m5013q((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo4997A(int i) {
            mo5009a(this.f3685c.get(i), true);
            this.f3685c.remove(i);
        }

        /* renamed from: B */
        public void mo4998B(View view) {
            C0792c0 k0 = RecyclerView.m4641k0(view);
            if (k0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (k0.isScrap()) {
                k0.unScrap();
            } else if (k0.wasReturnedFromScrap()) {
                k0.clearReturnedFromScrapFlag();
            }
            mo4999C(k0);
            if (RecyclerView.this.f3575T != null && !k0.isRecyclable()) {
                RecyclerView.this.f3575T.mo4852j(k0);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: C */
        public void mo4999C(C0792c0 c0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (c0Var.isScrap() || c0Var.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c0Var.isScrap());
                sb.append(" isAttached:");
                if (c0Var.itemView.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.mo4559Q());
                throw new IllegalArgumentException(sb.toString());
            } else if (c0Var.isTmpDetached()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c0Var + RecyclerView.this.mo4559Q());
            } else if (!c0Var.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = c0Var.doesTransientStatePreventRecycling();
                C0797h hVar = RecyclerView.this.f3607r;
                if ((hVar != null && doesTransientStatePreventRecycling && hVar.onFailedToRecycleView(c0Var)) || c0Var.isRecyclable()) {
                    if (this.f3688f <= 0 || c0Var.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.f3685c.size();
                        if (size >= this.f3688f && size > 0) {
                            mo4997A(0);
                            size--;
                        }
                        if (RecyclerView.f3543M0 && size > 0 && !RecyclerView.this.f3600n0.mo5302d(c0Var.mPosition)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.f3600n0.mo5302d(this.f3685c.get(i).mPosition)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f3685c.add(size, c0Var);
                        z = true;
                    }
                    if (!z) {
                        mo5009a(c0Var, true);
                        z2 = z;
                        RecyclerView.this.f3595l.mo5192q(c0Var);
                        if (!z2 && !z3 && doesTransientStatePreventRecycling) {
                            c0Var.mBindingAdapter = null;
                            c0Var.mOwnerRecyclerView = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.f3595l.mo5192q(c0Var);
                if (!z2) {
                }
            } else {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.mo4559Q());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public void mo5000D(View view) {
            C0792c0 k0 = RecyclerView.m4641k0(view);
            if (!k0.hasAnyOfTheFlags(12) && k0.isUpdated() && !RecyclerView.this.mo4655q(k0)) {
                if (this.f3684b == null) {
                    this.f3684b = new ArrayList<>();
                }
                k0.setScrapContainer(this, true);
                this.f3684b.add(k0);
            } else if (!k0.isInvalid() || k0.isRemoved() || RecyclerView.this.f3607r.hasStableIds()) {
                k0.setScrapContainer(this, false);
                this.f3683a.add(k0);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.mo4559Q());
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo5001E(C0818u uVar) {
            C0818u uVar2 = this.f3689g;
            if (uVar2 != null) {
                uVar2.mo4988c();
            }
            this.f3689g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f3689g.mo4986a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: F */
        public void mo5002F(C0788a0 a0Var) {
        }

        /* renamed from: G */
        public void mo5003G(int i) {
            this.f3687e = i;
            mo5006K();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01cb  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01ce  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x020c  */
        /* renamed from: I */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0792c0 mo5004I(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x022f
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f3602o0
                int r1 = r1.mo5057b()
                if (r3 >= r1) goto L_0x022f
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f3602o0
                boolean r1 = r1.mo5060e()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r16.mo5015h(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r16.mo5020m(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo5007L(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.addFlags(r5)
                boolean r5 = r1.isScrap()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.itemView
                r5.removeDetachedView(r9, r8)
                r1.unScrap()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.wasReturnedFromScrap()
                if (r5 == 0) goto L_0x0057
                r1.clearReturnedFromScrapFlag()
            L_0x0057:
                r6.mo4999C(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.f3591j
                int r5 = r5.mo5150m(r3)
                if (r5 < 0) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f3607r
                int r9 = r9.getItemCount()
                if (r5 >= r9) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r9 = r9.f3607r
                int r9 = r9.getItemViewType(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r10 = r10.f3607r
                boolean r10 = r10.hasStableIds()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r1 = r1.f3607r
                long r10 = r1.getItemId(r5)
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r6.mo5019l(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.mPosition = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r6.f3690h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.mo4718a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$c0 r1 = r1.mo4632j0(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.shouldIgnore()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4559Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4559Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0102
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.mo5016i()
                androidx.recyclerview.widget.RecyclerView$c0 r0 = r0.mo4991f(r9)
                if (r0 == 0) goto L_0x0101
                r0.resetInternal()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.f3540J0
                if (r1 == 0) goto L_0x0101
                r6.m5014r(r0)
            L_0x0101:
                r1 = r0
            L_0x0102:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0120
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f3689g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo4996l(r11, r12, r14)
                if (r5 != 0) goto L_0x0120
                return r2
            L_0x0120:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$h r5 = r2.f3607r
                androidx.recyclerview.widget.RecyclerView$c0 r2 = r5.createViewHolder(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.f3543M0
                if (r5 == 0) goto L_0x013b
                android.view.View r5 = r2.itemView
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.m4630X(r5)
                if (r5 == 0) goto L_0x013b
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.mNestedRecyclerView = r10
            L_0x013b:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f3689g
                long r10 = r10 - r0
                r5.mo4990e(r9, r10)
                r9 = r2
                goto L_0x0182
            L_0x0149:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.f3602o0
                int r2 = r2.mo5057b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4559Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0181:
                r9 = r1
            L_0x0182:
                r10 = r4
                if (r10 == 0) goto L_0x01bb
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f3602o0
                boolean r0 = r0.mo5060e()
                if (r0 != 0) goto L_0x01bb
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x01bb
                r9.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f3602o0
                boolean r0 = r0.f3718k
                if (r0 == 0) goto L_0x01bb
                int r0 = androidx.recyclerview.widget.RecyclerView.C0803m.m4806e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$m r2 = r1.f3575T
                androidx.recyclerview.widget.RecyclerView$z r1 = r1.f3602o0
                java.util.List r4 = r9.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$m$c r0 = r2.mo4863u(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.mo4568Y0(r9, r0)
            L_0x01bb:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r0 = r0.f3602o0
                boolean r0 = r0.mo5060e()
                if (r0 == 0) goto L_0x01ce
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x01ce
                r9.mPreLayoutPosition = r3
                goto L_0x01e1
            L_0x01ce:
                boolean r0 = r9.isBound()
                if (r0 == 0) goto L_0x01e3
                boolean r0 = r9.needsUpdate()
                if (r0 != 0) goto L_0x01e3
                boolean r0 = r9.isInvalid()
                if (r0 == 0) goto L_0x01e1
                goto L_0x01e3
            L_0x01e1:
                r0 = 0
                goto L_0x01f6
            L_0x01e3:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f3591j
                int r2 = r0.mo5150m(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.m5011H(r1, r2, r3, r4)
            L_0x01f6:
                android.view.View r1 = r9.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020c
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x0224
            L_0x020c:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0222
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r9.itemView
                r2.setLayoutParams(r1)
                goto L_0x0224
            L_0x0222:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            L_0x0224:
                r1.f3625a = r9
                if (r10 == 0) goto L_0x022b
                if (r0 == 0) goto L_0x022b
                goto L_0x022c
            L_0x022b:
                r7 = 0
            L_0x022c:
                r1.f3628d = r7
                return r9
            L_0x022f:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$z r2 = r2.f3602o0
                int r2 = r2.mo5057b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.mo4559Q()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0820v.mo5004I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public void mo5005J(C0792c0 c0Var) {
            if (c0Var.mInChangeScrap) {
                this.f3684b.remove(c0Var);
            } else {
                this.f3683a.remove(c0Var);
            }
            c0Var.mScrapContainer = null;
            c0Var.mInChangeScrap = false;
            c0Var.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: K */
        public void mo5006K() {
            C0809p pVar = RecyclerView.this.f3609s;
            this.f3688f = this.f3687e + (pVar != null ? pVar.f3665m : 0);
            for (int size = this.f3685c.size() - 1; size >= 0 && this.f3685c.size() > this.f3688f; size--) {
                mo4997A(size);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: L */
        public boolean mo5007L(C0792c0 c0Var) {
            if (c0Var.isRemoved()) {
                return RecyclerView.this.f3602o0.mo5060e();
            }
            int i = c0Var.mPosition;
            if (i < 0 || i >= RecyclerView.this.f3607r.getItemCount()) {
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c0Var + RecyclerView.this.mo4559Q());
            } else if (!RecyclerView.this.f3602o0.mo5060e() && RecyclerView.this.f3607r.getItemViewType(c0Var.mPosition) != c0Var.getItemViewType()) {
                return false;
            } else {
                if (!RecyclerView.this.f3607r.hasStableIds() || c0Var.getItemId() == RecyclerView.this.f3607r.getItemId(c0Var.mPosition)) {
                    return true;
                }
                return false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: M */
        public void mo5008M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f3685c.size() - 1; size >= 0; size--) {
                C0792c0 c0Var = this.f3685c.get(size);
                if (c0Var != null && (i3 = c0Var.mPosition) >= i && i3 < i4) {
                    c0Var.addFlags(2);
                    mo4997A(size);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5009a(C0792c0 c0Var, boolean z) {
            RecyclerView.m4652s(c0Var);
            View view = c0Var.itemView;
            C0913w wVar = RecyclerView.this.f3616v0;
            if (wVar != null) {
                C3704a n = wVar.mo5404n();
                C3774v.m16217o0(view, n instanceof C0913w.C0914a ? ((C0913w.C0914a) n).mo5410n(view) : null);
            }
            if (z) {
                mo5014g(c0Var);
            }
            c0Var.mBindingAdapter = null;
            c0Var.mOwnerRecyclerView = null;
            mo5016i().mo4993i(c0Var);
        }

        /* renamed from: c */
        public void mo5010c() {
            this.f3683a.clear();
            mo5031z();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5011d() {
            int size = this.f3685c.size();
            for (int i = 0; i < size; i++) {
                this.f3685c.get(i).clearOldPosition();
            }
            int size2 = this.f3683a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f3683a.get(i2).clearOldPosition();
            }
            ArrayList<C0792c0> arrayList = this.f3684b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f3684b.get(i3).clearOldPosition();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo5012e() {
            this.f3683a.clear();
            ArrayList<C0792c0> arrayList = this.f3684b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* renamed from: f */
        public int mo5013f(int i) {
            if (i < 0 || i >= RecyclerView.this.f3602o0.mo5057b()) {
                throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.f3602o0.mo5057b() + RecyclerView.this.mo4559Q());
            } else if (!RecyclerView.this.f3602o0.mo5060e()) {
                return i;
            } else {
                return RecyclerView.this.f3591j.mo5150m(i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo5014g(C0792c0 c0Var) {
            C0821w wVar = RecyclerView.this.f3611t;
            if (wVar != null) {
                wVar.mo5032a(c0Var);
            }
            int size = RecyclerView.this.f3613u.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.f3613u.get(i).mo5032a(c0Var);
            }
            C0797h hVar = RecyclerView.this.f3607r;
            if (hVar != null) {
                hVar.onViewRecycled(c0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3602o0 != null) {
                recyclerView.f3595l.mo5192q(c0Var);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C0792c0 mo5015h(int i) {
            int size;
            int m;
            ArrayList<C0792c0> arrayList = this.f3684b;
            if (!(arrayList == null || (size = arrayList.size()) == 0)) {
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    C0792c0 c0Var = this.f3684b.get(i3);
                    if (c0Var.wasReturnedFromScrap() || c0Var.getLayoutPosition() != i) {
                        i3++;
                    } else {
                        c0Var.addFlags(32);
                        return c0Var;
                    }
                }
                if (RecyclerView.this.f3607r.hasStableIds() && (m = RecyclerView.this.f3591j.mo5150m(i)) > 0 && m < RecyclerView.this.f3607r.getItemCount()) {
                    long itemId = RecyclerView.this.f3607r.getItemId(m);
                    while (i2 < size) {
                        C0792c0 c0Var2 = this.f3684b.get(i2);
                        if (c0Var2.wasReturnedFromScrap() || c0Var2.getItemId() != itemId) {
                            i2++;
                        } else {
                            c0Var2.addFlags(32);
                            return c0Var2;
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C0818u mo5016i() {
            if (this.f3689g == null) {
                this.f3689g = new C0818u();
            }
            return this.f3689g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public int mo5017j() {
            return this.f3683a.size();
        }

        /* renamed from: k */
        public List<C0792c0> mo5018k() {
            return this.f3686d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C0792c0 mo5019l(long j, int i, boolean z) {
            for (int size = this.f3683a.size() - 1; size >= 0; size--) {
                C0792c0 c0Var = this.f3683a.get(size);
                if (c0Var.getItemId() == j && !c0Var.wasReturnedFromScrap()) {
                    if (i == c0Var.getItemViewType()) {
                        c0Var.addFlags(32);
                        if (c0Var.isRemoved() && !RecyclerView.this.f3602o0.mo5060e()) {
                            c0Var.setFlags(2, 14);
                        }
                        return c0Var;
                    } else if (!z) {
                        this.f3683a.remove(size);
                        RecyclerView.this.removeDetachedView(c0Var.itemView, false);
                        mo5030y(c0Var.itemView);
                    }
                }
            }
            int size2 = this.f3685c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0792c0 c0Var2 = this.f3685c.get(size2);
                if (c0Var2.getItemId() == j && !c0Var2.isAttachedToTransitionOverlay()) {
                    if (i == c0Var2.getItemViewType()) {
                        if (!z) {
                            this.f3685c.remove(size2);
                        }
                        return c0Var2;
                    } else if (!z) {
                        mo4997A(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C0792c0 mo5020m(int i, boolean z) {
            View e;
            int size = this.f3683a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0792c0 c0Var = this.f3683a.get(i3);
                if (c0Var.wasReturnedFromScrap() || c0Var.getLayoutPosition() != i || c0Var.isInvalid() || (!RecyclerView.this.f3602o0.f3715h && c0Var.isRemoved())) {
                    i3++;
                } else {
                    c0Var.addFlags(32);
                    return c0Var;
                }
            }
            if (z || (e = RecyclerView.this.f3593k.mo5216e(i)) == null) {
                int size2 = this.f3685c.size();
                while (i2 < size2) {
                    C0792c0 c0Var2 = this.f3685c.get(i2);
                    if (c0Var2.isInvalid() || c0Var2.getLayoutPosition() != i || c0Var2.isAttachedToTransitionOverlay()) {
                        i2++;
                    } else {
                        if (!z) {
                            this.f3685c.remove(i2);
                        }
                        return c0Var2;
                    }
                }
                return null;
            }
            C0792c0 k0 = RecyclerView.m4641k0(e);
            RecyclerView.this.f3593k.mo5228s(e);
            int m = RecyclerView.this.f3593k.mo5222m(e);
            if (m != -1) {
                RecyclerView.this.f3593k.mo5215d(m);
                mo5000D(e);
                k0.addFlags(8224);
                return k0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + k0 + RecyclerView.this.mo4559Q());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public View mo5021n(int i) {
            return this.f3683a.get(i).itemView;
        }

        /* renamed from: o */
        public View mo5022o(int i) {
            return mo5023p(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public View mo5023p(int i, boolean z) {
            return mo5004I(i, z, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo5024s() {
            int size = this.f3685c.size();
            for (int i = 0; i < size; i++) {
                LayoutParams layoutParams = (LayoutParams) this.f3685c.get(i).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.f3627c = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo5025t() {
            int size = this.f3685c.size();
            for (int i = 0; i < size; i++) {
                C0792c0 c0Var = this.f3685c.get(i);
                if (c0Var != null) {
                    c0Var.addFlags(6);
                    c0Var.addChangePayload((Object) null);
                }
            }
            C0797h hVar = RecyclerView.this.f3607r;
            if (hVar == null || !hVar.hasStableIds()) {
                mo5031z();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo5026u(int i, int i2) {
            int size = this.f3685c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0792c0 c0Var = this.f3685c.get(i3);
                if (c0Var != null && c0Var.mPosition >= i) {
                    c0Var.offsetPosition(i2, false);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5027v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f3685c.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0792c0 c0Var = this.f3685c.get(i7);
                if (c0Var != null && (i6 = c0Var.mPosition) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        c0Var.offsetPosition(i2 - i, false);
                    } else {
                        c0Var.offsetPosition(i5, false);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo5028w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f3685c.size() - 1; size >= 0; size--) {
                C0792c0 c0Var = this.f3685c.get(size);
                if (c0Var != null) {
                    int i4 = c0Var.mPosition;
                    if (i4 >= i3) {
                        c0Var.offsetPosition(-i2, z);
                    } else if (i4 >= i) {
                        c0Var.addFlags(8);
                        mo4997A(size);
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo5029x(C0797h hVar, C0797h hVar2, boolean z) {
            mo5010c();
            mo5016i().mo4992h(hVar, hVar2, z);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo5030y(View view) {
            C0792c0 k0 = RecyclerView.m4641k0(view);
            k0.mScrapContainer = null;
            k0.mInChangeScrap = false;
            k0.clearReturnedFromScrapFlag();
            mo4999C(k0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo5031z() {
            for (int size = this.f3685c.size() - 1; size >= 0; size--) {
                mo4997A(size);
            }
            this.f3685c.clear();
            if (RecyclerView.f3543M0) {
                RecyclerView.this.f3600n0.mo5300b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C0821w {
        /* renamed from: a */
        void mo5032a(C0792c0 c0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C0822x extends C0800j {
        C0822x() {
        }

        /* renamed from: a */
        public void mo4834a() {
            RecyclerView.this.mo4652p((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3602o0.f3714g = true;
            recyclerView.mo4567W0(true);
            if (!RecyclerView.this.f3591j.mo5153p()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: c */
        public void mo4836c(int i, int i2, Object obj) {
            RecyclerView.this.mo4652p((String) null);
            if (RecyclerView.this.f3591j.mo5155r(i, i2, obj)) {
                mo5033h();
            }
        }

        /* renamed from: d */
        public void mo4837d(int i, int i2) {
            RecyclerView.this.mo4652p((String) null);
            if (RecyclerView.this.f3591j.mo5156s(i, i2)) {
                mo5033h();
            }
        }

        /* renamed from: e */
        public void mo4838e(int i, int i2, int i3) {
            RecyclerView.this.mo4652p((String) null);
            if (RecyclerView.this.f3591j.mo5157t(i, i2, i3)) {
                mo5033h();
            }
        }

        /* renamed from: f */
        public void mo4839f(int i, int i2) {
            RecyclerView.this.mo4652p((String) null);
            if (RecyclerView.this.f3591j.mo5158u(i, i2)) {
                mo5033h();
            }
        }

        /* renamed from: g */
        public void mo4840g() {
            C0797h hVar;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3589i != null && (hVar = recyclerView.f3607r) != null && hVar.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo5033h() {
            if (RecyclerView.f3542L0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f3623z && recyclerView.f3621y) {
                    C3774v.m16201g0(recyclerView, recyclerView.f3599n);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f3562H = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class C0823y {

        /* renamed from: a */
        private int f3693a = -1;

        /* renamed from: b */
        private RecyclerView f3694b;

        /* renamed from: c */
        private C0809p f3695c;

        /* renamed from: d */
        private boolean f3696d;

        /* renamed from: e */
        private boolean f3697e;

        /* renamed from: f */
        private View f3698f;

        /* renamed from: g */
        private final C0824a f3699g = new C0824a(0, 0);

        /* renamed from: h */
        private boolean f3700h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        public static class C0824a {

            /* renamed from: a */
            private int f3701a;

            /* renamed from: b */
            private int f3702b;

            /* renamed from: c */
            private int f3703c;

            /* renamed from: d */
            private int f3704d;

            /* renamed from: e */
            private Interpolator f3705e;

            /* renamed from: f */
            private boolean f3706f;

            /* renamed from: g */
            private int f3707g;

            public C0824a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }

            /* renamed from: e */
            private void m5076e() {
                if (this.f3705e != null && this.f3703c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f3703c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public boolean mo5052a() {
                return this.f3704d >= 0;
            }

            /* renamed from: b */
            public void mo5053b(int i) {
                this.f3704d = i;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public void mo5054c(RecyclerView recyclerView) {
                int i = this.f3704d;
                if (i >= 0) {
                    this.f3704d = -1;
                    recyclerView.mo4534C0(i);
                    this.f3706f = false;
                } else if (this.f3706f) {
                    m5076e();
                    recyclerView.f3596l0.mo4722e(this.f3701a, this.f3702b, this.f3703c, this.f3705e);
                    int i2 = this.f3707g + 1;
                    this.f3707g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3706f = false;
                } else {
                    this.f3707g = 0;
                }
            }

            /* renamed from: d */
            public void mo5055d(int i, int i2, int i3, Interpolator interpolator) {
                this.f3701a = i;
                this.f3702b = i2;
                this.f3703c = i3;
                this.f3705e = interpolator;
                this.f3706f = true;
            }

            public C0824a(int i, int i2, int i3, Interpolator interpolator) {
                this.f3704d = -1;
                this.f3706f = false;
                this.f3707g = 0;
                this.f3701a = i;
                this.f3702b = i2;
                this.f3703c = i3;
                this.f3705e = interpolator;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$b */
        public interface C0825b {
            /* renamed from: a */
            PointF mo4486a(int i);
        }

        /* renamed from: a */
        public PointF mo5034a(int i) {
            C0809p e = mo5038e();
            if (e instanceof C0825b) {
                return ((C0825b) e).mo4486a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + C0825b.class.getCanonicalName());
            return null;
        }

        /* renamed from: b */
        public View mo5035b(int i) {
            return this.f3694b.f3609s.mo4473D(i);
        }

        /* renamed from: c */
        public int mo5036c() {
            return this.f3694b.f3609s.mo4901K();
        }

        /* renamed from: d */
        public int mo5037d(View view) {
            return this.f3694b.mo4623h0(view);
        }

        /* renamed from: e */
        public C0809p mo5038e() {
            return this.f3695c;
        }

        /* renamed from: f */
        public int mo5039f() {
            return this.f3693a;
        }

        /* renamed from: g */
        public boolean mo5040g() {
            return this.f3696d;
        }

        /* renamed from: h */
        public boolean mo5041h() {
            return this.f3697e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo5042i(PointF pointF) {
            float f = pointF.x;
            float f2 = pointF.y;
            float sqrt = (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo5043j(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f3694b;
            if (this.f3693a == -1 || recyclerView == null) {
                mo5051r();
            }
            if (this.f3696d && this.f3698f == null && this.f3695c != null && (a = mo5034a(this.f3693a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.mo4654p1((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            this.f3696d = false;
            View view = this.f3698f;
            if (view != null) {
                if (mo5037d(view) == this.f3693a) {
                    mo5048o(this.f3698f, recyclerView.f3602o0, this.f3699g);
                    this.f3699g.mo5054c(recyclerView);
                    mo5051r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3698f = null;
                }
            }
            if (this.f3697e) {
                mo5045l(i, i2, recyclerView.f3602o0, this.f3699g);
                boolean a2 = this.f3699g.mo5052a();
                this.f3699g.mo5054c(recyclerView);
                if (a2 && this.f3697e) {
                    this.f3696d = true;
                    recyclerView.f3596l0.mo4721d();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public void mo5044k(View view) {
            if (mo5037d(view) == mo5039f()) {
                this.f3698f = view;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public abstract void mo5045l(int i, int i2, C0826z zVar, C0824a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract void mo5046m();

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public abstract void mo5047n();

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public abstract void mo5048o(View view, C0826z zVar, C0824a aVar);

        /* renamed from: p */
        public void mo5049p(int i) {
            this.f3693a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo5050q(RecyclerView recyclerView, C0809p pVar) {
            recyclerView.f3596l0.mo4723f();
            if (this.f3700h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3694b = recyclerView;
            this.f3695c = pVar;
            int i = this.f3693a;
            if (i != -1) {
                recyclerView.f3602o0.f3708a = i;
                this.f3697e = true;
                this.f3696d = true;
                this.f3698f = mo5035b(mo5039f());
                mo5046m();
                this.f3694b.f3596l0.mo4721d();
                this.f3700h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public final void mo5051r() {
            if (this.f3697e) {
                this.f3697e = false;
                mo5047n();
                this.f3694b.f3602o0.f3708a = -1;
                this.f3698f = null;
                this.f3693a = -1;
                this.f3696d = false;
                this.f3695c.mo4937g1(this);
                this.f3695c = null;
                this.f3694b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static class C0826z {

        /* renamed from: a */
        int f3708a = -1;

        /* renamed from: b */
        private SparseArray<Object> f3709b;

        /* renamed from: c */
        int f3710c = 0;

        /* renamed from: d */
        int f3711d = 0;

        /* renamed from: e */
        int f3712e = 1;

        /* renamed from: f */
        int f3713f = 0;

        /* renamed from: g */
        boolean f3714g = false;

        /* renamed from: h */
        boolean f3715h = false;

        /* renamed from: i */
        boolean f3716i = false;

        /* renamed from: j */
        boolean f3717j = false;

        /* renamed from: k */
        boolean f3718k = false;

        /* renamed from: l */
        boolean f3719l = false;

        /* renamed from: m */
        int f3720m;

        /* renamed from: n */
        long f3721n;

        /* renamed from: o */
        int f3722o;

        /* renamed from: p */
        int f3723p;

        /* renamed from: q */
        int f3724q;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5056a(int i) {
            if ((this.f3712e & i) == 0) {
                throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f3712e));
            }
        }

        /* renamed from: b */
        public int mo5057b() {
            if (this.f3715h) {
                return this.f3710c - this.f3711d;
            }
            return this.f3713f;
        }

        /* renamed from: c */
        public int mo5058c() {
            return this.f3708a;
        }

        /* renamed from: d */
        public boolean mo5059d() {
            return this.f3708a != -1;
        }

        /* renamed from: e */
        public boolean mo5060e() {
            return this.f3715h;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo5061f(C0797h hVar) {
            this.f3712e = 1;
            this.f3713f = hVar.getItemCount();
            this.f3715h = false;
            this.f3716i = false;
            this.f3717j = false;
        }

        /* renamed from: g */
        public boolean mo5062g() {
            return this.f3719l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3708a + ", mData=" + this.f3709b + ", mItemCount=" + this.f3713f + ", mIsMeasuring=" + this.f3717j + ", mPreviousLayoutItemCount=" + this.f3710c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3711d + ", mStructureChanged=" + this.f3714g + ", mInPreLayout=" + this.f3715h + ", mRunSimpleAnimations=" + this.f3718k + ", mRunPredictiveAnimations=" + this.f3719l + '}';
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            f3539I0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 18
            if (r1 == r2) goto L_0x001c
            r2 = 19
            if (r1 == r2) goto L_0x001c
            r2 = 20
            if (r1 != r2) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r2 = 0
            goto L_0x001d
        L_0x001c:
            r2 = 1
        L_0x001d:
            f3540J0 = r2
            r2 = 23
            if (r1 < r2) goto L_0x0025
            r2 = 1
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            f3541K0 = r2
            r2 = 16
            if (r1 < r2) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            f3542L0 = r2
            r2 = 21
            if (r1 < r2) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            f3543M0 = r2
            r2 = 15
            if (r1 > r2) goto L_0x0040
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            f3544N0 = r4
            if (r1 > r2) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            f3545O0 = r1
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f3546P0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            f3547Q0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: B */
    private void m4617B() {
        int i = this.f3560G;
        this.f3560G = 0;
        if (i != 0 && mo4704z0()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C3735b.m15974b(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* renamed from: B0 */
    private boolean m4618B0(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || mo4564T(view2) == null) {
            return false;
        }
        if (view == null || mo4564T(view) == null) {
            return true;
        }
        this.f3601o.set(0, 0, view.getWidth(), view.getHeight());
        this.f3603p.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3601o);
        offsetDescendantRectToMyCoords(view2, this.f3603p);
        char c = 65535;
        int i3 = this.f3609s.mo4922a0() == 1 ? -1 : 1;
        Rect rect = this.f3601o;
        int i4 = rect.left;
        Rect rect2 = this.f3603p;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                throw new IllegalArgumentException("Invalid direction: " + i + mo4559Q());
                            } else if (c > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i2 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i2 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c > 0 || (c == 0 && i2 * i3 > 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c < 0 || (c == 0 && i2 * i3 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: D */
    private void m4619D() {
        boolean z = true;
        this.f3602o0.mo5056a(1);
        mo4560R(this.f3602o0);
        this.f3602o0.f3717j = false;
        mo4705z1();
        this.f3595l.mo5182f();
        mo4554N0();
        m4628V0();
        m4645m1();
        C0826z zVar = this.f3602o0;
        if (!zVar.f3718k || !this.f3610s0) {
            z = false;
        }
        zVar.f3716i = z;
        this.f3610s0 = false;
        this.f3608r0 = false;
        zVar.f3715h = zVar.f3719l;
        zVar.f3713f = this.f3607r.getItemCount();
        m4629W(this.f3620x0);
        if (this.f3602o0.f3718k) {
            int g = this.f3593k.mo5218g();
            for (int i = 0; i < g; i++) {
                C0792c0 k0 = m4641k0(this.f3593k.mo5217f(i));
                if (!k0.shouldIgnore() && (!k0.isInvalid() || this.f3607r.hasStableIds())) {
                    this.f3595l.mo5181e(k0, this.f3575T.mo4863u(this.f3602o0, k0, C0803m.m4806e(k0), k0.getUnmodifiedPayloads()));
                    if (this.f3602o0.f3716i && k0.isUpdated() && !k0.isRemoved() && !k0.shouldIgnore() && !k0.isInvalid()) {
                        this.f3595l.mo5179c(mo4597f0(k0), k0);
                    }
                }
            }
        }
        if (this.f3602o0.f3719l) {
            mo4637n1();
            C0826z zVar2 = this.f3602o0;
            boolean z2 = zVar2.f3714g;
            zVar2.f3714g = false;
            this.f3609s.mo4442Y0(this.f3587h, zVar2);
            this.f3602o0.f3714g = z2;
            for (int i2 = 0; i2 < this.f3593k.mo5218g(); i2++) {
                C0792c0 k02 = m4641k0(this.f3593k.mo5217f(i2));
                if (!k02.shouldIgnore() && !this.f3595l.mo5185i(k02)) {
                    int e = C0803m.m4806e(k02);
                    boolean hasAnyOfTheFlags = k02.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        e |= 4096;
                    }
                    C0803m.C0806c u = this.f3575T.mo4863u(this.f3602o0, k02, e, k02.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        mo4568Y0(k02, u);
                    } else {
                        this.f3595l.mo5177a(k02, u);
                    }
                }
            }
            mo4690t();
        } else {
            mo4690t();
        }
        mo4556O0();
        mo4532B1(false);
        this.f3602o0.f3712e = 2;
    }

    /* renamed from: E */
    private void m4620E() {
        mo4705z1();
        mo4554N0();
        this.f3602o0.mo5056a(6);
        this.f3591j.mo5148j();
        this.f3602o0.f3713f = this.f3607r.getItemCount();
        this.f3602o0.f3711d = 0;
        if (this.f3589i != null && this.f3607r.canRestoreState()) {
            Parcelable parcelable = this.f3589i.f3629i;
            if (parcelable != null) {
                this.f3609s.mo4490d1(parcelable);
            }
            this.f3589i = null;
        }
        C0826z zVar = this.f3602o0;
        zVar.f3715h = false;
        this.f3609s.mo4442Y0(this.f3587h, zVar);
        C0826z zVar2 = this.f3602o0;
        zVar2.f3714g = false;
        zVar2.f3718k = zVar2.f3718k && this.f3575T != null;
        zVar2.f3712e = 4;
        mo4556O0();
        mo4532B1(false);
    }

    /* renamed from: E1 */
    private void m4621E1() {
        this.f3596l0.mo4723f();
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            pVar.mo4903L1();
        }
    }

    /* renamed from: F */
    private void m4622F() {
        this.f3602o0.mo5056a(4);
        mo4705z1();
        mo4554N0();
        C0826z zVar = this.f3602o0;
        zVar.f3712e = 1;
        if (zVar.f3718k) {
            for (int g = this.f3593k.mo5218g() - 1; g >= 0; g--) {
                C0792c0 k0 = m4641k0(this.f3593k.mo5217f(g));
                if (!k0.shouldIgnore()) {
                    long f0 = mo4597f0(k0);
                    C0803m.C0806c t = this.f3575T.mo4862t(this.f3602o0, k0);
                    C0792c0 g2 = this.f3595l.mo5183g(f0);
                    if (g2 == null || g2.shouldIgnore()) {
                        this.f3595l.mo5180d(k0, t);
                    } else {
                        boolean h = this.f3595l.mo5184h(g2);
                        boolean h2 = this.f3595l.mo5184h(k0);
                        if (!h || g2 != k0) {
                            C0803m.C0806c n = this.f3595l.mo5189n(g2);
                            this.f3595l.mo5180d(k0, t);
                            C0803m.C0806c m = this.f3595l.mo5188m(k0);
                            if (n == null) {
                                m4650r0(f0, k0, g2);
                            } else {
                                m4646n(g2, k0, n, m, h, h2);
                            }
                        } else {
                            this.f3595l.mo5180d(k0, t);
                        }
                    }
                }
            }
            this.f3595l.mo5190o(this.f3563H0);
        }
        this.f3609s.mo4950m1(this.f3587h);
        C0826z zVar2 = this.f3602o0;
        zVar2.f3710c = zVar2.f3713f;
        this.f3566K = false;
        this.f3567L = false;
        zVar2.f3718k = false;
        zVar2.f3719l = false;
        this.f3609s.f3660h = false;
        ArrayList<C0792c0> arrayList = this.f3587h.f3684b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C0809p pVar = this.f3609s;
        if (pVar.f3666n) {
            pVar.f3665m = 0;
            pVar.f3666n = false;
            this.f3587h.mo5006K();
        }
        this.f3609s.mo4443Z0(this.f3602o0);
        mo4556O0();
        mo4532B1(false);
        this.f3595l.mo5182f();
        int[] iArr = this.f3620x0;
        if (m4657y(iArr[0], iArr[1])) {
            mo4546J(0, 0);
        }
        m4633Z0();
        m4642k1();
    }

    /* renamed from: F0 */
    private void m4623F0(int i, int i2, MotionEvent motionEvent, int i3) {
        C0809p pVar = this.f3609s;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3556E) {
            int[] iArr = this.f3551B0;
            int i4 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean l = pVar.mo4495l();
            boolean m = this.f3609s.mo4496m();
            int i5 = l ? 1 : 0;
            if (m) {
                i5 |= 2;
            }
            mo4531A1(i5, i3);
            if (mo4540G(l ? i : 0, m ? i2 : 0, this.f3551B0, this.f3624z0, i3)) {
                int[] iArr2 = this.f3551B0;
                i -= iArr2[0];
                i2 -= iArr2[1];
            }
            int i6 = l ? i : 0;
            if (m) {
                i4 = i2;
            }
            mo4639o1(i6, i4, motionEvent, i3);
            C0881k kVar = this.f3598m0;
            if (!(kVar == null || (i == 0 && i2 == 0))) {
                kVar.mo5294f(this, i, i2);
            }
            mo4535C1(i3);
        }
    }

    /* renamed from: L */
    private boolean m4624L(MotionEvent motionEvent) {
        C0816s sVar = this.f3619x;
        if (sVar != null) {
            sVar.onTouchEvent(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.f3619x = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return m4627V(motionEvent);
        }
    }

    /* renamed from: Q0 */
    private void m4625Q0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3577V) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f3577V = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f3581c0 = x;
            this.f3579a0 = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f3582d0 = y;
            this.f3580b0 = y;
        }
    }

    /* renamed from: U0 */
    private boolean m4626U0() {
        return this.f3575T != null && this.f3609s.mo4431M1();
    }

    /* renamed from: V */
    private boolean m4627V(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3617w.size();
        int i = 0;
        while (i < size) {
            C0816s sVar = this.f3617w.get(i);
            if (!sVar.onInterceptTouchEvent(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f3619x = sVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: V0 */
    private void m4628V0() {
        boolean z;
        if (this.f3566K) {
            this.f3591j.mo5161y();
            if (this.f3567L) {
                this.f3609s.mo4436T0(this);
            }
        }
        if (m4626U0()) {
            this.f3591j.mo5159w();
        } else {
            this.f3591j.mo5148j();
        }
        boolean z2 = false;
        boolean z3 = this.f3608r0 || this.f3610s0;
        this.f3602o0.f3718k = this.f3550B && this.f3575T != null && ((z = this.f3566K) || z3 || this.f3609s.f3660h) && (!z || this.f3607r.hasStableIds());
        C0826z zVar = this.f3602o0;
        if (zVar.f3718k && z3 && !this.f3566K && m4626U0()) {
            z2 = true;
        }
        zVar.f3719l = z2;
    }

    /* renamed from: W */
    private void m4629W(int[] iArr) {
        int g = this.f3593k.mo5218g();
        if (g == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < g; i3++) {
            C0792c0 k0 = m4641k0(this.f3593k.mo5217f(i3));
            if (!k0.shouldIgnore()) {
                int layoutPosition = k0.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: X */
    static RecyclerView m4630X(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView X = m4630X(viewGroup.getChildAt(i));
            if (X != null) {
                return X;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4631X0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.mo4553N()
            android.widget.EdgeEffect r3 = r6.f3571P
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
            androidx.core.widget.C0550f.m3397a(r3, r4, r9)
        L_0x001f:
            r9 = 1
            goto L_0x003c
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x003b
            r6.mo4555O()
            android.widget.EdgeEffect r3 = r6.f3573R
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            androidx.core.widget.C0550f.m3397a(r3, r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0056
            r6.mo4557P()
            android.widget.EdgeEffect r9 = r6.f3572Q
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0550f.m3397a(r9, r0, r7)
            goto L_0x0072
        L_0x0056:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0071
            r6.mo4551M()
            android.widget.EdgeEffect r9 = r6.f3574S
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0550f.m3397a(r9, r3, r0)
            goto L_0x0072
        L_0x0071:
            r1 = r9
        L_0x0072:
            if (r1 != 0) goto L_0x007c
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007f
        L_0x007c:
            p082e.p109h.p119p.C3774v.m16197e0(r6)
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m4631X0(float, float, float, float):void");
    }

    /* renamed from: Y */
    private View m4632Y() {
        C0792c0 Z;
        C0826z zVar = this.f3602o0;
        int i = zVar.f3720m;
        if (i == -1) {
            i = 0;
        }
        int b = zVar.mo5057b();
        int i2 = i;
        while (i2 < b) {
            C0792c0 Z2 = mo4569Z(i2);
            if (Z2 == null) {
                break;
            } else if (Z2.itemView.hasFocusable()) {
                return Z2.itemView;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0 || (Z = mo4569Z(min)) == null) {
                return null;
            }
            if (Z.itemView.hasFocusable()) {
                return Z.itemView;
            }
        }
    }

    /* renamed from: Z0 */
    private void m4633Z0() {
        View findViewById;
        if (this.f3594k0 && this.f3607r != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!f3545O0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.f3593k.mo5223n(focusedChild)) {
                            return;
                        }
                    } else if (this.f3593k.mo5218g() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                C0792c0 a0 = (this.f3602o0.f3721n == -1 || !this.f3607r.hasStableIds()) ? null : mo4571a0(this.f3602o0.f3721n);
                if (a0 != null && !this.f3593k.mo5223n(a0.itemView) && a0.itemView.hasFocusable()) {
                    view = a0.itemView;
                } else if (this.f3593k.mo5218g() > 0) {
                    view = m4632Y();
                }
                if (view != null) {
                    int i = this.f3602o0.f3722o;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    /* renamed from: a1 */
    private void m4634a1() {
        boolean z;
        EdgeEffect edgeEffect = this.f3571P;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f3571P.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f3572Q;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f3572Q.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3573R;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f3573R.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3574S;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f3574S.isFinished();
        }
        if (z) {
            C3774v.m16197e0(this);
        }
    }

    /* renamed from: g */
    private void m4639g(C0792c0 c0Var) {
        View view = c0Var.itemView;
        boolean z = view.getParent() == this;
        this.f3587h.mo5005J(mo4632j0(view));
        if (c0Var.isTmpDetached()) {
            this.f3593k.mo5214c(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f3593k.mo5213b(view, true);
        } else {
            this.f3593k.mo5221k(view);
        }
    }

    private C3764l getScrollingChildHelper() {
        if (this.f3622y0 == null) {
            this.f3622y0 = new C3764l(this);
        }
        return this.f3622y0;
    }

    /* renamed from: j1 */
    private void m4640j1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3601o.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f3627c) {
                Rect rect = layoutParams2.f3626b;
                Rect rect2 = this.f3601o;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3601o);
            offsetRectIntoDescendantCoords(view, this.f3601o);
        }
        this.f3609s.mo4963t1(this, view, this.f3601o, !this.f3550B, view2 == null);
    }

    /* renamed from: k0 */
    static C0792c0 m4641k0(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f3625a;
    }

    /* renamed from: k1 */
    private void m4642k1() {
        C0826z zVar = this.f3602o0;
        zVar.f3721n = -1;
        zVar.f3720m = -1;
        zVar.f3722o = -1;
    }

    /* renamed from: l1 */
    private void m4643l1() {
        VelocityTracker velocityTracker = this.f3578W;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        mo4535C1(0);
        m4634a1();
    }

    /* renamed from: m0 */
    static void m4644m0(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f3626b;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    /* renamed from: m1 */
    private void m4645m1() {
        int i;
        C0792c0 c0Var = null;
        View focusedChild = (!this.f3594k0 || !hasFocus() || this.f3607r == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            c0Var = mo4566U(focusedChild);
        }
        if (c0Var == null) {
            m4642k1();
            return;
        }
        this.f3602o0.f3721n = this.f3607r.hasStableIds() ? c0Var.getItemId() : -1;
        C0826z zVar = this.f3602o0;
        if (this.f3566K) {
            i = -1;
        } else if (c0Var.isRemoved()) {
            i = c0Var.mOldPosition;
        } else {
            i = c0Var.getAbsoluteAdapterPosition();
        }
        zVar.f3720m = i;
        this.f3602o0.f3722o = m4647n0(c0Var.itemView);
    }

    /* renamed from: n */
    private void m4646n(C0792c0 c0Var, C0792c0 c0Var2, C0803m.C0806c cVar, C0803m.C0806c cVar2, boolean z, boolean z2) {
        c0Var.setIsRecyclable(false);
        if (z) {
            m4639g(c0Var);
        }
        if (c0Var != c0Var2) {
            if (z2) {
                m4639g(c0Var2);
            }
            c0Var.mShadowedHolder = c0Var2;
            m4639g(c0Var);
            this.f3587h.mo5005J(c0Var);
            c0Var2.setIsRecyclable(false);
            c0Var2.mShadowingHolder = c0Var;
        }
        if (this.f3575T.mo4845b(c0Var, c0Var2, cVar, cVar2)) {
            mo4565T0();
        }
    }

    /* renamed from: n0 */
    private int m4647n0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    /* renamed from: o0 */
    private String m4648o0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    /* renamed from: r */
    private void m4649r() {
        m4643l1();
        setScrollState(0);
    }

    /* renamed from: r0 */
    private void m4650r0(long j, C0792c0 c0Var, C0792c0 c0Var2) {
        int g = this.f3593k.mo5218g();
        for (int i = 0; i < g; i++) {
            C0792c0 k0 = m4641k0(this.f3593k.mo5217f(i));
            if (k0 != c0Var && mo4597f0(k0) == j) {
                C0797h hVar = this.f3607r;
                if (hVar == null || !hVar.hasStableIds()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + k0 + " \n View Holder 2:" + c0Var + mo4559Q());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + k0 + " \n View Holder 2:" + c0Var + mo4559Q());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c0Var2 + " cannot be found but it is necessary for " + c0Var + mo4559Q());
    }

    /* renamed from: r1 */
    private void m4651r1(C0797h hVar, boolean z, boolean z2) {
        C0797h hVar2 = this.f3607r;
        if (hVar2 != null) {
            hVar2.unregisterAdapterDataObserver(this.f3585g);
            this.f3607r.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            mo4574b1();
        }
        this.f3591j.mo5161y();
        C0797h hVar3 = this.f3607r;
        this.f3607r = hVar;
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f3585g);
            hVar.onAttachedToRecyclerView(this);
        }
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            pVar.mo4891F0(hVar3, this.f3607r);
        }
        this.f3587h.mo5029x(hVar3, this.f3607r, z);
        this.f3602o0.f3714g = true;
    }

    /* renamed from: s */
    static void m4652s(C0792c0 c0Var) {
        WeakReference<RecyclerView> weakReference = c0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != c0Var.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            c0Var.mNestedRecyclerView = null;
        }
    }

    /* renamed from: t0 */
    private boolean m4653t0() {
        int g = this.f3593k.mo5218g();
        for (int i = 0; i < g; i++) {
            C0792c0 k0 = m4641k0(this.f3593k.mo5217f(i));
            if (k0 != null && !k0.shouldIgnore() && k0.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: v0 */
    private void m4654v0() {
        if (C3774v.m16149A(this) == 0) {
            C3774v.m16239z0(this, 8);
        }
    }

    /* renamed from: w */
    private void m4655w(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String o0 = m4648o0(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(o0, false, classLoader).asSubclass(C0809p.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(f3546P0);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0809p) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + o0, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + o0, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + o0, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + o0, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + o0, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + o0, e7);
                }
            }
        }
    }

    /* renamed from: w0 */
    private void m4656w0() {
        this.f3593k = new C0851f(new C0794e());
    }

    /* renamed from: y */
    private boolean m4657y(int i, int i2) {
        m4629W(this.f3620x0);
        int[] iArr = this.f3620x0;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo4529A(View view) {
        C0792c0 k0 = m4641k0(view);
        mo4552M0(view);
        C0797h hVar = this.f3607r;
        if (!(hVar == null || k0 == null)) {
            hVar.onViewDetachedFromWindow(k0);
        }
        List<C0814q> list = this.f3565J;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3565J.get(size).mo4978a(view);
            }
        }
    }

    /* renamed from: A0 */
    public boolean mo4530A0() {
        return this.f3568M > 0;
    }

    /* renamed from: A1 */
    public boolean mo4531A1(int i, int i2) {
        return getScrollingChildHelper().mo13185p(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B1 */
    public void mo4532B1(boolean z) {
        if (this.f3552C < 1) {
            this.f3552C = 1;
        }
        if (!z && !this.f3556E) {
            this.f3554D = false;
        }
        if (this.f3552C == 1) {
            if (z && this.f3554D && !this.f3556E && this.f3609s != null && this.f3607r != null) {
                mo4533C();
            }
            if (!this.f3556E) {
                this.f3554D = false;
            }
        }
        this.f3552C--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo4533C() {
        if (this.f3607r == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
        } else if (this.f3609s == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
        } else {
            this.f3602o0.f3717j = false;
            boolean z = this.f3557E0 && !(this.f3559F0 == getWidth() && this.f3561G0 == getHeight());
            this.f3559F0 = 0;
            this.f3561G0 = 0;
            this.f3557E0 = false;
            if (this.f3602o0.f3712e == 1) {
                m4619D();
                this.f3609s.mo4881A1(this);
                m4620E();
            } else if (this.f3591j.mo5154q() || z || this.f3609s.mo4955p0() != getWidth() || this.f3609s.mo4919X() != getHeight()) {
                this.f3609s.mo4881A1(this);
                m4620E();
            } else {
                this.f3609s.mo4881A1(this);
            }
            m4622F();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C0 */
    public void mo4534C0(int i) {
        if (this.f3609s != null) {
            setScrollState(2);
            this.f3609s.mo4507y1(i);
            awakenScrollBars();
        }
    }

    /* renamed from: C1 */
    public void mo4535C1(int i) {
        getScrollingChildHelper().mo13187r(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public void mo4536D0() {
        int j = this.f3593k.mo5220j();
        for (int i = 0; i < j; i++) {
            ((LayoutParams) this.f3593k.mo5219i(i).getLayoutParams()).f3627c = true;
        }
        this.f3587h.mo5024s();
    }

    /* renamed from: D1 */
    public void mo4537D1() {
        setScrollState(0);
        m4621E1();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void mo4538E0() {
        int j = this.f3593k.mo5220j();
        for (int i = 0; i < j; i++) {
            C0792c0 k0 = m4641k0(this.f3593k.mo5219i(i));
            if (k0 != null && !k0.shouldIgnore()) {
                k0.addFlags(6);
            }
        }
        mo4536D0();
        this.f3587h.mo5025t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F1 */
    public void mo4539F1(int i, int i2, Object obj) {
        int i3;
        int j = this.f3593k.mo5220j();
        int i4 = i + i2;
        for (int i5 = 0; i5 < j; i5++) {
            View i6 = this.f3593k.mo5219i(i5);
            C0792c0 k0 = m4641k0(i6);
            if (k0 != null && !k0.shouldIgnore() && (i3 = k0.mPosition) >= i && i3 < i4) {
                k0.addFlags(2);
                k0.addChangePayload(obj);
                ((LayoutParams) i6.getLayoutParams()).f3627c = true;
            }
        }
        this.f3587h.mo5008M(i, i2);
    }

    /* renamed from: G */
    public boolean mo4540G(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo13177d(i, i2, iArr, iArr2, i3);
    }

    /* renamed from: G0 */
    public void mo4541G0(int i) {
        int g = this.f3593k.mo5218g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f3593k.mo5217f(i2).offsetLeftAndRight(i);
        }
    }

    /* renamed from: H */
    public final void mo4542H(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo13178e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: H0 */
    public void mo4543H0(int i) {
        int g = this.f3593k.mo5218g();
        for (int i2 = 0; i2 < g; i2++) {
            this.f3593k.mo5217f(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo4544I(int i) {
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            pVar.mo4935f1(i);
        }
        mo4561R0(i);
        C0817t tVar = this.f3604p0;
        if (tVar != null) {
            tVar.mo4984a(this, i);
        }
        List<C0817t> list = this.f3606q0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3606q0.get(size).mo4984a(this, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I0 */
    public void mo4545I0(int i, int i2) {
        int j = this.f3593k.mo5220j();
        for (int i3 = 0; i3 < j; i3++) {
            C0792c0 k0 = m4641k0(this.f3593k.mo5219i(i3));
            if (k0 != null && !k0.shouldIgnore() && k0.mPosition >= i) {
                k0.offsetPosition(i2, false);
                this.f3602o0.f3714g = true;
            }
        }
        this.f3587h.mo5026u(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo4546J(int i, int i2) {
        this.f3569N++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        mo4563S0(i, i2);
        C0817t tVar = this.f3604p0;
        if (tVar != null) {
            tVar.mo4985b(this, i, i2);
        }
        List<C0817t> list = this.f3606q0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3606q0.get(size).mo4985b(this, i, i2);
            }
        }
        this.f3569N--;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J0 */
    public void mo4547J0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int j = this.f3593k.mo5220j();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i7 = 0; i7 < j; i7++) {
            C0792c0 k0 = m4641k0(this.f3593k.mo5219i(i7));
            if (k0 != null && (i6 = k0.mPosition) >= i4 && i6 <= i3) {
                if (i6 == i) {
                    k0.offsetPosition(i2 - i, false);
                } else {
                    k0.offsetPosition(i5, false);
                }
                this.f3602o0.f3714g = true;
            }
        }
        this.f3587h.mo5027v(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public void mo4548K() {
        int i;
        for (int size = this.f3553C0.size() - 1; size >= 0; size--) {
            C0792c0 c0Var = this.f3553C0.get(size);
            if (c0Var.itemView.getParent() == this && !c0Var.shouldIgnore() && (i = c0Var.mPendingAccessibilityState) != -1) {
                C3774v.m16237y0(c0Var.itemView, i);
                c0Var.mPendingAccessibilityState = -1;
            }
        }
        this.f3553C0.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K0 */
    public void mo4549K0(int i, int i2, boolean z) {
        int i3 = i + i2;
        int j = this.f3593k.mo5220j();
        for (int i4 = 0; i4 < j; i4++) {
            C0792c0 k0 = m4641k0(this.f3593k.mo5219i(i4));
            if (k0 != null && !k0.shouldIgnore()) {
                int i5 = k0.mPosition;
                if (i5 >= i3) {
                    k0.offsetPosition(-i2, z);
                    this.f3602o0.f3714g = true;
                } else if (i5 >= i) {
                    k0.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f3602o0.f3714g = true;
                }
            }
        }
        this.f3587h.mo5028w(i, i2, z);
        requestLayout();
    }

    /* renamed from: L0 */
    public void mo4550L0(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo4551M() {
        if (this.f3574S == null) {
            EdgeEffect a = this.f3570O.mo4842a(this, 3);
            this.f3574S = a;
            if (this.f3597m) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: M0 */
    public void mo4552M0(View view) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo4553N() {
        if (this.f3571P == null) {
            EdgeEffect a = this.f3570O.mo4842a(this, 0);
            this.f3571P = a;
            if (this.f3597m) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N0 */
    public void mo4554N0() {
        this.f3568M++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo4555O() {
        if (this.f3573R == null) {
            EdgeEffect a = this.f3570O.mo4842a(this, 2);
            this.f3573R = a;
            if (this.f3597m) {
                a.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo4556O0() {
        mo4558P0(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo4557P() {
        if (this.f3572Q == null) {
            EdgeEffect a = this.f3570O.mo4842a(this, 1);
            this.f3572Q = a;
            if (this.f3597m) {
                a.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo4558P0(boolean z) {
        int i = this.f3568M - 1;
        this.f3568M = i;
        if (i < 1) {
            this.f3568M = 0;
            if (z) {
                m4617B();
                mo4548K();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public String mo4559Q() {
        return " " + super.toString() + ", adapter:" + this.f3607r + ", layout:" + this.f3609s + ", context:" + getContext();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final void mo4560R(C0826z zVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f3596l0.f3634i;
            zVar.f3723p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.f3724q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        zVar.f3723p = 0;
        zVar.f3724q = 0;
    }

    /* renamed from: R0 */
    public void mo4561R0(int i) {
    }

    /* renamed from: S */
    public View mo4562S(float f, float f2) {
        for (int g = this.f3593k.mo5218g() - 1; g >= 0; g--) {
            View f3 = this.f3593k.mo5217f(g);
            float translationX = f3.getTranslationX();
            float translationY = f3.getTranslationY();
            if (f >= ((float) f3.getLeft()) + translationX && f <= ((float) f3.getRight()) + translationX && f2 >= ((float) f3.getTop()) + translationY && f2 <= ((float) f3.getBottom()) + translationY) {
                return f3;
            }
        }
        return null;
    }

    /* renamed from: S0 */
    public void mo4563S0(int i, int i2) {
    }

    /* renamed from: T */
    public View mo4564T(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public void mo4565T0() {
        if (!this.f3614u0 && this.f3621y) {
            C3774v.m16201g0(this, this.f3555D0);
            this.f3614u0 = true;
        }
    }

    /* renamed from: U */
    public C0792c0 mo4566U(View view) {
        View T = mo4564T(view);
        if (T == null) {
            return null;
        }
        return mo4632j0(T);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W0 */
    public void mo4567W0(boolean z) {
        this.f3567L = z | this.f3567L;
        this.f3566K = true;
        mo4538E0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y0 */
    public void mo4568Y0(C0792c0 c0Var, C0803m.C0806c cVar) {
        c0Var.setFlags(0, 8192);
        if (this.f3602o0.f3716i && c0Var.isUpdated() && !c0Var.isRemoved() && !c0Var.shouldIgnore()) {
            this.f3595l.mo5179c(mo4597f0(c0Var), c0Var);
        }
        this.f3595l.mo5181e(c0Var, cVar);
    }

    /* renamed from: Z */
    public C0792c0 mo4569Z(int i) {
        C0792c0 c0Var = null;
        if (this.f3566K) {
            return null;
        }
        int j = this.f3593k.mo5220j();
        for (int i2 = 0; i2 < j; i2++) {
            C0792c0 k0 = m4641k0(this.f3593k.mo5219i(i2));
            if (k0 != null && !k0.isRemoved() && mo4595e0(k0) == i) {
                if (!this.f3593k.mo5223n(k0.itemView)) {
                    return k0;
                }
                c0Var = k0;
            }
        }
        return c0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4570a(int i, int i2) {
        if (i < 0) {
            mo4553N();
            if (this.f3571P.isFinished()) {
                this.f3571P.onAbsorb(-i);
            }
        } else if (i > 0) {
            mo4555O();
            if (this.f3573R.isFinished()) {
                this.f3573R.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            mo4557P();
            if (this.f3572Q.isFinished()) {
                this.f3572Q.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            mo4551M();
            if (this.f3574S.isFinished()) {
                this.f3574S.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C3774v.m16197e0(this);
        }
    }

    /* renamed from: a0 */
    public C0792c0 mo4571a0(long j) {
        C0797h hVar = this.f3607r;
        C0792c0 c0Var = null;
        if (hVar != null && hVar.hasStableIds()) {
            int j2 = this.f3593k.mo5220j();
            for (int i = 0; i < j2; i++) {
                C0792c0 k0 = m4641k0(this.f3593k.mo5219i(i));
                if (k0 != null && !k0.isRemoved() && k0.getItemId() == j) {
                    if (!this.f3593k.mo5223n(k0.itemView)) {
                        return k0;
                    }
                    c0Var = k0;
                }
            }
        }
        return c0Var;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0809p pVar = this.f3609s;
        if (pVar == null || !pVar.mo4893G0(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* renamed from: b0 */
    public C0792c0 mo4573b0(int i) {
        return mo4575c0(i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b1 */
    public void mo4574b1() {
        C0803m mVar = this.f3575T;
        if (mVar != null) {
            mVar.mo4853k();
        }
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            pVar.mo4948l1(this.f3587h);
            this.f3609s.mo4950m1(this.f3587h);
        }
        this.f3587h.mo5010c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public C0792c0 mo4575c0(int i, boolean z) {
        int j = this.f3593k.mo5220j();
        C0792c0 c0Var = null;
        for (int i2 = 0; i2 < j; i2++) {
            C0792c0 k0 = m4641k0(this.f3593k.mo5219i(i2));
            if (k0 != null && !k0.isRemoved()) {
                if (z) {
                    if (k0.mPosition != i) {
                        continue;
                    }
                } else if (k0.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.f3593k.mo5223n(k0.itemView)) {
                    return k0;
                }
                c0Var = k0;
            }
        }
        return c0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c1 */
    public boolean mo4576c1(View view) {
        mo4705z1();
        boolean r = this.f3593k.mo5227r(view);
        if (r) {
            C0792c0 k0 = m4641k0(view);
            this.f3587h.mo5005J(k0);
            this.f3587h.mo4999C(k0);
        }
        mo4532B1(!r);
        return r;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.f3609s.mo4448n((LayoutParams) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        C0809p pVar = this.f3609s;
        if (pVar != null && pVar.mo4495l()) {
            return this.f3609s.mo4503r(this.f3602o0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C0809p pVar = this.f3609s;
        if (pVar != null && pVar.mo4495l()) {
            return this.f3609s.mo4450s(this.f3602o0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C0809p pVar = this.f3609s;
        if (pVar != null && pVar.mo4495l()) {
            return this.f3609s.mo4452t(this.f3602o0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C0809p pVar = this.f3609s;
        if (pVar != null && pVar.mo4496m()) {
            return this.f3609s.mo4505u(this.f3602o0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C0809p pVar = this.f3609s;
        if (pVar != null && pVar.mo4496m()) {
            return this.f3609s.mo4453v(this.f3602o0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C0809p pVar = this.f3609s;
        if (pVar != null && pVar.mo4496m()) {
            return this.f3609s.mo4454w(this.f3602o0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public boolean mo4584d0(int i, int i2) {
        C0809p pVar = this.f3609s;
        int i3 = 0;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.f3556E) {
            return false;
        } else {
            boolean l = pVar.mo4495l();
            boolean m = this.f3609s.mo4496m();
            if (!l || Math.abs(i) < this.f3586g0) {
                i = 0;
            }
            if (!m || Math.abs(i2) < this.f3586g0) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = l || m;
                dispatchNestedFling(f, f2, z);
                C0815r rVar = this.f3584f0;
                if (rVar != null && rVar.mo4980a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (l) {
                        i3 = 1;
                    }
                    if (m) {
                        i3 |= 2;
                    }
                    mo4531A1(i3, 1);
                    int i4 = this.f3588h0;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.f3588h0;
                    this.f3596l0.mo4720b(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: d1 */
    public void mo4585d1(C0808o oVar) {
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            pVar.mo4494h("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3615v.remove(oVar);
        if (this.f3615v.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        mo4536D0();
        requestLayout();
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo13174a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo13175b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo13176c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo13179f(i, i2, i3, i4, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.f3615v.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.f3615v.get(i).mo4878h(canvas, this, this.f3602o0);
        }
        EdgeEffect edgeEffect = this.f3571P;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3597m ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.f3571P;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f3572Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3597m) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f3572Q;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f3573R;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3597m ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.f3573R;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f3574S;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3597m) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f3574S;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.f3575T == null || this.f3615v.size() <= 0 || !this.f3575T.mo4858p()) {
            z3 = z;
        }
        if (z3) {
            C3774v.m16197e0(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public int mo4595e0(C0792c0 c0Var) {
        if (c0Var.hasAnyOfTheFlags(524) || !c0Var.isBound()) {
            return -1;
        }
        return this.f3591j.mo5146e(c0Var.mPosition);
    }

    /* renamed from: e1 */
    public void mo4596e1(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        mo4585d1(mo4656q0(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public long mo4597f0(C0792c0 c0Var) {
        return this.f3607r.hasStableIds() ? c0Var.getItemId() : (long) c0Var.mPosition;
    }

    /* renamed from: f1 */
    public void mo4598f1(C0814q qVar) {
        List<C0814q> list = this.f3565J;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View R0 = this.f3609s.mo4912R0(view, i);
        if (R0 != null) {
            return R0;
        }
        boolean z2 = true;
        boolean z3 = this.f3607r != null && this.f3609s != null && !mo4530A0() && !this.f3556E;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                mo4695v();
                if (mo4564T(view) == null) {
                    return null;
                }
                mo4705z1();
                view2 = this.f3609s.mo4430K0(view, i, this.f3587h, this.f3602o0);
                mo4532B1(false);
            }
        } else {
            if (this.f3609s.mo4496m()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (f3544N0) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.f3609s.mo4495l()) {
                int i3 = (this.f3609s.mo4922a0() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (f3544N0) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                mo4695v();
                if (mo4564T(view) == null) {
                    return null;
                }
                mo4705z1();
                this.f3609s.mo4430K0(view, i, this.f3587h, this.f3602o0);
                mo4532B1(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return m4618B0(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        m4640j1(view2, (View) null);
        return view;
    }

    /* renamed from: g0 */
    public int mo4600g0(View view) {
        C0792c0 k0 = m4641k0(view);
        if (k0 != null) {
            return k0.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    /* renamed from: g1 */
    public void mo4601g1(C0816s sVar) {
        this.f3617w.remove(sVar);
        if (this.f3619x == sVar) {
            this.f3619x = null;
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            return pVar.mo4427E();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4559Q());
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            return pVar.mo4428F(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4559Q());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C0797h getAdapter() {
        return this.f3607r;
    }

    public int getBaseline() {
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            return pVar.mo4895H();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C0801k kVar = this.f3618w0;
        if (kVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return kVar.mo4841a(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f3597m;
    }

    public C0913w getCompatAccessibilityDelegate() {
        return this.f3616v0;
    }

    public C0802l getEdgeEffectFactory() {
        return this.f3570O;
    }

    public C0803m getItemAnimator() {
        return this.f3575T;
    }

    public int getItemDecorationCount() {
        return this.f3615v.size();
    }

    public C0809p getLayoutManager() {
        return this.f3609s;
    }

    public int getMaxFlingVelocity() {
        return this.f3588h0;
    }

    public int getMinFlingVelocity() {
        return this.f3586g0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f3543M0) {
            return System.nanoTime();
        }
        return 0;
    }

    public C0815r getOnFlingListener() {
        return this.f3584f0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3594k0;
    }

    public C0818u getRecycledViewPool() {
        return this.f3587h.mo5016i();
    }

    public int getScrollState() {
        return this.f3576U;
    }

    /* renamed from: h */
    public void mo4622h(C0808o oVar) {
        mo4626i(oVar, -1);
    }

    /* renamed from: h0 */
    public int mo4623h0(View view) {
        C0792c0 k0 = m4641k0(view);
        if (k0 != null) {
            return k0.getLayoutPosition();
        }
        return -1;
    }

    /* renamed from: h1 */
    public void mo4624h1(C0817t tVar) {
        List<C0817t> list = this.f3606q0;
        if (list != null) {
            list.remove(tVar);
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo13180j();
    }

    /* renamed from: i */
    public void mo4626i(C0808o oVar, int i) {
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            pVar.mo4494h("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3615v.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f3615v.add(oVar);
        } else {
            this.f3615v.add(i, oVar);
        }
        mo4536D0();
        requestLayout();
    }

    @Deprecated
    /* renamed from: i0 */
    public int mo4627i0(View view) {
        return mo4600g0(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i1 */
    public void mo4628i1() {
        C0792c0 c0Var;
        int g = this.f3593k.mo5218g();
        for (int i = 0; i < g; i++) {
            View f = this.f3593k.mo5217f(i);
            C0792c0 j0 = mo4632j0(f);
            if (!(j0 == null || (c0Var = j0.mShadowingHolder) == null)) {
                View view = c0Var.itemView;
                int left = f.getLeft();
                int top = f.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public boolean isAttachedToWindow() {
        return this.f3621y;
    }

    public final boolean isLayoutSuppressed() {
        return this.f3556E;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo13182l();
    }

    /* renamed from: j */
    public void mo4631j(C0814q qVar) {
        if (this.f3565J == null) {
            this.f3565J = new ArrayList();
        }
        this.f3565J.add(qVar);
    }

    /* renamed from: j0 */
    public C0792c0 mo4632j0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m4641k0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: k */
    public void mo4633k(C0816s sVar) {
        this.f3617w.add(sVar);
    }

    /* renamed from: l */
    public void mo4634l(C0817t tVar) {
        if (this.f3606q0 == null) {
            this.f3606q0 = new ArrayList();
        }
        this.f3606q0.add(tVar);
    }

    /* renamed from: l0 */
    public void mo4635l0(View view, Rect rect) {
        m4644m0(view, rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo4636m(C0792c0 c0Var, C0803m.C0806c cVar, C0803m.C0806c cVar2) {
        c0Var.setIsRecyclable(false);
        if (this.f3575T.mo4844a(c0Var, cVar, cVar2)) {
            mo4565T0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n1 */
    public void mo4637n1() {
        int j = this.f3593k.mo5220j();
        for (int i = 0; i < j; i++) {
            C0792c0 k0 = m4641k0(this.f3593k.mo5219i(i));
            if (!k0.shouldIgnore()) {
                k0.saveOldPosition();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4638o(C0792c0 c0Var, C0803m.C0806c cVar, C0803m.C0806c cVar2) {
        m4639g(c0Var);
        c0Var.setIsRecyclable(false);
        if (this.f3575T.mo4846c(c0Var, cVar, cVar2)) {
            mo4565T0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o1 */
    public boolean mo4639o1(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i2;
        MotionEvent motionEvent2 = motionEvent;
        mo4695v();
        if (this.f3607r != null) {
            int[] iArr = this.f3551B0;
            iArr[0] = 0;
            iArr[1] = 0;
            mo4654p1(i8, i9, iArr);
            int[] iArr2 = this.f3551B0;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i7 = i11;
            i6 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.f3615v.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f3551B0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        mo4542H(i6, i7, i5, i4, this.f3624z0, i3, iArr3);
        int[] iArr4 = this.f3551B0;
        int i12 = i5 - iArr4[0];
        int i13 = i4 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i14 = this.f3581c0;
        int[] iArr5 = this.f3624z0;
        this.f3581c0 = i14 - iArr5[0];
        this.f3582d0 -= iArr5[1];
        int[] iArr6 = this.f3549A0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C3762j.m16112h(motionEvent2, 8194)) {
                m4631X0(motionEvent.getX(), (float) i12, motionEvent.getY(), (float) i13);
            }
            mo4692u(i, i2);
        }
        if (!(i6 == 0 && i7 == 0)) {
            mo4546J(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z && i6 == 0 && i7 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3568M = 0;
        boolean z = true;
        this.f3621y = true;
        if (!this.f3550B || isLayoutRequested()) {
            z = false;
        }
        this.f3550B = z;
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            pVar.mo4879A(this);
        }
        this.f3614u0 = false;
        if (f3543M0) {
            ThreadLocal<C0881k> threadLocal = C0881k.f3958k;
            C0881k kVar = threadLocal.get();
            this.f3598m0 = kVar;
            if (kVar == null) {
                this.f3598m0 = new C0881k();
                Display v = C3774v.m16230v(this);
                float f = 60.0f;
                if (!isInEditMode() && v != null) {
                    float refreshRate = v.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C0881k kVar2 = this.f3598m0;
                kVar2.f3962i = (long) (1.0E9f / f);
                threadLocal.set(kVar2);
            }
            this.f3598m0.mo5293a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C0881k kVar;
        super.onDetachedFromWindow();
        C0803m mVar = this.f3575T;
        if (mVar != null) {
            mVar.mo4853k();
        }
        mo4537D1();
        this.f3621y = false;
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            pVar.mo4882B(this, this.f3587h);
        }
        this.f3553C0.clear();
        removeCallbacks(this.f3555D0);
        this.f3595l.mo5186j();
        if (f3543M0 && (kVar = this.f3598m0) != null) {
            kVar.mo5296j(this);
            this.f3598m0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3615v.size();
        for (int i = 0; i < size; i++) {
            this.f3615v.get(i).mo4876f(canvas, this, this.f3602o0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.f3609s != null && !this.f3556E && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.f3609s.mo4496m() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f3609s.mo4495l()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        m4623F0((int) (f * this.f3590i0), (int) (f2 * this.f3592j0), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f3609s.mo4496m()) {
                        f2 = -axisValue;
                    } else if (this.f3609s.mo4495l()) {
                        f = axisValue;
                        f2 = 0.0f;
                        m4623F0((int) (f * this.f3590i0), (int) (f2 * this.f3592j0), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            m4623F0((int) (f * this.f3590i0), (int) (f2 * this.f3592j0), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f3556E) {
            return false;
        }
        this.f3619x = null;
        if (m4627V(motionEvent)) {
            m4649r();
            return true;
        }
        C0809p pVar = this.f3609s;
        if (pVar == null) {
            return false;
        }
        boolean l = pVar.mo4495l();
        boolean m = this.f3609s.mo4496m();
        if (this.f3578W == null) {
            this.f3578W = VelocityTracker.obtain();
        }
        this.f3578W.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3558F) {
                this.f3558F = false;
            }
            this.f3577V = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f3581c0 = x;
            this.f3579a0 = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f3582d0 = y;
            this.f3580b0 = y;
            if (this.f3576U == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo4535C1(1);
            }
            int[] iArr = this.f3549A0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (m) {
                l |= true;
            }
            mo4531A1(l ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f3578W.clear();
            mo4535C1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3577V);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f3577V + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f3576U != 1) {
                int i = x2 - this.f3579a0;
                int i2 = y2 - this.f3580b0;
                if (!l || Math.abs(i) <= this.f3583e0) {
                    z = false;
                } else {
                    this.f3581c0 = x2;
                    z = true;
                }
                if (m && Math.abs(i2) > this.f3583e0) {
                    this.f3582d0 = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m4649r();
        } else if (actionMasked == 5) {
            this.f3577V = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f3581c0 = x3;
            this.f3579a0 = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f3582d0 = y3;
            this.f3580b0 = y3;
        } else if (actionMasked == 6) {
            m4625Q0(motionEvent);
        }
        if (this.f3576U == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C3656k.m15717a("RV OnLayout");
        mo4533C();
        C3656k.m15718b();
        this.f3550B = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0809p pVar = this.f3609s;
        if (pVar == null) {
            mo4698x(i, i2);
            return;
        }
        boolean z = false;
        if (pVar.mo4504t0()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f3609s.mo4923a1(this.f3587h, this.f3602o0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f3557E0 = z;
            if (!z && this.f3607r != null) {
                if (this.f3602o0.f3712e == 1) {
                    m4619D();
                }
                this.f3609s.mo4884B1(i, i2);
                this.f3602o0.f3717j = true;
                m4620E();
                this.f3609s.mo4890E1(i, i2);
                if (this.f3609s.mo4474H1()) {
                    this.f3609s.mo4884B1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f3602o0.f3717j = true;
                    m4620E();
                    this.f3609s.mo4890E1(i, i2);
                }
                this.f3559F0 = getMeasuredWidth();
                this.f3561G0 = getMeasuredHeight();
            }
        } else if (this.f3623z) {
            this.f3609s.mo4923a1(this.f3587h, this.f3602o0, i, i2);
        } else {
            if (this.f3562H) {
                mo4705z1();
                mo4554N0();
                m4628V0();
                mo4556O0();
                C0826z zVar = this.f3602o0;
                if (zVar.f3719l) {
                    zVar.f3715h = true;
                } else {
                    this.f3591j.mo5148j();
                    this.f3602o0.f3715h = false;
                }
                this.f3562H = false;
                mo4532B1(false);
            } else if (this.f3602o0.f3719l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0797h hVar = this.f3607r;
            if (hVar != null) {
                this.f3602o0.f3713f = hVar.getItemCount();
            } else {
                this.f3602o0.f3713f = 0;
            }
            mo4705z1();
            this.f3609s.mo4923a1(this.f3587h, this.f3602o0, i, i2);
            mo4532B1(false);
            this.f3602o0.f3715h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo4530A0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f3589i = savedState;
        super.onRestoreInstanceState(savedState.mo3471a());
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f3589i;
        if (savedState2 != null) {
            savedState.mo4710b(savedState2);
        } else {
            C0809p pVar = this.f3609s;
            if (pVar != null) {
                savedState.f3629i = pVar.mo4492e1();
            } else {
                savedState.f3629i = null;
            }
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            mo4701y0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.f3556E
            r8 = 0
            if (r0 != 0) goto L_0x01df
            boolean r0 = r6.f3558F
            if (r0 == 0) goto L_0x000f
            goto L_0x01df
        L_0x000f:
            boolean r0 = r17.m4624L(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.m4649r()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f3609s
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo4495l()
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f3609s
            boolean r11 = r0.mo4496m()
            android.view.VelocityTracker r0 = r6.f3578W
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f3578W = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.f3549A0
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.f3549A0
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b3
            if (r0 == r9) goto L_0x0171
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d4
        L_0x0066:
            r17.m4625Q0(r18)
            goto L_0x01d4
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.f3577V = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3581c0 = r0
            r6.f3579a0 = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3582d0 = r0
            r6.f3580b0 = r0
            goto L_0x01d4
        L_0x0087:
            r17.m4649r()
            goto L_0x01d4
        L_0x008c:
            int r0 = r6.f3577V
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.f3577V
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.f3581c0
            int r0 = r0 - r13
            int r1 = r6.f3582d0
            int r1 = r1 - r14
            int r2 = r6.f3576U
            if (r2 == r9) goto L_0x00fb
            if (r10 == 0) goto L_0x00df
            if (r0 <= 0) goto L_0x00d4
            int r2 = r6.f3583e0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00db
        L_0x00d4:
            int r2 = r6.f3583e0
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00db:
            if (r0 == 0) goto L_0x00df
            r2 = 1
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            if (r11 == 0) goto L_0x00f6
            if (r1 <= 0) goto L_0x00ec
            int r3 = r6.f3583e0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f3
        L_0x00ec:
            int r3 = r6.f3583e0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f3:
            if (r1 == 0) goto L_0x00f6
            r2 = 1
        L_0x00f6:
            if (r2 == 0) goto L_0x00fb
            r6.setScrollState(r9)
        L_0x00fb:
            r15 = r0
            r16 = r1
            int r0 = r6.f3576U
            if (r0 != r9) goto L_0x01d4
            int[] r3 = r6.f3551B0
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x010c
            r1 = r15
            goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            if (r11 == 0) goto L_0x0112
            r2 = r16
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            int[] r4 = r6.f3624z0
            r5 = 0
            r0 = r17
            boolean r0 = r0.mo4540G(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0140
            int[] r0 = r6.f3551B0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f3549A0
            r1 = r0[r8]
            int[] r2 = r6.f3624z0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0140:
            r0 = r16
            int[] r1 = r6.f3624z0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f3581c0 = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f3582d0 = r14
            if (r10 == 0) goto L_0x0152
            r1 = r15
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            if (r11 == 0) goto L_0x0157
            r2 = r0
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            boolean r1 = r6.mo4639o1(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0165
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0165:
            androidx.recyclerview.widget.k r1 = r6.f3598m0
            if (r1 == 0) goto L_0x01d4
            if (r15 != 0) goto L_0x016d
            if (r0 == 0) goto L_0x01d4
        L_0x016d:
            r1.mo5294f(r6, r15, r0)
            goto L_0x01d4
        L_0x0171:
            android.view.VelocityTracker r0 = r6.f3578W
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f3578W
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.f3588h0
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x018d
            android.view.VelocityTracker r1 = r6.f3578W
            int r2 = r6.f3577V
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018e
        L_0x018d:
            r1 = 0
        L_0x018e:
            if (r11 == 0) goto L_0x019a
            android.view.VelocityTracker r2 = r6.f3578W
            int r3 = r6.f3577V
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
        L_0x01a3:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.mo4584d0(r0, r1)
            if (r0 != 0) goto L_0x01ae
        L_0x01ab:
            r6.setScrollState(r8)
        L_0x01ae:
            r17.m4643l1()
            r8 = 1
            goto L_0x01d4
        L_0x01b3:
            int r0 = r7.getPointerId(r8)
            r6.f3577V = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3581c0 = r0
            r6.f3579a0 = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.f3582d0 = r0
            r6.f3580b0 = r0
            if (r11 == 0) goto L_0x01d1
            r10 = r10 | 2
        L_0x01d1:
            r6.mo4531A1(r10, r8)
        L_0x01d4:
            if (r8 != 0) goto L_0x01db
            android.view.VelocityTracker r0 = r6.f3578W
            r0.addMovement(r12)
        L_0x01db:
            r12.recycle()
            return r9
        L_0x01df:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo4652p(String str) {
        if (mo4530A0()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + mo4559Q());
            }
            throw new IllegalStateException(str);
        } else if (this.f3569N > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(BuildConfig.FLAVOR + mo4559Q()));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p0 */
    public Rect mo4653p0(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f3627c) {
            return layoutParams.f3626b;
        }
        if (this.f3602o0.mo5060e() && (layoutParams.mo4707b() || layoutParams.mo4709d())) {
            return layoutParams.f3626b;
        }
        Rect rect = layoutParams.f3626b;
        rect.set(0, 0, 0, 0);
        int size = this.f3615v.size();
        for (int i = 0; i < size; i++) {
            this.f3601o.set(0, 0, 0, 0);
            this.f3615v.get(i).mo4874d(this.f3601o, view, this, this.f3602o0);
            int i2 = rect.left;
            Rect rect2 = this.f3601o;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f3627c = false;
        return rect;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p1 */
    public void mo4654p1(int i, int i2, int[] iArr) {
        mo4705z1();
        mo4554N0();
        C3656k.m15717a("RV Scroll");
        mo4560R(this.f3602o0);
        int x1 = i != 0 ? this.f3609s.mo4455x1(i, this.f3587h, this.f3602o0) : 0;
        int z1 = i2 != 0 ? this.f3609s.mo4456z1(i2, this.f3587h, this.f3602o0) : 0;
        C3656k.m15718b();
        mo4628i1();
        mo4556O0();
        mo4532B1(false);
        if (iArr != null) {
            iArr[0] = x1;
            iArr[1] = z1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo4655q(C0792c0 c0Var) {
        C0803m mVar = this.f3575T;
        return mVar == null || mVar.mo4849g(c0Var, c0Var.getUnmodifiedPayloads());
    }

    /* renamed from: q0 */
    public C0808o mo4656q0(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.f3615v.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    /* renamed from: q1 */
    public void mo4657q1(int i) {
        if (!this.f3556E) {
            mo4537D1();
            C0809p pVar = this.f3609s;
            if (pVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            pVar.mo4507y1(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C0792c0 k0 = m4641k0(view);
        if (k0 != null) {
            if (k0.isTmpDetached()) {
                k0.clearTmpDetachFlag();
            } else if (!k0.shouldIgnore()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + k0 + mo4559Q());
            }
        }
        view.clearAnimation();
        mo4529A(view);
        super.removeDetachedView(view, z);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f3609s.mo4928c1(this, this.f3602o0, view, view2) && view2 != null) {
            m4640j1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f3609s.mo4962s1(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f3617w.size();
        for (int i = 0; i < size; i++) {
            this.f3617w.get(i).onRequestDisallowInterceptTouchEvent(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.f3552C != 0 || this.f3556E) {
            this.f3554D = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s0 */
    public boolean mo4663s0() {
        return !this.f3550B || this.f3566K || this.f3591j.mo5153p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s1 */
    public boolean mo4664s1(C0792c0 c0Var, int i) {
        if (mo4530A0()) {
            c0Var.mPendingAccessibilityState = i;
            this.f3553C0.add(c0Var);
            return false;
        }
        C3774v.m16237y0(c0Var.itemView, i);
        return true;
    }

    public void scrollBy(int i, int i2) {
        C0809p pVar = this.f3609s;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3556E) {
            boolean l = pVar.mo4495l();
            boolean m = this.f3609s.mo4496m();
            if (l || m) {
                if (!l) {
                    i = 0;
                }
                if (!m) {
                    i2 = 0;
                }
                mo4639o1(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!mo4691t1(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C0913w wVar) {
        this.f3616v0 = wVar;
        C3774v.m16217o0(this, wVar);
    }

    public void setAdapter(C0797h hVar) {
        setLayoutFrozen(false);
        m4651r1(hVar, false, true);
        mo4567W0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0801k kVar) {
        if (kVar != this.f3618w0) {
            this.f3618w0 = kVar;
            setChildrenDrawingOrderEnabled(kVar != null);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f3597m) {
            mo4701y0();
        }
        this.f3597m = z;
        super.setClipToPadding(z);
        if (this.f3550B) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0802l lVar) {
        C3703i.m15827d(lVar);
        this.f3570O = lVar;
        mo4701y0();
    }

    public void setHasFixedSize(boolean z) {
        this.f3623z = z;
    }

    public void setItemAnimator(C0803m mVar) {
        C0803m mVar2 = this.f3575T;
        if (mVar2 != null) {
            mVar2.mo4853k();
            this.f3575T.mo4867y((C0803m.C0805b) null);
        }
        this.f3575T = mVar;
        if (mVar != null) {
            mVar.mo4867y(this.f3612t0);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.f3587h.mo5003G(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C0809p pVar) {
        if (pVar != this.f3609s) {
            mo4537D1();
            if (this.f3609s != null) {
                C0803m mVar = this.f3575T;
                if (mVar != null) {
                    mVar.mo4853k();
                }
                this.f3609s.mo4948l1(this.f3587h);
                this.f3609s.mo4950m1(this.f3587h);
                this.f3587h.mo5010c();
                if (this.f3621y) {
                    this.f3609s.mo4882B(this, this.f3587h);
                }
                this.f3609s.mo4892F1((RecyclerView) null);
                this.f3609s = null;
            } else {
                this.f3587h.mo5010c();
            }
            this.f3593k.mo5224o();
            this.f3609s = pVar;
            if (pVar != null) {
                if (pVar.f3654b == null) {
                    pVar.mo4892F1(this);
                    if (this.f3621y) {
                        this.f3609s.mo4879A(this);
                    }
                } else {
                    throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f3654b.mo4559Q());
                }
            }
            this.f3587h.mo5006K();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo13183m(z);
    }

    public void setOnFlingListener(C0815r rVar) {
        this.f3584f0 = rVar;
    }

    @Deprecated
    public void setOnScrollListener(C0817t tVar) {
        this.f3604p0 = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f3594k0 = z;
    }

    public void setRecycledViewPool(C0818u uVar) {
        this.f3587h.mo5001E(uVar);
    }

    @Deprecated
    public void setRecyclerListener(C0821w wVar) {
        this.f3611t = wVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f3576U) {
            this.f3576U = i;
            if (i != 2) {
                m4621E1();
            }
            mo4544I(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.f3583e0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f3583e0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C0788a0 a0Var) {
        this.f3587h.mo5002F(a0Var);
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo13184o(i);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo13186q();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f3556E) {
            mo4652p("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f3556E = false;
                if (!(!this.f3554D || this.f3609s == null || this.f3607r == null)) {
                    requestLayout();
                }
                this.f3554D = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f3556E = true;
            this.f3558F = true;
            mo4537D1();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo4690t() {
        int j = this.f3593k.mo5220j();
        for (int i = 0; i < j; i++) {
            C0792c0 k0 = m4641k0(this.f3593k.mo5219i(i));
            if (!k0.shouldIgnore()) {
                k0.clearOldPosition();
            }
        }
        this.f3587h.mo5011d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public boolean mo4691t1(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!mo4530A0()) {
            return false;
        }
        int a = accessibilityEvent != null ? C3735b.m15973a(accessibilityEvent) : 0;
        if (a != 0) {
            i = a;
        }
        this.f3560G |= i;
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo4692u(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f3571P;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f3571P.onRelease();
            z = this.f3571P.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f3573R;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f3573R.onRelease();
            z |= this.f3573R.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f3572Q;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f3572Q.onRelease();
            z |= this.f3572Q.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f3574S;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f3574S.onRelease();
            z |= this.f3574S.isFinished();
        }
        if (z) {
            C3774v.m16197e0(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public void mo4693u0() {
        this.f3591j = new C0832a(new C0795f());
    }

    /* renamed from: u1 */
    public void mo4694u1(int i, int i2) {
        mo4696v1(i, i2, (Interpolator) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo4695v() {
        if (!this.f3550B || this.f3566K) {
            C3656k.m15717a("RV FullInvalidate");
            mo4533C();
            C3656k.m15718b();
        } else if (this.f3591j.mo5153p()) {
            if (this.f3591j.mo5152o(4) && !this.f3591j.mo5152o(11)) {
                C3656k.m15717a("RV PartialInvalidate");
                mo4705z1();
                mo4554N0();
                this.f3591j.mo5159w();
                if (!this.f3554D) {
                    if (m4653t0()) {
                        mo4533C();
                    } else {
                        this.f3591j.mo5147i();
                    }
                }
                mo4532B1(true);
                mo4556O0();
                C3656k.m15718b();
            } else if (this.f3591j.mo5153p()) {
                C3656k.m15717a("RV FullInvalidate");
                mo4533C();
                C3656k.m15718b();
            }
        }
    }

    /* renamed from: v1 */
    public void mo4696v1(int i, int i2, Interpolator interpolator) {
        mo4697w1(i, i2, interpolator, Integer.MIN_VALUE);
    }

    /* renamed from: w1 */
    public void mo4697w1(int i, int i2, Interpolator interpolator, int i3) {
        mo4700x1(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo4698x(int i, int i2) {
        setMeasuredDimension(C0809p.m4848o(i, getPaddingLeft() + getPaddingRight(), C3774v.m16155D(this)), C0809p.m4848o(i2, getPaddingTop() + getPaddingBottom(), C3774v.m16153C(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public void mo4699x0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + mo4559Q());
        }
        Resources resources = getContext().getResources();
        new C0876j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C4133b.fastscroll_default_thickness), resources.getDimensionPixelSize(C4133b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C4133b.fastscroll_margin));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x1 */
    public void mo4700x1(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C0809p pVar = this.f3609s;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f3556E) {
            int i4 = 0;
            if (!pVar.mo4495l()) {
                i = 0;
            }
            if (!this.f3609s.mo4496m()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        mo4531A1(i4, 1);
                    }
                    this.f3596l0.mo4722e(i, i2, i3, interpolator);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y0 */
    public void mo4701y0() {
        this.f3574S = null;
        this.f3572Q = null;
        this.f3573R = null;
        this.f3571P = null;
    }

    /* renamed from: y1 */
    public void mo4702y1(int i) {
        if (!this.f3556E) {
            C0809p pVar = this.f3609s;
            if (pVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                pVar.mo4476J1(this, this.f3602o0, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public void mo4703z(View view) {
        C0792c0 k0 = m4641k0(view);
        mo4550L0(view);
        C0797h hVar = this.f3607r;
        if (!(hVar == null || k0 == null)) {
            hVar.onViewAttachedToWindow(k0);
        }
        List<C0814q> list = this.f3565J;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f3565J.get(size).mo4979b(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public boolean mo4704z0() {
        AccessibilityManager accessibilityManager = this.f3564I;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z1 */
    public void mo4705z1() {
        int i = this.f3552C + 1;
        this.f3552C = i;
        if (i == 1 && !this.f3556E) {
            this.f3554D = false;
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4132a.recyclerViewStyle);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0786a();

        /* renamed from: i */
        Parcelable f3629i;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        class C0786a implements Parcelable.ClassLoaderCreator<SavedState> {
            C0786a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3629i = parcel.readParcelable(classLoader == null ? C0809p.class.getClassLoader() : classLoader);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4710b(SavedState savedState) {
            this.f3629i = savedState.f3629i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f3629i, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3585g = new C0822x();
        this.f3587h = new C0820v();
        this.f3595l = new C0839b0();
        this.f3599n = new C0787a();
        this.f3601o = new Rect();
        this.f3603p = new Rect();
        this.f3605q = new RectF();
        this.f3613u = new ArrayList();
        this.f3615v = new ArrayList<>();
        this.f3617w = new ArrayList<>();
        this.f3552C = 0;
        this.f3566K = false;
        this.f3567L = false;
        this.f3568M = 0;
        this.f3569N = 0;
        this.f3570O = new C0802l();
        this.f3575T = new C0854g();
        this.f3576U = 0;
        this.f3577V = -1;
        this.f3590i0 = Float.MIN_VALUE;
        this.f3592j0 = Float.MIN_VALUE;
        boolean z = true;
        this.f3594k0 = true;
        this.f3596l0 = new C0790b0();
        this.f3600n0 = f3543M0 ? new C0881k.C0883b() : null;
        this.f3602o0 = new C0826z();
        this.f3608r0 = false;
        this.f3610s0 = false;
        this.f3612t0 = new C0807n();
        this.f3614u0 = false;
        this.f3620x0 = new int[2];
        this.f3624z0 = new int[2];
        this.f3549A0 = new int[2];
        this.f3551B0 = new int[2];
        this.f3553C0 = new ArrayList();
        this.f3555D0 = new C0789b();
        this.f3559F0 = 0;
        this.f3561G0 = 0;
        this.f3563H0 = new C0793d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3583e0 = viewConfiguration.getScaledTouchSlop();
        this.f3590i0 = C3787w.m16289b(viewConfiguration, context);
        this.f3592j0 = C3787w.m16291d(viewConfiguration, context);
        this.f3586g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3588h0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f3575T.mo4867y(this.f3612t0);
        mo4693u0();
        m4656w0();
        m4654v0();
        if (C3774v.m16238z(this) == 0) {
            C3774v.m16237y0(this, 1);
        }
        this.f3564I = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0913w(this));
        int[] iArr = C4135d.RecyclerView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C3774v.m16213m0(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(C4135d.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(C4135d.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3597m = obtainStyledAttributes.getBoolean(C4135d.RecyclerView_android_clipToPadding, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C4135d.RecyclerView_fastScrollEnabled, false);
        this.f3548A = z2;
        if (z2) {
            mo4699x0((StateListDrawable) obtainStyledAttributes.getDrawable(C4135d.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(C4135d.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(C4135d.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(C4135d.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        m4655w(context, string, attributeSet, i, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = f3539I0;
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
            C3774v.m16213m0(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        C0792c0 f3625a;

        /* renamed from: b */
        final Rect f3626b = new Rect();

        /* renamed from: c */
        boolean f3627c = true;

        /* renamed from: d */
        boolean f3628d = false;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        public int mo4706a() {
            return this.f3625a.getLayoutPosition();
        }

        /* renamed from: b */
        public boolean mo4707b() {
            return this.f3625a.isUpdated();
        }

        /* renamed from: c */
        public boolean mo4708c() {
            return this.f3625a.isRemoved();
        }

        /* renamed from: d */
        public boolean mo4709d() {
            return this.f3625a.isInvalid();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C0809p pVar = this.f3609s;
        if (pVar != null) {
            return pVar.mo4429G(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + mo4559Q());
    }
}
