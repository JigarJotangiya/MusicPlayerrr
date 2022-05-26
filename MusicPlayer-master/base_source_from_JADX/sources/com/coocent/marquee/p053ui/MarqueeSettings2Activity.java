package com.coocent.marquee.p053ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0506a;
import androidx.core.widget.C0549e;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.marquee.C2267b;
import com.coocent.marquee.C2268c;
import com.coocent.marquee.C2274d;
import com.coocent.marquee.C2275e;
import com.coocent.marquee.C2277g;
import com.coocent.marquee.C2279i;
import com.coocent.marquee.C2280j;
import com.coocent.marquee.C2296m;
import com.coocent.marquee.C2298o;
import com.coocent.marquee.C2306q;
import com.coocent.marquee.C2307r;
import com.coocent.marquee.C2308s;
import com.coocent.marquee.C2310t;
import com.coocent.marquee.C2311u;
import com.coocent.marquee.C2326v;
import com.coocent.marquee.MarqueeSeekBarView;
import com.coocent.marquee.MarqueeSweepGradientView;
import com.coocent.marquee.MarqueeSwitchButton;
import com.coocent.marquee.MarqueeSwitchButton2;
import com.coocent.marquee.SettingsBaseActivity;
import com.coocent.marquee.p054x.C2329a;
import com.coocent.marquee.p054x.C2330b;
import com.coocent.marquee.p055y.C2333a;
import com.google.android.material.snackbar.Snackbar;
import java.util.ArrayList;
import java.util.List;
import p159f.p166c.p167a.p168c.C4306a;
import p159f.p166c.p176c.C4326a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity */
public class MarqueeSettings2Activity extends SettingsBaseActivity implements C2268c.C2270b, View.OnClickListener, C2330b.C2331a {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public MarqueeSweepGradientView f8072A;

    /* renamed from: B */
    private ConstraintLayout f8073B;

    /* renamed from: C */
    private MarqueeSwitchButton f8074C;

    /* renamed from: D */
    private MarqueeSwitchButton f8075D;

    /* renamed from: E */
    private MarqueeSwitchButton2 f8076E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public MarqueeSeekBarView f8077F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public MarqueeSeekBarView f8078G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public TextView f8079H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public TextView f8080I;

    /* renamed from: J */
    private TextView f8081J;

    /* renamed from: K */
    private TextView f8082K;

    /* renamed from: L */
    private TextView f8083L;

    /* renamed from: M */
    private MarqueeSeekBarView f8084M;

    /* renamed from: N */
    private MarqueeSeekBarView f8085N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public TextView f8086O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public TextView f8087P;

    /* renamed from: Q */
    private RelativeLayout f8088Q;

    /* renamed from: R */
    private ImageView f8089R;

    /* renamed from: S */
    private TextView f8090S;

    /* renamed from: T */
    private TextView f8091T;

    /* renamed from: U */
    private TextView f8092U;

    /* renamed from: V */
    private TextView f8093V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public RecyclerView f8094W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public C2268c f8095X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public ArrayList<C2277g> f8096Y;

    /* renamed from: Z */
    private ConstraintLayout f8097Z;

    /* renamed from: a0 */
    private List<View> f8098a0 = new ArrayList();

    /* renamed from: b0 */
    private View f8099b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public AppCompatCheckBox f8100c0;

    /* renamed from: d0 */
    private boolean f8101d0;

    /* renamed from: e0 */
    private AppCompatCheckBox f8102e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public boolean f8103f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public TextView f8104g0;

    /* renamed from: h0 */
    private TextView f8105h0;

    /* renamed from: i0 */
    private C2329a f8106i0;

    /* renamed from: j0 */
    private TextView f8107j0;

    /* renamed from: k0 */
    private ImageView f8108k0;

    /* renamed from: l0 */
    private ImageView f8109l0;

    /* renamed from: m0 */
    private ImageView f8110m0;

    /* renamed from: n0 */
    private ImageView f8111n0;

    /* renamed from: o0 */
    private View.OnClickListener f8112o0 = new C2313b();

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$a */
    class C2312a implements C2280j.C2284d {
        C2312a() {
        }

        /* renamed from: a */
        public void mo9011a() {
            MarqueeSettings2Activity.this.finish();
            MarqueeSettings2Activity.this.overridePendingTransition(0, C2306q.menu_out);
            MarqueeSettings2Activity.this.m10880F2();
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$b */
    class C2313b implements View.OnClickListener {
        C2313b() {
        }

        public void onClick(View view) {
            MarqueeSettings2Activity.this.onBackPressed();
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$c */
    class C2314c implements C4306a.C4308b {

        /* renamed from: g */
        final /* synthetic */ int f8115g;

        C2314c(int i) {
            this.f8115g = i;
        }

        /* renamed from: c */
        public void mo8769c() {
        }

        /* renamed from: d */
        public void mo8770d(int i, String str) {
            ((C2277g) MarqueeSettings2Activity.this.f8096Y.get(this.f8115g - 1)).mo9005c(String.format("#%08X", new Object[]{Integer.valueOf(i)}));
            MarqueeSettings2Activity.this.f8095X.notifyItemChanged(this.f8115g);
            MarqueeSettings2Activity.this.m10881G2();
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$d */
    class C2315d implements C4306a.C4308b {

        /* renamed from: g */
        final /* synthetic */ int f8117g;

        C2315d(int i) {
            this.f8117g = i;
        }

        /* renamed from: c */
        public void mo8769c() {
        }

        /* renamed from: d */
        public void mo8770d(int i, String str) {
            String format = String.format("#%08X", new Object[]{Integer.valueOf(i)});
            C2277g gVar = new C2277g();
            gVar.mo9006d(MarqueeSettings2Activity.this.getResources().getString(C2311u.marquee_color) + " " + this.f8117g);
            gVar.mo9005c(format);
            MarqueeSettings2Activity.this.f8096Y.add(gVar);
            MarqueeSettings2Activity.this.m10881G2();
            MarqueeSettings2Activity.this.f8095X.notifyDataSetChanged();
            MarqueeSettings2Activity.this.f8094W.mo4657q1(MarqueeSettings2Activity.this.f8095X.getItemCount() - 1);
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$e */
    class C2316e implements View.OnClickListener {

        /* renamed from: g */
        final /* synthetic */ int f8119g;

        C2316e(int i) {
            this.f8119g = i;
        }

        public void onClick(View view) {
            int i = this.f8119g - 1;
            if (i >= 0 && i < MarqueeSettings2Activity.this.f8096Y.size()) {
                MarqueeSettings2Activity.this.f8096Y.remove(i);
                MarqueeSettings2Activity.this.m10881G2();
                MarqueeSettings2Activity.this.f8095X.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$f */
    class C2317f implements MarqueeSwitchButton.C2262a {
        C2317f() {
        }

        /* renamed from: a */
        public void mo8897a(boolean z) {
            SharedPreferences.Editor edit = MarqueeSettings2Activity.this.f7805z.edit();
            edit.putBoolean("marquee_enable", z);
            edit.apply();
            if (z) {
                MarqueeSettings2Activity.this.mo8887g2(true, false);
            } else {
                MarqueeSettings2Activity.this.mo8887g2(false, true);
            }
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$g */
    class C2318g implements MarqueeSwitchButton.C2262a {
        C2318g() {
        }

        /* renamed from: a */
        public void mo8897a(boolean z) {
            SharedPreferences.Editor edit = MarqueeSettings2Activity.this.f7805z.edit();
            edit.putBoolean("marquee_enable", z);
            edit.apply();
            if (z) {
                MarqueeSettings2Activity.this.mo8887g2(true, false);
            } else {
                MarqueeSettings2Activity.this.mo8887g2(false, true);
            }
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$h */
    class C2319h implements CompoundButton.OnCheckedChangeListener {
        C2319h() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MarqueeSettings2Activity.this.m10879E2(z);
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$i */
    class C2320i implements CompoundButton.OnCheckedChangeListener {
        C2320i() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean unused = MarqueeSettings2Activity.this.f8103f0 = z;
            MarqueeSettings2Activity.this.f8104g0.setText(MarqueeSettings2Activity.this.getResources().getString(MarqueeSettings2Activity.this.f8103f0 ? C2311u.marquee_link_outer_radians : C2311u.marquee_unlink_outer_radians));
            MarqueeSettings2Activity.this.f8077F.setCurrentValue(MarqueeSettings2Activity.this.f8078G.getValue());
            MarqueeSettings2Activity.this.f8077F.setLink(MarqueeSettings2Activity.this.f8103f0);
            MarqueeSettings2Activity.this.f8072A.setRadiusTopIn(MarqueeSettings2Activity.this.f8078G.getValue());
            MarqueeSettings2Activity.this.f8072A.setRadiusBottomIn(MarqueeSettings2Activity.this.f8078G.getValue());
            MarqueeSettings2Activity.this.f8079H.setText(String.valueOf(MarqueeSettings2Activity.this.f8078G.getValue()));
            C2296m.m10663g(MarqueeSettings2Activity.this, z);
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$j */
    class C2321j implements View.OnClickListener {
        C2321j() {
        }

        public void onClick(View view) {
            MarqueeSettings2Activity.this.f8100c0.performClick();
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$k */
    class C2322k implements MarqueeSeekBarView.C2260a {
        C2322k() {
        }

        /* renamed from: a */
        public void mo8894a(int i, boolean z, boolean z2) {
            MarqueeSettings2Activity.this.f8072A.setRadiusTopOut(i);
            MarqueeSettings2Activity.this.f8072A.setRadiusBottomOut(i);
            MarqueeSettings2Activity.this.f8080I.setText(String.valueOf(i));
            if (MarqueeSettings2Activity.this.f8103f0) {
                MarqueeSettings2Activity.this.f8077F.setCurrentValue(MarqueeSettings2Activity.this.f8078G.getValue());
            }
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$l */
    class C2323l implements MarqueeSeekBarView.C2260a {
        C2323l() {
        }

        /* renamed from: a */
        public void mo8894a(int i, boolean z, boolean z2) {
            MarqueeSettings2Activity.this.f8072A.setRadiusTopIn(i);
            MarqueeSettings2Activity.this.f8072A.setRadiusBottomIn(i);
            MarqueeSettings2Activity.this.f8079H.setText(String.valueOf(i));
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$m */
    class C2324m implements MarqueeSeekBarView.C2260a {
        C2324m() {
        }

        /* renamed from: a */
        public void mo8894a(int i, boolean z, boolean z2) {
            MarqueeSettings2Activity.this.f8072A.setWidth(i);
            MarqueeSettings2Activity.this.f8086O.setText(String.valueOf(i + 1));
        }
    }

    /* renamed from: com.coocent.marquee.ui.MarqueeSettings2Activity$n */
    class C2325n implements MarqueeSeekBarView.C2260a {
        C2325n() {
        }

        /* renamed from: a */
        public void mo8894a(int i, boolean z, boolean z2) {
            MarqueeSettings2Activity.this.f8072A.setBaseRotate(i);
            MarqueeSettings2Activity.this.f8087P.setText(String.valueOf(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public void m10879E2(boolean z) {
        this.f8101d0 = z;
        if (!z) {
            C2296m.m10661e(this, 1);
            this.f8100c0.setChecked(false);
            C2296m.m10662f(this, false);
        } else if (C4326a.m18907f().mo14749c(this)) {
            this.f8100c0.setChecked(true);
            C2296m.m10662f(this, true);
        } else {
            this.f8101d0 = false;
            C4326a.m18907f().mo14748b(this, C2326v.Theme_AppCompat_Light_Dialog_Alert);
            this.f8100c0.setChecked(false);
            C2296m.m10662f(this, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public void m10880F2() {
        super.onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public void m10881G2() {
        int size = this.f8096Y.size() + 1;
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                iArr[i] = iArr[0];
            } else {
                iArr[i] = Color.parseColor(this.f8096Y.get(i).mo9003a());
            }
        }
        MarqueeSweepGradientView marqueeSweepGradientView = this.f8072A;
        if (marqueeSweepGradientView != null) {
            marqueeSweepGradientView.setColors(iArr);
        }
    }

    /* renamed from: B0 */
    public boolean mo9086B0(int i, int i2) {
        int i3;
        if (i2 == 0 || i == 0 || i - 1 < 0 || i3 >= this.f8096Y.size()) {
            return false;
        }
        this.f8096Y.remove(i3);
        this.f8096Y.add(i2 - 1, this.f8096Y.get(i3));
        this.f8095X.notifyItemMoved(i, i2);
        return true;
    }

    /* renamed from: S0 */
    public void mo9087S0() {
        m10881G2();
    }

    /* renamed from: b */
    public void mo8997b(int i) {
        C2267b bVar = new C2267b(this, Color.parseColor(this.f8096Y.get(i - 1).mo9003a()));
        bVar.mo14670s(new C2314c(i));
        bVar.mo14668q(true);
        bVar.mo14669r(true);
        try {
            bVar.show();
        } catch (WindowManager.BadTokenException e) {
            Log.d(BuildConfig.FLAVOR, "异常##" + e.getMessage());
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C2275e.m10597b(this, motionEvent, this.f8098a0);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e2 */
    public void mo8886e2(int i) {
        this.f8078G.setCurrentValue(i);
        this.f8077F.setCurrentValue(i);
        this.f8080I.setText(String.valueOf(i));
        this.f8079H.setText(String.valueOf(i));
        this.f8072A.setRadiusTopOut(i);
        this.f8072A.setRadiusBottomOut(i);
        this.f8072A.setRadiusTopIn(i);
        this.f8072A.setRadiusBottomIn(i);
    }

    /* renamed from: g2 */
    public void mo8887g2(boolean z, boolean z2) {
        int i = 0;
        boolean z3 = this.f7805z.getBoolean("marquee_enable", false);
        if (z) {
            z3 = true;
        }
        if (z2) {
            z3 = false;
        }
        this.f8074C.setIsShow(z3);
        this.f8074C.setOnBitmap(C2298o.m10694I1());
        this.f8076E.setIsShow(z3);
        this.f8075D.setIsShow(z3);
        this.f8077F.setEnable(z3);
        this.f8077F.mo8922g(C2298o.m10732V0(), z3);
        this.f8078G.setEnable(z3);
        this.f8078G.mo8922g(C2298o.m10732V0(), z3);
        this.f8084M.setEnable(z3);
        this.f8084M.mo8922g(C2298o.m10732V0(), z3);
        this.f8085N.setEnable(z3);
        this.f8085N.mo8922g(C2298o.m10732V0(), z3);
        this.f8081J.setEnabled(z3);
        this.f8100c0.setEnabled(z3);
        this.f8102e0.setEnabled(z3);
        if (!z3 && ((Boolean) this.f8105h0.getTag()).booleanValue()) {
            this.f8105h0.performClick();
        }
        this.f8105h0.setEnabled(z3);
        this.f8105h0.setVisibility(z3 ? 0 : 8);
        this.f8094W.setEnabled(z3);
        MarqueeSweepGradientView marqueeSweepGradientView = this.f8072A;
        if (!z3) {
            i = 8;
        }
        marqueeSweepGradientView.setVisibility(i);
        this.f8095X.mo8995g(z3 ? this : null);
        this.f8095X.notifyDataSetChanged();
    }

    /* renamed from: h2 */
    public void mo8888h2() {
        if (C2298o.m10721R1() != 0) {
            this.f8073B.setBackgroundColor(C2298o.m10721R1());
            this.f8088Q.setBackgroundColor(C2298o.m10721R1());
            this.f8099b0.setBackgroundColor(C2298o.m10721R1());
        } else {
            int b = C2274d.m10590b(C2298o.m10688G1());
            this.f8073B.setBackgroundColor(b);
            this.f8088Q.setBackgroundColor(b);
            this.f8099b0.setBackgroundColor(b);
        }
        this.f8097Z.setBackgroundColor(C2298o.m10720R0());
        if (C2298o.m10723S0() != 0) {
            this.f8097Z.setBackgroundResource(C2298o.m10723S0());
            this.f8073B.setBackgroundResource(C2298o.m10723S0());
            this.f8088Q.setBackgroundColor(0);
        }
        int e1 = C2298o.m10758e1();
        if (C2298o.m10699K0() != null) {
            this.f8089R.setImageDrawable(C2298o.m10699K0());
        } else if (C2298o.m10696J0() != -1) {
            this.f8089R.setImageResource(C2298o.m10696J0());
        } else if (e1 != -1) {
            this.f8089R.setImageDrawable(C2333a.f8191a.mo9132c(this, C2307r.marquee_btn_top_return_white, e1));
        } else {
            this.f8089R.setImageResource(C2307r.marquee_btn_top_return_white);
        }
        this.f8090S.setTextColor(C2298o.m10691H1());
        int[][] iArr = {new int[]{-16842912}, new int[]{16842912}};
        String format = String.format("%08X", new Object[]{Integer.valueOf(C2298o.m10718Q1())});
        C0549e.m3395c(this.f8100c0, new ColorStateList(iArr, new int[]{Color.parseColor("#7F" + format.substring(2)), C2298o.m10718Q1()}));
        int parseColor = Color.parseColor("#7F" + String.format("%08X", new Object[]{Integer.valueOf(e1)}).substring(2));
        C0549e.m3395c(this.f8102e0, new ColorStateList(iArr, new int[]{parseColor, e1}));
        this.f8107j0.setTextColor(parseColor);
        this.f8081J.setTextColor(e1);
        this.f8082K.setTextColor(e1);
        this.f8083L.setTextColor(e1);
        this.f8091T.setTextColor(e1);
        this.f8092U.setTextColor(e1);
        this.f8079H.setTextColor(e1);
        this.f8080I.setTextColor(e1);
        this.f8086O.setTextColor(e1);
        this.f8087P.setTextColor(e1);
        this.f8093V.setTextColor(e1);
        this.f8105h0.setTextColor(e1);
        this.f8104g0.setTextColor(e1);
        C2333a.C2334a aVar = C2333a.f8191a;
        this.f8105h0.setCompoundDrawablesRelativeWithIntrinsicBounds(aVar.mo9132c(this, C2307r.marquee_ic_color_edit, e1), (Drawable) null, (Drawable) null, (Drawable) null);
        this.f8108k0.setImageDrawable(aVar.mo9132c(this, C2307r.marquee_icon_edgelight_01_outerradian, e1));
        this.f8109l0.setImageDrawable(aVar.mo9132c(this, C2307r.marquee_icon_edgelight_02_radian, e1));
        this.f8110m0.setImageDrawable(aVar.mo9132c(this, C2307r.marquee_icon_edgelight_03_width, e1));
        this.f8111n0.setImageDrawable(aVar.mo9132c(this, C2307r.marquee_icon_edgelight_04_speed, e1));
        Drawable d = C0506a.m3152d(this, C2307r.marquee_bg_icon_settings);
        aVar.mo9131b(d, e1);
        this.f8108k0.setBackground(d);
        this.f8109l0.setBackground(d);
        this.f8110m0.setBackground(d);
        this.f8111n0.setBackground(d);
        this.f8077F.setEnable(true);
        this.f8077F.mo8922g(C2298o.m10732V0(), true);
        this.f8078G.setEnable(true);
        this.f8078G.mo8922g(C2298o.m10732V0(), true);
        this.f8084M.setEnable(true);
        this.f8084M.mo8922g(C2298o.m10732V0(), true);
        this.f8085N.setEnable(true);
        this.f8085N.mo8922g(C2298o.m10732V0(), true);
    }

    /* renamed from: i2 */
    public void mo8889i2() {
        this.f8108k0 = (ImageView) findViewById(C2308s.img_settings_outRadius);
        this.f8109l0 = (ImageView) findViewById(C2308s.img_settings_inRadius);
        this.f8110m0 = (ImageView) findViewById(C2308s.img_settings_width);
        this.f8111n0 = (ImageView) findViewById(C2308s.img_settings_speed);
        this.f8073B = (ConstraintLayout) findViewById(C2308s.mainRelLayout);
        this.f8097Z = (ConstraintLayout) findViewById(C2308s.contentRelLayout);
        this.f8088Q = (RelativeLayout) findViewById(C2308s.nav);
        this.f8099b0 = findViewById(C2308s.floatingLine);
        ImageView imageView = (ImageView) findViewById(C2308s.menuBtn);
        this.f8089R = imageView;
        imageView.setOnClickListener(this.f8112o0);
        this.f8090S = (TextView) findViewById(C2308s.title_main_text);
        this.f8072A = (MarqueeSweepGradientView) findViewById(C2308s.sweepView);
        this.f8096Y = C2279i.m10611b(this).mo9007a();
        m10881G2();
        this.f8074C = (MarqueeSwitchButton) findViewById(C2308s.marqueeSwitch);
        this.f8075D = (MarqueeSwitchButton) findViewById(C2308s.marqueeSwitch2_icon);
        this.f8076E = (MarqueeSwitchButton2) findViewById(C2308s.marqueeSwitch2_bg);
        if (!C2298o.m10739X1()) {
            this.f8074C.setVisibility(0);
            this.f8075D.setVisibility(8);
            this.f8076E.setVisibility(8);
        } else {
            this.f8074C.setVisibility(8);
            this.f8075D.setVisibility(0);
            this.f8076E.setVisibility(0);
        }
        this.f8074C.setOnchangeListener(new C2317f());
        this.f8075D.setOnchangeListener(new C2318g());
        boolean z = C2296m.m10659c(this) && C4326a.m18907f().mo14749c(this);
        this.f8101d0 = z;
        C2296m.m10662f(this, z);
        this.f8100c0 = (AppCompatCheckBox) findViewById(C2308s.floatingCheckBox);
        boolean z2 = C2296m.m10659c(this) && C4326a.m18907f().mo14749c(this);
        this.f8101d0 = z2;
        this.f8100c0.setChecked(z2);
        C2296m.m10662f(this, this.f8101d0);
        this.f8100c0.setOnCheckedChangeListener(new C2319h());
        this.f8104g0 = (TextView) findViewById(C2308s.tv_link);
        this.f8102e0 = (AppCompatCheckBox) findViewById(C2308s.chk_link);
        boolean d = C2296m.m10660d(this);
        this.f8103f0 = d;
        this.f8102e0.setChecked(d);
        this.f8104g0.setText(getResources().getString(this.f8103f0 ? C2311u.marquee_link_outer_radians : C2311u.marquee_unlink_outer_radians));
        this.f8102e0.setOnCheckedChangeListener(new C2320i());
        TextView textView = (TextView) findViewById(C2308s.floatingIcon);
        this.f8081J = textView;
        textView.setOnClickListener(new C2321j());
        this.f8082K = (TextView) findViewById(C2308s.radianIcon);
        this.f8083L = (TextView) findViewById(C2308s.radianTopOutIcon);
        this.f8091T = (TextView) findViewById(C2308s.widthIcon);
        this.f8092U = (TextView) findViewById(C2308s.speedIcon);
        this.f8079H = (TextView) findViewById(C2308s.radianTv);
        this.f8080I = (TextView) findViewById(C2308s.radianTopOutTv);
        this.f8086O = (TextView) findViewById(C2308s.widthTv);
        this.f8087P = (TextView) findViewById(C2308s.speedTv);
        this.f8077F = (MarqueeSeekBarView) findViewById(C2308s.radianView);
        this.f8078G = (MarqueeSeekBarView) findViewById(C2308s.radianTopOutView);
        this.f8084M = (MarqueeSeekBarView) findViewById(C2308s.widthView);
        this.f8085N = (MarqueeSeekBarView) findViewById(C2308s.speedView);
        int i = this.f7805z.getInt("marquee_radian_top_out", C2298o.m10770i1());
        int i2 = this.f8103f0 ? i : this.f7805z.getInt("marquee_radian", C2298o.m10773j1());
        int i3 = this.f7805z.getInt("marquee_width", C2298o.m10706M1());
        int i4 = this.f7805z.getInt("marquee_speed", C2298o.m10676C1());
        this.f8080I.setText(String.valueOf(i));
        this.f8079H.setText(String.valueOf(i2));
        this.f8086O.setText(String.valueOf(i3 + 1));
        this.f8087P.setText(String.valueOf(i4));
        this.f8072A.mo8945e(i2, i2, i, i, i3, i4);
        this.f8078G.setEnable(true);
        this.f8078G.mo8922g(C2298o.m10776k1(), true);
        this.f8078G.setMaxValue(60);
        this.f8078G.setCurrentValue(i);
        this.f8078G.setOnSeekBarChangeListener(new C2322k());
        this.f8077F.setEnable(true);
        this.f8077F.mo8922g(C2298o.m10776k1(), true);
        this.f8077F.setMaxValue(60);
        this.f8077F.setCurrentValue(i2);
        this.f8077F.setLink(this.f8103f0);
        this.f8077F.setOnSeekBarChangeListener(new C2323l());
        this.f8084M.setEnable(true);
        this.f8084M.mo8922g(C2298o.m10709N1(), true);
        this.f8084M.setMaxValue(10);
        this.f8084M.setCurrentValue(i3);
        this.f8084M.setOnSeekBarChangeListener(new C2324m());
        this.f8085N.setEnable(true);
        this.f8085N.mo8922g(C2298o.m10679D1(), true);
        this.f8085N.setMaxValue(15);
        this.f8085N.setCurrentValue(i4);
        this.f8085N.setOnSeekBarChangeListener(new C2325n());
        this.f8093V = (TextView) findViewById(C2308s.pickerTitleTv);
        this.f8107j0 = (TextView) findViewById(C2308s.tv_tip_press);
        TextView textView2 = (TextView) findViewById(C2308s.tv_edit);
        this.f8105h0 = textView2;
        textView2.setTag(Boolean.FALSE);
        this.f8105h0.setOnClickListener(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(C2308s.marqueeRecView);
        this.f8094W = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f8094W.setLayoutManager(new GridLayoutManager(this, 5));
        C2329a aVar = new C2329a(this);
        this.f8106i0 = aVar;
        aVar.mo5310j(this.f8094W);
        this.f8106i0.mo9125K(false);
        this.f8106i0.mo9126L(false);
        C2268c cVar = new C2268c(this, this.f8096Y, this);
        this.f8095X = cVar;
        this.f8094W.setAdapter(cVar);
        this.f8098a0.add(this.f8094W);
        this.f8102e0.setButtonDrawable(C2307r.marquee_bg_check_box_link);
    }

    /* renamed from: k2 */
    public void mo8890k2() {
        setContentView(C2310t.marquee_activity_settings2);
    }

    /* renamed from: l1 */
    public void mo8998l1(RecyclerView.C0792c0 c0Var) {
        this.f8106i0.mo5308E(c0Var);
    }

    /* renamed from: o */
    public void mo8999o(int i) {
        int i2;
        int i3 = 0;
        if (this.f8096Y != null) {
            int i4 = 0;
            while (i3 < this.f8096Y.size()) {
                if (this.f8096Y.get(i3).mo9004b().indexOf(getResources().getString(C2311u.marquee_color)) != -1) {
                    String substring = this.f8096Y.get(i3).mo9004b().substring(this.f8096Y.get(i3).mo9004b().lastIndexOf(" ") + 1, this.f8096Y.get(i3).mo9004b().length());
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
        bVar.mo14670s(new C2315d(i5));
        bVar.mo14668q(true);
        bVar.mo14669r(true);
        bVar.show();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && C4326a.m18907f().mo14749c(this)) {
            this.f8100c0.setChecked(true);
            this.f8101d0 = true;
            C2296m.m10662f(this, true);
        }
    }

    public void onBackPressed() {
        C2280j.m10625k(this, new C2312a());
    }

    public void onClick(View view) {
        if (view.getId() == this.f8105h0.getId()) {
            boolean z = !((Boolean) this.f8105h0.getTag()).booleanValue();
            this.f8105h0.setTag(Boolean.valueOf(z));
            this.f8105h0.setCompoundDrawablesRelativeWithIntrinsicBounds(C2333a.f8191a.mo9132c(this, z ? C2307r.marquee_ic_color_done : C2307r.marquee_ic_color_edit, C2298o.m10758e1()), (Drawable) null, (Drawable) null, (Drawable) null);
            this.f8105h0.setText(getResources().getString(z ? C2311u.marquee_done : C2311u.marquee_edit));
            this.f8107j0.setVisibility(z ? 0 : 8);
            this.f8095X.mo8994f(z);
            this.f8095X.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f8095X.mo8995g((C2268c.C2270b) null);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        SharedPreferences.Editor edit = this.f7805z.edit();
        edit.putBoolean("marquee_enable", this.f8074C.mo8963d());
        edit.putInt("marquee_radian", this.f8077F.getValue());
        edit.putInt("marquee_radian_top_out", this.f8078G.getValue());
        edit.putInt("marquee_radian_bottom_in", this.f8077F.getValue());
        edit.putInt("marquee_radian_bottom_out", this.f8078G.getValue());
        edit.putInt("marquee_width", this.f8084M.getValue());
        edit.putInt("marquee_speed", this.f8085N.getValue());
        edit.apply();
        if (this.f8096Y != null) {
            C2279i.m10611b(this).mo9008d(this.f8096Y);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        AppCompatCheckBox appCompatCheckBox;
        super.onResume();
        if ((!C4326a.m18907f().mo14749c(this) || !C2296m.m10659c(this)) && (appCompatCheckBox = this.f8100c0) != null) {
            appCompatCheckBox.setChecked(false);
            this.f8101d0 = false;
            C2296m.m10662f(this, false);
        }
    }

    /* renamed from: p0 */
    public void mo9090p0(int i) {
    }

    /* renamed from: x */
    public void mo9000x(View view, int i) {
        Snackbar X = Snackbar.m37002X(view, getString(C2311u.marquee_delete_item), -1);
        X.mo24687Z(getString(C2311u.marquee_ok), new C2316e(i));
        X.mo24688a0(Color.parseColor(C2298o.m10688G1()));
        View B = X.mo24632B();
        ((TextView) B.findViewById(C2308s.snackbar_text)).setTextColor(C2298o.m10758e1());
        B.setBackgroundColor(C2298o.m10673B1());
        X.mo24640N();
    }
}
