package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.C0131b;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import p082e.p083a.p086l.p087a.C3425d;

/* renamed from: androidx.appcompat.app.a */
/* compiled from: ActionBarDrawerToggle */
public class C0125a implements DrawerLayout.C0567d {

    /* renamed from: a */
    private final C0127b f449a;

    /* renamed from: b */
    private final DrawerLayout f450b;

    /* renamed from: c */
    private C3425d f451c;

    /* renamed from: d */
    private boolean f452d;

    /* renamed from: e */
    boolean f453e;

    /* renamed from: f */
    private final int f454f;

    /* renamed from: g */
    private final int f455g;

    /* renamed from: h */
    View.OnClickListener f456h;

    /* renamed from: androidx.appcompat.app.a$a */
    /* compiled from: ActionBarDrawerToggle */
    class C0126a implements View.OnClickListener {
        C0126a() {
        }

        public void onClick(View view) {
            C0125a aVar = C0125a.this;
            if (aVar.f453e) {
                aVar.mo622h();
                return;
            }
            View.OnClickListener onClickListener = aVar.f456h;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.a$b */
    /* compiled from: ActionBarDrawerToggle */
    public interface C0127b {
        /* renamed from: a */
        Context mo587a();

        /* renamed from: b */
        Drawable mo588b();

        /* renamed from: c */
        void mo589c(int i);
    }

    /* renamed from: androidx.appcompat.app.a$c */
    /* compiled from: ActionBarDrawerToggle */
    public interface C0128c {
        /* renamed from: N */
        C0127b mo468N();
    }

    /* renamed from: androidx.appcompat.app.a$d */
    /* compiled from: ActionBarDrawerToggle */
    private static class C0129d implements C0127b {

        /* renamed from: a */
        private final Activity f458a;

        /* renamed from: b */
        private C0131b.C0132a f459b;

        C0129d(Activity activity) {
            this.f458a = activity;
        }

        /* renamed from: a */
        public Context mo587a() {
            ActionBar actionBar = this.f458a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f458a;
        }

        /* renamed from: b */
        public Drawable mo588b() {
            if (Build.VERSION.SDK_INT < 18) {
                return C0131b.m698a(this.f458a);
            }
            TypedArray obtainStyledAttributes = mo587a().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        /* renamed from: c */
        public void mo589c(int i) {
            if (Build.VERSION.SDK_INT >= 18) {
                ActionBar actionBar = this.f458a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(i);
                    return;
                }
                return;
            }
            this.f459b = C0131b.m699b(this.f459b, this.f458a, i);
        }
    }

    /* renamed from: androidx.appcompat.app.a$e */
    /* compiled from: ActionBarDrawerToggle */
    static class C0130e implements C0127b {

        /* renamed from: a */
        final Toolbar f460a;

        /* renamed from: b */
        final Drawable f461b;

        /* renamed from: c */
        final CharSequence f462c;

        C0130e(Toolbar toolbar) {
            this.f460a = toolbar;
            this.f461b = toolbar.getNavigationIcon();
            this.f462c = toolbar.getNavigationContentDescription();
        }

        /* renamed from: a */
        public Context mo587a() {
            return this.f460a.getContext();
        }

        /* renamed from: b */
        public Drawable mo588b() {
            return this.f461b;
        }

        /* renamed from: c */
        public void mo589c(int i) {
            if (i == 0) {
                this.f460a.setNavigationContentDescription(this.f462c);
            } else {
                this.f460a.setNavigationContentDescription(i);
            }
        }
    }

    public C0125a(Activity activity, DrawerLayout drawerLayout, int i, int i2) {
        this(activity, (Toolbar) null, drawerLayout, (C3425d) null, i, i2);
    }

    /* renamed from: g */
    private void m680g(float f) {
        if (f == 1.0f) {
            this.f451c.mo12147g(true);
        } else if (f == 0.0f) {
            this.f451c.mo12147g(false);
        }
        this.f451c.mo12145e(f);
    }

    /* renamed from: a */
    public void mo616a(View view) {
        m680g(1.0f);
        if (this.f453e) {
            mo621f(this.f455g);
        }
    }

    /* renamed from: b */
    public void mo617b(View view) {
        m680g(0.0f);
        if (this.f453e) {
            mo621f(this.f454f);
        }
    }

    /* renamed from: c */
    public void mo618c(int i) {
    }

    /* renamed from: d */
    public void mo619d(View view, float f) {
        if (this.f452d) {
            m680g(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            m680g(0.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Drawable mo620e() {
        return this.f449a.mo588b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo621f(int i) {
        this.f449a.mo589c(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo622h() {
        int q = this.f450b.mo3532q(8388611);
        if (this.f450b.mo3482E(8388611) && q != 2) {
            this.f450b.mo3501d(8388611);
        } else if (q != 1) {
            this.f450b.mo3485J(8388611);
        }
    }

    C0125a(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C3425d dVar, int i, int i2) {
        this.f452d = true;
        this.f453e = true;
        if (toolbar != null) {
            this.f449a = new C0130e(toolbar);
            toolbar.setNavigationOnClickListener(new C0126a());
        } else if (activity instanceof C0128c) {
            this.f449a = ((C0128c) activity).mo468N();
        } else {
            this.f449a = new C0129d(activity);
        }
        this.f450b = drawerLayout;
        this.f454f = i;
        this.f455g = i2;
        if (dVar == null) {
            this.f451c = new C3425d(this.f449a.mo587a());
        } else {
            this.f451c = dVar;
        }
        mo620e();
    }
}
