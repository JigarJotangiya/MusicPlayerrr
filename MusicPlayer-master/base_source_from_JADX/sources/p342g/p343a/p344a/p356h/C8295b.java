package p342g.p343a.p344a.p356h;

import android.animation.Animator;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import media.musicplayer.audioplayer.videoplayer.R;

/* renamed from: g.a.a.h.b */
/* compiled from: BasePopupWindow */
public abstract class C8295b implements C8294a, PopupWindow.OnDismissListener, C8304d {

    /* renamed from: A */
    private boolean f34692A;

    /* renamed from: B */
    private int f34693B;

    /* renamed from: C */
    private Animator.AnimatorListener f34694C = new C8298c();

    /* renamed from: D */
    private Animation.AnimationListener f34695D = new C8299d();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C8305e f34696g;

    /* renamed from: h */
    private View f34697h;

    /* renamed from: i */
    private Activity f34698i;

    /* renamed from: j */
    protected View f34699j;

    /* renamed from: k */
    protected View f34700k;

    /* renamed from: l */
    private boolean f34701l = false;

    /* renamed from: m */
    private C8301f f34702m;

    /* renamed from: n */
    private C8300e f34703n;

    /* renamed from: o */
    private Animation f34704o;

    /* renamed from: p */
    private Animator f34705p;

    /* renamed from: q */
    private Animation f34706q;

    /* renamed from: r */
    private Animator f34707r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f34708s = false;

    /* renamed from: t */
    private int f34709t = 0;

    /* renamed from: u */
    private int f34710u;

    /* renamed from: v */
    private int f34711v;

    /* renamed from: w */
    private int f34712w;

    /* renamed from: x */
    private int f34713x;

    /* renamed from: y */
    private int[] f34714y;

    /* renamed from: z */
    private boolean f34715z;

    /* renamed from: g.a.a.h.b$a */
    /* compiled from: BasePopupWindow */
    class C8296a implements View.OnClickListener {
        C8296a() {
        }

        public void onClick(View view) {
            C8295b.this.mo30018u();
        }
    }

    /* renamed from: g.a.a.h.b$b */
    /* compiled from: BasePopupWindow */
    class C8297b implements View.OnClickListener {
        C8297b(C8295b bVar) {
        }

        public void onClick(View view) {
        }
    }

    /* renamed from: g.a.a.h.b$c */
    /* compiled from: BasePopupWindow */
    class C8298c implements Animator.AnimatorListener {
        C8298c() {
        }

        public void onAnimationCancel(Animator animator) {
            boolean unused = C8295b.this.f34708s = false;
        }

        public void onAnimationEnd(Animator animator) {
            C8295b.this.f34696g.mo30036a();
            boolean unused = C8295b.this.f34708s = false;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            boolean unused = C8295b.this.f34708s = true;
        }
    }

    /* renamed from: g.a.a.h.b$d */
    /* compiled from: BasePopupWindow */
    class C8299d implements Animation.AnimationListener {
        C8299d() {
        }

        public void onAnimationEnd(Animation animation) {
            C8295b.this.f34696g.mo30036a();
            boolean unused = C8295b.this.f34708s = false;
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            boolean unused = C8295b.this.f34708s = true;
        }
    }

    /* renamed from: g.a.a.h.b$e */
    /* compiled from: BasePopupWindow */
    public interface C8300e {
        /* renamed from: a */
        boolean mo30033a(View view, View view2, boolean z);
    }

    /* renamed from: g.a.a.h.b$f */
    /* compiled from: BasePopupWindow */
    public static abstract class C8301f implements PopupWindow.OnDismissListener {
        /* renamed from: a */
        public abstract boolean mo30034a();
    }

    public C8295b(Activity activity, int i, int i2) {
        m45892J(activity, i, i2);
    }

    /* renamed from: J */
    private void m45892J(Activity activity, int i, int i2) {
        this.f34698i = activity;
        this.f34697h = mo29994f();
        View b = mo29993b();
        this.f34699j = b;
        if (b != null) {
            this.f34693B = b.getId();
        }
        m45900s();
        C8305e eVar = new C8305e(this.f34697h, i, i2, this);
        this.f34696g = eVar;
        eVar.setOnDismissListener(this);
        boolean z = true;
        mo30005M(true);
        m45893K(i, i2);
        if (Build.VERSION.SDK_INT > 22) {
            z = false;
        }
        mo30006N(z);
        View w = mo30020w();
        this.f34700k = w;
        if (w != null && !(w instanceof AdapterView)) {
            w.setOnClickListener(new C8296a());
        }
        View view = this.f34699j;
        if (view != null && !(view instanceof AdapterView)) {
            view.setOnClickListener(new C8297b(this));
        }
        this.f34704o = mo30002H();
        this.f34705p = mo30003I();
        this.f34706q = mo30000F();
        this.f34707r = mo30001G();
        this.f34714y = new int[2];
    }

    /* renamed from: K */
    private void m45893K(int i, int i2) {
        View view = this.f34697h;
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 18) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int i3 = -2;
                if (layoutParams == null || layoutParams.height != -2) {
                    i3 = -1;
                }
                this.f34697h.setLayoutParams(new ViewGroup.LayoutParams(-1, i3));
            }
            this.f34697h.measure(i, i2);
            this.f34712w = this.f34697h.getMeasuredWidth();
            this.f34713x = this.f34697h.getMeasuredHeight();
            this.f34697h.setFocusableInTouchMode(true);
        }
    }

    /* renamed from: V */
    private void m45894V(View view) {
        Animator animator;
        View view2;
        if (view != null) {
            try {
                int[] p = m45897p(view);
                if (this.f34692A) {
                    this.f34696g.showAsDropDown(view, p[0], p[1]);
                } else {
                    this.f34696g.showAtLocation(view, this.f34709t, p[0], p[1]);
                }
            } catch (Exception e) {
                Log.e("BasePopupWindow", "show error");
                e.printStackTrace();
                return;
            }
        } else {
            this.f34696g.showAtLocation(this.f34698i.findViewById(16908290), this.f34709t, this.f34710u, this.f34711v);
        }
        if (!(this.f34704o == null || (view2 = this.f34699j) == null)) {
            view2.clearAnimation();
            this.f34699j.startAnimation(this.f34704o);
        }
        if (!(this.f34704o != null || (animator = this.f34705p) == null || this.f34699j == null)) {
            animator.start();
        }
        if (this.f34701l && mo29995A() != null) {
            mo29995A().requestFocus();
            C8302c.m45932b(mo29995A(), 150);
        }
    }

    /* renamed from: p */
    private int[] m45897p(View view) {
        boolean z = false;
        int[] iArr = {this.f34710u, this.f34711v};
        view.getLocationOnScreen(this.f34714y);
        if (this.f34715z) {
            if (mo29998D() - (this.f34714y[1] + iArr[1]) < mo30023z()) {
                z = true;
            }
            if (z) {
                iArr[1] = ((-view.getHeight()) - mo30023z()) - (iArr[1] * 3);
                mo30012T(this.f34697h);
            } else {
                mo30011S(this.f34697h);
            }
        }
        return iArr;
    }

    /* renamed from: q */
    private boolean m45898q() {
        C8301f fVar = this.f34702m;
        if (!(fVar != null ? fVar.mo30034a() : true) || this.f34708s) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private boolean m45899r(View view) {
        C8300e eVar = this.f34703n;
        boolean z = true;
        if (eVar == null) {
            return true;
        }
        View view2 = this.f34697h;
        if (this.f34704o == null && this.f34705p == null) {
            z = false;
        }
        return eVar.mo30033a(view2, view, z);
    }

    /* renamed from: s */
    private void m45900s() {
        View view;
        View view2 = this.f34697h;
        if (view2 != null && (view = this.f34699j) != null && view2 == view) {
            try {
                FrameLayout frameLayout = new FrameLayout(mo30021x());
                this.f34697h = frameLayout;
                if (this.f34693B == 0) {
                    frameLayout.addView(this.f34699j);
                } else {
                    this.f34699j = View.inflate(mo30021x(), this.f34693B, (FrameLayout) this.f34697h);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: A */
    public EditText mo29995A() {
        return null;
    }

    /* renamed from: B */
    public View mo29996B() {
        return this.f34697h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public Animation mo29997C(float f, float f2, float f3, float f4, int i, float f5, int i2, float f6) {
        return C8306f.m45939b(f, f2, f3, f4, i, f5, i2, f6);
    }

    /* renamed from: D */
    public int mo29998D() {
        return mo30021x().getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: E */
    public int mo29999E() {
        int width = this.f34697h.getWidth();
        return width <= 0 ? this.f34712w : width;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public Animation mo30000F() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public Animator mo30001G() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract Animation mo30002H();

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract Animator mo30003I();

    /* renamed from: L */
    public void mo30004L(boolean z) {
        mo30010R(true);
        this.f34715z = z;
    }

    /* renamed from: M */
    public void mo30005M(boolean z) {
        if (z) {
            this.f34696g.setFocusable(true);
            this.f34696g.setOutsideTouchable(true);
            this.f34696g.setBackgroundDrawable(new ColorDrawable());
            return;
        }
        this.f34696g.setFocusable(false);
        this.f34696g.setOutsideTouchable(false);
        this.f34696g.setBackgroundDrawable((Drawable) null);
    }

    /* renamed from: N */
    public void mo30006N(boolean z) {
        mo30009Q(z ? R.style.PopupAnimaFade : 0);
    }

    /* renamed from: O */
    public void mo30007O(int i) {
        this.f34710u = i;
    }

    /* renamed from: P */
    public void mo30008P(int i) {
        this.f34711v = i;
    }

    /* renamed from: Q */
    public void mo30009Q(int i) {
        this.f34696g.setAnimationStyle(i);
        this.f34696g.update();
    }

    /* renamed from: R */
    public void mo30010R(boolean z) {
        this.f34692A = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public void mo30011S(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public void mo30012T(View view) {
    }

    /* renamed from: U */
    public void mo30013U(View view) {
        if (m45899r(view)) {
            this.f34692A = true;
            m45894V(view);
        }
    }

    /* renamed from: a */
    public boolean mo30014a() {
        return m45898q();
    }

    /* renamed from: d */
    public boolean mo30015d() {
        boolean z;
        Animation animation = this.f34706q;
        if (animation == null || this.f34699j == null) {
            Animator animator = this.f34707r;
            if (animator != null && !this.f34708s) {
                animator.removeListener(this.f34694C);
                this.f34707r.addListener(this.f34694C);
                this.f34707r.start();
                this.f34708s = true;
            }
            z = false;
            return !z;
        }
        if (!this.f34708s) {
            animation.setAnimationListener(this.f34695D);
            this.f34699j.clearAnimation();
            this.f34699j.startAnimation(this.f34706q);
            this.f34708s = true;
        }
        z = false;
        return !z;
        z = true;
        return !z;
    }

    public void onDismiss() {
        C8301f fVar = this.f34702m;
        if (fVar != null) {
            fVar.onDismiss();
        }
        this.f34708s = false;
    }

    /* renamed from: t */
    public View mo30017t(int i) {
        if (i == 0) {
            return null;
        }
        this.f34693B = i;
        return LayoutInflater.from(this.f34698i).inflate(i, (ViewGroup) null);
    }

    /* renamed from: u */
    public void mo30018u() {
        try {
            this.f34696g.dismiss();
        } catch (Exception unused) {
            Log.e("BasePopupWindow", "dismiss error");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public View mo30019v(int i) {
        View view = this.f34697h;
        if (view == null || i == 0) {
            return null;
        }
        return view.findViewById(i);
    }

    /* renamed from: w */
    public abstract View mo30020w();

    /* renamed from: x */
    public Activity mo30021x() {
        return this.f34698i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Animation mo30022y() {
        return C8306f.m45938a();
    }

    /* renamed from: z */
    public int mo30023z() {
        int height = this.f34697h.getHeight();
        return height <= 0 ? this.f34713x : height;
    }
}
