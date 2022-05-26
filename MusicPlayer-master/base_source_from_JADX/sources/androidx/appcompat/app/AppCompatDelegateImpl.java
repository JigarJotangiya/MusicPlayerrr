package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.C0125a;
import androidx.appcompat.view.menu.C0168e;
import androidx.appcompat.view.menu.C0171g;
import androidx.appcompat.view.menu.C0186m;
import androidx.appcompat.view.menu.C0188n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0275f;
import androidx.appcompat.widget.C0279g0;
import androidx.appcompat.widget.C0294l0;
import androidx.appcompat.widget.C0299m0;
import androidx.appcompat.widget.C0300n;
import androidx.appcompat.widget.C0307r;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0480e;
import androidx.core.content.C0506a;
import androidx.core.content.p003d.C0524f;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0718v;
import com.un4seen.bass.BASS;
import java.lang.Thread;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p082e.p083a.C3400a;
import p082e.p083a.C3402c;
import p082e.p083a.C3405f;
import p082e.p083a.C3406g;
import p082e.p083a.C3408i;
import p082e.p083a.C3409j;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p083a.p090o.C3432b;
import p082e.p083a.p090o.C3435d;
import p082e.p083a.p090o.C3437f;
import p082e.p083a.p090o.C3439g;
import p082e.p083a.p090o.C3444i;
import p082e.p098e.C3478g;
import p082e.p109h.p118o.C3698d;
import p082e.p109h.p119p.C3706a0;
import p082e.p109h.p119p.C3710b0;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3755f;
import p082e.p109h.p119p.C3759g;
import p082e.p109h.p119p.C3769q;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.C3790z;

class AppCompatDelegateImpl extends C0136e implements C0171g.C0172a, LayoutInflater.Factory2 {

    /* renamed from: g0 */
    private static final C3478g<String, Integer> f349g0 = new C3478g<>();

    /* renamed from: h0 */
    private static final boolean f350h0;

    /* renamed from: i0 */
    private static final int[] f351i0 = {16842836};

    /* renamed from: j0 */
    private static final boolean f352j0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: k0 */
    private static final boolean f353k0;

    /* renamed from: l0 */
    private static boolean f354l0 = true;

    /* renamed from: A */
    private boolean f355A;

    /* renamed from: B */
    ViewGroup f356B;

    /* renamed from: C */
    private TextView f357C;

    /* renamed from: D */
    private View f358D;

    /* renamed from: E */
    private boolean f359E;

    /* renamed from: F */
    private boolean f360F;

    /* renamed from: G */
    boolean f361G;

    /* renamed from: H */
    boolean f362H;

    /* renamed from: I */
    boolean f363I;

    /* renamed from: J */
    boolean f364J;

    /* renamed from: K */
    boolean f365K;

    /* renamed from: L */
    private boolean f366L;

    /* renamed from: M */
    private PanelFeatureState[] f367M;

    /* renamed from: N */
    private PanelFeatureState f368N;

    /* renamed from: O */
    private boolean f369O;

    /* renamed from: P */
    private boolean f370P;

    /* renamed from: Q */
    private boolean f371Q;

    /* renamed from: R */
    private boolean f372R;

    /* renamed from: S */
    boolean f373S;

    /* renamed from: T */
    private int f374T;

    /* renamed from: U */
    private int f375U;

    /* renamed from: V */
    private boolean f376V;

    /* renamed from: W */
    private boolean f377W;

    /* renamed from: X */
    private C0116m f378X;

    /* renamed from: Y */
    private C0116m f379Y;

    /* renamed from: Z */
    boolean f380Z;

    /* renamed from: a0 */
    int f381a0;

    /* renamed from: b0 */
    private final Runnable f382b0;

    /* renamed from: c0 */
    private boolean f383c0;

    /* renamed from: d0 */
    private Rect f384d0;

    /* renamed from: e0 */
    private Rect f385e0;

    /* renamed from: f0 */
    private C0139g f386f0;

    /* renamed from: j */
    final Object f387j;

    /* renamed from: k */
    final Context f388k;

    /* renamed from: l */
    Window f389l;

    /* renamed from: m */
    private C0114k f390m;

    /* renamed from: n */
    final C0135d f391n;

    /* renamed from: o */
    ActionBar f392o;

    /* renamed from: p */
    MenuInflater f393p;

    /* renamed from: q */
    private CharSequence f394q;

    /* renamed from: r */
    private C0300n f395r;

    /* renamed from: s */
    private C0111i f396s;

    /* renamed from: t */
    private C0124t f397t;

    /* renamed from: u */
    C3432b f398u;

    /* renamed from: v */
    ActionBarContextView f399v;

    /* renamed from: w */
    PopupWindow f400w;

    /* renamed from: x */
    Runnable f401x;

    /* renamed from: y */
    C3790z f402y;

    /* renamed from: z */
    private boolean f403z;

    protected static final class PanelFeatureState {

        /* renamed from: a */
        int f404a;

        /* renamed from: b */
        int f405b;

        /* renamed from: c */
        int f406c;

        /* renamed from: d */
        int f407d;

        /* renamed from: e */
        int f408e;

        /* renamed from: f */
        int f409f;

        /* renamed from: g */
        ViewGroup f410g;

        /* renamed from: h */
        View f411h;

        /* renamed from: i */
        View f412i;

        /* renamed from: j */
        C0171g f413j;

        /* renamed from: k */
        C0168e f414k;

        /* renamed from: l */
        Context f415l;

        /* renamed from: m */
        boolean f416m;

        /* renamed from: n */
        boolean f417n;

        /* renamed from: o */
        boolean f418o;

        /* renamed from: p */
        public boolean f419p;

        /* renamed from: q */
        boolean f420q = false;

        /* renamed from: r */
        boolean f421r;

        /* renamed from: s */
        Bundle f422s;

        @SuppressLint({"BanParcelableUsage"})
        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new C0101a();

            /* renamed from: g */
            int f423g;

            /* renamed from: h */
            boolean f424h;

            /* renamed from: i */
            Bundle f425i;

            /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a */
            class C0101a implements Parcelable.ClassLoaderCreator<SavedState> {
                C0101a() {
                }

                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.m639a(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.m639a(parcel, classLoader);
                }

                /* renamed from: c */
                public SavedState[] newArray(int i) {
                    return new SavedState[i];
                }
            }

            SavedState() {
            }

            /* renamed from: a */
            static SavedState m639a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f423g = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                savedState.f424h = z;
                if (z) {
                    savedState.f425i = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f423g);
                parcel.writeInt(this.f424h ? 1 : 0);
                if (this.f424h) {
                    parcel.writeBundle(this.f425i);
                }
            }
        }

        PanelFeatureState(int i) {
            this.f404a = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0188n mo566a(C0186m.C0187a aVar) {
            if (this.f413j == null) {
                return null;
            }
            if (this.f414k == null) {
                C0168e eVar = new C0168e(this.f415l, C3406g.abc_list_menu_item_layout);
                this.f414k = eVar;
                eVar.mo818I(aVar);
                this.f413j.mo916b(this.f414k);
            }
            return this.f414k.mo862b(this.f410g);
        }

        /* renamed from: b */
        public boolean mo567b() {
            if (this.f411h == null) {
                return false;
            }
            if (this.f412i == null && this.f414k.mo861a().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo568c(C0171g gVar) {
            C0168e eVar;
            C0171g gVar2 = this.f413j;
            if (gVar != gVar2) {
                if (gVar2 != null) {
                    gVar2.mo896Q(this.f414k);
                }
                this.f413j = gVar;
                if (gVar != null && (eVar = this.f414k) != null) {
                    gVar.mo916b(eVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo569d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C3400a.actionBarPopupTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C3400a.panelMenuListTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C3408i.Theme_AppCompat_CompactMenu, true);
            }
            C3435d dVar = new C3435d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f415l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(C3409j.AppCompatTheme);
            this.f405b = obtainStyledAttributes.getResourceId(C3409j.AppCompatTheme_panelBackground, 0);
            this.f409f = obtainStyledAttributes.getResourceId(C3409j.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$a */
    class C0102a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f426a;

        C0102a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f426a = uncaughtExceptionHandler;
        }

        /* renamed from: a */
        private boolean m643a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            if (message.contains("drawable") || message.contains("Drawable")) {
                return true;
            }
            return false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m643a(th)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f426a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f426a.uncaughtException(thread, th);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$b */
    class C0103b implements Runnable {
        C0103b() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f381a0 & 1) != 0) {
                appCompatDelegateImpl.mo531Z(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f381a0 & 4096) != 0) {
                appCompatDelegateImpl2.mo531Z(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f380Z = false;
            appCompatDelegateImpl3.f381a0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$c */
    class C0104c implements C3769q {
        C0104c() {
        }

        /* renamed from: a */
        public C3718d0 mo580a(View view, C3718d0 d0Var) {
            int l = d0Var.mo13038l();
            int P0 = AppCompatDelegateImpl.this.mo524P0(d0Var, (Rect) null);
            if (l != P0) {
                d0Var = d0Var.mo13042q(d0Var.mo13036j(), P0, d0Var.mo13037k(), d0Var.mo13035i());
            }
            return C3774v.m16189a0(view, d0Var);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$d */
    class C0105d implements C0307r.C0308a {
        C0105d() {
        }

        /* renamed from: a */
        public void mo581a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.mo524P0((C3718d0) null, rect);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$e */
    class C0106e implements ContentFrameLayout.C0231a {
        C0106e() {
        }

        /* renamed from: a */
        public void mo582a() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.mo529X();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f */
    class C0107f implements Runnable {

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$f$a */
        class C0108a extends C3710b0 {
            C0108a() {
            }

            /* renamed from: b */
            public void mo585b(View view) {
                AppCompatDelegateImpl.this.f399v.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f402y.mo13230h((C3706a0) null);
                AppCompatDelegateImpl.this.f402y = null;
            }

            /* renamed from: c */
            public void mo586c(View view) {
                AppCompatDelegateImpl.this.f399v.setVisibility(0);
            }
        }

        C0107f() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f400w.showAtLocation(appCompatDelegateImpl.f399v, 55, 0, 0);
            AppCompatDelegateImpl.this.mo533a0();
            if (AppCompatDelegateImpl.this.mo519I0()) {
                AppCompatDelegateImpl.this.f399v.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                C3790z d = C3774v.m16194d(appCompatDelegateImpl2.f399v);
                d.mo13223a(1.0f);
                appCompatDelegateImpl2.f402y = d;
                AppCompatDelegateImpl.this.f402y.mo13230h(new C0108a());
                return;
            }
            AppCompatDelegateImpl.this.f399v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f399v.setVisibility(0);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$g */
    class C0109g extends C3710b0 {
        C0109g() {
        }

        /* renamed from: b */
        public void mo585b(View view) {
            AppCompatDelegateImpl.this.f399v.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f402y.mo13230h((C3706a0) null);
            AppCompatDelegateImpl.this.f402y = null;
        }

        /* renamed from: c */
        public void mo586c(View view) {
            AppCompatDelegateImpl.this.f399v.setVisibility(0);
            AppCompatDelegateImpl.this.f399v.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f399v.getParent() instanceof View) {
                C3774v.m16211l0((View) AppCompatDelegateImpl.this.f399v.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$h */
    private class C0110h implements C0125a.C0127b {
        C0110h() {
        }

        /* renamed from: a */
        public Context mo587a() {
            return AppCompatDelegateImpl.this.mo538f0();
        }

        /* renamed from: b */
        public Drawable mo588b() {
            C0279g0 u = C0279g0.m1626u(mo587a(), (AttributeSet) null, new int[]{C3400a.homeAsUpIndicator});
            Drawable g = u.mo1982g(0);
            u.mo1995w();
            return g;
        }

        /* renamed from: c */
        public void mo589c(int i) {
            ActionBar n = AppCompatDelegateImpl.this.mo546n();
            if (n != null) {
                n.mo422u(i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$i */
    private final class C0111i implements C0186m.C0187a {
        C0111i() {
        }

        /* renamed from: c */
        public void mo590c(C0171g gVar, boolean z) {
            AppCompatDelegateImpl.this.mo525Q(gVar);
        }

        /* renamed from: d */
        public boolean mo591d(C0171g gVar) {
            Window.Callback k0 = AppCompatDelegateImpl.this.mo543k0();
            if (k0 == null) {
                return true;
            }
            k0.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j */
    class C0112j implements C3432b.C3433a {

        /* renamed from: a */
        private C3432b.C3433a f436a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$j$a */
        class C0113a extends C3710b0 {
            C0113a() {
            }

            /* renamed from: b */
            public void mo585b(View view) {
                AppCompatDelegateImpl.this.f399v.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f400w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f399v.getParent() instanceof View) {
                    C3774v.m16211l0((View) AppCompatDelegateImpl.this.f399v.getParent());
                }
                AppCompatDelegateImpl.this.f399v.removeAllViews();
                AppCompatDelegateImpl.this.f402y.mo13230h((C3706a0) null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f402y = null;
                C3774v.m16211l0(appCompatDelegateImpl2.f356B);
            }
        }

        public C0112j(C3432b.C3433a aVar) {
            this.f436a = aVar;
        }

        /* renamed from: a */
        public void mo592a(C3432b bVar) {
            this.f436a.mo592a(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f400w != null) {
                appCompatDelegateImpl.f389l.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f401x);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f399v != null) {
                appCompatDelegateImpl2.mo533a0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                C3790z d = C3774v.m16194d(appCompatDelegateImpl3.f399v);
                d.mo13223a(0.0f);
                appCompatDelegateImpl3.f402y = d;
                AppCompatDelegateImpl.this.f402y.mo13230h(new C0113a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            C0135d dVar = appCompatDelegateImpl4.f391n;
            if (dVar != null) {
                dVar.mo472S(appCompatDelegateImpl4.f398u);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f398u = null;
            C3774v.m16211l0(appCompatDelegateImpl5.f356B);
        }

        /* renamed from: b */
        public boolean mo593b(C3432b bVar, Menu menu) {
            return this.f436a.mo593b(bVar, menu);
        }

        /* renamed from: c */
        public boolean mo594c(C3432b bVar, Menu menu) {
            C3774v.m16211l0(AppCompatDelegateImpl.this.f356B);
            return this.f436a.mo594c(bVar, menu);
        }

        /* renamed from: d */
        public boolean mo595d(C3432b bVar, MenuItem menuItem) {
            return this.f436a.mo595d(bVar, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$l */
    private class C0115l extends C0116m {

        /* renamed from: c */
        private final PowerManager f440c;

        C0115l(Context context) {
            super();
            this.f440c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo607b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo608c() {
            if (Build.VERSION.SDK_INT < 21 || !this.f440c.isPowerSaveMode()) {
                return 1;
            }
            return 2;
        }

        /* renamed from: d */
        public void mo609d() {
            AppCompatDelegateImpl.this.mo521K();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m */
    abstract class C0116m {

        /* renamed from: a */
        private BroadcastReceiver f442a;

        /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$m$a */
        class C0117a extends BroadcastReceiver {
            C0117a() {
            }

            public void onReceive(Context context, Intent intent) {
                C0116m.this.mo609d();
            }
        }

        C0116m() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo610a() {
            BroadcastReceiver broadcastReceiver = this.f442a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f388k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f442a = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract IntentFilter mo607b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract int mo608c();

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo609d();

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo611e() {
            mo610a();
            IntentFilter b = mo607b();
            if (b != null && b.countActions() != 0) {
                if (this.f442a == null) {
                    this.f442a = new C0117a();
                }
                AppCompatDelegateImpl.this.f388k.registerReceiver(this.f442a, b);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$n */
    private class C0118n extends C0116m {

        /* renamed from: c */
        private final C0150l f445c;

        C0118n(C0150l lVar) {
            super();
            this.f445c = lVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IntentFilter mo607b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* renamed from: c */
        public int mo608c() {
            return this.f445c.mo687d() ? 2 : 1;
        }

        /* renamed from: d */
        public void mo609d() {
            AppCompatDelegateImpl.this.mo521K();
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$o */
    static class C0119o {
        /* renamed from: a */
        static void m673a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$p */
    static class C0120p {
        /* renamed from: a */
        static void m674a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (!locales.equals(locales2)) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$q */
    static class C0121q {
        /* renamed from: a */
        static void m675a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$r */
    private static class C0122r {
        /* renamed from: a */
        static void m676a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$s */
    private class C0123s extends ContentFrameLayout {
        public C0123s(Context context) {
            super(context);
        }

        /* renamed from: c */
        private boolean m677c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo530Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !m677c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.mo526S(0);
            return true;
        }

        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C3410a.m14543d(getContext(), i));
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$t */
    private final class C0124t implements C0186m.C0187a {
        C0124t() {
        }

        /* renamed from: c */
        public void mo590c(C0171g gVar, boolean z) {
            C0171g F = gVar.mo886F();
            boolean z2 = F != gVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                gVar = F;
            }
            PanelFeatureState d0 = appCompatDelegateImpl.mo536d0(gVar);
            if (d0 == null) {
                return;
            }
            if (z2) {
                AppCompatDelegateImpl.this.mo523P(d0.f404a, d0, F);
                AppCompatDelegateImpl.this.mo527T(d0, true);
                return;
            }
            AppCompatDelegateImpl.this.mo527T(d0, z);
        }

        /* renamed from: d */
        public boolean mo591d(C0171g gVar) {
            Window.Callback k0;
            if (gVar != gVar.mo886F()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f361G || (k0 = appCompatDelegateImpl.mo543k0()) == null || AppCompatDelegateImpl.this.f373S) {
                return true;
            }
            k0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        boolean z2 = i < 21;
        f350h0 = z2;
        if (i >= 17) {
            z = true;
        }
        f353k0 = z;
        if (z2 && !f354l0) {
            Thread.setDefaultUncaughtExceptionHandler(new C0102a(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    AppCompatDelegateImpl(Activity activity, C0135d dVar) {
        this(activity, (Window) null, dVar, activity);
    }

    /* renamed from: C0 */
    private void m549C0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (!panelFeatureState.f418o && !this.f373S) {
            if (panelFeatureState.f404a == 0) {
                if ((this.f388k.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback k0 = mo543k0();
            if (k0 == null || k0.onMenuOpened(panelFeatureState.f404a, panelFeatureState.f413j)) {
                WindowManager windowManager = (WindowManager) this.f388k.getSystemService("window");
                if (windowManager != null && m551F0(panelFeatureState, keyEvent)) {
                    ViewGroup viewGroup = panelFeatureState.f410g;
                    if (viewGroup == null || panelFeatureState.f420q) {
                        if (viewGroup == null) {
                            if (!m574n0(panelFeatureState) || panelFeatureState.f410g == null) {
                                return;
                            }
                        } else if (panelFeatureState.f420q && viewGroup.getChildCount() > 0) {
                            panelFeatureState.f410g.removeAllViews();
                        }
                        if (!m573m0(panelFeatureState) || !panelFeatureState.mo567b()) {
                            panelFeatureState.f420q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f411h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        panelFeatureState.f410g.setBackgroundResource(panelFeatureState.f405b);
                        ViewParent parent = panelFeatureState.f411h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(panelFeatureState.f411h);
                        }
                        panelFeatureState.f410g.addView(panelFeatureState.f411h, layoutParams2);
                        if (!panelFeatureState.f411h.hasFocus()) {
                            panelFeatureState.f411h.requestFocus();
                        }
                    } else {
                        View view = panelFeatureState.f412i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i = -1;
                            panelFeatureState.f417n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f407d, panelFeatureState.f408e, 1002, 8519680, -3);
                            layoutParams3.gravity = panelFeatureState.f406c;
                            layoutParams3.windowAnimations = panelFeatureState.f409f;
                            windowManager.addView(panelFeatureState.f410g, layoutParams3);
                            panelFeatureState.f418o = true;
                            return;
                        }
                    }
                    i = -2;
                    panelFeatureState.f417n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, panelFeatureState.f407d, panelFeatureState.f408e, 1002, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.f406c;
                    layoutParams32.windowAnimations = panelFeatureState.f409f;
                    windowManager.addView(panelFeatureState.f410g, layoutParams32);
                    panelFeatureState.f418o = true;
                    return;
                }
                return;
            }
            mo527T(panelFeatureState, true);
        }
    }

    /* renamed from: E0 */
    private boolean m550E0(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent, int i2) {
        C0171g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f416m || m551F0(panelFeatureState, keyEvent)) && (gVar = panelFeatureState.f413j) != null) {
            z = gVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f395r == null) {
            mo527T(panelFeatureState, true);
        }
        return z;
    }

    /* renamed from: F0 */
    private boolean m551F0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        C0300n nVar;
        C0300n nVar2;
        C0300n nVar3;
        C0300n nVar4;
        if (this.f373S) {
            return false;
        }
        if (panelFeatureState.f416m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f368N;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            mo527T(panelFeatureState2, false);
        }
        Window.Callback k0 = mo543k0();
        if (k0 != null) {
            panelFeatureState.f412i = k0.onCreatePanelView(panelFeatureState.f404a);
        }
        int i = panelFeatureState.f404a;
        boolean z = i == 0 || i == 108;
        if (z && (nVar4 = this.f395r) != null) {
            nVar4.mo1198c();
        }
        if (panelFeatureState.f412i == null && (!z || !(mo513D0() instanceof C0143j))) {
            C0171g gVar = panelFeatureState.f413j;
            if (gVar == null || panelFeatureState.f421r) {
                if (gVar == null && (!m575o0(panelFeatureState) || panelFeatureState.f413j == null)) {
                    return false;
                }
                if (z && (nVar3 = this.f395r) != null) {
                    if (this.f396s == null) {
                        this.f396s = new C0111i();
                    }
                    nVar3.mo1196a(panelFeatureState.f413j, this.f396s);
                }
                panelFeatureState.f413j.mo932h0();
                if (!k0.onCreatePanelMenu(panelFeatureState.f404a, panelFeatureState.f413j)) {
                    panelFeatureState.mo568c((C0171g) null);
                    if (z && (nVar2 = this.f395r) != null) {
                        nVar2.mo1196a((Menu) null, this.f396s);
                    }
                    return false;
                }
                panelFeatureState.f421r = false;
            }
            panelFeatureState.f413j.mo932h0();
            Bundle bundle = panelFeatureState.f422s;
            if (bundle != null) {
                panelFeatureState.f413j.mo897R(bundle);
                panelFeatureState.f422s = null;
            }
            if (!k0.onPreparePanel(0, panelFeatureState.f412i, panelFeatureState.f413j)) {
                if (z && (nVar = this.f395r) != null) {
                    nVar.mo1196a((Menu) null, this.f396s);
                }
                panelFeatureState.f413j.mo929g0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f419p = z2;
            panelFeatureState.f413j.setQwertyMode(z2);
            panelFeatureState.f413j.mo929g0();
        }
        panelFeatureState.f416m = true;
        panelFeatureState.f417n = false;
        this.f368N = panelFeatureState;
        return true;
    }

    /* renamed from: G0 */
    private void m552G0(boolean z) {
        C0300n nVar = this.f395r;
        if (nVar == null || !nVar.mo1200d() || (ViewConfiguration.get(this.f388k).hasPermanentMenuKey() && !this.f395r.mo1202e())) {
            PanelFeatureState i0 = mo540i0(0, true);
            i0.f420q = true;
            mo527T(i0, false);
            m549C0(i0, (KeyEvent) null);
            return;
        }
        Window.Callback k0 = mo543k0();
        if (this.f395r.mo1197b() && z) {
            this.f395r.mo1203f();
            if (!this.f373S) {
                k0.onPanelClosed(108, mo540i0(0, true).f413j);
            }
        } else if (k0 != null && !this.f373S) {
            if (this.f380Z && (this.f381a0 & 1) != 0) {
                this.f389l.getDecorView().removeCallbacks(this.f382b0);
                this.f382b0.run();
            }
            PanelFeatureState i02 = mo540i0(0, true);
            C0171g gVar = i02.f413j;
            if (gVar != null && !i02.f421r && k0.onPreparePanel(0, i02.f412i, gVar)) {
                k0.onMenuOpened(108, i02.f413j);
                this.f395r.mo1205g();
            }
        }
    }

    /* renamed from: H0 */
    private int m553H0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i != 9) {
            return i;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        }
    }

    /* renamed from: J0 */
    private boolean m554J0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f389l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C3774v.m16180S((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: L */
    private boolean m555L(boolean z) {
        if (this.f373S) {
            return false;
        }
        int O = m561O();
        boolean N0 = m560N0(mo554s0(this.f388k, O), z);
        if (O == 0) {
            m571h0(this.f388k).mo611e();
        } else {
            C0116m mVar = this.f378X;
            if (mVar != null) {
                mVar.mo610a();
            }
        }
        if (O == 3) {
            m570g0(this.f388k).mo611e();
        } else {
            C0116m mVar2 = this.f379Y;
            if (mVar2 != null) {
                mVar2.mo610a();
            }
        }
        return N0;
    }

    /* renamed from: L0 */
    private void m556L0() {
        if (this.f355A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: M */
    private void m557M() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f356B.findViewById(16908290);
        View decorView = this.f389l.getDecorView();
        contentFrameLayout.mo1558b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f388k.obtainStyledAttributes(C3409j.AppCompatTheme);
        obtainStyledAttributes.getValue(C3409j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C3409j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i = C3409j.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C3409j.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C3409j.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C3409j.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: M0 */
    private AppCompatActivity m558M0() {
        Context context = this.f388k;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    /* renamed from: N */
    private void m559N(Window window) {
        if (this.f389l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0114k)) {
                C0114k kVar = new C0114k(callback);
                this.f390m = kVar;
                window.setCallback(kVar);
                C0279g0 u = C0279g0.m1626u(this.f388k, (AttributeSet) null, f351i0);
                Drawable h = u.mo1983h(0);
                if (h != null) {
                    window.setBackgroundDrawable(h);
                }
                u.mo1995w();
                this.f389l = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* renamed from: N0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m560N0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f388k
            r1 = 0
            android.content.res.Configuration r0 = r6.m565U(r0, r7, r1)
            boolean r2 = r6.m577q0()
            android.content.Context r3 = r6.f388k
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.f370P
            if (r8 == 0) goto L_0x0047
            boolean r8 = f352j0
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.f371Q
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f387j
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f387j
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.C0466a.m2985l(r8)
            r8 = 1
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.m562O0(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f387j
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            r8.mo474T1(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m560N0(int, boolean):boolean");
    }

    /* renamed from: O */
    private int m561O() {
        int i = this.f374T;
        return i != -100 ? i : C0136e.m729j();
    }

    /* renamed from: O0 */
    private void m562O0(int i, boolean z, Configuration configuration) {
        Resources resources = this.f388k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            C0141h.m788a(resources);
        }
        int i3 = this.f375U;
        if (i3 != 0) {
            this.f388k.setTheme(i3);
            if (i2 >= 23) {
                this.f388k.getTheme().applyStyle(this.f375U, true);
            }
        }
        if (z) {
            Object obj = this.f387j;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof C0718v) {
                    if (((C0718v) activity).mo390v().mo4257b().isAtLeast(C0697n.C0700c.STARTED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else if (this.f372R) {
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    /* renamed from: Q0 */
    private void m563Q0(View view) {
        int i;
        if ((C3774v.m16173M(view) & 8192) != 0) {
            i = C0506a.m3150b(this.f388k, C3402c.abc_decor_view_status_guard_light);
        } else {
            i = C0506a.m3150b(this.f388k, C3402c.abc_decor_view_status_guard);
        }
        view.setBackgroundColor(i);
    }

    /* renamed from: R */
    private void m564R() {
        C0116m mVar = this.f378X;
        if (mVar != null) {
            mVar.mo610a();
        }
        C0116m mVar2 = this.f379Y;
        if (mVar2 != null) {
            mVar2.mo610a();
        }
    }

    /* renamed from: U */
    private Configuration m565U(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* renamed from: V */
    private ViewGroup m566V() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f388k.obtainStyledAttributes(C3409j.AppCompatTheme);
        int i = C3409j.AppCompatTheme_windowActionBar;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C3409j.AppCompatTheme_windowNoTitle, false)) {
                mo510B(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo510B(108);
            }
            if (obtainStyledAttributes.getBoolean(C3409j.AppCompatTheme_windowActionBarOverlay, false)) {
                mo510B(109);
            }
            if (obtainStyledAttributes.getBoolean(C3409j.AppCompatTheme_windowActionModeOverlay, false)) {
                mo510B(10);
            }
            this.f364J = obtainStyledAttributes.getBoolean(C3409j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            m568c0();
            this.f389l.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f388k);
            if (this.f365K) {
                viewGroup = this.f363I ? (ViewGroup) from.inflate(C3406g.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C3406g.abc_screen_simple, (ViewGroup) null);
            } else if (this.f364J) {
                viewGroup = (ViewGroup) from.inflate(C3406g.abc_dialog_title_material, (ViewGroup) null);
                this.f362H = false;
                this.f361G = false;
            } else if (this.f361G) {
                TypedValue typedValue = new TypedValue();
                this.f388k.getTheme().resolveAttribute(C3400a.actionBarTheme, typedValue, true);
                if (typedValue.resourceId != 0) {
                    context = new C3435d(this.f388k, typedValue.resourceId);
                } else {
                    context = this.f388k;
                }
                viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C3406g.abc_screen_toolbar, (ViewGroup) null);
                C0300n nVar = (C0300n) viewGroup.findViewById(C3405f.decor_content_parent);
                this.f395r = nVar;
                nVar.setWindowCallback(mo543k0());
                if (this.f362H) {
                    this.f395r.mo1212h(109);
                }
                if (this.f359E) {
                    this.f395r.mo1212h(2);
                }
                if (this.f360F) {
                    this.f395r.mo1212h(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    C3774v.m16154C0(viewGroup, new C0104c());
                } else if (viewGroup instanceof C0307r) {
                    ((C0307r) viewGroup).setOnFitSystemWindowsListener(new C0105d());
                }
                if (this.f395r == null) {
                    this.f357C = (TextView) viewGroup.findViewById(C3405f.title);
                }
                C0299m0.m1794c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C3405f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f389l.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f389l.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0106e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f361G + ", windowActionBarOverlay: " + this.f362H + ", android:windowIsFloating: " + this.f364J + ", windowActionModeOverlay: " + this.f363I + ", windowNoTitle: " + this.f365K + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: b0 */
    private void m567b0() {
        if (!this.f355A) {
            this.f356B = m566V();
            CharSequence j0 = mo541j0();
            if (!TextUtils.isEmpty(j0)) {
                C0300n nVar = this.f395r;
                if (nVar != null) {
                    nVar.setWindowTitle(j0);
                } else if (mo513D0() != null) {
                    mo513D0().mo427z(j0);
                } else {
                    TextView textView = this.f357C;
                    if (textView != null) {
                        textView.setText(j0);
                    }
                }
            }
            m557M();
            mo511B0(this.f356B);
            this.f355A = true;
            PanelFeatureState i0 = mo540i0(0, false);
            if (this.f373S) {
                return;
            }
            if (i0 == null || i0.f413j == null) {
                m576p0(108);
            }
        }
    }

    /* renamed from: c0 */
    private void m568c0() {
        if (this.f389l == null) {
            Object obj = this.f387j;
            if (obj instanceof Activity) {
                m559N(((Activity) obj).getWindow());
            }
        }
        if (this.f389l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: e0 */
    private static Configuration m569e0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0120p.m674a(configuration, configuration2, configuration3);
            } else if (!C3698d.m15814a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & BASS.BASS_ATTRIB_MUSIC_VOL_INST;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & BASS.BASS_ATTRIB_MUSIC_VOL_INST)) {
                configuration3.screenLayout |= i25 & BASS.BASS_ATTRIB_MUSIC_VOL_INST;
            }
            if (i5 >= 26) {
                C0121q.m675a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            if (i5 >= 17) {
                C0119o.m673a(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    /* renamed from: g0 */
    private C0116m m570g0(Context context) {
        if (this.f379Y == null) {
            this.f379Y = new C0115l(context);
        }
        return this.f379Y;
    }

    /* renamed from: h0 */
    private C0116m m571h0(Context context) {
        if (this.f378X == null) {
            this.f378X = new C0118n(C0150l.m827a(context));
        }
        return this.f378X;
    }

    /* renamed from: l0 */
    private void m572l0() {
        m567b0();
        if (this.f361G && this.f392o == null) {
            Object obj = this.f387j;
            if (obj instanceof Activity) {
                this.f392o = new C0152m((Activity) this.f387j, this.f362H);
            } else if (obj instanceof Dialog) {
                this.f392o = new C0152m((Dialog) this.f387j);
            }
            ActionBar actionBar = this.f392o;
            if (actionBar != null) {
                actionBar.mo419r(this.f383c0);
            }
        }
    }

    /* renamed from: m0 */
    private boolean m573m0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f412i;
        if (view != null) {
            panelFeatureState.f411h = view;
            return true;
        } else if (panelFeatureState.f413j == null) {
            return false;
        } else {
            if (this.f397t == null) {
                this.f397t = new C0124t();
            }
            View view2 = (View) panelFeatureState.mo566a(this.f397t);
            panelFeatureState.f411h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: n0 */
    private boolean m574n0(PanelFeatureState panelFeatureState) {
        panelFeatureState.mo569d(mo538f0());
        panelFeatureState.f410g = new C0123s(panelFeatureState.f415l);
        panelFeatureState.f406c = 81;
        return true;
    }

    /* renamed from: o0 */
    private boolean m575o0(PanelFeatureState panelFeatureState) {
        Context context = this.f388k;
        int i = panelFeatureState.f404a;
        if ((i == 0 || i == 108) && this.f395r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(C3400a.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(C3400a.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(C3400a.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                C3435d dVar = new C3435d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        C0171g gVar = new C0171g(context);
        gVar.mo901V(this);
        panelFeatureState.mo568c(gVar);
        return true;
    }

    /* renamed from: p0 */
    private void m576p0(int i) {
        this.f381a0 = (1 << i) | this.f381a0;
        if (!this.f380Z) {
            C3774v.m16201g0(this.f389l.getDecorView(), this.f382b0);
            this.f380Z = true;
        }
    }

    /* renamed from: q0 */
    private boolean m577q0() {
        if (!this.f377W && (this.f387j instanceof Activity)) {
            PackageManager packageManager = this.f388k.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f388k, this.f387j.getClass()), i >= 29 ? 269221888 : i >= 24 ? 786432 : 0);
                this.f376V = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f376V = false;
            }
        }
        this.f377W = true;
        return this.f376V;
    }

    /* renamed from: v0 */
    private boolean m578v0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState i0 = mo540i0(i, true);
        if (!i0.f418o) {
            return m551F0(i0, keyEvent);
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a  */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m579y0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            e.a.o.b r0 = r4.f398u
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            r0 = 1
            androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState r2 = r4.mo540i0(r5, r0)
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.n r5 = r4.f395r
            if (r5 == 0) goto L_0x0043
            boolean r5 = r5.mo1200d()
            if (r5 == 0) goto L_0x0043
            android.content.Context r5 = r4.f388k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L_0x0043
            androidx.appcompat.widget.n r5 = r4.f395r
            boolean r5 = r5.mo1197b()
            if (r5 != 0) goto L_0x003c
            boolean r5 = r4.f373S
            if (r5 != 0) goto L_0x0062
            boolean r5 = r4.m551F0(r2, r6)
            if (r5 == 0) goto L_0x0062
            androidx.appcompat.widget.n r5 = r4.f395r
            boolean r0 = r5.mo1205g()
            goto L_0x0068
        L_0x003c:
            androidx.appcompat.widget.n r5 = r4.f395r
            boolean r0 = r5.mo1203f()
            goto L_0x0068
        L_0x0043:
            boolean r5 = r2.f418o
            if (r5 != 0) goto L_0x0064
            boolean r3 = r2.f417n
            if (r3 == 0) goto L_0x004c
            goto L_0x0064
        L_0x004c:
            boolean r5 = r2.f416m
            if (r5 == 0) goto L_0x0062
            boolean r5 = r2.f421r
            if (r5 == 0) goto L_0x005b
            r2.f416m = r1
            boolean r5 = r4.m551F0(r2, r6)
            goto L_0x005c
        L_0x005b:
            r5 = 1
        L_0x005c:
            if (r5 == 0) goto L_0x0062
            r4.m549C0(r2, r6)
            goto L_0x0068
        L_0x0062:
            r0 = 0
            goto L_0x0068
        L_0x0064:
            r4.mo527T(r2, r0)
            r0 = r5
        L_0x0068:
            if (r0 == 0) goto L_0x0085
            android.content.Context r5 = r4.f388k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L_0x007e
            r5.playSoundEffect(r1)
            goto L_0x0085
        L_0x007e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m579y0(int, android.view.KeyEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public void mo509A0(int i) {
        if (i == 108) {
            ActionBar n = mo546n();
            if (n != null) {
                n.mo409h(false);
            }
        } else if (i == 0) {
            PanelFeatureState i0 = mo540i0(i, true);
            if (i0.f418o) {
                mo527T(i0, false);
            }
        }
    }

    /* renamed from: B */
    public boolean mo510B(int i) {
        int H0 = m553H0(i);
        if (this.f365K && H0 == 108) {
            return false;
        }
        if (this.f361G && H0 == 1) {
            this.f361G = false;
        }
        if (H0 == 1) {
            m556L0();
            this.f365K = true;
            return true;
        } else if (H0 == 2) {
            m556L0();
            this.f359E = true;
            return true;
        } else if (H0 == 5) {
            m556L0();
            this.f360F = true;
            return true;
        } else if (H0 == 10) {
            m556L0();
            this.f363I = true;
            return true;
        } else if (H0 == 108) {
            m556L0();
            this.f361G = true;
            return true;
        } else if (H0 != 109) {
            return this.f389l.requestFeature(H0);
        } else {
            m556L0();
            this.f362H = true;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B0 */
    public void mo511B0(ViewGroup viewGroup) {
    }

    /* renamed from: D */
    public void mo512D(int i) {
        m567b0();
        ViewGroup viewGroup = (ViewGroup) this.f356B.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f388k).inflate(i, viewGroup);
        this.f390m.mo12213a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D0 */
    public final ActionBar mo513D0() {
        return this.f392o;
    }

    /* renamed from: E */
    public void mo514E(View view) {
        m567b0();
        ViewGroup viewGroup = (ViewGroup) this.f356B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f390m.mo12213a().onContentChanged();
    }

    /* renamed from: F */
    public void mo515F(View view, ViewGroup.LayoutParams layoutParams) {
        m567b0();
        ViewGroup viewGroup = (ViewGroup) this.f356B.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f390m.mo12213a().onContentChanged();
    }

    /* renamed from: G */
    public void mo516G(Toolbar toolbar) {
        if (this.f387j instanceof Activity) {
            ActionBar n = mo546n();
            if (!(n instanceof C0152m)) {
                this.f393p = null;
                if (n != null) {
                    n.mo415n();
                }
                if (toolbar != null) {
                    C0143j jVar = new C0143j(toolbar, mo541j0(), this.f390m);
                    this.f392o = jVar;
                    this.f389l.setCallback(jVar.mo680D());
                } else {
                    this.f392o = null;
                    this.f389l.setCallback(this.f390m);
                }
                mo550p();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* renamed from: H */
    public void mo517H(int i) {
        this.f375U = i;
    }

    /* renamed from: I */
    public final void mo518I(CharSequence charSequence) {
        this.f394q = charSequence;
        C0300n nVar = this.f395r;
        if (nVar != null) {
            nVar.setWindowTitle(charSequence);
        } else if (mo513D0() != null) {
            mo513D0().mo427z(charSequence);
        } else {
            TextView textView = this.f357C;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f356B;
     */
    /* renamed from: I0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo519I0() {
        /*
            r1 = this;
            boolean r0 = r1.f355A
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f356B
            if (r0 == 0) goto L_0x0010
            boolean r0 = p082e.p109h.p119p.C3774v.m16181T(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo519I0():boolean");
    }

    /* renamed from: J */
    public C3432b mo520J(C3432b.C3433a aVar) {
        C0135d dVar;
        if (aVar != null) {
            C3432b bVar = this.f398u;
            if (bVar != null) {
                bVar.mo703c();
            }
            C0112j jVar = new C0112j(aVar);
            ActionBar n = mo546n();
            if (n != null) {
                C3432b B = n.mo406B(jVar);
                this.f398u = B;
                if (!(B == null || (dVar = this.f391n) == null)) {
                    dVar.mo467L(B);
                }
            }
            if (this.f398u == null) {
                this.f398u = mo522K0(jVar);
            }
            return this.f398u;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: K */
    public boolean mo521K() {
        return m555L(true);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p082e.p083a.p090o.C3432b mo522K0(p082e.p083a.p090o.C3432b.C3433a r8) {
        /*
            r7 = this;
            r7.mo533a0()
            e.a.o.b r0 = r7.f398u
            if (r0 == 0) goto L_0x000a
            r0.mo703c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.C0112j
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$j r0 = new androidx.appcompat.app.AppCompatDelegateImpl$j
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f391n
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.f373S
            if (r2 != 0) goto L_0x0022
            e.a.o.b r0 = r0.mo466F0(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f398u = r0
            goto L_0x0161
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f399v
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.f364J
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f388k
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = p082e.p083a.C3400a.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f388k
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            e.a.o.d r4 = new e.a.o.d
            android.content.Context r6 = r7.f388k
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f388k
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f399v = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = p082e.p083a.C3400a.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f400w = r5
            r6 = 2
            androidx.core.widget.C0554j.m3408b(r5, r6)
            android.widget.PopupWindow r5 = r7.f400w
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f399v
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f400w
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = p082e.p083a.C3400a.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f399v
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f400w
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$f r0 = new androidx.appcompat.app.AppCompatDelegateImpl$f
            r0.<init>()
            r7.f401x = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f356B
            int r4 = p082e.p083a.C3405f.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.mo538f0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.mo1897a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f399v = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f399v
            if (r0 == 0) goto L_0x0161
            r7.mo533a0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f399v
            r0.mo1182k()
            e.a.o.e r0 = new e.a.o.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f399v
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f399v
            android.widget.PopupWindow r6 = r7.f400w
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = 0
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.mo705e()
            boolean r8 = r8.mo593b(r0, r3)
            if (r8 == 0) goto L_0x015f
            r0.mo709k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f399v
            r8.mo1180h(r0)
            r7.f398u = r0
            boolean r8 = r7.mo519I0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x0129
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f399v
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f399v
            e.h.p.z r8 = p082e.p109h.p119p.C3774v.m16194d(r8)
            r8.mo13223a(r0)
            r7.f402y = r8
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = new androidx.appcompat.app.AppCompatDelegateImpl$g
            r0.<init>()
            r8.mo13230h(r0)
            goto L_0x014f
        L_0x0129:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f399v
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f399v
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f399v
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f399v
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x014f
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f399v
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            p082e.p109h.p119p.C3774v.m16211l0(r8)
        L_0x014f:
            android.widget.PopupWindow r8 = r7.f400w
            if (r8 == 0) goto L_0x0161
            android.view.Window r8 = r7.f389l
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f401x
            r8.post(r0)
            goto L_0x0161
        L_0x015f:
            r7.f398u = r1
        L_0x0161:
            e.a.o.b r8 = r7.f398u
            if (r8 == 0) goto L_0x016c
            androidx.appcompat.app.d r0 = r7.f391n
            if (r0 == 0) goto L_0x016c
            r0.mo467L(r8)
        L_0x016c:
            e.a.o.b r8 = r7.f398u
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo522K0(e.a.o.b$a):e.a.o.b");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo523P(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f367M;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f413j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f418o) && !this.f373S) {
            this.f390m.mo12213a().onPanelClosed(i, menu);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public final int mo524P0(C3718d0 d0Var, Rect rect) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int i5 = 0;
        if (d0Var != null) {
            i = d0Var.mo13038l();
        } else {
            i = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f399v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f399v.getLayoutParams();
            boolean z3 = true;
            if (this.f399v.isShown()) {
                if (this.f384d0 == null) {
                    this.f384d0 = new Rect();
                    this.f385e0 = new Rect();
                }
                Rect rect2 = this.f384d0;
                Rect rect3 = this.f385e0;
                if (d0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(d0Var.mo13036j(), d0Var.mo13038l(), d0Var.mo13037k(), d0Var.mo13035i());
                }
                C0299m0.m1792a(this.f356B, rect2, rect3);
                int i6 = rect2.top;
                int i7 = rect2.left;
                int i8 = rect2.right;
                C3718d0 I = C3774v.m16165I(this.f356B);
                if (I == null) {
                    i2 = 0;
                } else {
                    i2 = I.mo13036j();
                }
                if (I == null) {
                    i3 = 0;
                } else {
                    i3 = I.mo13037k();
                }
                if (marginLayoutParams2.topMargin == i6 && marginLayoutParams2.leftMargin == i7 && marginLayoutParams2.rightMargin == i8) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i6;
                    marginLayoutParams2.leftMargin = i7;
                    marginLayoutParams2.rightMargin = i8;
                    z2 = true;
                }
                if (i6 <= 0 || this.f358D != null) {
                    View view = this.f358D;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i4 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3))) {
                        marginLayoutParams.height = i4;
                        marginLayoutParams.leftMargin = i2;
                        marginLayoutParams.rightMargin = i3;
                        this.f358D.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f388k);
                    this.f358D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = i3;
                    this.f356B.addView(this.f358D, -1, layoutParams);
                }
                View view3 = this.f358D;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m563Q0(this.f358D);
                }
                if (!this.f363I && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f399v.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f358D;
        if (view4 != null) {
            if (!z) {
                i5 = 8;
            }
            view4.setVisibility(i5);
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public void mo525Q(C0171g gVar) {
        if (!this.f366L) {
            this.f366L = true;
            this.f395r.mo1213i();
            Window.Callback k0 = mo543k0();
            if (k0 != null && !this.f373S) {
                k0.onPanelClosed(108, gVar);
            }
            this.f366L = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public void mo526S(int i) {
        mo527T(mo540i0(i, true), true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo527T(PanelFeatureState panelFeatureState, boolean z) {
        ViewGroup viewGroup;
        C0300n nVar;
        if (!z || panelFeatureState.f404a != 0 || (nVar = this.f395r) == null || !nVar.mo1197b()) {
            WindowManager windowManager = (WindowManager) this.f388k.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f418o || (viewGroup = panelFeatureState.f410g) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    mo523P(panelFeatureState.f404a, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f416m = false;
            panelFeatureState.f417n = false;
            panelFeatureState.f418o = false;
            panelFeatureState.f411h = null;
            panelFeatureState.f420q = true;
            if (this.f368N == panelFeatureState) {
                this.f368N = null;
                return;
            }
            return;
        }
        mo525Q(panelFeatureState.f413j);
    }

    /* renamed from: W */
    public View mo528W(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f386f0 == null) {
            String string = this.f388k.obtainStyledAttributes(C3409j.AppCompatTheme).getString(C3409j.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f386f0 = new C0139g();
            } else {
                try {
                    this.f386f0 = (C0139g) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f386f0 = new C0139g();
                }
            }
        }
        boolean z3 = f350h0;
        if (z3) {
            if (!(attributeSet instanceof XmlPullParser)) {
                z2 = m554J0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = false;
        }
        return this.f386f0.mo678q(view, str, context, attributeSet, z, z3, true, C0294l0.m1754c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo529X() {
        C0171g gVar;
        C0300n nVar = this.f395r;
        if (nVar != null) {
            nVar.mo1213i();
        }
        if (this.f400w != null) {
            this.f389l.getDecorView().removeCallbacks(this.f401x);
            if (this.f400w.isShowing()) {
                try {
                    this.f400w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f400w = null;
        }
        mo533a0();
        PanelFeatureState i0 = mo540i0(0, false);
        if (i0 != null && (gVar = i0.f413j) != null) {
            gVar.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public boolean mo530Y(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f387j;
        boolean z = true;
        if (((obj instanceof C3755f.C3756a) || (obj instanceof C0137f)) && (decorView = this.f389l.getDecorView()) != null && C3755f.m16084d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f390m.mo12213a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        return z ? mo558u0(keyCode, keyEvent) : mo563x0(keyCode, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo531Z(int i) {
        PanelFeatureState i0;
        PanelFeatureState i02 = mo540i0(i, true);
        if (i02.f413j != null) {
            Bundle bundle = new Bundle();
            i02.f413j.mo899T(bundle);
            if (bundle.size() > 0) {
                i02.f422s = bundle;
            }
            i02.f413j.mo932h0();
            i02.f413j.clear();
        }
        i02.f421r = true;
        i02.f420q = true;
        if ((i == 108 || i == 0) && this.f395r != null && (i0 = mo540i0(0, false)) != null) {
            i0.f416m = false;
            m551F0(i0, (KeyEvent) null);
        }
    }

    /* renamed from: a */
    public boolean mo532a(C0171g gVar, MenuItem menuItem) {
        PanelFeatureState d0;
        Window.Callback k0 = mo543k0();
        if (k0 == null || this.f373S || (d0 = mo536d0(gVar.mo886F())) == null) {
            return false;
        }
        return k0.onMenuItemSelected(d0.f404a, menuItem);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo533a0() {
        C3790z zVar = this.f402y;
        if (zVar != null) {
            zVar.mo13224b();
        }
    }

    /* renamed from: b */
    public void mo534b(C0171g gVar) {
        m552G0(true);
    }

    /* renamed from: d */
    public void mo535d(View view, ViewGroup.LayoutParams layoutParams) {
        m567b0();
        ((ViewGroup) this.f356B.findViewById(16908290)).addView(view, layoutParams);
        this.f390m.mo12213a().onContentChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public PanelFeatureState mo536d0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f367M;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f413j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* renamed from: f */
    public Context mo537f(Context context) {
        boolean z = true;
        this.f370P = true;
        int s0 = mo554s0(context, m561O());
        Configuration configuration = null;
        if (f353k0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0122r.m676a((ContextThemeWrapper) context, m565U(context, s0, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C3435d) {
            try {
                ((C3435d) context).mo12168a(m565U(context, s0, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f352j0) {
            super.mo537f(context);
            return context;
        }
        try {
            Configuration configuration2 = context.getPackageManager().getResourcesForApplication(context.getApplicationInfo()).getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            if (!configuration2.equals(configuration3)) {
                configuration = m569e0(configuration2, configuration3);
            }
            Configuration U = m565U(context, s0, configuration);
            C3435d dVar = new C3435d(context, C3408i.Theme_AppCompat_Empty);
            dVar.mo12168a(U);
            boolean z2 = false;
            try {
                if (context.getTheme() == null) {
                    z = false;
                }
                z2 = z;
            } catch (NullPointerException unused3) {
            }
            if (z2) {
                C0524f.C0530d.m3239a(dVar.getTheme());
            }
            super.mo537f(dVar);
            return dVar;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Application failed to obtain resources from itself", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final Context mo538f0() {
        ActionBar n = mo546n();
        Context j = n != null ? n.mo411j() : null;
        return j == null ? this.f388k : j;
    }

    /* renamed from: i */
    public <T extends View> T mo539i(int i) {
        m567b0();
        return this.f389l.findViewById(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public PanelFeatureState mo540i0(int i, boolean z) {
        PanelFeatureState[] panelFeatureStateArr = this.f367M;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f367M = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public final CharSequence mo541j0() {
        Object obj = this.f387j;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f394q;
    }

    /* renamed from: k */
    public final C0125a.C0127b mo542k() {
        return new C0110h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public final Window.Callback mo543k0() {
        return this.f389l.getCallback();
    }

    /* renamed from: l */
    public int mo544l() {
        return this.f374T;
    }

    /* renamed from: m */
    public MenuInflater mo545m() {
        if (this.f393p == null) {
            m572l0();
            ActionBar actionBar = this.f392o;
            this.f393p = new C3439g(actionBar != null ? actionBar.mo411j() : this.f388k);
        }
        return this.f393p;
    }

    /* renamed from: n */
    public ActionBar mo546n() {
        m572l0();
        return this.f392o;
    }

    /* renamed from: o */
    public void mo547o() {
        LayoutInflater from = LayoutInflater.from(this.f388k);
        if (from.getFactory() == null) {
            C3759g.m16092b(from, this);
        } else if (!(from.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return mo528W(view, str, context, attributeSet);
    }

    /* renamed from: p */
    public void mo550p() {
        ActionBar n = mo546n();
        if (n == null || !n.mo413l()) {
            m576p0(0);
        }
    }

    /* renamed from: r */
    public void mo551r(Configuration configuration) {
        ActionBar n;
        if (this.f361G && this.f355A && (n = mo546n()) != null) {
            n.mo414m(configuration);
        }
        C0275f.m1604b().mo1969g(this.f388k);
        m555L(false);
    }

    /* renamed from: r0 */
    public boolean mo552r0() {
        return this.f403z;
    }

    /* renamed from: s */
    public void mo553s(Bundle bundle) {
        this.f370P = true;
        m555L(false);
        m568c0();
        Object obj = this.f387j;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = C0480e.m3010c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                ActionBar D0 = mo513D0();
                if (D0 == null) {
                    this.f383c0 = true;
                } else {
                    D0.mo419r(true);
                }
            }
            C0136e.m726c(this);
        }
        this.f371Q = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s0 */
    public int mo554s0(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        return m570g0(context).mo608c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() != 0) {
                return m571h0(context).mo608c();
            } else {
                return -1;
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo555t() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f387j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.C0136e.m731z(r3)
        L_0x0009:
            boolean r0 = r3.f380Z
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f389l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f382b0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.f372R = r0
            r0 = 1
            r3.f373S = r0
            int r0 = r3.f374T
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f387j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            e.e.g<java.lang.String, java.lang.Integer> r0 = f349g0
            java.lang.Object r1 = r3.f387j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f374T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            e.e.g<java.lang.String, java.lang.Integer> r0 = f349g0
            java.lang.Object r1 = r3.f387j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.ActionBar r0 = r3.f392o
            if (r0 == 0) goto L_0x005e
            r0.mo415n()
        L_0x005e:
            r3.m564R()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.mo555t():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public boolean mo556t0() {
        C3432b bVar = this.f398u;
        if (bVar != null) {
            bVar.mo703c();
            return true;
        }
        ActionBar n = mo546n();
        if (n == null || !n.mo408g()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public void mo557u(Bundle bundle) {
        m567b0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u0 */
    public boolean mo558u0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f369O = z;
        } else if (i == 82) {
            m578v0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public void mo559v() {
        ActionBar n = mo546n();
        if (n != null) {
            n.mo424w(true);
        }
    }

    /* renamed from: w */
    public void mo560w(Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public boolean mo561w0(int i, KeyEvent keyEvent) {
        ActionBar n = mo546n();
        if (n != null && n.mo416o(i, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.f368N;
        if (panelFeatureState == null || !m550E0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.f368N == null) {
                PanelFeatureState i0 = mo540i0(0, true);
                m551F0(i0, keyEvent);
                boolean E0 = m550E0(i0, keyEvent.getKeyCode(), keyEvent, 1);
                i0.f416m = false;
                if (E0) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.f368N;
        if (panelFeatureState2 != null) {
            panelFeatureState2.f417n = true;
        }
        return true;
    }

    /* renamed from: x */
    public void mo562x() {
        this.f372R = true;
        mo521K();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x0 */
    public boolean mo563x0(int i, KeyEvent keyEvent) {
        if (i == 4) {
            boolean z = this.f369O;
            this.f369O = false;
            PanelFeatureState i0 = mo540i0(0, false);
            if (i0 != null && i0.f418o) {
                if (!z) {
                    mo527T(i0, true);
                }
                return true;
            } else if (mo556t0()) {
                return true;
            }
        } else if (i == 82) {
            m579y0(0, keyEvent);
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public void mo564y() {
        this.f372R = false;
        ActionBar n = mo546n();
        if (n != null) {
            n.mo424w(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z0 */
    public void mo565z0(int i) {
        ActionBar n;
        if (i == 108 && (n = mo546n()) != null) {
            n.mo409h(true);
        }
    }

    AppCompatDelegateImpl(Dialog dialog, C0135d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    AppCompatDelegateImpl(Context context, Window window, C0135d dVar) {
        this(context, window, dVar, context);
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegateImpl$k */
    class C0114k extends C3444i {
        C0114k(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final ActionMode mo596b(ActionMode.Callback callback) {
            C3437f.C3438a aVar = new C3437f.C3438a(AppCompatDelegateImpl.this.f388k, callback);
            C3432b J = AppCompatDelegateImpl.this.mo520J(aVar);
            if (J != null) {
                return aVar.mo12194e(J);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.mo530Y(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.mo561w0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof C0171g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl.this.mo565z0(i);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl.this.mo509A0(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0171g gVar = menu instanceof C0171g ? (C0171g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.mo926e0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.mo926e0(false);
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0171g gVar;
            PanelFeatureState i0 = AppCompatDelegateImpl.this.mo540i0(0, true);
            if (i0 == null || (gVar = i0.f413j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (AppCompatDelegateImpl.this.mo552r0()) {
                return mo596b(callback);
            }
            return super.onWindowStartingActionMode(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (!AppCompatDelegateImpl.this.mo552r0() || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return mo596b(callback);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        r3 = f349g0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private AppCompatDelegateImpl(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.C0135d r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f402y = r0
            r0 = 1
            r2.f403z = r0
            r0 = -100
            r2.f374T = r0
            androidx.appcompat.app.AppCompatDelegateImpl$b r1 = new androidx.appcompat.app.AppCompatDelegateImpl$b
            r1.<init>()
            r2.f382b0 = r1
            r2.f388k = r3
            r2.f391n = r5
            r2.f387j = r6
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x002e
            androidx.appcompat.app.AppCompatActivity r3 = r2.m558M0()
            if (r3 == 0) goto L_0x002e
            androidx.appcompat.app.e r3 = r3.mo470Q1()
            int r3 = r3.mo544l()
            r2.f374T = r3
        L_0x002e:
            int r3 = r2.f374T
            if (r3 != r0) goto L_0x0055
            e.e.g<java.lang.String, java.lang.Integer> r3 = f349g0
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0055
            int r5 = r5.intValue()
            r2.f374T = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0055:
            if (r4 == 0) goto L_0x005a
            r2.m559N(r4)
        L_0x005a:
            androidx.appcompat.widget.C0275f.m1606h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.d, java.lang.Object):void");
    }
}
