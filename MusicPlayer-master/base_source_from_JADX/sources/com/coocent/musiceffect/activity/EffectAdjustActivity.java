package com.coocent.musiceffect.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.coocent.musiceffect.view.BezierView;
import com.coocent.musiceffect.view.EffectArcSeekbar;
import com.coocent.musiceffect.view.EffectVerticalSeekbar;
import com.coocent.musiceffect.view.PresetTextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p159f.p166c.p171b.p172a.C4315c;
import p159f.p166c.p201g.C4506a;
import p159f.p166c.p201g.C4507b;
import p159f.p166c.p201g.C4509d;
import p159f.p166c.p201g.C4510e;
import p159f.p166c.p201g.C4511f;
import p159f.p166c.p201g.C4512g;
import p159f.p166c.p201g.C4513h;
import p159f.p166c.p201g.p202j.C4515a;
import p159f.p166c.p201g.p203k.C4533a;
import p159f.p166c.p201g.p204l.C4545a;
import p159f.p166c.p201g.p205m.C4547a;
import p159f.p166c.p201g.p205m.C4550b;
import p159f.p166c.p201g.p205m.C4552c;
import p159f.p166c.p201g.p205m.C4555d;
import p159f.p166c.p201g.p207o.C4563a;
import p159f.p166c.p201g.p208p.C4565a;
import p159f.p166c.p201g.p208p.C4568c;
import p159f.p166c.p201g.p208p.C4569d;
import p159f.p166c.p201g.p208p.C4570e;
import p159f.p166c.p201g.p208p.C4573g;

public class EffectAdjustActivity extends AppCompatActivity implements View.OnClickListener, C4563a {

    /* renamed from: A */
    private ImageView f8634A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public BezierView f8635B;

    /* renamed from: C */
    private PresetTextView f8636C;

    /* renamed from: D */
    private PresetTextView f8637D;

    /* renamed from: E */
    private RecyclerView f8638E;

    /* renamed from: F */
    private EffectArcSeekbar f8639F;

    /* renamed from: G */
    private EffectArcSeekbar f8640G;

    /* renamed from: H */
    private FrameLayout f8641H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C4515a f8642I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public int[] f8643J;

    /* renamed from: K */
    private List<C4315c> f8644K;

    /* renamed from: L */
    private List<C4315c> f8645L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public AudioManager f8646M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public Vibrator f8647N;

    /* renamed from: O */
    private C4533a f8648O;

    /* renamed from: P */
    private BroadcastReceiver f8649P = new C2462f();

    /* renamed from: z */
    private ImageView f8650z;

    /* renamed from: com.coocent.musiceffect.activity.EffectAdjustActivity$a */
    class C2457a implements C4515a.C4518c {
        C2457a() {
        }

        /* renamed from: a */
        public void mo9519a(EffectVerticalSeekbar effectVerticalSeekbar, int i) {
            effectVerticalSeekbar.setProgress((((effectVerticalSeekbar.getProgress() - 1500) / 100) * 100) + 1500);
            EffectAdjustActivity.this.m11523w2();
            EffectAdjustActivity.this.m11524x2();
        }

        /* renamed from: b */
        public void mo9520b(EffectVerticalSeekbar effectVerticalSeekbar, int i, boolean z, int i2) {
            EffectAdjustActivity.this.f8635B.mo9563d(i2, i);
            int i3 = (i - 1500) / 100;
            if (z) {
                EffectAdjustActivity.this.f8643J[i2] = i3;
                EffectAdjustActivity.this.m11518r2();
                C4507b.m19752h(i2, i3);
                EffectAdjustActivity.this.f8647N.vibrate(new long[]{0, 15}, -1);
            }
        }
    }

    /* renamed from: com.coocent.musiceffect.activity.EffectAdjustActivity$b */
    class C2458b implements EffectArcSeekbar.C2469b {
        C2458b() {
        }

        /* renamed from: a */
        public void mo9521a(EffectArcSeekbar effectArcSeekbar) {
            C4568c.m19956o(EffectAdjustActivity.this, effectArcSeekbar.getProgress());
            EffectAdjustActivity.this.m11524x2();
        }

        /* renamed from: b */
        public void mo9522b(int i, boolean z) {
            if (z) {
                C4507b.m19750f(i);
                EffectAdjustActivity.this.f8647N.vibrate(new long[]{0, 15}, -1);
            }
        }
    }

    /* renamed from: com.coocent.musiceffect.activity.EffectAdjustActivity$c */
    class C2459c implements EffectArcSeekbar.C2469b {
        C2459c() {
        }

        /* renamed from: a */
        public void mo9521a(EffectArcSeekbar effectArcSeekbar) {
            C4568c.m19960s(EffectAdjustActivity.this, effectArcSeekbar.getProgress());
            EffectAdjustActivity.this.m11524x2();
        }

        /* renamed from: b */
        public void mo9522b(int i, boolean z) {
            if (z) {
                C4507b.m19759o(i);
                EffectAdjustActivity.this.f8647N.vibrate(new long[]{0, 15}, -1);
            }
        }
    }

    /* renamed from: com.coocent.musiceffect.activity.EffectAdjustActivity$d */
    class C2460d implements C4547a.C4549b {
        C2460d() {
        }

        /* renamed from: a */
        public void mo9523a() {
            EffectAdjustActivity effectAdjustActivity = EffectAdjustActivity.this;
            C4555d dVar = new C4555d(effectAdjustActivity, effectAdjustActivity.f8643J);
            dVar.mo15255f(EffectAdjustActivity.this);
            dVar.show();
        }

        /* renamed from: b */
        public void mo9524b(int i, C4315c cVar) {
            C4550b bVar = new C4550b(EffectAdjustActivity.this, i, cVar);
            bVar.mo15249n(EffectAdjustActivity.this);
            bVar.show();
        }

        /* renamed from: c */
        public void mo9525c(int i, C4315c cVar) {
            EffectAdjustActivity.this.m11503B2(cVar);
            EffectAdjustActivity.this.f8642I.mo15207h(EffectAdjustActivity.this.f8643J);
            int[] unused = EffectAdjustActivity.this.f8643J = Arrays.copyOf(cVar.mo14718g(), cVar.mo14718g().length);
            EffectAdjustActivity.this.f8642I.mo15206g(EffectAdjustActivity.this.f8643J);
            C4507b.m19754j(EffectAdjustActivity.this.f8643J);
            EffectAdjustActivity.this.m11523w2();
            EffectAdjustActivity.this.m11524x2();
        }
    }

    /* renamed from: com.coocent.musiceffect.activity.EffectAdjustActivity$e */
    class C2461e implements C4552c.C4554b {
        C2461e() {
        }

        /* renamed from: a */
        public void mo9526a(int i) {
            if (i > 0) {
                if (EffectAdjustActivity.this.f8646M == null) {
                    EffectAdjustActivity effectAdjustActivity = EffectAdjustActivity.this;
                    AudioManager unused = effectAdjustActivity.f8646M = (AudioManager) effectAdjustActivity.getSystemService("audio");
                }
                if (EffectAdjustActivity.this.f8646M.getStreamVolume(3) == 0) {
                    Toast.makeText(EffectAdjustActivity.this, C4513h.boost_zero, 0).show();
                    return;
                }
            }
            EffectAdjustActivity.this.m11504C2(i);
            C4507b.m19756l(i);
            C4568c.m19959r(EffectAdjustActivity.this, i);
            EffectAdjustActivity.this.m11524x2();
        }
    }

    /* renamed from: com.coocent.musiceffect.activity.EffectAdjustActivity$f */
    class C2462f extends BroadcastReceiver {
        C2462f() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (C4506a.m19739m(context).equals(action)) {
                EffectAdjustActivity.this.m11525y2(intent.getBooleanExtra("enable", false));
            } else if (C4506a.m19740n(context).equals(action)) {
                EffectAdjustActivity.this.m11504C2(0);
            }
        }
    }

    /* renamed from: A2 */
    private void m11502A2(View view) {
        C4552c cVar = new C4552c(this, this.f8645L, view.getWidth(), C4569d.m19968a(this, 245.0f));
        cVar.mo15254b(new C2461e());
        cVar.showAsDropDown(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public void m11503B2(C4315c cVar) {
        int i;
        PresetTextView presetTextView = this.f8636C;
        if (presetTextView != null) {
            presetTextView.setText(cVar.mo14714c());
            if (cVar.mo14713b() < C4506a.m19734h().length) {
                i = C4506a.m19734h()[cVar.mo14713b()];
            } else {
                i = C4506a.m19734h()[0];
            }
            this.f8636C.mo9595q(i, C4510e.ic_arrow_down);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public void m11504C2(int i) {
        int i2;
        if (i >= 0 && i < this.f8645L.size()) {
            C4315c cVar = this.f8645L.get(i);
            PresetTextView presetTextView = this.f8637D;
            if (presetTextView != null) {
                presetTextView.setText(cVar.mo14714c());
                if (cVar.mo14713b() < C4506a.m19736j().length) {
                    i2 = C4506a.m19736j()[cVar.mo14713b()];
                } else {
                    i2 = C4506a.m19736j()[0];
                }
                this.f8637D.mo9595q(i2, C4510e.ic_arrow_down);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public void m11518r2() {
        C4315c cVar;
        Iterator<C4315c> it = this.f8644K.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            }
            cVar = it.next();
            if (Arrays.equals(this.f8643J, cVar.mo14718g())) {
                break;
            }
        }
        if (cVar != null) {
            m11503B2(cVar);
            return;
        }
        C4315c cVar2 = new C4315c();
        cVar2.mo14721j(getString(C4513h.effect_custom));
        m11503B2(cVar2);
    }

    /* renamed from: s2 */
    private void m11519s2() {
        this.f8635B.setNum(C4506a.m19730d());
        int[] g = C4568c.m19948g(this);
        this.f8643J = g;
        this.f8642I.mo15206g(g);
        this.f8644K = new C4545a(this).mo14733c();
        m11518r2();
        this.f8645L = new ArrayList();
        String[] k = C4506a.m19737k(this);
        int i = 0;
        for (int i2 = 0; i2 < k.length; i2++) {
            C4315c cVar = new C4315c();
            cVar.mo14720i(i2);
            cVar.mo14721j(k[i2]);
            this.f8645L.add(cVar);
        }
        if (this.f8646M.getStreamVolume(3) == 0) {
            C4568c.m19959r(this, 0);
        } else {
            i = C4568c.m19951j(this);
        }
        m11504C2(i);
        this.f8639F.mo9569f(C4568c.m19945d(this), true);
        this.f8640G.mo9569f(C4568c.m19955n(this), true);
        m11525y2(C4565a.m19902a().f13259b);
    }

    /* renamed from: t2 */
    private void m11520t2() {
        this.f8650z.setOnClickListener(this);
        this.f8634A.setOnClickListener(this);
        this.f8636C.setOnClickListener(this);
        this.f8637D.setOnClickListener(this);
        this.f8642I.mo15208i(new C2457a());
        this.f8639F.setOnProgressChangedListener(new C2458b());
        this.f8640G.setOnProgressChangedListener(new C2459c());
    }

    /* renamed from: u2 */
    private void m11521u2() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C4506a.m19739m(this));
        intentFilter.addAction(C4506a.m19740n(this));
        registerReceiver(this.f8649P, intentFilter);
    }

    /* renamed from: v2 */
    private void m11522v2() {
        this.f8650z = (ImageView) findViewById(C4511f.iv_back);
        this.f8634A = (ImageView) findViewById(C4511f.iv_switch);
        this.f8635B = (BezierView) findViewById(C4511f.bezier_view);
        this.f8636C = (PresetTextView) findViewById(C4511f.tv_preset);
        this.f8637D = (PresetTextView) findViewById(C4511f.tv_reverb);
        this.f8638E = (RecyclerView) findViewById(C4511f.rv_equalizer);
        this.f8639F = (EffectArcSeekbar) findViewById(C4511f.sb_bass);
        this.f8640G = (EffectArcSeekbar) findViewById(C4511f.sb_virtual);
        FrameLayout frameLayout = (FrameLayout) findViewById(C4511f.ad_layout);
        this.f8641H = frameLayout;
        C4570e.m19971b(this, frameLayout);
        C4515a aVar = new C4515a(C4506a.m19731e());
        this.f8642I = aVar;
        this.f8638E.setAdapter(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: w2 */
    public void m11523w2() {
        C4568c.m19958q(this, this.f8643J);
    }

    /* access modifiers changed from: private */
    /* renamed from: x2 */
    public void m11524x2() {
        if (C4565a.m19902a().f13264g >= 0) {
            C4565a.m19902a().mo15298i(this, -1);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public void m11525y2(boolean z) {
        this.f8634A.setSelected(z);
        this.f8635B.setEnabled(z);
        this.f8636C.setEnabled(z);
        this.f8637D.setEnabled(z);
        this.f8642I.mo15207h(this.f8643J);
        this.f8642I.mo15205f(z);
        this.f8639F.setEnabled(z);
        this.f8640G.setEnabled(z);
    }

    /* renamed from: z2 */
    private void m11526z2(View view) {
        C4547a aVar = new C4547a(this, this.f8644K, TextUtils.equals(this.f8636C.getText().toString(), getString(C4513h.effect_custom)), view.getWidth(), C4569d.m19968a(this, 280.0f));
        aVar.mo15248d(new C2460d());
        aVar.showAsDropDown(view);
    }

    /* renamed from: E */
    public void mo9515E(C4315c cVar) {
        m11503B2(cVar);
        this.f8644K.add(cVar);
    }

    /* renamed from: g1 */
    public void mo9516g1(int i, C4315c cVar) {
        if (this.f8636C.getText().toString().equals(cVar.mo14714c())) {
            C4315c cVar2 = new C4315c();
            cVar2.mo14721j(getString(C4513h.effect_custom));
            m11503B2(cVar2);
        }
        this.f8644K.remove(i);
    }

    /* renamed from: o1 */
    public void mo9517o1(int i, C4315c cVar, String str) {
        if (this.f8636C.getText().toString().equals(cVar.mo14714c())) {
            this.f8636C.setText(str);
        }
        this.f8644K.get(i).mo14721j(str);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == C4511f.iv_back) {
            onBackPressed();
        } else if (id == C4511f.iv_switch) {
            boolean z = !C4565a.m19902a().f13259b;
            C4565a.m19902a().mo15294e(this, z);
            m11525y2(z);
            C4507b.m19753i(z);
        } else if (id == C4511f.tv_preset) {
            m11526z2(view);
        } else if (id == C4511f.tv_reverb) {
            m11502A2(view);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C4573g.m19978a(this, !C4573g.m19979b(getResources().getColor(C4509d.effect_bg)));
        super.onCreate(bundle);
        setContentView(C4512g.activity_effect_adjust);
        this.f8646M = (AudioManager) getSystemService("audio");
        this.f8647N = (Vibrator) getSystemService("vibrator");
        this.f8648O = new C4533a(this);
        m11522v2();
        m11519s2();
        m11520t2();
        m11521u2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C4570e.m19970a();
        FrameLayout frameLayout = this.f8641H;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f8641H = null;
        }
        try {
            unregisterReceiver(this.f8649P);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C4533a aVar = this.f8648O;
        if (aVar == null || !aVar.mo15228f(i)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C4533a aVar = this.f8648O;
        if (aVar != null) {
            aVar.mo15229g();
        }
    }
}
