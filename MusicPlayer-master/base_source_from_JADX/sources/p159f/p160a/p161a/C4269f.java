package p159f.p160a.p161a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.p003d.C0524f;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.C1435c;
import com.afollestad.materialdialogs.internal.C1436d;
import com.afollestad.materialdialogs.internal.MDButton;
import com.afollestad.materialdialogs.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p159f.p160a.p161a.C4260a;
import p159f.p160a.p161a.p163r.C4297a;
import p159f.p160a.p161a.p163r.C4300b;
import p159f.p160a.p161a.p163r.C4301c;

/* renamed from: f.a.a.f */
/* compiled from: MaterialDialog */
public class C4269f extends C4265c implements View.OnClickListener, C4260a.C4263c {

    /* renamed from: i */
    protected final C4274d f12735i;

    /* renamed from: j */
    protected ImageView f12736j;

    /* renamed from: k */
    protected TextView f12737k;

    /* renamed from: l */
    protected TextView f12738l;

    /* renamed from: m */
    EditText f12739m;

    /* renamed from: n */
    RecyclerView f12740n;

    /* renamed from: o */
    View f12741o;

    /* renamed from: p */
    FrameLayout f12742p;

    /* renamed from: q */
    ProgressBar f12743q;

    /* renamed from: r */
    TextView f12744r;

    /* renamed from: s */
    TextView f12745s;

    /* renamed from: t */
    TextView f12746t;

    /* renamed from: u */
    CheckBox f12747u;

    /* renamed from: v */
    MDButton f12748v;

    /* renamed from: w */
    MDButton f12749w;

    /* renamed from: x */
    MDButton f12750x;

    /* renamed from: y */
    C4282l f12751y;

    /* renamed from: z */
    List<Integer> f12752z;

    /* renamed from: f.a.a.f$a */
    /* compiled from: MaterialDialog */
    class C4270a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: f.a.a.f$a$a */
        /* compiled from: MaterialDialog */
        class C4271a implements Runnable {

            /* renamed from: g */
            final /* synthetic */ int f12754g;

            C4271a(int i) {
                this.f12754g = i;
            }

            public void run() {
                C4269f.this.f12740n.requestFocus();
                C4269f.this.f12735i.f12798Y.mo4507y1(this.f12754g);
            }
        }

        C4270a() {
        }

        public void onGlobalLayout() {
            int i;
            if (Build.VERSION.SDK_INT < 16) {
                C4269f.this.f12740n.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            } else {
                C4269f.this.f12740n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
            C4269f fVar = C4269f.this;
            C4282l lVar = fVar.f12751y;
            C4282l lVar2 = C4282l.SINGLE;
            if (lVar == lVar2 || lVar == C4282l.MULTI) {
                if (lVar == lVar2) {
                    i = fVar.f12735i.f12787O;
                    if (i < 0) {
                        return;
                    }
                } else {
                    List<Integer> list = fVar.f12752z;
                    if (list != null && list.size() != 0) {
                        Collections.sort(C4269f.this.f12752z);
                        i = C4269f.this.f12752z.get(0).intValue();
                    } else {
                        return;
                    }
                }
                C4269f.this.f12740n.post(new C4271a(i));
            }
        }
    }

    /* renamed from: f.a.a.f$b */
    /* compiled from: MaterialDialog */
    class C4272b implements TextWatcher {
        C4272b() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int length = charSequence.toString().length();
            C4269f fVar = C4269f.this;
            boolean z = false;
            if (!fVar.f12735i.f12831p0) {
                if (length == 0) {
                    z = true;
                }
                fVar.mo14594n(C4264b.POSITIVE).setEnabled(!z);
            }
            C4269f.this.mo14604t(length, z);
            C4269f fVar2 = C4269f.this;
            C4274d dVar = fVar2.f12735i;
            if (dVar.f12835r0) {
                dVar.f12829o0.mo14656a(fVar2, charSequence);
            }
        }
    }

    /* renamed from: f.a.a.f$c */
    /* compiled from: MaterialDialog */
    static /* synthetic */ class C4273c {

        /* renamed from: a */
        static final /* synthetic */ int[] f12757a;

        /* renamed from: b */
        static final /* synthetic */ int[] f12758b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                f.a.a.f$l[] r0 = p159f.p160a.p161a.C4269f.C4282l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12758b = r0
                r1 = 1
                f.a.a.f$l r2 = p159f.p160a.p161a.C4269f.C4282l.REGULAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f12758b     // Catch:{ NoSuchFieldError -> 0x001d }
                f.a.a.f$l r3 = p159f.p160a.p161a.C4269f.C4282l.SINGLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f12758b     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.a.a.f$l r4 = p159f.p160a.p161a.C4269f.C4282l.MULTI     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                f.a.a.b[] r3 = p159f.p160a.p161a.C4264b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f12757a = r3
                f.a.a.b r4 = p159f.p160a.p161a.C4264b.NEUTRAL     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f12757a     // Catch:{ NoSuchFieldError -> 0x0043 }
                f.a.a.b r3 = p159f.p160a.p161a.C4264b.NEGATIVE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f12757a     // Catch:{ NoSuchFieldError -> 0x004d }
                f.a.a.b r1 = p159f.p160a.p161a.C4264b.POSITIVE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p160a.p161a.C4269f.C4273c.<clinit>():void");
        }
    }

    /* renamed from: f.a.a.f$d */
    /* compiled from: MaterialDialog */
    public static class C4274d {

        /* renamed from: A */
        protected C4283m f12759A;

        /* renamed from: A0 */
        protected NumberFormat f12760A0;

        /* renamed from: B */
        protected C4283m f12761B;

        /* renamed from: B0 */
        protected boolean f12762B0;

        /* renamed from: C */
        protected C4283m f12763C;

        /* renamed from: C0 */
        protected boolean f12764C0;

        /* renamed from: D */
        protected C4283m f12765D;

        /* renamed from: D0 */
        protected boolean f12766D0;

        /* renamed from: E */
        protected C4278h f12767E;

        /* renamed from: E0 */
        protected boolean f12768E0;

        /* renamed from: F */
        protected C4281k f12769F;

        /* renamed from: F0 */
        protected boolean f12770F0;

        /* renamed from: G */
        protected C4280j f12771G;

        /* renamed from: G0 */
        protected boolean f12772G0;

        /* renamed from: H */
        protected C4279i f12773H;

        /* renamed from: H0 */
        protected boolean f12774H0;

        /* renamed from: I */
        protected boolean f12775I;

        /* renamed from: I0 */
        protected boolean f12776I0;

        /* renamed from: J */
        protected boolean f12777J;

        /* renamed from: J0 */
        protected boolean f12778J0;

        /* renamed from: K */
        protected C4293p f12779K;

        /* renamed from: K0 */
        protected int f12780K0;

        /* renamed from: L */
        protected boolean f12781L;

        /* renamed from: L0 */
        protected int f12782L0;

        /* renamed from: M */
        protected boolean f12783M;

        /* renamed from: M0 */
        protected int f12784M0;

        /* renamed from: N */
        protected float f12785N;

        /* renamed from: N0 */
        protected int f12786N0;

        /* renamed from: O */
        protected int f12787O;

        /* renamed from: O0 */
        protected int f12788O0;

        /* renamed from: P */
        protected Integer[] f12789P;

        /* renamed from: Q */
        protected Integer[] f12790Q;

        /* renamed from: R */
        protected boolean f12791R;

        /* renamed from: S */
        protected Typeface f12792S;

        /* renamed from: T */
        protected Typeface f12793T;

        /* renamed from: U */
        protected Drawable f12794U;

        /* renamed from: V */
        protected boolean f12795V;

        /* renamed from: W */
        protected int f12796W;

        /* renamed from: X */
        protected RecyclerView.C0797h<?> f12797X;

        /* renamed from: Y */
        protected RecyclerView.C0809p f12798Y;

        /* renamed from: Z */
        protected DialogInterface.OnDismissListener f12799Z;

        /* renamed from: a */
        protected final Context f12800a;

        /* renamed from: a0 */
        protected DialogInterface.OnCancelListener f12801a0;

        /* renamed from: b */
        protected CharSequence f12802b;

        /* renamed from: b0 */
        protected DialogInterface.OnKeyListener f12803b0;

        /* renamed from: c */
        protected C4267e f12804c;

        /* renamed from: c0 */
        protected DialogInterface.OnShowListener f12805c0;

        /* renamed from: d */
        protected C4267e f12806d;

        /* renamed from: d0 */
        protected C4292o f12807d0;

        /* renamed from: e */
        protected C4267e f12808e = C4267e.END;

        /* renamed from: e0 */
        protected boolean f12809e0;

        /* renamed from: f */
        protected C4267e f12810f;

        /* renamed from: f0 */
        protected int f12811f0;

        /* renamed from: g */
        protected C4267e f12812g;

        /* renamed from: g0 */
        protected int f12813g0;

        /* renamed from: h */
        protected int f12814h;

        /* renamed from: h0 */
        protected int f12815h0;

        /* renamed from: i */
        protected int f12816i;

        /* renamed from: i0 */
        protected boolean f12817i0;

        /* renamed from: j */
        protected int f12818j;

        /* renamed from: j0 */
        protected boolean f12819j0;

        /* renamed from: k */
        protected CharSequence f12820k;

        /* renamed from: k0 */
        protected int f12821k0;

        /* renamed from: l */
        protected ArrayList<CharSequence> f12822l;

        /* renamed from: l0 */
        protected int f12823l0;

        /* renamed from: m */
        protected CharSequence f12824m;

        /* renamed from: m0 */
        protected CharSequence f12825m0;

        /* renamed from: n */
        protected CharSequence f12826n;

        /* renamed from: n0 */
        protected CharSequence f12827n0;

        /* renamed from: o */
        protected CharSequence f12828o;

        /* renamed from: o0 */
        protected C4277g f12829o0;

        /* renamed from: p */
        protected boolean f12830p;

        /* renamed from: p0 */
        protected boolean f12831p0;

        /* renamed from: q */
        protected boolean f12832q;

        /* renamed from: q0 */
        protected int f12833q0;

        /* renamed from: r */
        protected boolean f12834r;

        /* renamed from: r0 */
        protected boolean f12835r0;

        /* renamed from: s */
        protected View f12836s;

        /* renamed from: s0 */
        protected int f12837s0;

        /* renamed from: t */
        protected int f12838t;

        /* renamed from: t0 */
        protected int f12839t0;

        /* renamed from: u */
        protected ColorStateList f12840u;

        /* renamed from: u0 */
        protected int f12841u0;

        /* renamed from: v */
        protected ColorStateList f12842v;

        /* renamed from: v0 */
        protected int[] f12843v0;

        /* renamed from: w */
        protected ColorStateList f12844w;

        /* renamed from: w0 */
        protected CharSequence f12845w0;

        /* renamed from: x */
        protected ColorStateList f12846x;

        /* renamed from: x0 */
        protected boolean f12847x0;

        /* renamed from: y */
        protected ColorStateList f12848y;

        /* renamed from: y0 */
        protected CompoundButton.OnCheckedChangeListener f12849y0;

        /* renamed from: z */
        protected C4275e f12850z;

        /* renamed from: z0 */
        protected String f12851z0;

        public C4274d(Context context) {
            C4267e eVar = C4267e.START;
            this.f12804c = eVar;
            this.f12806d = eVar;
            this.f12810f = eVar;
            this.f12812g = eVar;
            this.f12814h = 0;
            this.f12816i = -1;
            this.f12818j = -1;
            this.f12775I = false;
            this.f12777J = false;
            C4293p pVar = C4293p.LIGHT;
            this.f12779K = pVar;
            this.f12781L = true;
            this.f12783M = true;
            this.f12785N = 1.2f;
            this.f12787O = -1;
            this.f12789P = null;
            this.f12790Q = null;
            this.f12791R = true;
            this.f12796W = -1;
            this.f12821k0 = -2;
            this.f12823l0 = 0;
            this.f12833q0 = -1;
            this.f12837s0 = -1;
            this.f12839t0 = -1;
            this.f12841u0 = 0;
            this.f12764C0 = false;
            this.f12766D0 = false;
            this.f12768E0 = false;
            this.f12770F0 = false;
            this.f12772G0 = false;
            this.f12774H0 = false;
            this.f12776I0 = false;
            this.f12778J0 = false;
            this.f12800a = context;
            int m = C4297a.m18799m(context, C4284g.colorAccent, C4297a.m18789c(context, C4285h.md_material_blue_600));
            this.f12838t = m;
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                this.f12838t = C4297a.m18799m(context, 16843829, m);
            }
            this.f12842v = C4297a.m18788b(context, this.f12838t);
            this.f12844w = C4297a.m18788b(context, this.f12838t);
            this.f12846x = C4297a.m18788b(context, this.f12838t);
            this.f12848y = C4297a.m18788b(context, C4297a.m18799m(context, C4284g.md_link_color, this.f12838t));
            this.f12814h = C4297a.m18799m(context, C4284g.md_btn_ripple_color, C4297a.m18799m(context, C4284g.colorControlHighlight, i >= 21 ? C4297a.m18798l(context, 16843820) : 0));
            this.f12760A0 = NumberFormat.getPercentInstance();
            this.f12851z0 = "%1d/%2d";
            this.f12779K = !C4297a.m18793g(C4297a.m18798l(context, 16842806)) ? C4293p.DARK : pVar;
            m18738e();
            this.f12804c = C4297a.m18804r(context, C4284g.md_title_gravity, this.f12804c);
            this.f12806d = C4297a.m18804r(context, C4284g.md_content_gravity, this.f12806d);
            this.f12808e = C4297a.m18804r(context, C4284g.md_btnstacked_gravity, this.f12808e);
            this.f12810f = C4297a.m18804r(context, C4284g.md_items_gravity, this.f12810f);
            this.f12812g = C4297a.m18804r(context, C4284g.md_buttons_gravity, this.f12812g);
            try {
                mo14625L(C4297a.m18805s(context, C4284g.md_medium_font), C4297a.m18805s(context, C4284g.md_regular_font));
            } catch (Throwable unused) {
            }
            if (this.f12793T == null) {
                try {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.f12793T = Typeface.create("sans-serif-medium", 0);
                    } else {
                        this.f12793T = Typeface.create("sans-serif", 1);
                    }
                } catch (Throwable unused2) {
                    this.f12793T = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.f12792S == null) {
                try {
                    this.f12792S = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.f12792S = typeface;
                    if (typeface == null) {
                        this.f12792S = Typeface.DEFAULT;
                    }
                }
            }
        }

        /* renamed from: e */
        private void m18738e() {
            if (C1436d.m7543b(false) != null) {
                C1436d a = C1436d.m7542a();
                if (a.f5527a) {
                    this.f12779K = C4293p.DARK;
                }
                int i = a.f5528b;
                if (i != 0) {
                    this.f12816i = i;
                }
                int i2 = a.f5529c;
                if (i2 != 0) {
                    this.f12818j = i2;
                }
                ColorStateList colorStateList = a.f5530d;
                if (colorStateList != null) {
                    this.f12842v = colorStateList;
                }
                ColorStateList colorStateList2 = a.f5531e;
                if (colorStateList2 != null) {
                    this.f12846x = colorStateList2;
                }
                ColorStateList colorStateList3 = a.f5532f;
                if (colorStateList3 != null) {
                    this.f12844w = colorStateList3;
                }
                int i3 = a.f5534h;
                if (i3 != 0) {
                    this.f12815h0 = i3;
                }
                Drawable drawable = a.f5535i;
                if (drawable != null) {
                    this.f12794U = drawable;
                }
                int i4 = a.f5536j;
                if (i4 != 0) {
                    this.f12813g0 = i4;
                }
                int i5 = a.f5537k;
                if (i5 != 0) {
                    this.f12811f0 = i5;
                }
                int i6 = a.f5540n;
                if (i6 != 0) {
                    this.f12782L0 = i6;
                }
                int i7 = a.f5539m;
                if (i7 != 0) {
                    this.f12780K0 = i7;
                }
                int i8 = a.f5541o;
                if (i8 != 0) {
                    this.f12784M0 = i8;
                }
                int i9 = a.f5542p;
                if (i9 != 0) {
                    this.f12786N0 = i9;
                }
                int i10 = a.f5543q;
                if (i10 != 0) {
                    this.f12788O0 = i10;
                }
                int i11 = a.f5533g;
                if (i11 != 0) {
                    this.f12838t = i11;
                }
                ColorStateList colorStateList4 = a.f5538l;
                if (colorStateList4 != null) {
                    this.f12848y = colorStateList4;
                }
                this.f12804c = a.f5544r;
                this.f12806d = a.f5545s;
                this.f12808e = a.f5546t;
                this.f12810f = a.f5547u;
                this.f12812g = a.f5548v;
            }
        }

        /* renamed from: A */
        public C4274d mo14614A(C4283m mVar) {
            this.f12765D = mVar;
            return this;
        }

        /* renamed from: B */
        public C4274d mo14615B(C4283m mVar) {
            this.f12761B = mVar;
            return this;
        }

        /* renamed from: C */
        public C4274d mo14616C(C4283m mVar) {
            this.f12759A = mVar;
            return this;
        }

        /* renamed from: D */
        public C4274d mo14617D(int i) {
            mo14618E(C4297a.m18788b(this.f12800a, i));
            return this;
        }

        /* renamed from: E */
        public C4274d mo14618E(ColorStateList colorStateList) {
            this.f12842v = colorStateList;
            this.f12770F0 = true;
            return this;
        }

        /* renamed from: F */
        public C4274d mo14619F(int i) {
            if (i == 0) {
                return this;
            }
            mo14620G(this.f12800a.getText(i));
            return this;
        }

        /* renamed from: G */
        public C4274d mo14620G(CharSequence charSequence) {
            this.f12824m = charSequence;
            return this;
        }

        /* renamed from: H */
        public C4269f mo14621H() {
            C4269f c = mo14629c();
            c.show();
            return c;
        }

        /* renamed from: I */
        public C4274d mo14622I(int i) {
            mo14623J(this.f12800a.getText(i));
            return this;
        }

        /* renamed from: J */
        public C4274d mo14623J(CharSequence charSequence) {
            this.f12802b = charSequence;
            return this;
        }

        /* renamed from: K */
        public C4274d mo14624K(int i) {
            this.f12816i = i;
            this.f12764C0 = true;
            return this;
        }

        /* renamed from: L */
        public C4274d mo14625L(String str, String str2) {
            if (str != null && !str.trim().isEmpty()) {
                Typeface a = C4301c.m18809a(this.f12800a, str);
                this.f12793T = a;
                if (a == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str + "\"");
                }
            }
            if (str2 != null && !str2.trim().isEmpty()) {
                Typeface a2 = C4301c.m18809a(this.f12800a, str2);
                this.f12792S = a2;
                if (a2 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
                }
            }
            return this;
        }

        /* renamed from: M */
        public C4274d mo14626M(int i) {
            this.f12838t = i;
            this.f12776I0 = true;
            return this;
        }

        /* renamed from: a */
        public C4274d mo14627a(boolean z) {
            this.f12791R = z;
            return this;
        }

        /* renamed from: b */
        public C4274d mo14628b(int i) {
            this.f12813g0 = i;
            return this;
        }

        /* renamed from: c */
        public C4269f mo14629c() {
            return new C4269f(this);
        }

        /* renamed from: d */
        public C4274d mo14630d(int i) {
            this.f12814h = i;
            return this;
        }

        /* renamed from: f */
        public C4274d mo14631f(CharSequence charSequence) {
            if (this.f12836s == null) {
                this.f12820k = charSequence;
                return this;
            }
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }

        /* renamed from: g */
        public C4274d mo14632g(int i) {
            this.f12818j = i;
            this.f12766D0 = true;
            return this;
        }

        /* renamed from: h */
        public C4274d mo14633h(View view, boolean z) {
            if (this.f12820k != null) {
                throw new IllegalStateException("You cannot use customView() when you have content set.");
            } else if (this.f12822l != null) {
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            } else if (this.f12829o0 != null) {
                throw new IllegalStateException("You cannot use customView() with an input dialog");
            } else if (this.f12821k0 > -2 || this.f12817i0) {
                throw new IllegalStateException("You cannot use customView() with a progress dialog");
            } else {
                if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                this.f12836s = view;
                this.f12809e0 = z;
                return this;
            }
        }

        /* renamed from: i */
        public C4274d mo14634i(DialogInterface.OnDismissListener onDismissListener) {
            this.f12799Z = onDismissListener;
            return this;
        }

        /* renamed from: j */
        public C4274d mo14635j(int i) {
            this.f12811f0 = i;
            this.f12778J0 = true;
            return this;
        }

        /* renamed from: k */
        public final Context mo14636k() {
            return this.f12800a;
        }

        /* renamed from: l */
        public C4274d mo14637l(Drawable drawable) {
            this.f12794U = drawable;
            return this;
        }

        /* renamed from: m */
        public C4274d mo14638m(CharSequence charSequence, CharSequence charSequence2, boolean z, C4277g gVar) {
            if (this.f12836s == null) {
                this.f12829o0 = gVar;
                this.f12827n0 = charSequence;
                this.f12825m0 = charSequence2;
                this.f12831p0 = z;
                return this;
            }
            throw new IllegalStateException("You cannot set content() when you're using a custom view.");
        }

        /* renamed from: n */
        public C4274d mo14639n(CharSequence... charSequenceArr) {
            if (this.f12836s == null) {
                ArrayList<CharSequence> arrayList = new ArrayList<>();
                this.f12822l = arrayList;
                Collections.addAll(arrayList, charSequenceArr);
                return this;
            }
            throw new IllegalStateException("You cannot set items() when you're using a custom view.");
        }

        /* renamed from: o */
        public C4274d mo14640o(C4278h hVar) {
            this.f12767E = hVar;
            this.f12771G = null;
            this.f12773H = null;
            return this;
        }

        /* renamed from: p */
        public C4274d mo14641p(Integer[] numArr, C4279i iVar) {
            this.f12789P = numArr;
            this.f12767E = null;
            this.f12771G = null;
            this.f12773H = iVar;
            return this;
        }

        /* renamed from: q */
        public C4274d mo14642q(int i, C4280j jVar) {
            this.f12787O = i;
            this.f12767E = null;
            this.f12771G = jVar;
            this.f12773H = null;
            return this;
        }

        /* renamed from: r */
        public C4274d mo14643r(int i) {
            this.f12815h0 = i;
            this.f12768E0 = true;
            return this;
        }

        /* renamed from: s */
        public C4274d mo14644s(int i) {
            mo14645t(C4297a.m18788b(this.f12800a, i));
            return this;
        }

        /* renamed from: t */
        public C4274d mo14645t(ColorStateList colorStateList) {
            this.f12848y = colorStateList;
            return this;
        }

        /* renamed from: u */
        public C4274d mo14646u(int i) {
            mo14647v(C4297a.m18788b(this.f12800a, i));
            return this;
        }

        /* renamed from: v */
        public C4274d mo14647v(ColorStateList colorStateList) {
            this.f12844w = colorStateList;
            this.f12774H0 = true;
            return this;
        }

        /* renamed from: w */
        public C4274d mo14648w(int i) {
            if (i == 0) {
                return this;
            }
            mo14649x(this.f12800a.getText(i));
            return this;
        }

        /* renamed from: x */
        public C4274d mo14649x(CharSequence charSequence) {
            this.f12828o = charSequence;
            return this;
        }

        /* renamed from: y */
        public C4274d mo14650y(int i) {
            mo14651z(C4297a.m18788b(this.f12800a, i));
            return this;
        }

        /* renamed from: z */
        public C4274d mo14651z(ColorStateList colorStateList) {
            this.f12846x = colorStateList;
            this.f12772G0 = true;
            return this;
        }
    }

    @Deprecated
    /* renamed from: f.a.a.f$e */
    /* compiled from: MaterialDialog */
    public static abstract class C4275e {
        @Deprecated
        /* renamed from: a */
        public abstract void mo14652a(C4269f fVar);

        @Deprecated
        /* renamed from: b */
        public abstract void mo14653b(C4269f fVar);

        @Deprecated
        /* renamed from: c */
        public abstract void mo14654c(C4269f fVar);

        @Deprecated
        /* renamed from: d */
        public abstract void mo14655d(C4269f fVar);
    }

    /* renamed from: f.a.a.f$f */
    /* compiled from: MaterialDialog */
    private static class C4276f extends WindowManager.BadTokenException {
        C4276f(String str) {
            super(str);
        }
    }

    /* renamed from: f.a.a.f$g */
    /* compiled from: MaterialDialog */
    public interface C4277g {
        /* renamed from: a */
        void mo14656a(C4269f fVar, CharSequence charSequence);
    }

    /* renamed from: f.a.a.f$h */
    /* compiled from: MaterialDialog */
    public interface C4278h {
        /* renamed from: a */
        void mo14657a(C4269f fVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: f.a.a.f$i */
    /* compiled from: MaterialDialog */
    public interface C4279i {
        /* renamed from: a */
        boolean mo6921a(C4269f fVar, Integer[] numArr, CharSequence[] charSequenceArr);
    }

    /* renamed from: f.a.a.f$j */
    /* compiled from: MaterialDialog */
    public interface C4280j {
        /* renamed from: a */
        boolean mo6908a(C4269f fVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: f.a.a.f$k */
    /* compiled from: MaterialDialog */
    public interface C4281k {
        /* renamed from: a */
        boolean mo14658a(C4269f fVar, View view, int i, CharSequence charSequence);
    }

    /* renamed from: f.a.a.f$l */
    /* compiled from: MaterialDialog */
    enum C4282l {
        REGULAR,
        SINGLE,
        MULTI;

        public static int getLayoutForType(C4282l lVar) {
            int i = C4273c.f12758b[lVar.ordinal()];
            if (i == 1) {
                return C4289l.md_listitem;
            }
            if (i == 2) {
                return C4289l.md_listitem_singlechoice;
            }
            if (i == 3) {
                return C4289l.md_listitem_multichoice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    /* renamed from: f.a.a.f$m */
    /* compiled from: MaterialDialog */
    public interface C4283m {
        /* renamed from: a */
        void mo6880a(C4269f fVar, C4264b bVar);
    }

    @SuppressLint({"InflateParams"})
    protected C4269f(C4274d dVar) {
        super(dVar.f12800a, C4266d.m18718c(dVar));
        new Handler();
        this.f12735i = dVar;
        this.f12730g = (MDRootLayout) LayoutInflater.from(dVar.f12800a).inflate(C4266d.m18717b(dVar), (ViewGroup) null);
        C4266d.m18719d(this);
    }

    /* renamed from: w */
    private boolean m18722w() {
        if (this.f12735i.f12773H == null) {
            return false;
        }
        Collections.sort(this.f12752z);
        ArrayList arrayList = new ArrayList();
        for (Integer next : this.f12752z) {
            if (next.intValue() >= 0 && next.intValue() <= this.f12735i.f12822l.size() - 1) {
                arrayList.add(this.f12735i.f12822l.get(next.intValue()));
            }
        }
        C4279i iVar = this.f12735i.f12773H;
        List<Integer> list = this.f12752z;
        return iVar.mo6921a(this, (Integer[]) list.toArray(new Integer[list.size()]), (CharSequence[]) arrayList.toArray(new CharSequence[arrayList.size()]));
    }

    /* renamed from: x */
    private boolean m18723x(View view) {
        C4274d dVar = this.f12735i;
        if (dVar.f12771G == null) {
            return false;
        }
        CharSequence charSequence = null;
        int i = dVar.f12787O;
        if (i >= 0 && i < dVar.f12822l.size()) {
            C4274d dVar2 = this.f12735i;
            charSequence = dVar2.f12822l.get(dVar2.f12787O);
        }
        C4274d dVar3 = this.f12735i;
        return dVar3.f12771G.mo6908a(this, view, dVar3.f12787O, charSequence);
    }

    /* renamed from: A */
    public final void mo14591A(TextView textView, Typeface typeface) {
        if (typeface != null) {
            textView.setPaintFlags(textView.getPaintFlags() | 128);
            textView.setTypeface(typeface);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e4, code lost:
        r4 = r3.f12735i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f7, code lost:
        r4 = r3.f12735i;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14580a(p159f.p160a.p161a.C4269f r4, android.view.View r5, int r6, java.lang.CharSequence r7, boolean r8) {
        /*
            r3 = this;
            boolean r4 = r5.isEnabled()
            r7 = 0
            if (r4 != 0) goto L_0x0008
            return r7
        L_0x0008:
            f.a.a.f$l r4 = r3.f12751y
            r0 = 1
            if (r4 == 0) goto L_0x00d9
            f.a.a.f$l r1 = p159f.p160a.p161a.C4269f.C4282l.REGULAR
            if (r4 != r1) goto L_0x0013
            goto L_0x00d9
        L_0x0013:
            f.a.a.f$l r8 = p159f.p160a.p161a.C4269f.C4282l.MULTI
            if (r4 != r8) goto L_0x0087
            int r4 = p159f.p160a.p161a.C4288k.md_control
            android.view.View r4 = r5.findViewById(r4)
            android.widget.CheckBox r4 = (android.widget.CheckBox) r4
            boolean r5 = r4.isEnabled()
            if (r5 != 0) goto L_0x0026
            return r7
        L_0x0026:
            java.util.List<java.lang.Integer> r5 = r3.f12752z
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r5 = r5.contains(r8)
            r5 = r5 ^ r0
            if (r5 == 0) goto L_0x005d
            java.util.List<java.lang.Integer> r5 = r3.f12752z
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.add(r7)
            f.a.a.f$d r5 = r3.f12735i
            boolean r5 = r5.f12775I
            if (r5 == 0) goto L_0x0058
            boolean r5 = r3.m18722w()
            if (r5 == 0) goto L_0x004d
            r4.setChecked(r0)
            goto L_0x010a
        L_0x004d:
            java.util.List<java.lang.Integer> r4 = r3.f12752z
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4.remove(r5)
            goto L_0x010a
        L_0x0058:
            r4.setChecked(r0)
            goto L_0x010a
        L_0x005d:
            java.util.List<java.lang.Integer> r5 = r3.f12752z
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r5.remove(r8)
            f.a.a.f$d r5 = r3.f12735i
            boolean r5 = r5.f12775I
            if (r5 == 0) goto L_0x0082
            boolean r5 = r3.m18722w()
            if (r5 == 0) goto L_0x0077
            r4.setChecked(r7)
            goto L_0x010a
        L_0x0077:
            java.util.List<java.lang.Integer> r4 = r3.f12752z
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r4.add(r5)
            goto L_0x010a
        L_0x0082:
            r4.setChecked(r7)
            goto L_0x010a
        L_0x0087:
            f.a.a.f$l r8 = p159f.p160a.p161a.C4269f.C4282l.SINGLE
            if (r4 != r8) goto L_0x010a
            int r4 = p159f.p160a.p161a.C4288k.md_control
            android.view.View r4 = r5.findViewById(r4)
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4
            boolean r8 = r4.isEnabled()
            if (r8 != 0) goto L_0x009a
            return r7
        L_0x009a:
            f.a.a.f$d r8 = r3.f12735i
            int r1 = r8.f12787O
            boolean r2 = r8.f12791R
            if (r2 == 0) goto L_0x00b1
            java.lang.CharSequence r2 = r8.f12824m
            if (r2 != 0) goto L_0x00b1
            r3.dismiss()
            f.a.a.f$d r8 = r3.f12735i
            r8.f12787O = r6
            r3.m18723x(r5)
            goto L_0x00c1
        L_0x00b1:
            boolean r7 = r8.f12777J
            if (r7 == 0) goto L_0x00c0
            r8.f12787O = r6
            boolean r7 = r3.m18723x(r5)
            f.a.a.f$d r5 = r3.f12735i
            r5.f12787O = r1
            goto L_0x00c1
        L_0x00c0:
            r7 = 1
        L_0x00c1:
            if (r7 == 0) goto L_0x010a
            f.a.a.f$d r5 = r3.f12735i
            r5.f12787O = r6
            r4.setChecked(r0)
            f.a.a.f$d r4 = r3.f12735i
            androidx.recyclerview.widget.RecyclerView$h<?> r4 = r4.f12797X
            r4.notifyItemChanged(r1)
            f.a.a.f$d r4 = r3.f12735i
            androidx.recyclerview.widget.RecyclerView$h<?> r4 = r4.f12797X
            r4.notifyItemChanged(r6)
            goto L_0x010a
        L_0x00d9:
            f.a.a.f$d r4 = r3.f12735i
            boolean r4 = r4.f12791R
            if (r4 == 0) goto L_0x00e2
            r3.dismiss()
        L_0x00e2:
            if (r8 != 0) goto L_0x00f5
            f.a.a.f$d r4 = r3.f12735i
            f.a.a.f$h r7 = r4.f12767E
            if (r7 == 0) goto L_0x00f5
            java.util.ArrayList<java.lang.CharSequence> r4 = r4.f12822l
            java.lang.Object r4 = r4.get(r6)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r7.mo14657a(r3, r5, r6, r4)
        L_0x00f5:
            if (r8 == 0) goto L_0x010a
            f.a.a.f$d r4 = r3.f12735i
            f.a.a.f$k r7 = r4.f12769F
            if (r7 == 0) goto L_0x010a
            java.util.ArrayList<java.lang.CharSequence> r4 = r4.f12822l
            java.lang.Object r4 = r4.get(r6)
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = r7.mo14658a(r3, r5, r6, r4)
            return r4
        L_0x010a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p160a.p161a.C4269f.mo14580a(f.a.a.f, android.view.View, int, java.lang.CharSequence, boolean):boolean");
    }

    public void dismiss() {
        if (this.f12739m != null) {
            C4297a.m18792f(this, this.f12735i);
        }
        super.dismiss();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo14593f() {
        RecyclerView recyclerView = this.f12740n;
        if (recyclerView != null) {
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C4270a());
        }
    }

    /* renamed from: n */
    public final MDButton mo14594n(C4264b bVar) {
        int i = C4273c.f12757a[bVar.ordinal()];
        if (i == 1) {
            return this.f12749w;
        }
        if (i != 2) {
            return this.f12748v;
        }
        return this.f12750x;
    }

    /* renamed from: o */
    public final C4274d mo14595o() {
        return this.f12735i;
    }

    public final void onClick(View view) {
        EditText editText;
        C4264b bVar = (C4264b) view.getTag();
        int i = C4273c.f12757a[bVar.ordinal()];
        if (i == 1) {
            C4275e eVar = this.f12735i.f12850z;
            if (eVar != null) {
                eVar.mo14652a(this);
                this.f12735i.f12850z.mo14654c(this);
            }
            C4283m mVar = this.f12735i.f12763C;
            if (mVar != null) {
                mVar.mo6880a(this, bVar);
            }
            if (this.f12735i.f12791R) {
                dismiss();
            }
        } else if (i == 2) {
            C4275e eVar2 = this.f12735i.f12850z;
            if (eVar2 != null) {
                eVar2.mo14652a(this);
                this.f12735i.f12850z.mo14653b(this);
            }
            C4283m mVar2 = this.f12735i.f12761B;
            if (mVar2 != null) {
                mVar2.mo6880a(this, bVar);
            }
            if (this.f12735i.f12791R) {
                cancel();
            }
        } else if (i == 3) {
            C4275e eVar3 = this.f12735i.f12850z;
            if (eVar3 != null) {
                eVar3.mo14652a(this);
                this.f12735i.f12850z.mo14655d(this);
            }
            C4283m mVar3 = this.f12735i.f12759A;
            if (mVar3 != null) {
                mVar3.mo6880a(this, bVar);
            }
            if (!this.f12735i.f12777J) {
                m18723x(view);
            }
            if (!this.f12735i.f12775I) {
                m18722w();
            }
            C4274d dVar = this.f12735i;
            C4277g gVar = dVar.f12829o0;
            if (!(gVar == null || (editText = this.f12739m) == null || dVar.f12835r0)) {
                gVar.mo14656a(this, editText.getText());
            }
            if (this.f12735i.f12791R) {
                dismiss();
            }
        }
        C4283m mVar4 = this.f12735i.f12765D;
        if (mVar4 != null) {
            mVar4.mo6880a(this, bVar);
        }
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.f12739m != null) {
            C4297a.m18807u(this, this.f12735i);
            if (this.f12739m.getText().length() > 0) {
                EditText editText = this.f12739m;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Drawable mo14597p(C4264b bVar, boolean z) {
        if (z) {
            C4274d dVar = this.f12735i;
            if (dVar.f12782L0 != 0) {
                return C0524f.m3225f(dVar.f12800a.getResources(), this.f12735i.f12782L0, (Resources.Theme) null);
            }
            Context context = dVar.f12800a;
            int i = C4284g.md_btn_stacked_selector;
            Drawable p = C4297a.m18802p(context, i);
            if (p != null) {
                return p;
            }
            return C4297a.m18802p(getContext(), i);
        }
        int i2 = C4273c.f12757a[bVar.ordinal()];
        if (i2 == 1) {
            C4274d dVar2 = this.f12735i;
            if (dVar2.f12786N0 != 0) {
                return C0524f.m3225f(dVar2.f12800a.getResources(), this.f12735i.f12786N0, (Resources.Theme) null);
            }
            Context context2 = dVar2.f12800a;
            int i3 = C4284g.md_btn_neutral_selector;
            Drawable p2 = C4297a.m18802p(context2, i3);
            if (p2 != null) {
                return p2;
            }
            Drawable p3 = C4297a.m18802p(getContext(), i3);
            if (Build.VERSION.SDK_INT >= 21) {
                C4300b.m18808a(p3, this.f12735i.f12814h);
            }
            return p3;
        } else if (i2 != 2) {
            C4274d dVar3 = this.f12735i;
            if (dVar3.f12784M0 != 0) {
                return C0524f.m3225f(dVar3.f12800a.getResources(), this.f12735i.f12784M0, (Resources.Theme) null);
            }
            Context context3 = dVar3.f12800a;
            int i4 = C4284g.md_btn_positive_selector;
            Drawable p4 = C4297a.m18802p(context3, i4);
            if (p4 != null) {
                return p4;
            }
            Drawable p5 = C4297a.m18802p(getContext(), i4);
            if (Build.VERSION.SDK_INT >= 21) {
                C4300b.m18808a(p5, this.f12735i.f12814h);
            }
            return p5;
        } else {
            C4274d dVar4 = this.f12735i;
            if (dVar4.f12788O0 != 0) {
                return C0524f.m3225f(dVar4.f12800a.getResources(), this.f12735i.f12788O0, (Resources.Theme) null);
            }
            Context context4 = dVar4.f12800a;
            int i5 = C4284g.md_btn_negative_selector;
            Drawable p6 = C4297a.m18802p(context4, i5);
            if (p6 != null) {
                return p6;
            }
            Drawable p7 = C4297a.m18802p(getContext(), i5);
            if (Build.VERSION.SDK_INT >= 21) {
                C4300b.m18808a(p7, this.f12735i.f12814h);
            }
            return p7;
        }
    }

    /* renamed from: q */
    public final EditText mo14598q() {
        return this.f12739m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final Drawable mo14599r() {
        C4274d dVar = this.f12735i;
        if (dVar.f12780K0 != 0) {
            return C0524f.m3225f(dVar.f12800a.getResources(), this.f12735i.f12780K0, (Resources.Theme) null);
        }
        Context context = dVar.f12800a;
        int i = C4284g.md_list_selector;
        Drawable p = C4297a.m18802p(context, i);
        if (p != null) {
            return p;
        }
        return C4297a.m18802p(getContext(), i);
    }

    /* renamed from: s */
    public final View mo14600s() {
        return this.f12730g;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f12737k.setText(charSequence);
    }

    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
            throw new C4276f("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo14604t(int i, boolean z) {
        C4274d dVar;
        int i2;
        TextView textView = this.f12746t;
        if (textView != null) {
            boolean z2 = false;
            if (this.f12735i.f12839t0 > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f12735i.f12839t0)}));
                this.f12746t.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            if ((z && i == 0) || (((i2 = dVar.f12839t0) > 0 && i > i2) || i < (dVar = this.f12735i).f12837s0)) {
                z2 = true;
            }
            C4274d dVar2 = this.f12735i;
            int i3 = z2 ? dVar2.f12841u0 : dVar2.f12818j;
            C4274d dVar3 = this.f12735i;
            int i4 = z2 ? dVar3.f12841u0 : dVar3.f12838t;
            if (this.f12735i.f12839t0 > 0) {
                this.f12746t.setTextColor(i3);
            }
            C1435c.m7537e(this.f12739m, i4);
            mo14594n(C4264b.POSITIVE).setEnabled(!z2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo14605u() {
        if (this.f12740n != null) {
            ArrayList<CharSequence> arrayList = this.f12735i.f12822l;
            if ((arrayList != null && arrayList.size() != 0) || this.f12735i.f12797X != null) {
                C4274d dVar = this.f12735i;
                if (dVar.f12798Y == null) {
                    dVar.f12798Y = new LinearLayoutManager(getContext());
                }
                if (this.f12740n.getLayoutManager() == null) {
                    this.f12740n.setLayoutManager(this.f12735i.f12798Y);
                }
                this.f12740n.setAdapter(this.f12735i.f12797X);
                if (this.f12751y != null) {
                    ((C4260a) this.f12735i.f12797X).mo14577h(this);
                }
            }
        }
    }

    /* renamed from: v */
    public final void mo14606v() {
        this.f12735i.f12797X.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo14607y() {
        EditText editText = this.f12739m;
        if (editText != null) {
            editText.addTextChangedListener(new C4272b());
        }
    }

    /* renamed from: z */
    public final void mo14608z(CharSequence... charSequenceArr) {
        C4274d dVar = this.f12735i;
        if (dVar.f12797X != null) {
            if (charSequenceArr != null) {
                dVar.f12822l = new ArrayList<>(charSequenceArr.length);
                Collections.addAll(this.f12735i.f12822l, charSequenceArr);
            } else {
                dVar.f12822l = null;
            }
            if (this.f12735i.f12797X instanceof C4260a) {
                mo14606v();
                return;
            }
            throw new IllegalStateException("When using a custom adapter, setItems() cannot be used. Set items through the adapter instead.");
        }
        throw new IllegalStateException("This MaterialDialog instance does not yet have an adapter set to it. You cannot use setItems().");
    }

    public final void setTitle(int i) {
        setTitle((CharSequence) this.f12735i.f12800a.getString(i));
    }
}
