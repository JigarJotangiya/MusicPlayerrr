package p159f.p166c.p181e.p182a.p190b.p197l;

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

/* renamed from: f.c.e.a.b.l.d */
/* compiled from: SystemBarTintManager */
public class C4478d {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static String f13065f;

    /* renamed from: a */
    private final C4480b f13066a;

    /* renamed from: b */
    private boolean f13067b;

    /* renamed from: c */
    private boolean f13068c;

    /* renamed from: d */
    private View f13069d;

    /* renamed from: e */
    private View f13070e;

    /* renamed from: f.c.e.a.b.l.d$b */
    /* compiled from: SystemBarTintManager */
    public static class C4480b {

        /* renamed from: a */
        private final boolean f13071a;

        /* renamed from: b */
        private final int f13072b;

        /* renamed from: c */
        private final int f13073c;

        /* renamed from: d */
        private final boolean f13074d;

        /* renamed from: e */
        private final int f13075e;

        /* renamed from: f */
        private final int f13076f;

        /* renamed from: g */
        private final boolean f13077g;

        /* renamed from: h */
        private final float f13078h;

        @TargetApi(14)
        /* renamed from: a */
        private int m19665a(Context context) {
            if (Build.VERSION.SDK_INT < 14) {
                return 0;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843499, typedValue, true);
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }

        /* renamed from: b */
        private int m19666b(Resources resources, String str) {
            int identifier = resources.getIdentifier(str, "dimen", "android");
            if (identifier > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
            return 0;
        }

        @TargetApi(14)
        /* renamed from: d */
        private int m19667d(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || !m19670j(context)) {
                return 0;
            }
            return m19666b(resources, this.f13077g ? "navigation_bar_height" : "navigation_bar_height_landscape");
        }

        @TargetApi(14)
        /* renamed from: f */
        private int m19668f(Context context) {
            Resources resources = context.getResources();
            if (Build.VERSION.SDK_INT < 14 || !m19670j(context)) {
                return 0;
            }
            return m19666b(resources, "navigation_bar_width");
        }

        @SuppressLint({"NewApi"})
        /* renamed from: h */
        private float m19669h(Activity activity) {
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
        private boolean m19670j(Context context) {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier == 0) {
                return !ViewConfiguration.get(context).hasPermanentMenuKey();
            }
            boolean z = resources.getBoolean(identifier);
            if ("1".equals(C4478d.f13065f)) {
                return false;
            }
            if ("0".equals(C4478d.f13065f)) {
                return true;
            }
            return z;
        }

        /* renamed from: c */
        public int mo15183c() {
            return this.f13075e;
        }

        /* renamed from: e */
        public int mo15184e() {
            return this.f13076f;
        }

        /* renamed from: g */
        public int mo15185g(boolean z) {
            int i = 0;
            int i2 = this.f13071a ? this.f13072b : 0;
            if (z) {
                i = this.f13073c;
            }
            return i2 + i;
        }

        /* renamed from: i */
        public int mo15186i() {
            return this.f13072b;
        }

        /* renamed from: k */
        public boolean mo15187k() {
            return this.f13074d;
        }

        /* renamed from: l */
        public boolean mo15188l() {
            return this.f13078h >= 600.0f || this.f13077g;
        }

        private C4480b(Activity activity, boolean z, boolean z2) {
            Resources resources = activity.getResources();
            boolean z3 = false;
            this.f13077g = resources.getConfiguration().orientation == 1;
            this.f13078h = m19669h(activity);
            this.f13072b = m19666b(resources, "status_bar_height");
            this.f13073c = m19665a(activity);
            int d = m19667d(activity);
            this.f13075e = d;
            this.f13076f = m19668f(activity);
            this.f13074d = d > 0 ? true : z3;
            this.f13071a = z;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class});
                declaredMethod.setAccessible(true);
                f13065f = (String) declaredMethod.invoke((Object) null, new Object[]{"qemu.hw.mainkeys"});
            } catch (Throwable unused) {
                f13065f = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    @TargetApi(19)
    public C4478d(Activity activity) {
        Window window = activity.getWindow();
        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
        if (Build.VERSION.SDK_INT >= 19) {
            TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(new int[]{16843759, 16843760});
            try {
                this.f13067b = obtainStyledAttributes.getBoolean(0, false);
                this.f13068c = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                int i = window.getAttributes().flags;
                if ((67108864 & i) != 0) {
                    this.f13067b = true;
                }
                if ((i & 134217728) != 0) {
                    this.f13068c = true;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        C4480b bVar = new C4480b(activity, this.f13067b, this.f13068c);
        this.f13066a = bVar;
        if (!bVar.mo15187k()) {
            this.f13068c = false;
        }
        if (this.f13067b) {
            m19661f(activity, viewGroup);
        }
        if (this.f13068c) {
            m19660e(activity, viewGroup);
        }
    }

    /* renamed from: e */
    private void m19660e(Context context, ViewGroup viewGroup) {
        FrameLayout.LayoutParams layoutParams;
        this.f13070e = new View(context);
        if (this.f13066a.mo15188l()) {
            layoutParams = new FrameLayout.LayoutParams(-1, this.f13066a.mo15183c());
            layoutParams.gravity = 80;
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.f13066a.mo15184e(), -1);
            layoutParams.gravity = 5;
        }
        this.f13070e.setLayoutParams(layoutParams);
        this.f13070e.setBackgroundColor(-1728053248);
        this.f13070e.setVisibility(8);
        viewGroup.addView(this.f13070e);
    }

    /* renamed from: f */
    private void m19661f(Context context, ViewGroup viewGroup) {
        this.f13069d = new View(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f13066a.mo15186i());
        layoutParams.gravity = 48;
        if (this.f13068c && !this.f13066a.mo15188l()) {
            layoutParams.rightMargin = this.f13066a.mo15184e();
        }
        this.f13069d.setLayoutParams(layoutParams);
        this.f13069d.setBackgroundColor(-1728053248);
        this.f13069d.setVisibility(8);
        viewGroup.addView(this.f13069d);
    }

    /* renamed from: b */
    public C4480b mo15180b() {
        return this.f13066a;
    }

    /* renamed from: c */
    public void mo15181c(int i) {
        if (this.f13067b) {
            this.f13069d.setBackgroundColor(i);
        }
    }

    /* renamed from: d */
    public void mo15182d(boolean z) {
        if (this.f13067b) {
            this.f13069d.setVisibility(z ? 0 : 8);
        }
    }
}
