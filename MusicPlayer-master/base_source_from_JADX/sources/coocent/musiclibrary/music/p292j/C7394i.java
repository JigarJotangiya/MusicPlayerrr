package coocent.musiclibrary.music.p292j;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* renamed from: coocent.musiclibrary.music.j.i */
/* compiled from: SystemBarTintManager */
public class C7394i {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static String f32490f;

    /* renamed from: a */
    private final C7396b f32491a;

    /* renamed from: b */
    private boolean f32492b;

    /* renamed from: c */
    private boolean f32493c;

    /* renamed from: d */
    private View f32494d;

    /* renamed from: e */
    private View f32495e;

    /* renamed from: coocent.musiclibrary.music.j.i$b */
    /* compiled from: SystemBarTintManager */
    public static class C7396b {

        /* renamed from: a */
        private final boolean f32496a;

        /* renamed from: b */
        private final int f32497b;

        /* renamed from: c */
        private final int f32498c;

        /* renamed from: d */
        private final boolean f32499d;

        /* renamed from: e */
        private final int f32500e;

        /* renamed from: f */
        private final int f32501f;

        /* renamed from: g */
        private final boolean f32502g;

        /* renamed from: h */
        private final float f32503h;

        @TargetApi(14)
        /* renamed from: a */
        private int m41719a(Context context) {
            if (Build.VERSION.SDK_INT < 14) {
                return 0;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843499, typedValue, true);
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }

        /* renamed from: b */
        private int m41720b(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        @TargetApi(14)
        /* renamed from: d */
        private int m41721d(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || !m41724j(context)) {
                return 0;
            }
            return m41720b(resources, this.f32502g ? "navigation_bar_height" : "navigation_bar_height_landscape");
        }

        @TargetApi(14)
        /* renamed from: f */
        private int m41722f(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || !m41724j(context)) {
                return 0;
            }
            return m41720b(resources, "navigation_bar_width");
        }

        @SuppressLint({"NewApi"})
        /* renamed from: h */
        private float m41723h(Activity activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (Build.VERSION.SDK_INT >= 16) {
                activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            } else {
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            }
            float f = displayMetrics.density;
            return Math.min(((float) displayMetrics.widthPixels) / f, ((float) displayMetrics.heightPixels) / f);
        }

        @TargetApi(14)
        /* renamed from: j */
        private boolean m41724j(Context context) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier == 0) {
                return !ViewConfiguration.get(context).hasPermanentMenuKey();
            }
            boolean z = resources.getBoolean(identifier);
            if ("1".equals(C7394i.f32490f)) {
                return false;
            }
            if ("0".equals(C7394i.f32490f)) {
                return true;
            }
            return z;
        }

        /* renamed from: c */
        public int mo28200c() {
            return this.f32500e;
        }

        /* renamed from: e */
        public int mo28201e() {
            return this.f32501f;
        }

        /* renamed from: g */
        public int mo28202g(boolean z) {
            int i = 0;
            int i2 = this.f32496a ? this.f32497b : 0;
            if (z) {
                i = this.f32498c;
            }
            return i2 + i;
        }

        /* renamed from: i */
        public int mo28203i() {
            return this.f32497b;
        }

        /* renamed from: k */
        public boolean mo28204k() {
            return this.f32499d;
        }

        /* renamed from: l */
        public boolean mo28205l() {
            return this.f32503h >= 600.0f || this.f32502g;
        }

        private C7396b(Activity activity, boolean z, boolean z2) {
            Resources resources = activity.getResources();
            boolean z3 = false;
            this.f32502g = resources.getConfiguration().orientation == 1;
            this.f32503h = m41723h(activity);
            this.f32497b = m41720b(resources, "status_bar_height");
            this.f32498c = m41719a(activity);
            int d = m41721d(activity);
            this.f32500e = d;
            this.f32501f = m41722f(activity);
            this.f32499d = d > 0 ? true : z3;
            this.f32496a = z;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class});
                declaredMethod.setAccessible(true);
                f32490f = (String) declaredMethod.invoke((Object) null, new Object[]{"qemu.hw.mainkeys"});
            } catch (Throwable unused) {
                f32490f = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @TargetApi(19)
    public C7394i(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        if (Build.VERSION.SDK_INT >= 19) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.f32492b = obtainStyledAttributes.getBoolean(0, false);
                this.f32493c = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                int i = window.getAttributes().flags;
                if ((67108864 & i) != 0) {
                    this.f32492b = true;
                }
                if ((i & 134217728) != 0) {
                    this.f32493c = true;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        C7396b bVar = new C7396b(activity, this.f32492b, this.f32493c);
        this.f32491a = bVar;
        if (!bVar.mo28204k()) {
            this.f32493c = false;
        }
        if (this.f32492b) {
            m41715f(activity, viewGroup);
        }
        if (this.f32493c) {
            m41714e(activity, viewGroup);
        }
    }

    /* renamed from: e */
    private void m41714e(Context context, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        this.f32495e = new View(context);
        if (this.f32491a.mo28205l()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.f32491a.mo28200c());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f32491a.mo28201e(), -1);
            layoutParams.gravity = 5;
        }
        this.f32495e.setLayoutParams(layoutParams);
        this.f32495e.setBackgroundColor(-1728053248);
        this.f32495e.setVisibility(8);
        viewGroup.addView(this.f32495e);
    }

    /* renamed from: f */
    private void m41715f(Context context, ViewGroup viewGroup) {
        this.f32494d = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f32491a.mo28203i());
        layoutParams.gravity = 48;
        if (this.f32493c && !this.f32491a.mo28205l()) {
            layoutParams.rightMargin = this.f32491a.mo28201e();
        }
        this.f32494d.setLayoutParams(layoutParams);
        this.f32494d.setBackgroundColor(-1728053248);
        this.f32494d.setVisibility(8);
        viewGroup.addView(this.f32494d);
    }

    /* renamed from: b */
    public C7396b mo28197b() {
        return this.f32491a;
    }

    /* renamed from: c */
    public void mo28198c(int i) {
        if (this.f32492b) {
            this.f32494d.setBackgroundColor(i);
        }
    }

    /* renamed from: d */
    public void mo28199d(boolean z) {
        if (this.f32492b) {
            this.f32494d.setVisibility(z ? 0 : 8);
        }
    }
}
