package com.coocent.marquee;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.C0549e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.marquee.C2285k;
import com.coocent.marquee.MarqueeSeekBarView;
import com.coocent.marquee.MarqueeSwitchButton;
import com.coocent.marquee.p055y.C2333a;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.List;
import p159f.p166c.p167a.p168c.C4306a;
import p159f.p166c.p176c.C4326a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

@Deprecated
public class MarqueeActivity extends SettingsBaseActivity implements C2285k.C2286a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public MarqueeSweepGradientView f7633A;

    /* renamed from: B */
    private ConstraintLayout f7634B;

    /* renamed from: C */
    private MarqueeSwitchButton f7635C;

    /* renamed from: D */
    private MarqueeSwitchButton f7636D;

    /* renamed from: E */
    private MarqueeSwitchButton2 f7637E;

    /* renamed from: F */
    private MarqueeSeekBarView f7638F;

    /* renamed from: G */
    private MarqueeSeekBarView f7639G;

    /* renamed from: H */
    private MarqueeSeekBarView f7640H;

    /* renamed from: I */
    private MarqueeSeekBarView f7641I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public TextView f7642J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public TextView f7643K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public TextView f7644L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public TextView f7645M;

    /* renamed from: N */
    private TextView f7646N;

    /* renamed from: O */
    private TextView f7647O;

    /* renamed from: P */
    private TextView f7648P;

    /* renamed from: Q */
    private TextView f7649Q;

    /* renamed from: R */
    private TextView f7650R;

    /* renamed from: S */
    private MarqueeSeekBarView f7651S;

    /* renamed from: T */
    private MarqueeSeekBarView f7652T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public TextView f7653U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public TextView f7654V;

    /* renamed from: W */
    private RelativeLayout f7655W;

    /* renamed from: X */
    private ImageView f7656X;

    /* renamed from: Y */
    private TextView f7657Y;

    /* renamed from: Z */
    private TextView f7658Z;

    /* renamed from: a0 */
    private TextView f7659a0;

    /* renamed from: b0 */
    private TextView f7660b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public RecyclerView f7661c0;
    /* access modifiers changed from: private */

    /* renamed from: d0 */
    public C2285k f7662d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public ArrayList<C2277g> f7663e0;

    /* renamed from: f0 */
    private ConstraintLayout f7664f0;

    /* renamed from: g0 */
    private List<View> f7665g0 = new ArrayList();

    /* renamed from: h0 */
    private InputMethodManager f7666h0;

    /* renamed from: i0 */
    private CoordinatorLayout f7667i0;

    /* renamed from: j0 */
    private RelativeLayout f7668j0;

    /* renamed from: k0 */
    private View f7669k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public AppCompatCheckBox f7670l0;

    /* renamed from: m0 */
    private boolean f7671m0;

    /* renamed from: n0 */
    private View.OnClickListener f7672n0 = new C2242b();

    /* renamed from: com.coocent.marquee.MarqueeActivity$a */
    class C2241a implements MarqueeSeekBarView.C2260a {
        C2241a() {
        }

        /* renamed from: a */
        public void mo8894a(int i, boolean z, boolean z2) {
            MarqueeActivity.this.f7633A.setBaseRotate(i);
            MarqueeActivity.this.f7654V.setText(String.valueOf(i));
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$b */
    class C2242b implements View.OnClickListener {
        C2242b() {
        }

        public void onClick(View view) {
            MarqueeActivity.this.finish();
            MarqueeActivity.this.overridePendingTransition(0, C2306q.menu_out);
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$c */
    class C2243c implements C4306a.C4308b {

        /* renamed from: g */
        final /* synthetic */ int f7675g;

        C2243c(int i) {
            this.f7675g = i;
        }

        /* renamed from: c */
        public void mo8769c() {
        }

        /* renamed from: d */
        public void mo8770d(int i, String str) {
            ((C2277g) MarqueeActivity.this.f7663e0.get(this.f7675g)).mo9005c(String.format("#%08X", new Object[]{Integer.valueOf(i)}));
            MarqueeActivity.this.f7662d0.notifyItemChanged(this.f7675g);
            MarqueeActivity.this.m10459z2();
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$d */
    class C2244d implements C4306a.C4308b {

        /* renamed from: g */
        final /* synthetic */ int f7677g;

        /* renamed from: h */
        final /* synthetic */ int f7678h;

        C2244d(int i, int i2) {
            this.f7677g = i;
            this.f7678h = i2;
        }

        /* renamed from: c */
        public void mo8769c() {
        }

        /* renamed from: d */
        public void mo8770d(int i, String str) {
            String format = String.format("#%08X", new Object[]{Integer.valueOf(i)});
            C2277g gVar = new C2277g();
            gVar.mo9006d(MarqueeActivity.this.getResources().getString(C2311u.marquee_color) + " " + this.f7677g);
            gVar.mo9005c(format);
            MarqueeActivity.this.f7663e0.add(gVar);
            MarqueeActivity.this.m10459z2();
            MarqueeActivity.this.f7662d0.notifyItemChanged(this.f7678h);
            MarqueeActivity.this.f7662d0.notifyItemChanged(MarqueeActivity.this.f7663e0.size() - 1);
            MarqueeActivity.this.f7661c0.mo4657q1(MarqueeActivity.this.f7663e0.size() - 1);
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$e */
    class C2245e implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ int f7680g;

        C2245e(int i) {
            this.f7680g = i;
        }

        public void onClick(View view) {
            int i = this.f7680g;
            if (i >= 0 && i < MarqueeActivity.this.f7663e0.size()) {
                MarqueeActivity.this.f7663e0.remove(this.f7680g);
                MarqueeActivity.this.m10459z2();
                MarqueeActivity.this.f7662d0.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$f */
    class C2246f implements MarqueeSwitchButton.C2262a {
        C2246f() {
        }

        /* renamed from: a */
        public void mo8897a(boolean z) {
            SharedPreferences.Editor edit = MarqueeActivity.this.f7805z.edit();
            edit.putBoolean("marquee_enable", z);
            edit.apply();
            if (z) {
                MarqueeActivity.this.mo8887g2(true, false);
            } else {
                MarqueeActivity.this.mo8887g2(false, true);
            }
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$g */
    class C2247g implements MarqueeSwitchButton.C2262a {
        C2247g() {
        }

        /* renamed from: a */
        public void mo8897a(boolean z) {
            SharedPreferences.Editor edit = MarqueeActivity.this.f7805z.edit();
            edit.putBoolean("marquee_enable", z);
            edit.apply();
            if (z) {
                MarqueeActivity.this.mo8887g2(true, false);
            } else {
                MarqueeActivity.this.mo8887g2(false, true);
            }
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$h */
    class C2248h implements CompoundButton.OnCheckedChangeListener {
        C2248h() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MarqueeActivity.this.m10458y2(z);
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$i */
    class C2249i implements View.OnClickListener {
        C2249i() {
        }

        public void onClick(View view) {
            MarqueeActivity.this.f7670l0.performClick();
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$j */
    class C2250j implements MarqueeSeekBarView.C2260a {
        C2250j() {
        }

        /* renamed from: a */
        public void mo8894a(int i, boolean z, boolean z2) {
            MarqueeActivity.this.f7633A.setRadiusTopIn(i);
            MarqueeActivity.this.f7642J.setText(String.valueOf(i));
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$k */
    class C2251k implements MarqueeSeekBarView.C2260a {
        C2251k() {
        }

        /* renamed from: a */
        public void mo8894a(int i, boolean z, boolean z2) {
            MarqueeActivity.this.f7633A.setRadiusTopOut(i);
            MarqueeActivity.this.f7643K.setText(String.valueOf(i));
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$l */
    class C2252l implements MarqueeSeekBarView.C2260a {
        C2252l() {
        }

        /* renamed from: a */
        public void mo8894a(int i, boolean z, boolean z2) {
            MarqueeActivity.this.f7633A.setRadiusBottomIn(i);
            MarqueeActivity.this.f7644L.setText(String.valueOf(i));
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$m */
    class C2253m implements MarqueeSeekBarView.C2260a {
        C2253m() {
        }

        /* renamed from: a */
        public void mo8894a(int i, boolean z, boolean z2) {
            MarqueeActivity.this.f7633A.setRadiusBottomOut(i);
            MarqueeActivity.this.f7645M.setText(String.valueOf(i));
        }
    }

    /* renamed from: com.coocent.marquee.MarqueeActivity$n */
    class C2254n implements MarqueeSeekBarView.C2260a {
        C2254n() {
        }

        /* renamed from: a */
        public void mo8894a(int i, boolean z, boolean z2) {
            MarqueeActivity.this.f7633A.setWidth(i);
            MarqueeActivity.this.f7653U.setText(String.valueOf(i + 1));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public void m10458y2(boolean z) {
        this.f7671m0 = z;
        if (!z) {
            C2296m.m10661e(this, 1);
            this.f7670l0.setChecked(false);
            C2296m.m10662f(this, false);
        } else if (C4326a.m18907f().mo14749c(this)) {
            this.f7670l0.setChecked(true);
            C2296m.m10662f(this, true);
        } else {
            this.f7671m0 = false;
            C4326a.m18907f().mo14748b(this, C2326v.Theme_AppCompat_Light_Dialog_Alert);
            this.f7670l0.setChecked(false);
            C2296m.m10662f(this, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public void m10459z2() {
        int size = this.f7663e0.size() + 1;
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                iArr[i] = iArr[0];
            } else {
                iArr[i] = Color.parseColor(this.f7663e0.get(i).mo9003a());
            }
        }
        MarqueeSweepGradientView marqueeSweepGradientView = this.f7633A;
        if (marqueeSweepGradientView != null) {
            marqueeSweepGradientView.setColors(iArr);
        }
    }

    /* renamed from: Y0 */
    public void mo8883Y0(int i) {
        C2275e.m10596a(this, this.f7666h0);
        CoordinatorLayout coordinatorLayout = this.f7667i0;
        if (coordinatorLayout != null) {
            Snackbar X = Snackbar.m37002X(coordinatorLayout, getString(C2311u.marquee_delete_item), -1);
            X.mo24687Z(getString(C2311u.marquee_ok), new C2245e(i));
            X.mo24688a0(Color.parseColor(C2298o.m10688G1()));
            View B = X.mo24632B();
            ((TextView) B.findViewById(C2308s.snackbar_text)).setTextColor(C2298o.m10758e1());
            B.setBackgroundColor(C2298o.m10673B1());
            X.mo24640N();
        }
    }

    /* renamed from: b */
    public void mo8884b(int i) {
        C2275e.m10596a(this, this.f7666h0);
        C2267b bVar = new C2267b(this, Color.parseColor(this.f7663e0.get(i).mo9003a()));
        bVar.mo14670s(new C2243c(i));
        bVar.mo14668q(true);
        bVar.mo14669r(true);
        try {
            bVar.show();
        } catch (WindowManager.BadTokenException e) {
            Log.d(BuildConfig.FLAVOR, "异常##" + e.getMessage());
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C2275e.m10597b(this, motionEvent, this.f7665g0);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e2 */
    public void mo8886e2(int i) {
    }

    /* renamed from: g2 */
    public void mo8887g2(boolean z, boolean z2) {
        this.f7666h0 = (InputMethodManager) getSystemService("input_method");
        int i = 0;
        boolean z3 = this.f7805z.getBoolean("marquee_enable", false);
        if (z) {
            z3 = true;
        }
        if (z2) {
            z3 = false;
        }
        this.f7635C.setIsShow(z3);
        this.f7635C.setOnBitmap(C2298o.m10694I1());
        this.f7637E.setIsShow(z3);
        this.f7636D.setIsShow(z3);
        this.f7638F.setEnable(z3);
        this.f7638F.mo8922g(C2298o.m10732V0(), z3);
        this.f7639G.setEnable(z3);
        this.f7639G.mo8922g(C2298o.m10732V0(), z3);
        this.f7640H.setEnable(z3);
        this.f7640H.mo8922g(C2298o.m10732V0(), z3);
        this.f7641I.setEnable(z3);
        this.f7641I.mo8922g(C2298o.m10732V0(), z3);
        this.f7651S.setEnable(z3);
        this.f7651S.mo8922g(C2298o.m10732V0(), z3);
        this.f7652T.setEnable(z3);
        this.f7652T.mo8922g(C2298o.m10732V0(), z3);
        this.f7668j0.setEnabled(z3);
        this.f7670l0.setEnabled(z3);
        this.f7661c0.setEnabled(z3);
        MarqueeSweepGradientView marqueeSweepGradientView = this.f7633A;
        if (!z3) {
            i = 8;
        }
        marqueeSweepGradientView.setVisibility(i);
        this.f7662d0.mo9014g(z3 ? this : null);
        this.f7662d0.notifyItemChanged(this.f7663e0.size());
    }

    /* renamed from: h2 */
    public void mo8888h2() {
        if (C2298o.m10721R1() != 0) {
            this.f7634B.setBackgroundColor(C2298o.m10721R1());
            this.f7655W.setBackgroundColor(C2298o.m10721R1());
            this.f7669k0.setBackgroundColor(C2298o.m10721R1());
        } else {
            int b = C2274d.m10590b(C2298o.m10688G1());
            this.f7634B.setBackgroundColor(b);
            this.f7655W.setBackgroundColor(b);
            this.f7669k0.setBackgroundColor(b);
        }
        this.f7664f0.setBackgroundColor(C2298o.m10720R0());
        if (C2298o.m10723S0() != 0) {
            this.f7664f0.setBackgroundResource(C2298o.m10723S0());
            this.f7634B.setBackgroundResource(C2298o.m10723S0());
            this.f7655W.setBackgroundColor(0);
        }
        int e1 = C2298o.m10758e1();
        if (C2298o.m10699K0() != null) {
            this.f7656X.setImageDrawable(C2298o.m10699K0());
        } else if (C2298o.m10696J0() != -1) {
            this.f7656X.setImageResource(C2298o.m10696J0());
        } else if (e1 != -1) {
            this.f7656X.setImageDrawable(C2333a.f8191a.mo9132c(this, C2307r.marquee_btn_top_return_white, e1));
        } else {
            this.f7656X.setImageResource(C2307r.marquee_btn_top_return_white);
        }
        this.f7657Y.setTextColor(C2298o.m10691H1());
        int[][] iArr = {new int[]{-16842912}, new int[]{16842912}};
        C0549e.m3395c(this.f7670l0, new ColorStateList(iArr, new int[]{C2298o.m10718Q1(), C2298o.m10718Q1()}));
        this.f7646N.setTextColor(e1);
        this.f7647O.setTextColor(e1);
        this.f7648P.setTextColor(e1);
        this.f7649Q.setTextColor(e1);
        this.f7650R.setTextColor(e1);
        this.f7658Z.setTextColor(e1);
        this.f7659a0.setTextColor(e1);
        this.f7642J.setTextColor(e1);
        this.f7643K.setTextColor(e1);
        this.f7644L.setTextColor(e1);
        this.f7645M.setTextColor(e1);
        this.f7653U.setTextColor(e1);
        this.f7654V.setTextColor(e1);
        this.f7660b0.setTextColor(e1);
        if (Build.VERSION.SDK_INT >= 17) {
            if (C2298o.m10779l1() == null || C2298o.m10712O1() == null || C2298o.m10682E1() == null) {
                this.f7646N.setCompoundDrawablesRelativeWithIntrinsicBounds(getResources().getDrawable(C2298o.m10749b1()), (Drawable) null, (Drawable) null, (Drawable) null);
                this.f7647O.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, getResources().getDrawable(C2298o.m10782m1()), (Drawable) null, (Drawable) null);
                this.f7648P.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, getResources().getDrawable(C2298o.m10788o1()), (Drawable) null, (Drawable) null);
                this.f7649Q.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, getResources().getDrawable(C2298o.m10785n1()), (Drawable) null, (Drawable) null);
                this.f7650R.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, getResources().getDrawable(C2298o.m10791p1()), (Drawable) null, (Drawable) null);
                this.f7658Z.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, getResources().getDrawable(C2298o.m10715P1()), (Drawable) null, (Drawable) null);
                this.f7659a0.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, getResources().getDrawable(C2298o.m10685F1()), (Drawable) null, (Drawable) null);
            } else {
                this.f7646N.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C2298o.m10779l1(), (Drawable) null, (Drawable) null);
                this.f7647O.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C2298o.m10779l1(), (Drawable) null, (Drawable) null);
                this.f7648P.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C2298o.m10779l1(), (Drawable) null, (Drawable) null);
                this.f7649Q.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C2298o.m10779l1(), (Drawable) null, (Drawable) null);
                this.f7650R.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C2298o.m10779l1(), (Drawable) null, (Drawable) null);
                this.f7658Z.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C2298o.m10712O1(), (Drawable) null, (Drawable) null);
                this.f7659a0.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, C2298o.m10682E1(), (Drawable) null, (Drawable) null);
            }
        }
        this.f7638F.setEnable(true);
        this.f7638F.mo8922g(C2298o.m10732V0(), true);
        this.f7639G.setEnable(true);
        this.f7639G.mo8922g(C2298o.m10732V0(), true);
        this.f7640H.setEnable(true);
        this.f7640H.mo8922g(C2298o.m10732V0(), true);
        this.f7641I.setEnable(true);
        this.f7641I.mo8922g(C2298o.m10732V0(), true);
        this.f7651S.setEnable(true);
        this.f7651S.mo8922g(C2298o.m10732V0(), true);
        this.f7652T.setEnable(true);
        this.f7652T.mo8922g(C2298o.m10732V0(), true);
    }

    /* renamed from: i2 */
    public void mo8889i2() {
        this.f7667i0 = (CoordinatorLayout) findViewById(C2308s.marquee_bottom_snackbar);
        this.f7634B = (ConstraintLayout) findViewById(C2308s.mainRelLayout);
        this.f7664f0 = (ConstraintLayout) findViewById(C2308s.contentRelLayout);
        this.f7655W = (RelativeLayout) findViewById(C2308s.nav);
        this.f7669k0 = findViewById(C2308s.floatingLine);
        ImageView imageView = (ImageView) findViewById(C2308s.menuBtn);
        this.f7656X = imageView;
        imageView.setOnClickListener(this.f7672n0);
        this.f7657Y = (TextView) findViewById(C2308s.title_main_text);
        this.f7633A = (MarqueeSweepGradientView) findViewById(C2308s.sweepView);
        this.f7663e0 = C2279i.m10611b(this).mo9007a();
        m10459z2();
        this.f7635C = (MarqueeSwitchButton) findViewById(C2308s.marqueeSwitch);
        this.f7636D = (MarqueeSwitchButton) findViewById(C2308s.marqueeSwitch2_icon);
        this.f7637E = (MarqueeSwitchButton2) findViewById(C2308s.marqueeSwitch2_bg);
        boolean z = false;
        if (!C2298o.m10739X1()) {
            this.f7635C.setVisibility(0);
            this.f7636D.setVisibility(8);
            this.f7637E.setVisibility(8);
        } else {
            this.f7635C.setVisibility(8);
            this.f7636D.setVisibility(0);
            this.f7637E.setVisibility(0);
        }
        this.f7635C.setOnchangeListener(new C2246f());
        this.f7636D.setOnchangeListener(new C2247g());
        boolean z2 = C2296m.m10659c(this) && C4326a.m18907f().mo14749c(this);
        this.f7671m0 = z2;
        C2296m.m10662f(this, z2);
        this.f7670l0 = (AppCompatCheckBox) findViewById(C2308s.floatingCheckBox);
        if (C2296m.m10659c(this) && C4326a.m18907f().mo14749c(this)) {
            z = true;
        }
        this.f7671m0 = z;
        this.f7670l0.setChecked(z);
        C2296m.m10662f(this, this.f7671m0);
        this.f7670l0.setOnCheckedChangeListener(new C2248h());
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C2308s.floatingRelLayout);
        this.f7668j0 = relativeLayout;
        relativeLayout.setOnClickListener(new C2249i());
        this.f7646N = (TextView) findViewById(C2308s.floatingIcon);
        this.f7647O = (TextView) findViewById(C2308s.radianIcon);
        this.f7648P = (TextView) findViewById(C2308s.radianTopOutIcon);
        this.f7649Q = (TextView) findViewById(C2308s.radianBottomIcon);
        this.f7650R = (TextView) findViewById(C2308s.radianBottomOutIcon);
        this.f7658Z = (TextView) findViewById(C2308s.widthIcon);
        this.f7659a0 = (TextView) findViewById(C2308s.speedIcon);
        this.f7642J = (TextView) findViewById(C2308s.radianTv);
        this.f7643K = (TextView) findViewById(C2308s.radianTopOutTv);
        this.f7644L = (TextView) findViewById(C2308s.radianBottomTv);
        this.f7645M = (TextView) findViewById(C2308s.radianBottomOutTv);
        this.f7653U = (TextView) findViewById(C2308s.widthTv);
        this.f7654V = (TextView) findViewById(C2308s.speedTv);
        this.f7638F = (MarqueeSeekBarView) findViewById(C2308s.radianView);
        this.f7639G = (MarqueeSeekBarView) findViewById(C2308s.radianTopOutView);
        this.f7640H = (MarqueeSeekBarView) findViewById(C2308s.radianBottomView);
        this.f7641I = (MarqueeSeekBarView) findViewById(C2308s.radianBottomOutView);
        this.f7651S = (MarqueeSeekBarView) findViewById(C2308s.widthView);
        this.f7652T = (MarqueeSeekBarView) findViewById(C2308s.speedView);
        int i = this.f7805z.getInt("marquee_radian", C2298o.m10773j1());
        int i2 = this.f7805z.getInt("marquee_radian_top_out", C2298o.m10770i1());
        int i3 = this.f7805z.getInt("marquee_radian_bottom_in", C2298o.m10767h1());
        int i4 = this.f7805z.getInt("marquee_radian_bottom_out", C2298o.m10764g1());
        int i5 = this.f7805z.getInt("marquee_width", C2298o.m10706M1());
        int i6 = this.f7805z.getInt("marquee_speed", C2298o.m10676C1());
        this.f7642J.setText(String.valueOf(i));
        this.f7643K.setText(String.valueOf(i2));
        this.f7644L.setText(String.valueOf(i3));
        this.f7645M.setText(String.valueOf(i4));
        this.f7653U.setText(String.valueOf(i5 + 1));
        this.f7654V.setText(String.valueOf(i6));
        this.f7633A.mo8945e(i, i3, i2, i4, i5, i6);
        this.f7638F.setEnable(true);
        this.f7638F.mo8922g(C2298o.m10776k1(), true);
        this.f7638F.setMaxValue(60);
        this.f7638F.setCurrentValue(i);
        this.f7638F.setOnSeekBarChangeListener(new C2250j());
        this.f7639G.setEnable(true);
        this.f7639G.mo8922g(C2298o.m10776k1(), true);
        this.f7639G.setMaxValue(60);
        this.f7639G.setCurrentValue(i2);
        this.f7639G.setOnSeekBarChangeListener(new C2251k());
        this.f7640H.setEnable(true);
        this.f7640H.mo8922g(C2298o.m10776k1(), true);
        this.f7640H.setMaxValue(60);
        this.f7640H.setCurrentValue(i3);
        this.f7640H.setOnSeekBarChangeListener(new C2252l());
        this.f7641I.setEnable(true);
        this.f7641I.mo8922g(C2298o.m10776k1(), true);
        this.f7641I.setMaxValue(60);
        this.f7641I.setCurrentValue(i4);
        this.f7641I.setOnSeekBarChangeListener(new C2253m());
        this.f7651S.setEnable(true);
        this.f7651S.mo8922g(C2298o.m10709N1(), true);
        this.f7651S.setMaxValue(10);
        this.f7651S.setCurrentValue(i5);
        this.f7651S.setOnSeekBarChangeListener(new C2254n());
        this.f7652T.setEnable(true);
        this.f7652T.mo8922g(C2298o.m10679D1(), true);
        this.f7652T.setMaxValue(15);
        this.f7652T.setCurrentValue(i6);
        this.f7652T.setOnSeekBarChangeListener(new C2241a());
        this.f7660b0 = (TextView) findViewById(C2308s.pickerTitleTv);
        RecyclerView recyclerView = (RecyclerView) findViewById(C2308s.marqueeRecView);
        this.f7661c0 = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f7661c0.setLayoutManager(new LinearLayoutManager(this));
        C2285k kVar = new C2285k(this, this.f7663e0);
        this.f7662d0 = kVar;
        this.f7661c0.setAdapter(kVar);
        this.f7665g0.add(this.f7661c0);
    }

    /* renamed from: k2 */
    public void mo8890k2() {
        setContentView(C2310t.marquee_activity_marquee);
    }

    /* renamed from: m0 */
    public void mo8891m0(View view, int i) {
        String obj = ((EditText) view).getText().toString();
        if (!obj.isEmpty()) {
            ArrayList<C2277g> arrayList = this.f7663e0;
            if (arrayList != null && i >= 0 && i <= arrayList.size()) {
                this.f7663e0.get(i).mo9006d(obj);
            } else {
                return;
            }
        }
        try {
            this.f7662d0.notifyItemChanged(i);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o */
    public void mo8892o(int i) {
        int i2;
        C2275e.m10596a(this, this.f7666h0);
        int i3 = 0;
        if (this.f7663e0 != null) {
            int i4 = 0;
            while (i3 < this.f7663e0.size()) {
                if (this.f7663e0.get(i3).mo9004b().indexOf(getResources().getString(C2311u.marquee_color)) != -1) {
                    String substring = this.f7663e0.get(i3).mo9004b().substring(this.f7663e0.get(i3).mo9004b().lastIndexOf(" ") + 1, this.f7663e0.get(i3).mo9004b().length());
                    try {
                        if (Integer.parseInt(substring) > i4) {
                            i4 = Integer.parseInt(substring);
                        }
                    } catch (Throwable th) {
                        Log.d("测试" + getClass().getSimpleName(), "onAddClick=" + th.getMessage());
                    }
                }
                i3++;
            }
            i3 = i4;
        }
        int i5 = i3 + 1;
        if (C2298o.m10733V1() && C2298o.m10718Q1() != 0) {
            i2 = C2298o.m10718Q1();
        } else if (C2298o.m10761f1() == 0) {
            i2 = C2298o.m10718Q1() != 0 ? C2298o.m10718Q1() : -43230;
        } else {
            i2 = C2298o.m10761f1();
        }
        Log.d("测试" + getClass().getSimpleName(), "#strColor=" + i2);
        C2267b bVar = new C2267b(this, i2);
        bVar.mo14670s(new C2244d(i5, i));
        bVar.mo14668q(true);
        bVar.mo14669r(true);
        bVar.show();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && C4326a.m18907f().mo14749c(this)) {
            this.f7670l0.setChecked(true);
            this.f7671m0 = true;
            C2296m.m10662f(this, true);
        }
    }

    public void onBackPressed() {
        finish();
        overridePendingTransition(0, C2306q.menu_out);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f7662d0.mo9014g(this);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        SharedPreferences.Editor edit = this.f7805z.edit();
        edit.putBoolean("marquee_enable", this.f7635C.mo8963d());
        edit.putInt("marquee_radian", this.f7638F.getValue());
        edit.putInt("marquee_radian_top_out", this.f7639G.getValue());
        edit.putInt("marquee_radian_bottom_in", this.f7640H.getValue());
        edit.putInt("marquee_radian_bottom_out", this.f7641I.getValue());
        edit.putInt("marquee_width", this.f7651S.getValue());
        edit.putInt("marquee_speed", this.f7652T.getValue());
        edit.apply();
        if (this.f7663e0 != null) {
            C2279i.m10611b(this).mo9008d(this.f7663e0);
        }
        View currentFocus = getCurrentFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null && currentFocus != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        AppCompatCheckBox appCompatCheckBox;
        super.onResume();
        if (!C4326a.m18907f().mo14749c(this) && (appCompatCheckBox = this.f7670l0) != null) {
            appCompatCheckBox.setChecked(false);
            this.f7671m0 = false;
            C2296m.m10662f(this, false);
        }
    }

    /* renamed from: z1 */
    public void mo8893z1(int i) {
        this.f7662d0.notifyItemChanged(i);
    }
}
